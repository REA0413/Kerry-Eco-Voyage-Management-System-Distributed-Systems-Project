///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package distsys.kevms;
//
///**
// *
// * @author andre
// */
//
//import generated.grpc.CA.stafftraining.InstructorFeedback;
//import generated.grpc.CA.stafftraining.StaffTrainingHubGrpc;
//import generated.grpc.CA.stafftraining.TraineeAction;
//import io.grpc.ManagedChannel;
//import io.grpc.ManagedChannelBuilder;
//import io.grpc.stub.StreamObserver;
//import java.util.concurrent.CountDownLatch;
//import java.util.concurrent.TimeUnit;
//
//public class StaffTrainingClient {
//    public static void main(String[] args) throws InterruptedException {
//        // 1. Discover the service
//        ServiceDiscovery discovery = new ServiceDiscovery();
//        discovery.discover("_grpc._tcp.local."); // This listens for any gRPC service
//
//        String host = discovery.getHost();
//        int port = discovery.getPort();
//
//        System.out.println("Discovered StaffTraining at " + host + ":" + port);
//
//        // 2. Use the discovered address to build the channel
//        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
//                .usePlaintext()
//                .build();
//        
////        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053)
////                .usePlaintext()
////                .build();
//        
//        // Async stub for Bidirectional streaming
//        StaffTrainingHubGrpc.StaffTrainingHubStub asyncStub = StaffTrainingHubGrpc.newStub(channel);
//
//        CountDownLatch finishLatch = new CountDownLatch(1);
//
//        System.out.println("--- STARTING INTERACTIVE NAVIGATION TRAINING ---");
//
//        // 1. Set up the observer to listen to the instructor's feedback
//        StreamObserver<InstructorFeedback> responseObserver = new StreamObserver<InstructorFeedback>() {
//            @Override
//            public void onNext(InstructorFeedback feedback) {
//                System.out.println("\n[INSTRUCTOR]: " + feedback.getInstruction());
//                System.out.println("Error Margin: " + feedback.getCurrentErrorMargin() + " degrees");
//                if (feedback.getSessionPassed()) {
//                    System.out.println(">>> SESSION PASSED! <<<");
//                }
//            }
//
//            @Override
//            public void onError(Throwable t) {
//                t.printStackTrace();
//                finishLatch.countDown();
//            }
//
//            @Override
//            public void onCompleted() {
//                System.out.println("\nInstructor closed the session.");
//                finishLatch.countDown();
//            }
//        };
//
//        // 2. Open the bidirectional stream
//        StreamObserver<TraineeAction> requestObserver = asyncStub.interactiveNavigationTraining(responseObserver);
//
//        try {
//            // Trainee Action 1: Steering too hard
//            System.out.println("\n[TRAINEE]: Steering to 15.0 degrees...");
//            requestObserver.onNext(TraineeAction.newBuilder().setStaffId("andreas_h").setRudderAngle(15.0f).setEngineThrottle(60).build());
//            Thread.sleep(1500); // Wait for the instructor to yell at us
//            
//            // Trainee Action 2: Overcorrecting
//            System.out.println("\n[TRAINEE]: Correcting to 5.0 degrees...");
//            requestObserver.onNext(TraineeAction.newBuilder().setStaffId("andreas_h").setRudderAngle(5.0f).setEngineThrottle(50).build());
//            Thread.sleep(1500);
//            
//            // Trainee Action 3: Perfecting the turn
//            System.out.println("\n[TRAINEE]: Adjusting to 10.0 degrees...");
//            requestObserver.onNext(TraineeAction.newBuilder().setStaffId("andreas_h").setRudderAngle(10.0f).setEngineThrottle(40).build());
//            Thread.sleep(1000);
//            
//        } catch (RuntimeException e) {
//            requestObserver.onError(e);
//            throw e;
//        }
//
//        // 3. Trainee is done, close our end of the stream
//        requestObserver.onCompleted();
//
//        // Wait for the stream to fully resolve
//        finishLatch.await(1, TimeUnit.MINUTES);
//        channel.shutdown();
//    }
//}
