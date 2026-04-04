/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.kevms;

/**
 *
 * @author andre
 */

import generated.grpc.CA.stafftraining.InstructorFeedback;
import generated.grpc.CA.stafftraining.StaffTrainingHubGrpc.StaffTrainingHubImplBase;
import generated.grpc.CA.stafftraining.TraineeAction;
import io.grpc.stub.StreamObserver;

// Extend the auto-generated ImplBase class
public class StaffTrainingServiceImpl extends StaffTrainingHubImplBase {
    
    //Override the bidirectional RPC method
    @Override
    public StreamObserver<TraineeAction> interactiveNavigationTraining(StreamObserver<InstructorFeedback> responseObserver) {
        
        // Return a StreamObserver to handle incoming actions from the trainee
        return new StreamObserver<TraineeAction>() {
            
            @Override
            public void onNext(TraineeAction action) {
                // This is triggered every time the trainee sends a new action
                String staffId = action.getStaffId();
                float rudderAngle = action.getRudderAngle();
                
                System.out.println("Received Action from " + staffId + " -> Rudder: " + rudderAngle + ", Throttle: " + action.getEngineThrottle());
                
                // --- Simulator Logic ---
                // Assume the correct rudder angle to avoid a rock is exactly 10.0 degrees
                float targetAngle = 10.0f;
                float errorMargin = Math.abs(rudderAngle - targetAngle);
                
                String instruction;
                boolean passed = false;

                if (rudderAngle > targetAngle + 2) {
                    instruction = "Too sharp! Ease the rudder to port (left).";
                } else if (rudderAngle < targetAngle - 2) {
                    instruction = "Too wide! Steer harder to starboard (right).";
                } else {
                    instruction = "Perfect trajectory. Maintain course to dock.";
                    passed = true;
                }

                // Build and send the feedback back to the trainee immediately
                InstructorFeedback feedback = InstructorFeedback.newBuilder()
                        .setInstruction(instruction)
                        .setCurrentErrorMargin(errorMargin)
                        .setSessionPassed(passed)
                        .build();
                
                responseObserver.onNext(feedback);
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Training session error: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                // The trainee has ended their session
                System.out.println("Trainee ended the simulation session.");
                responseObserver.onCompleted();
            }
        };
    }
}
