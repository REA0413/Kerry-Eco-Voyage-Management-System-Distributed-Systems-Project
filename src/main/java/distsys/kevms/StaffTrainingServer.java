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

public class StaffTrainingServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 50053; // Unique port for Service 3
        
        Server server = ServerBuilder.forPort(port)
                .addService(new StaffTrainingServiceImpl())
                .build()
                .start();
        
        System.out.println("Staff Training Simulator Server started, listening on port: " + port);
        server.awaitTermination();
    }
}
