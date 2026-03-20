package generated.grpc.CA.maritimesafety;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * =================================================================
 * Service 1: Maritime Safety &amp; Environmental Monitor
 * =================================================================
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: maritime_safety.proto")
public final class MaritimeSafetyMonitorGrpc {

  private MaritimeSafetyMonitorGrpc() {}

  public static final String SERVICE_NAME = "MaritimeSafetyMonitor";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.grpc.CA.maritimesafety.ConditionRequest,
      generated.grpc.CA.maritimesafety.ConditionReport> getCheckSeaConditionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckSeaConditions",
      requestType = generated.grpc.CA.maritimesafety.ConditionRequest.class,
      responseType = generated.grpc.CA.maritimesafety.ConditionReport.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.grpc.CA.maritimesafety.ConditionRequest,
      generated.grpc.CA.maritimesafety.ConditionReport> getCheckSeaConditionsMethod() {
    io.grpc.MethodDescriptor<generated.grpc.CA.maritimesafety.ConditionRequest, generated.grpc.CA.maritimesafety.ConditionReport> getCheckSeaConditionsMethod;
    if ((getCheckSeaConditionsMethod = MaritimeSafetyMonitorGrpc.getCheckSeaConditionsMethod) == null) {
      synchronized (MaritimeSafetyMonitorGrpc.class) {
        if ((getCheckSeaConditionsMethod = MaritimeSafetyMonitorGrpc.getCheckSeaConditionsMethod) == null) {
          MaritimeSafetyMonitorGrpc.getCheckSeaConditionsMethod = getCheckSeaConditionsMethod = 
              io.grpc.MethodDescriptor.<generated.grpc.CA.maritimesafety.ConditionRequest, generated.grpc.CA.maritimesafety.ConditionReport>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "MaritimeSafetyMonitor", "CheckSeaConditions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.CA.maritimesafety.ConditionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.CA.maritimesafety.ConditionReport.getDefaultInstance()))
                  .setSchemaDescriptor(new MaritimeSafetyMonitorMethodDescriptorSupplier("CheckSeaConditions"))
                  .build();
          }
        }
     }
     return getCheckSeaConditionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.grpc.CA.maritimesafety.VesselRequest,
      generated.grpc.CA.maritimesafety.SafetyAlert> getStreamEmergencyAlertsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamEmergencyAlerts",
      requestType = generated.grpc.CA.maritimesafety.VesselRequest.class,
      responseType = generated.grpc.CA.maritimesafety.SafetyAlert.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.CA.maritimesafety.VesselRequest,
      generated.grpc.CA.maritimesafety.SafetyAlert> getStreamEmergencyAlertsMethod() {
    io.grpc.MethodDescriptor<generated.grpc.CA.maritimesafety.VesselRequest, generated.grpc.CA.maritimesafety.SafetyAlert> getStreamEmergencyAlertsMethod;
    if ((getStreamEmergencyAlertsMethod = MaritimeSafetyMonitorGrpc.getStreamEmergencyAlertsMethod) == null) {
      synchronized (MaritimeSafetyMonitorGrpc.class) {
        if ((getStreamEmergencyAlertsMethod = MaritimeSafetyMonitorGrpc.getStreamEmergencyAlertsMethod) == null) {
          MaritimeSafetyMonitorGrpc.getStreamEmergencyAlertsMethod = getStreamEmergencyAlertsMethod = 
              io.grpc.MethodDescriptor.<generated.grpc.CA.maritimesafety.VesselRequest, generated.grpc.CA.maritimesafety.SafetyAlert>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "MaritimeSafetyMonitor", "StreamEmergencyAlerts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.CA.maritimesafety.VesselRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.CA.maritimesafety.SafetyAlert.getDefaultInstance()))
                  .setSchemaDescriptor(new MaritimeSafetyMonitorMethodDescriptorSupplier("StreamEmergencyAlerts"))
                  .build();
          }
        }
     }
     return getStreamEmergencyAlertsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MaritimeSafetyMonitorStub newStub(io.grpc.Channel channel) {
    return new MaritimeSafetyMonitorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MaritimeSafetyMonitorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MaritimeSafetyMonitorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MaritimeSafetyMonitorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MaritimeSafetyMonitorFutureStub(channel);
  }

  /**
   * <pre>
   * =================================================================
   * Service 1: Maritime Safety &amp; Environmental Monitor
   * =================================================================
   * </pre>
   */
  public static abstract class MaritimeSafetyMonitorImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Functionality 1: Simple RPC
     * </pre>
     */
    public void checkSeaConditions(generated.grpc.CA.maritimesafety.ConditionRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.CA.maritimesafety.ConditionReport> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckSeaConditionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Functionality 2: Server-side Streaming
     * </pre>
     */
    public void streamEmergencyAlerts(generated.grpc.CA.maritimesafety.VesselRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.CA.maritimesafety.SafetyAlert> responseObserver) {
      asyncUnimplementedUnaryCall(getStreamEmergencyAlertsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckSeaConditionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.grpc.CA.maritimesafety.ConditionRequest,
                generated.grpc.CA.maritimesafety.ConditionReport>(
                  this, METHODID_CHECK_SEA_CONDITIONS)))
          .addMethod(
            getStreamEmergencyAlertsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                generated.grpc.CA.maritimesafety.VesselRequest,
                generated.grpc.CA.maritimesafety.SafetyAlert>(
                  this, METHODID_STREAM_EMERGENCY_ALERTS)))
          .build();
    }
  }

