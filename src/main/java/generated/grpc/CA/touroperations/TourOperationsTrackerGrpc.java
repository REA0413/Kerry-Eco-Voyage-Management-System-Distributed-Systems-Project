package generated.grpc.CA.touroperations;

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
 * Service 2: Tour Operations &amp; Efficiency Tracker
 * =================================================================
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: tour_operations.proto")
public final class TourOperationsTrackerGrpc {

  private TourOperationsTrackerGrpc() {}

  public static final String SERVICE_NAME = "TourOperationsTracker";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.grpc.CA.touroperations.TelemetryData,
      generated.grpc.CA.touroperations.VoyageSummary> getRecordVoyageTelemetryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecordVoyageTelemetry",
      requestType = generated.grpc.CA.touroperations.TelemetryData.class,
      responseType = generated.grpc.CA.touroperations.VoyageSummary.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.CA.touroperations.TelemetryData,
      generated.grpc.CA.touroperations.VoyageSummary> getRecordVoyageTelemetryMethod() {
    io.grpc.MethodDescriptor<generated.grpc.CA.touroperations.TelemetryData, generated.grpc.CA.touroperations.VoyageSummary> getRecordVoyageTelemetryMethod;
    if ((getRecordVoyageTelemetryMethod = TourOperationsTrackerGrpc.getRecordVoyageTelemetryMethod) == null) {
      synchronized (TourOperationsTrackerGrpc.class) {
        if ((getRecordVoyageTelemetryMethod = TourOperationsTrackerGrpc.getRecordVoyageTelemetryMethod) == null) {
          TourOperationsTrackerGrpc.getRecordVoyageTelemetryMethod = getRecordVoyageTelemetryMethod = 
              io.grpc.MethodDescriptor.<generated.grpc.CA.touroperations.TelemetryData, generated.grpc.CA.touroperations.VoyageSummary>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "TourOperationsTracker", "RecordVoyageTelemetry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.CA.touroperations.TelemetryData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.CA.touroperations.VoyageSummary.getDefaultInstance()))
                  .setSchemaDescriptor(new TourOperationsTrackerMethodDescriptorSupplier("RecordVoyageTelemetry"))
                  .build();
          }
        }
     }
     return getRecordVoyageTelemetryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.grpc.CA.touroperations.StaffRequest,
      generated.grpc.CA.touroperations.PerformanceScore> getGetStaffPerformanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStaffPerformance",
      requestType = generated.grpc.CA.touroperations.StaffRequest.class,
      responseType = generated.grpc.CA.touroperations.PerformanceScore.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.grpc.CA.touroperations.StaffRequest,
      generated.grpc.CA.touroperations.PerformanceScore> getGetStaffPerformanceMethod() {
    io.grpc.MethodDescriptor<generated.grpc.CA.touroperations.StaffRequest, generated.grpc.CA.touroperations.PerformanceScore> getGetStaffPerformanceMethod;
    if ((getGetStaffPerformanceMethod = TourOperationsTrackerGrpc.getGetStaffPerformanceMethod) == null) {
      synchronized (TourOperationsTrackerGrpc.class) {
        if ((getGetStaffPerformanceMethod = TourOperationsTrackerGrpc.getGetStaffPerformanceMethod) == null) {
          TourOperationsTrackerGrpc.getGetStaffPerformanceMethod = getGetStaffPerformanceMethod = 
              io.grpc.MethodDescriptor.<generated.grpc.CA.touroperations.StaffRequest, generated.grpc.CA.touroperations.PerformanceScore>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TourOperationsTracker", "GetStaffPerformance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.CA.touroperations.StaffRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.CA.touroperations.PerformanceScore.getDefaultInstance()))
                  .setSchemaDescriptor(new TourOperationsTrackerMethodDescriptorSupplier("GetStaffPerformance"))
                  .build();
          }
        }
     }
     return getGetStaffPerformanceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TourOperationsTrackerStub newStub(io.grpc.Channel channel) {
    return new TourOperationsTrackerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TourOperationsTrackerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TourOperationsTrackerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TourOperationsTrackerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TourOperationsTrackerFutureStub(channel);
  }

