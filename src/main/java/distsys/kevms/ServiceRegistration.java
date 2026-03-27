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
import javax.jmdns.ServiceInfo;

public class ServiceRegistration {

    public static void registerService(int port, String serviceName, String serviceType) {
        try {
            // 1. Create a JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            // 2. Register a service
            // Service Type format: _serviceName._protocol.local.
            ServiceInfo serviceInfo = ServiceInfo.create(serviceType, serviceName, port, "path=index.html");
            jmdns.registerService(serviceInfo);

            System.out.println("JmDNS: Registered service [" + serviceName + "] of type [" + serviceType + "] on port " + port);

        } catch (IOException e) {
            System.out.println("JmDNS Error: " + e.getMessage());
        }
    }
}
