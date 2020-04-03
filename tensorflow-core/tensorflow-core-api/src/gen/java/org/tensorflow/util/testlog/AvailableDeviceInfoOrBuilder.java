// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/util/test_log.proto

package org.tensorflow.util.testlog;

public interface AvailableDeviceInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.AvailableDeviceInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Device name.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Device name.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Device type, e.g. 'CPU' or 'GPU'.
   * </pre>
   *
   * <code>string type = 2;</code>
   */
  java.lang.String getType();
  /**
   * <pre>
   * Device type, e.g. 'CPU' or 'GPU'.
   * </pre>
   *
   * <code>string type = 2;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * Memory capacity in bytes.
   * </pre>
   *
   * <code>int64 memory_limit = 3;</code>
   */
  long getMemoryLimit();

  /**
   * <pre>
   * The physical description of this device.
   * </pre>
   *
   * <code>string physical_description = 4;</code>
   */
  java.lang.String getPhysicalDescription();
  /**
   * <pre>
   * The physical description of this device.
   * </pre>
   *
   * <code>string physical_description = 4;</code>
   */
  com.google.protobuf.ByteString
      getPhysicalDescriptionBytes();
}
