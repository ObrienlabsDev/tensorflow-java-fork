// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/data/experimental/snapshot.proto

package org.tensorflow.util;

public interface SnapshotRecordOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.data.experimental.SnapshotRecord)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .tensorflow.TensorProto tensor = 1;</code>
   */
  java.util.List<org.tensorflow.framework.TensorProto> 
      getTensorList();
  /**
   * <code>repeated .tensorflow.TensorProto tensor = 1;</code>
   */
  org.tensorflow.framework.TensorProto getTensor(int index);
  /**
   * <code>repeated .tensorflow.TensorProto tensor = 1;</code>
   */
  int getTensorCount();
  /**
   * <code>repeated .tensorflow.TensorProto tensor = 1;</code>
   */
  java.util.List<? extends org.tensorflow.framework.TensorProtoOrBuilder> 
      getTensorOrBuilderList();
  /**
   * <code>repeated .tensorflow.TensorProto tensor = 1;</code>
   */
  org.tensorflow.framework.TensorProtoOrBuilder getTensorOrBuilder(
      int index);
}
