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

public class MaritimeSafetyServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 1. Define the port we want the server to run on
        int port = 50051;
        
        // 2. Build the server and attach our Implementation class to it
//        Server server = ServerBuilder.forPort(port)
//                .addService(new MaritimeSafetyServiceImpl())
//                .build()
//                .start();
//        
//        System.out.println("Maritime Safety Server started, listening on port: " + port);

        // Register with JmDNS
        // Service Type is usually something like _http._tcp.local. 
        // For gRPC, we can use _grpc._tcp.local.
        ServiceRegistration.registerService(port, "MaritimeSafety", "_grpc._tcp.local.");

        Server server = ServerBuilder.forPort(port)
                .addService(new MaritimeSafetyServiceImpl())
                .build()
                .start();

        System.out.println("Maritime Safety server started...");
        server.awaitTermination();
        
        // 3. Keep the server running until we manually kill it
        server.awaitTermination();
    }
}
