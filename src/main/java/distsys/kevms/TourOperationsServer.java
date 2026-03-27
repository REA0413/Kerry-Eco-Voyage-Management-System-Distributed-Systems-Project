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

public class TourOperationsServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 50052; // Using a different port for Service 2
        
//        Server server = ServerBuilder.forPort(port)
//                .addService(new TourOperationsServiceImpl())
//                .build()
//                .start();
//        
//        System.out.println("Tour Operations Server started, listening on port: " + port);

        // Register with JmDNS
        // Service Type is usually something like _http._tcp.local. 
        // For gRPC, we can use _grpc._tcp.local.
        ServiceRegistration.registerService(port, "TourOperations", "_grpc._tcp.local.");

        Server server = ServerBuilder.forPort(port)
                .addService(new TourOperationsServiceImpl())
                .build()
                .start();

        System.out.println("Tour Operations server started...");

        server.awaitTermination();
    }
}
