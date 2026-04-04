/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.kevms;

/**
 *
 * @author andre
 */

import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import io.grpc.Status;

public class AuthInterceptor implements ServerInterceptor {

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
            ServerCall<ReqT, RespT> call, 
            Metadata headers, 
            ServerCallHandler<ReqT, RespT> next) {

        // 1. Define the key we are looking for (must match the client)
        Metadata.Key<String> authKey = Metadata.Key.of("auth-token", Metadata.ASCII_STRING_MARSHALLER);
        
        // 2. Extract the token from the incoming headers
        String token = headers.get(authKey);

        // 3. Validate the token
        if (token != null && token.equals("kevms-secure-token-123")) {
            System.out.println("SERVER: Authentication successful!");
            // Let the request pass through to your checkSeaConditions method
            return next.startCall(call, headers);
        } else {
            System.out.println("SERVER: Authentication FAILED. Blocking request.");
            // Reject the request with an UNAUTHENTICATED error
            call.close(Status.UNAUTHENTICATED.withDescription("Invalid or missing security token"), headers);
            return new ServerCall.Listener<ReqT>() {};
        }
    }
}
