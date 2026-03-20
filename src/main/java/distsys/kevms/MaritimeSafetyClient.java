/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.kevms;

/**
 *
 * @author andre
 */

import generated.grpc.CA.maritimesafety.ConditionReport;
import generated.grpc.CA.maritimesafety.ConditionRequest;
import generated.grpc.CA.maritimesafety.MaritimeSafetyMonitorGrpc;
import generated.grpc.CA.maritimesafety.SafetyAlert;
import generated.grpc.CA.maritimesafety.VesselRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.Iterator;

public class MaritimeSafetyClient {
    public static void main(String[] args) {
        
        // 1. Create a channel to connect to the server on localhost port 50051
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext() // No encryption for local testing
                .build();
        
        // 2. Create a Blocking Stub (used to make standard, synchronous RPC calls)
        MaritimeSafetyMonitorGrpc.MaritimeSafetyMonitorBlockingStub stub = 
                MaritimeSafetyMonitorGrpc.newBlockingStub(channel);
        
        System.out.println("--- TESTING FUNCTIONALITY 1: SIMPLE RPC ---");
        // Create the request object
        ConditionRequest request = ConditionRequest.newBuilder().setAreaCode(101).build();
        
        // Call the server and get the response
        ConditionReport response = stub.checkSeaConditions(request);
        System.out.println("Response from server - Is Safe: " + response.getIsSafe());
        System.out.println("Wave Height: " + response.getWaveHeight() + "m");
        
        
        System.out.println("\n--- TESTING FUNCTIONALITY 2: SERVER STREAMING RPC ---");
        // Create the request for vessel 2541
        VesselRequest vesselReq = VesselRequest.newBuilder().setVesselId(2541).build();
        
        // Call the server. Because it's a stream, we get an Iterator back
        Iterator<SafetyAlert> alerts = stub.streamEmergencyAlerts(vesselReq);
        
        // Loop through the stream as the server sends them
        while(alerts.hasNext()) {
            SafetyAlert alert = alerts.next();
            System.out.println("ALERT RECEIVED [Level " + alert.getRiskLevel() + "]: " + alert.getAlertMessage());
        }
        
        // 3. Close the connection
        channel.shutdown();
    }
}
