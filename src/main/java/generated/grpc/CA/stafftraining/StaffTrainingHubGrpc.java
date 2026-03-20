package generated.grpc.CA.stafftraining;

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
 * Service 3: Sustainable Staffs Training Hub
 * =================================================================
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: staff_training.proto")
public final class StaffTrainingHubGrpc {

  private StaffTrainingHubGrpc() {}

  public static final String SERVICE_NAME = "StaffTrainingHub";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.grpc.CA.stafftraining.TraineeAction,
      generated.grpc.CA.stafftraining.InstructorFeedback> getInteractiveNavigationTrainingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InteractiveNavigationTraining",
      requestType = generated.grpc.CA.stafftraining.TraineeAction.class,
      responseType = generated.grpc.CA.stafftraining.InstructorFeedback.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.CA.stafftraining.TraineeAction,
      generated.grpc.CA.stafftraining.InstructorFeedback> getInteractiveNavigationTrainingMethod() {
    io.grpc.MethodDescriptor<generated.grpc.CA.stafftraining.TraineeAction, generated.grpc.CA.stafftraining.InstructorFeedback> getInteractiveNavigationTrainingMethod;
    if ((getInteractiveNavigationTrainingMethod = StaffTrainingHubGrpc.getInteractiveNavigationTrainingMethod) == null) {
      synchronized (StaffTrainingHubGrpc.class) {
        if ((getInteractiveNavigationTrainingMethod = StaffTrainingHubGrpc.getInteractiveNavigationTrainingMethod) == null) {
          StaffTrainingHubGrpc.getInteractiveNavigationTrainingMethod = getInteractiveNavigationTrainingMethod = 
              io.grpc.MethodDescriptor.<generated.grpc.CA.stafftraining.TraineeAction, generated.grpc.CA.stafftraining.InstructorFeedback>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "StaffTrainingHub", "InteractiveNavigationTraining"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.CA.stafftraining.TraineeAction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.CA.stafftraining.InstructorFeedback.getDefaultInstance()))
                  .setSchemaDescriptor(new StaffTrainingHubMethodDescriptorSupplier("InteractiveNavigationTraining"))
                  .build();
          }
        }
     }
     return getInteractiveNavigationTrainingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StaffTrainingHubStub newStub(io.grpc.Channel channel) {
    return new StaffTrainingHubStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StaffTrainingHubBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StaffTrainingHubBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StaffTrainingHubFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StaffTrainingHubFutureStub(channel);
  }

  /**
   * <pre>
   * =================================================================
   * Service 3: Sustainable Staffs Training Hub
   * =================================================================
   * </pre>
   */
  public static abstract class StaffTrainingHubImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Functionality: Bidirectional Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.CA.stafftraining.TraineeAction> interactiveNavigationTraining(
        io.grpc.stub.StreamObserver<generated.grpc.CA.stafftraining.InstructorFeedback> responseObserver) {
      return asyncUnimplementedStreamingCall(getInteractiveNavigationTrainingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInteractiveNavigationTrainingMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                generated.grpc.CA.stafftraining.TraineeAction,
                generated.grpc.CA.stafftraining.InstructorFeedback>(
                  this, METHODID_INTERACTIVE_NAVIGATION_TRAINING)))
          .build();
    }
  }

  /**
   * <pre>
   * =================================================================
   * Service 3: Sustainable Staffs Training Hub
   * =================================================================
   * </pre>
   */
  public static final class StaffTrainingHubStub extends io.grpc.stub.AbstractStub<StaffTrainingHubStub> {
    private StaffTrainingHubStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StaffTrainingHubStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StaffTrainingHubStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StaffTrainingHubStub(channel, callOptions);
    }

    /**
     * <pre>
     * Functionality: Bidirectional Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.CA.stafftraining.TraineeAction> interactiveNavigationTraining(
        io.grpc.stub.StreamObserver<generated.grpc.CA.stafftraining.InstructorFeedback> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getInteractiveNavigationTrainingMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * =================================================================
   * Service 3: Sustainable Staffs Training Hub
   * =================================================================
   * </pre>
   */
  public static final class StaffTrainingHubBlockingStub extends io.grpc.stub.AbstractStub<StaffTrainingHubBlockingStub> {
    private StaffTrainingHubBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StaffTrainingHubBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StaffTrainingHubBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StaffTrainingHubBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * =================================================================
   * Service 3: Sustainable Staffs Training Hub
   * =================================================================
   * </pre>
   */
  public static final class StaffTrainingHubFutureStub extends io.grpc.stub.AbstractStub<StaffTrainingHubFutureStub> {
    private StaffTrainingHubFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StaffTrainingHubFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StaffTrainingHubFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StaffTrainingHubFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_INTERACTIVE_NAVIGATION_TRAINING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StaffTrainingHubImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StaffTrainingHubImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INTERACTIVE_NAVIGATION_TRAINING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.interactiveNavigationTraining(
              (io.grpc.stub.StreamObserver<generated.grpc.CA.stafftraining.InstructorFeedback>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StaffTrainingHubBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StaffTrainingHubBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.grpc.CA.stafftraining.StaffTrainingProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StaffTrainingHub");
    }
  }

  private static final class StaffTrainingHubFileDescriptorSupplier
      extends StaffTrainingHubBaseDescriptorSupplier {
    StaffTrainingHubFileDescriptorSupplier() {}
  }

  private static final class StaffTrainingHubMethodDescriptorSupplier
      extends StaffTrainingHubBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StaffTrainingHubMethodDescriptorSupplier(String methodName) {
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
      synchronized (StaffTrainingHubGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StaffTrainingHubFileDescriptorSupplier())
              .addMethod(getInteractiveNavigationTrainingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
