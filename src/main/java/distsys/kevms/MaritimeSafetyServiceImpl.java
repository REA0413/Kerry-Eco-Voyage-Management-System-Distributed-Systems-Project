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
import generated.grpc.CA.maritimesafety.MaritimeSafetyMonitorGrpc.MaritimeSafetyMonitorImplBase;
import generated.grpc.CA.maritimesafety.SafetyAlert;
import generated.grpc.CA.maritimesafety.VesselRequest;
import io.grpc.stub.StreamObserver;

// 1. Extend the auto-generated ImplBase class
public class MaritimeSafetyServiceImpl extends MaritimeSafetyMonitorImplBase {

    // 2. Override the Simple RPC method
    @Override
    public void checkSeaConditions(ConditionRequest request, StreamObserver<ConditionReport> responseObserver) {
        
        // Find out what area the client is asking about
        int areaCode = request.getAreaCode();
        System.out.println("Received diagnostic request for Area Code: " + areaCode);
        
        // Mocking some data based on the proposal
        float wave = 1.5f;
        float wind = 12.4f;
        boolean safe = true;
        
        // If it's a different area, maybe the weather is worse
        if (areaCode == 999) {
            wave = 4.5f;
            wind = 30.0f;
            safe = false;
        }

        // 3. Build the response message using the generated Builder
        ConditionReport report = ConditionReport.newBuilder()
                .setWaveHeight(wave)
                .setWindSpeed(wind)
                .setIsSafe(safe)
                .build();

        // 4. Send the response back to the client
        responseObserver.onNext(report);
        
        // 5. Tell the client we are finished sending data
        responseObserver.onCompleted();
    }

    // Override the Server-side Streaming RPC method
    @Override
    public void streamEmergencyAlerts(VesselRequest request, StreamObserver<SafetyAlert> responseObserver) {
        
        int vesselId = request.getVesselId();
        System.out.println("Starting emergency alert stream for Vessel ID: " + vesselId);

        try {
            // Send First Alert
            SafetyAlert alert1 = SafetyAlert.newBuilder()
                    .setAlertMessage("Strong swell detected on port side.")
                    .setRiskLevel(2)
                    .build();
            responseObserver.onNext(alert1);
            
            Thread.sleep(2000); // Wait 2 seconds to simulate time passing
            
            // Send Second Alert
            SafetyAlert alert2 = SafetyAlert.newBuilder()
                    .setAlertMessage("Heavy fog incoming - visibility < 50m.")
                    .setRiskLevel(4)
                    .build();
            responseObserver.onNext(alert2);
            
            // Send Third Alert
            SafetyAlert alert3 = SafetyAlert.newBuilder()
                    .setAlertMessage("Be cautious, nearby vessel in <5 km radius.")
                    .setRiskLevel(3)
                    .build();
            responseObserver.onNext(alert3);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the stream
            responseObserver.onCompleted();
            System.out.println("Stream completed for Vessel " + vesselId);
        }
    }
}