  /**
   * <pre>
   * =================================================================
   * Service 2: Tour Operations &amp; Efficiency Tracker
   * =================================================================
   * </pre>
   */
  public static abstract class TourOperationsTrackerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Functionality 1: Client-side Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.CA.touroperations.TelemetryData> recordVoyageTelemetry(
        io.grpc.stub.StreamObserver<generated.grpc.CA.touroperations.VoyageSummary> responseObserver) {
      return asyncUnimplementedStreamingCall(getRecordVoyageTelemetryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Functionality 2: Simple RPC
     * </pre>
     */
    public void getStaffPerformance(generated.grpc.CA.touroperations.StaffRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.CA.touroperations.PerformanceScore> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStaffPerformanceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRecordVoyageTelemetryMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                generated.grpc.CA.touroperations.TelemetryData,
                generated.grpc.CA.touroperations.VoyageSummary>(
                  this, METHODID_RECORD_VOYAGE_TELEMETRY)))
          .addMethod(
            getGetStaffPerformanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.grpc.CA.touroperations.StaffRequest,
                generated.grpc.CA.touroperations.PerformanceScore>(
                  this, METHODID_GET_STAFF_PERFORMANCE)))
          .build();
    }
  }

  /**
   * <pre>
   * =================================================================
   * Service 2: Tour Operations &amp; Efficiency Tracker
   * =================================================================
   * </pre>
   */
  public static final class TourOperationsTrackerStub extends io.grpc.stub.AbstractStub<TourOperationsTrackerStub> {
    private TourOperationsTrackerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TourOperationsTrackerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TourOperationsTrackerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TourOperationsTrackerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Functionality 1: Client-side Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.CA.touroperations.TelemetryData> recordVoyageTelemetry(
        io.grpc.stub.StreamObserver<generated.grpc.CA.touroperations.VoyageSummary> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getRecordVoyageTelemetryMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Functionality 2: Simple RPC
     * </pre>
     */
    public void getStaffPerformance(generated.grpc.CA.touroperations.StaffRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.CA.touroperations.PerformanceScore> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStaffPerformanceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * =================================================================
   * Service 2: Tour Operations &amp; Efficiency Tracker
   * =================================================================
   * </pre>
   */
  public static final class TourOperationsTrackerBlockingStub extends io.grpc.stub.AbstractStub<TourOperationsTrackerBlockingStub> {
    private TourOperationsTrackerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TourOperationsTrackerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TourOperationsTrackerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TourOperationsTrackerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Functionality 2: Simple RPC
     * </pre>
     */
    public generated.grpc.CA.touroperations.PerformanceScore getStaffPerformance(generated.grpc.CA.touroperations.StaffRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStaffPerformanceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * =================================================================
   * Service 2: Tour Operations &amp; Efficiency Tracker
   * =================================================================
   * </pre>
   */
  public static final class TourOperationsTrackerFutureStub extends io.grpc.stub.AbstractStub<TourOperationsTrackerFutureStub> {
    private TourOperationsTrackerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TourOperationsTrackerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TourOperationsTrackerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TourOperationsTrackerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Functionality 2: Simple RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.grpc.CA.touroperations.PerformanceScore> getStaffPerformance(
        generated.grpc.CA.touroperations.StaffRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStaffPerformanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STAFF_PERFORMANCE = 0;
  private static final int METHODID_RECORD_VOYAGE_TELEMETRY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TourOperationsTrackerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TourOperationsTrackerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STAFF_PERFORMANCE:
          serviceImpl.getStaffPerformance((generated.grpc.CA.touroperations.StaffRequest) request,
              (io.grpc.stub.StreamObserver<generated.grpc.CA.touroperations.PerformanceScore>) responseObserver);
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
        case METHODID_RECORD_VOYAGE_TELEMETRY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.recordVoyageTelemetry(
              (io.grpc.stub.StreamObserver<generated.grpc.CA.touroperations.VoyageSummary>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TourOperationsTrackerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TourOperationsTrackerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.grpc.CA.touroperations.TourOperationsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TourOperationsTracker");
    }
  }

  private static final class TourOperationsTrackerFileDescriptorSupplier
      extends TourOperationsTrackerBaseDescriptorSupplier {
    TourOperationsTrackerFileDescriptorSupplier() {}
  }

  private static final class TourOperationsTrackerMethodDescriptorSupplier
      extends TourOperationsTrackerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TourOperationsTrackerMethodDescriptorSupplier(String methodName) {
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
      synchronized (TourOperationsTrackerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TourOperationsTrackerFileDescriptorSupplier())
              .addMethod(getRecordVoyageTelemetryMethod())
              .addMethod(getGetStaffPerformanceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
