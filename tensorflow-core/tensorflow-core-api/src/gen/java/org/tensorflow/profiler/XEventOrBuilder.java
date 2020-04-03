// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/profiler/protobuf/xplane.proto

package org.tensorflow.profiler;

public interface XEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.profiler.XEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * XEventMetadata.id of corresponding metadata.
   * </pre>
   *
   * <code>int64 metadata_id = 1;</code>
   */
  long getMetadataId();

  /**
   * <pre>
   * Start time of the event in picoseconds, as offset from
   * XLine.timestamp_ns().
   * </pre>
   *
   * <code>int64 offset_ps = 2;</code>
   */
  long getOffsetPs();

  /**
   * <pre>
   * Number of occurrences of the event, if aggregated.
   * </pre>
   *
   * <code>int64 num_occurrences = 5;</code>
   */
  long getNumOccurrences();

  /**
   * <pre>
   * Duration of the event in picoseconds. Can be zero for an instant event.
   * </pre>
   *
   * <code>int64 duration_ps = 3;</code>
   */
  long getDurationPs();

  /**
   * <pre>
   * XStats associated with the event.
   * </pre>
   *
   * <code>repeated .tensorflow.profiler.XStat stats = 4;</code>
   */
  java.util.List<org.tensorflow.profiler.XStat> 
      getStatsList();
  /**
   * <pre>
   * XStats associated with the event.
   * </pre>
   *
   * <code>repeated .tensorflow.profiler.XStat stats = 4;</code>
   */
  org.tensorflow.profiler.XStat getStats(int index);
  /**
   * <pre>
   * XStats associated with the event.
   * </pre>
   *
   * <code>repeated .tensorflow.profiler.XStat stats = 4;</code>
   */
  int getStatsCount();
  /**
   * <pre>
   * XStats associated with the event.
   * </pre>
   *
   * <code>repeated .tensorflow.profiler.XStat stats = 4;</code>
   */
  java.util.List<? extends org.tensorflow.profiler.XStatOrBuilder> 
      getStatsOrBuilderList();
  /**
   * <pre>
   * XStats associated with the event.
   * </pre>
   *
   * <code>repeated .tensorflow.profiler.XStat stats = 4;</code>
   */
  org.tensorflow.profiler.XStatOrBuilder getStatsOrBuilder(
      int index);

  public org.tensorflow.profiler.XEvent.DataCase getDataCase();
}
