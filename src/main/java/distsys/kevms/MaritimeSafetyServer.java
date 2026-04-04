/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.kevms;

/**
 *
 * @author andre
 */

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import io.grpc.ServerInterceptors;

public class MaritimeSafetyServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 1. Define the port I want the server to run on
        int port = 50051;
        
        // 2. Old method if I want to connect the server with MaritimeSafetyClient.java
//        Server server = ServerBuilder.forPort(port)
//                .addService(new MaritimeSafetyServiceImpl())
//                .build()
//                .start();
//        
//        System.out.println("Maritime Safety Server started, listening on port: " + port);

        // Register the service with JmDNS
        ServiceRegistration.registerService(port, "MaritimeSafety", "_grpc._tcp.local.");
        
        //adding interceptor in the server builder to showcase authentication
        Server server = ServerBuilder.forPort(port)
                .addService(ServerInterceptors.intercept(new MaritimeSafetyServiceImpl(), new AuthInterceptor()))
                .build()
                .start();

        System.out.println("Maritime Safety server started...");
        // 3. Keep the server running until I manually kill it
        server.awaitTermination();
    }
}
