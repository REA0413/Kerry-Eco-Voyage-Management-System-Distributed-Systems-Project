/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.kevms;

/**
 *
 * @author andre
 */

import java.io.IOException;
import java.net.InetAddress;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;

public class ServiceDiscovery {

    private int port;
    private String host;

    public void discover(String serviceType) {
        try {
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            jmdns.addServiceListener(serviceType, new ServiceListener() {
                @Override
                public void serviceAdded(ServiceEvent event) {
                    System.out.println("Service added: " + event.getInfo());
                }

                @Override
                public void serviceRemoved(ServiceEvent event) {
                    System.out.println("Service removed: " + event.getInfo());
                }

                @Override
                public void serviceResolved(ServiceEvent event) {
                    System.out.println("Service resolved: " + event.getInfo());
                    // Capture the port and host for the gRPC channel
                    port = event.getInfo().getPort();
                    host = event.getInfo().getHostAddresses()[0];
                }
            });

            // Wait a bit for discovery to happen
            Thread.sleep(2000);
            jmdns.close();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getPort() { return port; }
    public String getHost() { return host; }
}
