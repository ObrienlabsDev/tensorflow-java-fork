// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/trackable_object_graph.proto

package org.tensorflow.framework;

public interface TrackableObjectGraphOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.TrackableObjectGraph)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .tensorflow.TrackableObjectGraph.TrackableObject nodes = 1;</code>
   */
  java.util.List<org.tensorflow.framework.TrackableObjectGraph.TrackableObject> 
      getNodesList();
  /**
   * <code>repeated .tensorflow.TrackableObjectGraph.TrackableObject nodes = 1;</code>
   */
  org.tensorflow.framework.TrackableObjectGraph.TrackableObject getNodes(int index);
  /**
   * <code>repeated .tensorflow.TrackableObjectGraph.TrackableObject nodes = 1;</code>
   */
  int getNodesCount();
  /**
   * <code>repeated .tensorflow.TrackableObjectGraph.TrackableObject nodes = 1;</code>
   */
  java.util.List<? extends org.tensorflow.framework.TrackableObjectGraph.TrackableObjectOrBuilder> 
      getNodesOrBuilderList();
  /**
   * <code>repeated .tensorflow.TrackableObjectGraph.TrackableObject nodes = 1;</code>
   */
  org.tensorflow.framework.TrackableObjectGraph.TrackableObjectOrBuilder getNodesOrBuilder(
      int index);
}
