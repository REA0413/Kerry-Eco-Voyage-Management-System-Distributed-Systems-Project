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
import generated.grpc.CA.touroperations.TourOperationsTrackerGrpc.TourOperationsTrackerImplBase;
import generated.grpc.CA.touroperations.VoyageSummary;
import io.grpc.stub.StreamObserver;

//Extend the auto-generated ImplBase class
public class TourOperationsServiceImpl extends TourOperationsTrackerImplBase {

    // Override the Simple/Unary RPC method
    @Override
    public void getStaffPerformance(StaffRequest request, StreamObserver<PerformanceScore> responseObserver) {
        int staffId = request.getStaffId();
        System.out.println("Fetching performance for Staff ID: " + staffId);

        // Mock data and logic
        float efficiency = (staffId == 541) ? 0.92f : 0.75f;

        PerformanceScore score = PerformanceScore.newBuilder()
                .setEfficiencyRating(efficiency)
                .build();

        responseObserver.onNext(score);
        responseObserver.onCompleted();
    }

    // Override the Client-Side Streaming method
    @Override
    public StreamObserver<TelemetryData> recordVoyageTelemetry(StreamObserver<VoyageSummary> responseObserver) {
        
        // For client streaming, we return a StreamObserver that dictates what the server does 
        // every time the client sends a new piece of data.
        return new StreamObserver<TelemetryData>() {
            
            // Variables to accumulate the streamed data
            float totalDistance = 0.0f;
            float totalFuel = 0.0f;

            @Override
            public void onNext(TelemetryData value) {
                // This gets called every time the client sends a GPS/Fuel update
                System.out.println("Received Telemetry -> Lat: " + value.getLatitude() + 
                                   ", Lon: " + value.getLongitude() + 
                                   ", Fuel Flow: " + value.getCurrentFuelFlow());
                
                // Simulate calculating distance and adding up fuel
                totalDistance += 6.4f; 
                totalFuel += value.getCurrentFuelFlow();
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error receiving telemetry stream: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                // This gets called when the client tells us it has finished streaming
                System.out.println("Telemetry stream finished. Calculating summary...");
                
                float avgEfficiency = (totalFuel > 0) ? (totalDistance / totalFuel) : 0.0f;

                VoyageSummary summary = VoyageSummary.newBuilder()
                        .setTotalDistance(totalDistance)
                        .setAverageEfficiency(avgEfficiency)
                        .build();

                // Send the final calculated summary back to the client
                responseObserver.onNext(summary);
                responseObserver.onCompleted();
            }
        };
    }
}
