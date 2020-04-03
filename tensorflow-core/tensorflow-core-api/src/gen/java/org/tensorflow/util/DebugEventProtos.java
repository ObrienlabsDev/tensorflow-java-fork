// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/debug_event.proto

package org.tensorflow.util;

public final class DebugEventProtos {
  private DebugEventProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_DebugEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_DebugEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_DebugMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_DebugMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SourceFile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SourceFile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_StackFrameWithId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_StackFrameWithId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CodeLocation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_CodeLocation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GraphOpCreation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GraphOpCreation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_DebuggedGraph_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_DebuggedGraph_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_DebuggedDevice_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_DebuggedDevice_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_Execution_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_Execution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GraphExecutionTrace_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GraphExecutionTrace_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*tensorflow/core/protobuf/debug_event.p" +
      "roto\022\ntensorflow\032&tensorflow/core/framew" +
      "ork/tensor.proto\032/tensorflow/core/protob" +
      "uf/graph_debug_info.proto\"\376\003\n\nDebugEvent" +
      "\022\021\n\twall_time\030\001 \001(\001\022\014\n\004step\030\002 \001(\003\0223\n\016deb" +
      "ug_metadata\030\003 \001(\0132\031.tensorflow.DebugMeta" +
      "dataH\000\022-\n\013source_file\030\004 \001(\0132\026.tensorflow" +
      ".SourceFileH\000\022;\n\023stack_frame_with_id\030\006 \001" +
      "(\0132\034.tensorflow.StackFrameWithIdH\000\0228\n\021gr" +
      "aph_op_creation\030\007 \001(\0132\033.tensorflow.Graph" +
      "OpCreationH\000\0223\n\016debugged_graph\030\010 \001(\0132\031.t" +
      "ensorflow.DebuggedGraphH\000\022*\n\texecution\030\t" +
      " \001(\0132\025.tensorflow.ExecutionH\000\022@\n\025graph_e" +
      "xecution_trace\030\n \001(\0132\037.tensorflow.GraphE" +
      "xecutionTraceH\000\022\022\n\010graph_id\030\013 \001(\tH\000\0225\n\017d" +
      "ebugged_device\030\014 \001(\0132\032.tensorflow.Debugg" +
      "edDeviceH\000B\006\n\004what\"A\n\rDebugMetadata\022\032\n\022t" +
      "ensorflow_version\030\001 \001(\t\022\024\n\014file_version\030" +
      "\002 \001(\t\"A\n\nSourceFile\022\021\n\tfile_path\030\001 \001(\t\022\021" +
      "\n\thost_name\030\002 \001(\t\022\r\n\005lines\030\003 \003(\t\"]\n\020Stac" +
      "kFrameWithId\022\n\n\002id\030\001 \001(\t\022=\n\rfile_line_co" +
      "l\030\002 \001(\0132&.tensorflow.GraphDebugInfo.File" +
      "LineCol\":\n\014CodeLocation\022\021\n\thost_name\030\001 \001" +
      "(\t\022\027\n\017stack_frame_ids\030\002 \003(\t\"\344\001\n\017GraphOpC" +
      "reation\022\017\n\007op_type\030\001 \001(\t\022\017\n\007op_name\030\002 \001(" +
      "\t\022\022\n\ngraph_name\030\003 \001(\t\022\020\n\010graph_id\030\004 \001(\t\022" +
      "\023\n\013device_name\030\005 \001(\t\022\023\n\013input_names\030\006 \003(" +
      "\t\022\023\n\013num_outputs\030\007 \001(\005\022/\n\rcode_location\030" +
      "\010 \001(\0132\030.tensorflow.CodeLocation\022\031\n\021outpu" +
      "t_tensor_ids\030\t \003(\005\"\245\001\n\rDebuggedGraph\022\020\n\010" +
      "graph_id\030\001 \001(\t\022\022\n\ngraph_name\030\002 \001(\t\022\030\n\020in" +
      "strumented_ops\030\003 \003(\t\022\032\n\022original_graph_d" +
      "ef\030\004 \001(\014\022\036\n\026instrumented_graph_def\030\005 \001(\014" +
      "\022\030\n\020outer_context_id\030\006 \001(\t\"8\n\016DebuggedDe" +
      "vice\022\023\n\013device_name\030\001 \001(\t\022\021\n\tdevice_id\030\002" +
      " \001(\005\"\263\002\n\tExecution\022\017\n\007op_type\030\001 \001(\t\022\023\n\013n" +
      "um_outputs\030\002 \001(\005\022\020\n\010graph_id\030\003 \001(\t\022\030\n\020in" +
      "put_tensor_ids\030\004 \003(\003\022\031\n\021output_tensor_id" +
      "s\030\005 \003(\003\0226\n\021tensor_debug_mode\030\006 \001(\0162\033.ten" +
      "sorflow.TensorDebugMode\022.\n\rtensor_protos" +
      "\030\007 \003(\0132\027.tensorflow.TensorProto\022/\n\rcode_" +
      "location\030\010 \001(\0132\030.tensorflow.CodeLocation" +
      "\022 \n\030output_tensor_device_ids\030\t \003(\005\"\321\001\n\023G" +
      "raphExecutionTrace\022\030\n\020tfdbg_context_id\030\001" +
      " \001(\t\022\017\n\007op_name\030\002 \001(\t\022\023\n\013output_slot\030\003 \001" +
      "(\005\0226\n\021tensor_debug_mode\030\004 \001(\0162\033.tensorfl" +
      "ow.TensorDebugMode\022-\n\014tensor_proto\030\005 \001(\013" +
      "2\027.tensorflow.TensorProto\022\023\n\013device_name" +
      "\030\006 \001(\t*\266\001\n\017TensorDebugMode\022\017\n\013UNSPECIFIE" +
      "D\020\000\022\r\n\tNO_TENSOR\020\001\022\017\n\013CURT_HEALTH\020\002\022\022\n\016C" +
      "ONCISE_HEALTH\020\003\022\017\n\013FULL_HEALTH\020\004\022\t\n\005SHAP" +
      "E\020\005\022\021\n\rFULL_NUMERICS\020\006\022\017\n\013FULL_TENSOR\020\007\022" +
      "\036\n\032REDUCE_INF_NAN_THREE_SLOTS\020\010Bv\n\023org.t" +
      "ensorflow.utilB\020DebugEventProtosP\001ZHgith" +
      "ub.com/tensorflow/tensorflow/tensorflow/" +
      "go/core/core_protos_go_proto\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.tensorflow.framework.TensorProtos.getDescriptor(),
          org.tensorflow.framework.GraphDebugInfoProtos.getDescriptor(),
        });
    internal_static_tensorflow_DebugEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_DebugEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_DebugEvent_descriptor,
        new java.lang.String[] { "WallTime", "Step", "DebugMetadata", "SourceFile", "StackFrameWithId", "GraphOpCreation", "DebuggedGraph", "Execution", "GraphExecutionTrace", "GraphId", "DebuggedDevice", "What", });
    internal_static_tensorflow_DebugMetadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_DebugMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_DebugMetadata_descriptor,
        new java.lang.String[] { "TensorflowVersion", "FileVersion", });
    internal_static_tensorflow_SourceFile_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_SourceFile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SourceFile_descriptor,
        new java.lang.String[] { "FilePath", "HostName", "Lines", });
    internal_static_tensorflow_StackFrameWithId_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tensorflow_StackFrameWithId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_StackFrameWithId_descriptor,
        new java.lang.String[] { "Id", "FileLineCol", });
    internal_static_tensorflow_CodeLocation_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tensorflow_CodeLocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_CodeLocation_descriptor,
        new java.lang.String[] { "HostName", "StackFrameIds", });
    internal_static_tensorflow_GraphOpCreation_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_tensorflow_GraphOpCreation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GraphOpCreation_descriptor,
        new java.lang.String[] { "OpType", "OpName", "GraphName", "GraphId", "DeviceName", "InputNames", "NumOutputs", "CodeLocation", "OutputTensorIds", });
    internal_static_tensorflow_DebuggedGraph_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_tensorflow_DebuggedGraph_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_DebuggedGraph_descriptor,
        new java.lang.String[] { "GraphId", "GraphName", "InstrumentedOps", "OriginalGraphDef", "InstrumentedGraphDef", "OuterContextId", });
    internal_static_tensorflow_DebuggedDevice_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_tensorflow_DebuggedDevice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_DebuggedDevice_descriptor,
        new java.lang.String[] { "DeviceName", "DeviceId", });
    internal_static_tensorflow_Execution_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_tensorflow_Execution_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_Execution_descriptor,
        new java.lang.String[] { "OpType", "NumOutputs", "GraphId", "InputTensorIds", "OutputTensorIds", "TensorDebugMode", "TensorProtos", "CodeLocation", "OutputTensorDeviceIds", });
    internal_static_tensorflow_GraphExecutionTrace_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_tensorflow_GraphExecutionTrace_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GraphExecutionTrace_descriptor,
        new java.lang.String[] { "TfdbgContextId", "OpName", "OutputSlot", "TensorDebugMode", "TensorProto", "DeviceName", });
    org.tensorflow.framework.TensorProtos.getDescriptor();
    org.tensorflow.framework.GraphDebugInfoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
