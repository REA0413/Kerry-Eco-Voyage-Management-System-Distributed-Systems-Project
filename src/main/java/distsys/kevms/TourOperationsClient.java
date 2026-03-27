/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.kevms;

/**
 *
 * @author andre
 */

import generated.grpc.CA.touroperations.PerformanceScore;
import generated.grpc.CA.touroperations.StaffRequest;
import generated.grpc.CA.touroperations.TelemetryData;
import generated.grpc.CA.touroperations.TourOperationsTrackerGrpc;
import generated.grpc.CA.touroperations.VoyageSummary;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class TourOperationsClient {
    public static void main(String[] args) throws InterruptedException {
        // 1. Discover the service
        ServiceDiscovery discovery = new ServiceDiscovery();
        discovery.discover("_grpc._tcp.local."); // This listens for any gRPC service

        String host = discovery.getHost();
        int port = discovery.getPort();

        System.out.println("Discovered TourOperations at " + host + ":" + port);

        // 2. Use the discovered address to build the channel
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        
//        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052)
//                .usePlaintext()
//                .build();
        
        // We need a Blocking Stub for the Simple RPC
        TourOperationsTrackerGrpc.TourOperationsTrackerBlockingStub blockingStub = 
                TourOperationsTrackerGrpc.newBlockingStub(channel);
        
        // We need an Async Stub for the Client-Side Streaming RPC
        TourOperationsTrackerGrpc.TourOperationsTrackerStub asyncStub = 
                TourOperationsTrackerGrpc.newStub(channel);

        System.out.println("--- TESTING FUNCTIONALITY 2: SIMPLE RPC ---");
        StaffRequest staffReq = StaffRequest.newBuilder().setStaffId(541).build();
        PerformanceScore score = blockingStub.getStaffPerformance(staffReq);
        System.out.println("Staff 541 Efficiency Rating: " + (score.getEfficiencyRating() * 100) + "%");

        System.out.println("\n--- TESTING FUNCTIONALITY 1: CLIENT-SIDE STREAMING RPC ---");
        
        // CountDownLatch keeps the client program running while the async stream finishes
        CountDownLatch finishLatch = new CountDownLatch(1);

        // Prepare the observer to handle the server's final response
        StreamObserver<VoyageSummary> responseObserver = new StreamObserver<VoyageSummary>() {
            @Override
            public void onNext(VoyageSummary summary) {
                System.out.println("SERVER RESPONSE -> Total Distance: " + summary.getTotalDistance() + 
                                   ", Avg Efficiency: " + summary.getAverageEfficiency());
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
                finishLatch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Server finished processing stream.");
                finishLatch.countDown();
            }
        };

        // Open the stream to the server
        StreamObserver<TelemetryData> requestObserver = asyncStub.recordVoyageTelemetry(responseObserver);

        try {
            // Stream Data 1
            requestObserver.onNext(TelemetryData.newBuilder().setLatitude(51.772).setLongitude(-10.539).setCurrentFuelFlow(4.2f).build());
            Thread.sleep(500); // Wait half a second
            
            // Stream Data 2
            requestObserver.onNext(TelemetryData.newBuilder().setLatitude(51.775).setLongitude(-10.542).setCurrentFuelFlow(4.5f).build());
            Thread.sleep(500);
            
            // Stream Data 3
            requestObserver.onNext(TelemetryData.newBuilder().setLatitude(51.778).setLongitude(-10.545).setCurrentFuelFlow(4.1f).build());
            
        } catch (RuntimeException e) {
            requestObserver.onError(e);
            throw e;
        }

        // Tell the server we are done sending data
        requestObserver.onCompleted();

        // Wait for the server to send its response before closing the channel
        finishLatch.await(1, TimeUnit.MINUTES);
        
        channel.shutdown();
    }
}