  /**
   * <pre>
   * =================================================================
   * Service 1: Maritime Safety &amp; Environmental Monitor
   * =================================================================
   * </pre>
   */
  public static final class MaritimeSafetyMonitorStub extends io.grpc.stub.AbstractStub<MaritimeSafetyMonitorStub> {
    private MaritimeSafetyMonitorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MaritimeSafetyMonitorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MaritimeSafetyMonitorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MaritimeSafetyMonitorStub(channel, callOptions);
    }

    /**
     * <pre>
     * Functionality 1: Simple RPC
     * </pre>
     */
    public void checkSeaConditions(generated.grpc.CA.maritimesafety.ConditionRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.CA.maritimesafety.ConditionReport> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckSeaConditionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Functionality 2: Server-side Streaming
     * </pre>
     */
    public void streamEmergencyAlerts(generated.grpc.CA.maritimesafety.VesselRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.CA.maritimesafety.SafetyAlert> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStreamEmergencyAlertsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * =================================================================
   * Service 1: Maritime Safety &amp; Environmental Monitor
   * =================================================================
   * </pre>
   */
  public static final class MaritimeSafetyMonitorBlockingStub extends io.grpc.stub.AbstractStub<MaritimeSafetyMonitorBlockingStub> {
    private MaritimeSafetyMonitorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MaritimeSafetyMonitorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MaritimeSafetyMonitorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MaritimeSafetyMonitorBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Functionality 1: Simple RPC
     * </pre>
     */
    public generated.grpc.CA.maritimesafety.ConditionReport checkSeaConditions(generated.grpc.CA.maritimesafety.ConditionRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckSeaConditionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Functionality 2: Server-side Streaming
     * </pre>
     */
    public java.util.Iterator<generated.grpc.CA.maritimesafety.SafetyAlert> streamEmergencyAlerts(
        generated.grpc.CA.maritimesafety.VesselRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getStreamEmergencyAlertsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * =================================================================
   * Service 1: Maritime Safety &amp; Environmental Monitor
   * =================================================================
   * </pre>
   */
  public static final class MaritimeSafetyMonitorFutureStub extends io.grpc.stub.AbstractStub<MaritimeSafetyMonitorFutureStub> {
    private MaritimeSafetyMonitorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MaritimeSafetyMonitorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MaritimeSafetyMonitorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MaritimeSafetyMonitorFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Functionality 1: Simple RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.grpc.CA.maritimesafety.ConditionReport> checkSeaConditions(
        generated.grpc.CA.maritimesafety.ConditionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckSeaConditionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_SEA_CONDITIONS = 0;
  private static final int METHODID_STREAM_EMERGENCY_ALERTS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MaritimeSafetyMonitorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MaritimeSafetyMonitorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_SEA_CONDITIONS:
          serviceImpl.checkSeaConditions((generated.grpc.CA.maritimesafety.ConditionRequest) request,
              (io.grpc.stub.StreamObserver<generated.grpc.CA.maritimesafety.ConditionReport>) responseObserver);
          break;
        case METHODID_STREAM_EMERGENCY_ALERTS:
          serviceImpl.streamEmergencyAlerts((generated.grpc.CA.maritimesafety.VesselRequest) request,
              (io.grpc.stub.StreamObserver<generated.grpc.CA.maritimesafety.SafetyAlert>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MaritimeSafetyMonitorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MaritimeSafetyMonitorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.grpc.CA.maritimesafety.MaritimeSafetyProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MaritimeSafetyMonitor");
    }
  }

  private static final class MaritimeSafetyMonitorFileDescriptorSupplier
      extends MaritimeSafetyMonitorBaseDescriptorSupplier {
    MaritimeSafetyMonitorFileDescriptorSupplier() {}
  }

  private static final class MaritimeSafetyMonitorMethodDescriptorSupplier
      extends MaritimeSafetyMonitorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MaritimeSafetyMonitorMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MaritimeSafetyMonitorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MaritimeSafetyMonitorFileDescriptorSupplier())
              .addMethod(getCheckSeaConditionsMethod())
              .addMethod(getStreamEmergencyAlertsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
