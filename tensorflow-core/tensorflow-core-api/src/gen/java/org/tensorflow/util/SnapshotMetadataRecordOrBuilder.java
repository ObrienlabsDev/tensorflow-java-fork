// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/data/experimental/snapshot.proto

package org.tensorflow.util;

public interface SnapshotMetadataRecordOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.data.experimental.SnapshotMetadataRecord)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Stores the fingerprint of the graph that describes the dataset that is
   * snapshotted.
   * </pre>
   *
   * <code>string graph_hash = 1;</code>
   */
  java.lang.String getGraphHash();
  /**
   * <pre>
   * Stores the fingerprint of the graph that describes the dataset that is
   * snapshotted.
   * </pre>
   *
   * <code>string graph_hash = 1;</code>
   */
  com.google.protobuf.ByteString
      getGraphHashBytes();

  /**
   * <pre>
   * Run ID that this snapshot corresponds to.
   * </pre>
   *
   * <code>string run_id = 2;</code>
   */
  java.lang.String getRunId();
  /**
   * <pre>
   * Run ID that this snapshot corresponds to.
   * </pre>
   *
   * <code>string run_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getRunIdBytes();

  /**
   * <pre>
   * Time when we started creating this snapshot.
   * </pre>
   *
   * <code>int64 creation_timestamp = 3;</code>
   */
  long getCreationTimestamp();

  /**
   * <pre>
   * Version of the snapshot data file format.
   * </pre>
   *
   * <code>int64 version = 4;</code>
   */
  long getVersion();

  /**
   * <pre>
   * A list of tensor dtype corresponding to each element of the snapshot.
   * </pre>
   *
   * <code>repeated .tensorflow.DataType dtype = 5;</code>
   */
  java.util.List<org.tensorflow.framework.DataType> getDtypeList();
  /**
   * <pre>
   * A list of tensor dtype corresponding to each element of the snapshot.
   * </pre>
   *
   * <code>repeated .tensorflow.DataType dtype = 5;</code>
   */
  int getDtypeCount();
  /**
   * <pre>
   * A list of tensor dtype corresponding to each element of the snapshot.
   * </pre>
   *
   * <code>repeated .tensorflow.DataType dtype = 5;</code>
   */
  org.tensorflow.framework.DataType getDtype(int index);
  /**
   * <pre>
   * A list of tensor dtype corresponding to each element of the snapshot.
   * </pre>
   *
   * <code>repeated .tensorflow.DataType dtype = 5;</code>
   */
  java.util.List<java.lang.Integer>
  getDtypeValueList();
  /**
   * <pre>
   * A list of tensor dtype corresponding to each element of the snapshot.
   * </pre>
   *
   * <code>repeated .tensorflow.DataType dtype = 5;</code>
   */
  int getDtypeValue(int index);

  /**
   * <code>bool finalized = 1000;</code>
   */
  boolean getFinalized();
}
