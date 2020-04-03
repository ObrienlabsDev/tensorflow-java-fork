// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/data/experimental/snapshot.proto

package org.tensorflow.util;

/**
 * <pre>
 * This stores the metadata information present in each snapshot record.
 * </pre>
 *
 * Protobuf type {@code tensorflow.data.experimental.SnapshotMetadataRecord}
 */
public  final class SnapshotMetadataRecord extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.data.experimental.SnapshotMetadataRecord)
    SnapshotMetadataRecordOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SnapshotMetadataRecord.newBuilder() to construct.
  private SnapshotMetadataRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SnapshotMetadataRecord() {
    graphHash_ = "";
    runId_ = "";
    dtype_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SnapshotMetadataRecord();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SnapshotMetadataRecord(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            graphHash_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            runId_ = s;
            break;
          }
          case 24: {

            creationTimestamp_ = input.readInt64();
            break;
          }
          case 32: {

            version_ = input.readInt64();
            break;
          }
          case 40: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              dtype_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            dtype_.add(rawValue);
            break;
          }
          case 42: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                dtype_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              dtype_.add(rawValue);
            }
            input.popLimit(oldLimit);
            break;
          }
          case 8000: {

            finalized_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        dtype_ = java.util.Collections.unmodifiableList(dtype_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.util.SnapshotProtos.internal_static_tensorflow_data_experimental_SnapshotMetadataRecord_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.util.SnapshotProtos.internal_static_tensorflow_data_experimental_SnapshotMetadataRecord_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.util.SnapshotMetadataRecord.class, org.tensorflow.util.SnapshotMetadataRecord.Builder.class);
  }

  public static final int GRAPH_HASH_FIELD_NUMBER = 1;
  private volatile java.lang.Object graphHash_;
  /**
   * <pre>
   * Stores the fingerprint of the graph that describes the dataset that is
   * snapshotted.
   * </pre>
   *
   * <code>string graph_hash = 1;</code>
   */
  public java.lang.String getGraphHash() {
    java.lang.Object ref = graphHash_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      graphHash_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Stores the fingerprint of the graph that describes the dataset that is
   * snapshotted.
   * </pre>
   *
   * <code>string graph_hash = 1;</code>
   */
  public com.google.protobuf.ByteString
      getGraphHashBytes() {
    java.lang.Object ref = graphHash_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      graphHash_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RUN_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object runId_;
  /**
   * <pre>
   * Run ID that this snapshot corresponds to.
   * </pre>
   *
   * <code>string run_id = 2;</code>
   */
  public java.lang.String getRunId() {
    java.lang.Object ref = runId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      runId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Run ID that this snapshot corresponds to.
   * </pre>
   *
   * <code>string run_id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getRunIdBytes() {
    java.lang.Object ref = runId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      runId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATION_TIMESTAMP_FIELD_NUMBER = 3;
  private long creationTimestamp_;
  /**
   * <pre>
   * Time when we started creating this snapshot.
   * </pre>
   *
   * <code>int64 creation_timestamp = 3;</code>
   */
  public long getCreationTimestamp() {
    return creationTimestamp_;
  }

  public static final int VERSION_FIELD_NUMBER = 4;
  private long version_;
  /**
   * <pre>
   * Version of the snapshot data file format.
   * </pre>
   *
   * <code>int64 version = 4;</code>
   */
  public long getVersion() {
    return version_;
  }

  public static final int DTYPE_FIELD_NUMBER = 5;
  private java.util.List<java.lang.Integer> dtype_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, org.tensorflow.framework.DataType> dtype_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, org.tensorflow.framework.DataType>() {
            public org.tensorflow.framework.DataType convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              org.tensorflow.framework.DataType result = org.tensorflow.framework.DataType.valueOf(from);
              return result == null ? org.tensorflow.framework.DataType.UNRECOGNIZED : result;
            }
          };
  /**
   * <pre>
   * A list of tensor dtype corresponding to each element of the snapshot.
   * </pre>
   *
   * <code>repeated .tensorflow.DataType dtype = 5;</code>
   */
  public java.util.List<org.tensorflow.framework.DataType> getDtypeList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, org.tensorflow.framework.DataType>(dtype_, dtype_converter_);
  }
  /**
   * <pre>
   * A list of tensor dtype corresponding to each element of the snapshot.
   * </pre>
   *
   * <code>repeated .tensorflow.DataType dtype = 5;</code>
   */
  public int getDtypeCount() {
    return dtype_.size();
  }
  /**
   * <pre>
   * A list of tensor dtype corresponding to each element of the snapshot.
   * </pre>
   *
   * <code>repeated .tensorflow.DataType dtype = 5;</code>
   */
  public org.tensorflow.framework.DataType getDtype(int index) {
    return dtype_converter_.convert(dtype_.get(index));
  }
  /**
   * <pre>
   * A list of tensor dtype corresponding to each element of the snapshot.
   * </pre>
   *
   * <code>repeated .tensorflow.DataType dtype = 5;</code>
   */
  public java.util.List<java.lang.Integer>
  getDtypeValueList() {
    return dtype_;
  }
  /**
   * <pre>
   * A list of tensor dtype corresponding to each element of the snapshot.
   * </pre>
   *
   * <code>repeated .tensorflow.DataType dtype = 5;</code>
   */
  public int getDtypeValue(int index) {
    return dtype_.get(index);
  }
  private int dtypeMemoizedSerializedSize;

  public static final int FINALIZED_FIELD_NUMBER = 1000;
  private boolean finalized_;
  /**
   * <code>bool finalized = 1000;</code>
   */
  public boolean getFinalized() {
    return finalized_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (!getGraphHashBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, graphHash_);
    }
    if (!getRunIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, runId_);
    }
    if (creationTimestamp_ != 0L) {
      output.writeInt64(3, creationTimestamp_);
    }
    if (version_ != 0L) {
      output.writeInt64(4, version_);
    }
    if (getDtypeList().size() > 0) {
      output.writeUInt32NoTag(42);
      output.writeUInt32NoTag(dtypeMemoizedSerializedSize);
    }
    for (int i = 0; i < dtype_.size(); i++) {
      output.writeEnumNoTag(dtype_.get(i));
    }
    if (finalized_ != false) {
      output.writeBool(1000, finalized_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getGraphHashBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, graphHash_);
    }
    if (!getRunIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, runId_);
    }
    if (creationTimestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, creationTimestamp_);
    }
    if (version_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, version_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < dtype_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(dtype_.get(i));
      }
      size += dataSize;
      if (!getDtypeList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }dtypeMemoizedSerializedSize = dataSize;
    }
    if (finalized_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1000, finalized_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.tensorflow.util.SnapshotMetadataRecord)) {
      return super.equals(obj);
    }
    org.tensorflow.util.SnapshotMetadataRecord other = (org.tensorflow.util.SnapshotMetadataRecord) obj;

    if (!getGraphHash()
        .equals(other.getGraphHash())) return false;
    if (!getRunId()
        .equals(other.getRunId())) return false;
    if (getCreationTimestamp()
        != other.getCreationTimestamp()) return false;
    if (getVersion()
        != other.getVersion()) return false;
    if (!dtype_.equals(other.dtype_)) return false;
    if (getFinalized()
        != other.getFinalized()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + GRAPH_HASH_FIELD_NUMBER;
    hash = (53 * hash) + getGraphHash().hashCode();
    hash = (37 * hash) + RUN_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRunId().hashCode();
    hash = (37 * hash) + CREATION_TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCreationTimestamp());
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getVersion());
    if (getDtypeCount() > 0) {
      hash = (37 * hash) + DTYPE_FIELD_NUMBER;
      hash = (53 * hash) + dtype_.hashCode();
    }
    hash = (37 * hash) + FINALIZED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFinalized());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.util.SnapshotMetadataRecord parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.util.SnapshotMetadataRecord parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.util.SnapshotMetadataRecord parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.util.SnapshotMetadataRecord parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.util.SnapshotMetadataRecord parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.util.SnapshotMetadataRecord parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.util.SnapshotMetadataRecord parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.util.SnapshotMetadataRecord parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.util.SnapshotMetadataRecord parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.util.SnapshotMetadataRecord parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.util.SnapshotMetadataRecord parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.util.SnapshotMetadataRecord parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.tensorflow.util.SnapshotMetadataRecord prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * This stores the metadata information present in each snapshot record.
   * </pre>
   *
   * Protobuf type {@code tensorflow.data.experimental.SnapshotMetadataRecord}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.data.experimental.SnapshotMetadataRecord)
      org.tensorflow.util.SnapshotMetadataRecordOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.util.SnapshotProtos.internal_static_tensorflow_data_experimental_SnapshotMetadataRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.util.SnapshotProtos.internal_static_tensorflow_data_experimental_SnapshotMetadataRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.util.SnapshotMetadataRecord.class, org.tensorflow.util.SnapshotMetadataRecord.Builder.class);
    }

    // Construct using org.tensorflow.util.SnapshotMetadataRecord.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      graphHash_ = "";

      runId_ = "";

      creationTimestamp_ = 0L;

      version_ = 0L;

      dtype_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      finalized_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.util.SnapshotProtos.internal_static_tensorflow_data_experimental_SnapshotMetadataRecord_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.util.SnapshotMetadataRecord getDefaultInstanceForType() {
      return org.tensorflow.util.SnapshotMetadataRecord.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.util.SnapshotMetadataRecord build() {
      org.tensorflow.util.SnapshotMetadataRecord result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.util.SnapshotMetadataRecord buildPartial() {
      org.tensorflow.util.SnapshotMetadataRecord result = new org.tensorflow.util.SnapshotMetadataRecord(this);
      int from_bitField0_ = bitField0_;
      result.graphHash_ = graphHash_;
      result.runId_ = runId_;
      result.creationTimestamp_ = creationTimestamp_;
      result.version_ = version_;
      if (((bitField0_ & 0x00000001) != 0)) {
        dtype_ = java.util.Collections.unmodifiableList(dtype_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.dtype_ = dtype_;
      result.finalized_ = finalized_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tensorflow.util.SnapshotMetadataRecord) {
        return mergeFrom((org.tensorflow.util.SnapshotMetadataRecord)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.util.SnapshotMetadataRecord other) {
      if (other == org.tensorflow.util.SnapshotMetadataRecord.getDefaultInstance()) return this;
      if (!other.getGraphHash().isEmpty()) {
        graphHash_ = other.graphHash_;
        onChanged();
      }
      if (!other.getRunId().isEmpty()) {
        runId_ = other.runId_;
        onChanged();
      }
      if (other.getCreationTimestamp() != 0L) {
        setCreationTimestamp(other.getCreationTimestamp());
      }
      if (other.getVersion() != 0L) {
        setVersion(other.getVersion());
      }
      if (!other.dtype_.isEmpty()) {
        if (dtype_.isEmpty()) {
          dtype_ = other.dtype_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureDtypeIsMutable();
          dtype_.addAll(other.dtype_);
        }
        onChanged();
      }
      if (other.getFinalized() != false) {
        setFinalized(other.getFinalized());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.tensorflow.util.SnapshotMetadataRecord parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.util.SnapshotMetadataRecord) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object graphHash_ = "";
    /**
     * <pre>
     * Stores the fingerprint of the graph that describes the dataset that is
     * snapshotted.
     * </pre>
     *
     * <code>string graph_hash = 1;</code>
     */
    public java.lang.String getGraphHash() {
      java.lang.Object ref = graphHash_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        graphHash_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Stores the fingerprint of the graph that describes the dataset that is
     * snapshotted.
     * </pre>
     *
     * <code>string graph_hash = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGraphHashBytes() {
      java.lang.Object ref = graphHash_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        graphHash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Stores the fingerprint of the graph that describes the dataset that is
     * snapshotted.
     * </pre>
     *
     * <code>string graph_hash = 1;</code>
     */
    public Builder setGraphHash(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      graphHash_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Stores the fingerprint of the graph that describes the dataset that is
     * snapshotted.
     * </pre>
     *
     * <code>string graph_hash = 1;</code>
     */
    public Builder clearGraphHash() {
      
      graphHash_ = getDefaultInstance().getGraphHash();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Stores the fingerprint of the graph that describes the dataset that is
     * snapshotted.
     * </pre>
     *
     * <code>string graph_hash = 1;</code>
     */
    public Builder setGraphHashBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      graphHash_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object runId_ = "";
    /**
     * <pre>
     * Run ID that this snapshot corresponds to.
     * </pre>
     *
     * <code>string run_id = 2;</code>
     */
    public java.lang.String getRunId() {
      java.lang.Object ref = runId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        runId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Run ID that this snapshot corresponds to.
     * </pre>
     *
     * <code>string run_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRunIdBytes() {
      java.lang.Object ref = runId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        runId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Run ID that this snapshot corresponds to.
     * </pre>
     *
     * <code>string run_id = 2;</code>
     */
    public Builder setRunId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      runId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Run ID that this snapshot corresponds to.
     * </pre>
     *
     * <code>string run_id = 2;</code>
     */
    public Builder clearRunId() {
      
      runId_ = getDefaultInstance().getRunId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Run ID that this snapshot corresponds to.
     * </pre>
     *
     * <code>string run_id = 2;</code>
     */
    public Builder setRunIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      runId_ = value;
      onChanged();
      return this;
    }

    private long creationTimestamp_ ;
    /**
     * <pre>
     * Time when we started creating this snapshot.
     * </pre>
     *
     * <code>int64 creation_timestamp = 3;</code>
     */
    public long getCreationTimestamp() {
      return creationTimestamp_;
    }
    /**
     * <pre>
     * Time when we started creating this snapshot.
     * </pre>
     *
     * <code>int64 creation_timestamp = 3;</code>
     */
    public Builder setCreationTimestamp(long value) {
      
      creationTimestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time when we started creating this snapshot.
     * </pre>
     *
     * <code>int64 creation_timestamp = 3;</code>
     */
    public Builder clearCreationTimestamp() {
      
      creationTimestamp_ = 0L;
      onChanged();
      return this;
    }

    private long version_ ;
    /**
     * <pre>
     * Version of the snapshot data file format.
     * </pre>
     *
     * <code>int64 version = 4;</code>
     */
    public long getVersion() {
      return version_;
    }
    /**
     * <pre>
     * Version of the snapshot data file format.
     * </pre>
     *
     * <code>int64 version = 4;</code>
     */
    public Builder setVersion(long value) {
      
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Version of the snapshot data file format.
     * </pre>
     *
     * <code>int64 version = 4;</code>
     */
    public Builder clearVersion() {
      
      version_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> dtype_ =
      java.util.Collections.emptyList();
    private void ensureDtypeIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dtype_ = new java.util.ArrayList<java.lang.Integer>(dtype_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <pre>
     * A list of tensor dtype corresponding to each element of the snapshot.
     * </pre>
     *
     * <code>repeated .tensorflow.DataType dtype = 5;</code>
     */
    public java.util.List<org.tensorflow.framework.DataType> getDtypeList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, org.tensorflow.framework.DataType>(dtype_, dtype_converter_);
    }
    /**
     * <pre>
     * A list of tensor dtype corresponding to each element of the snapshot.
     * </pre>
     *
     * <code>repeated .tensorflow.DataType dtype = 5;</code>
     */
    public int getDtypeCount() {
      return dtype_.size();
    }
    /**
     * <pre>
     * A list of tensor dtype corresponding to each element of the snapshot.
     * </pre>
     *
     * <code>repeated .tensorflow.DataType dtype = 5;</code>
     */
    public org.tensorflow.framework.DataType getDtype(int index) {
      return dtype_converter_.convert(dtype_.get(index));
    }
    /**
     * <pre>
     * A list of tensor dtype corresponding to each element of the snapshot.
     * </pre>
     *
     * <code>repeated .tensorflow.DataType dtype = 5;</code>
     */
    public Builder setDtype(
        int index, org.tensorflow.framework.DataType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureDtypeIsMutable();
      dtype_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of tensor dtype corresponding to each element of the snapshot.
     * </pre>
     *
     * <code>repeated .tensorflow.DataType dtype = 5;</code>
     */
    public Builder addDtype(org.tensorflow.framework.DataType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureDtypeIsMutable();
      dtype_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of tensor dtype corresponding to each element of the snapshot.
     * </pre>
     *
     * <code>repeated .tensorflow.DataType dtype = 5;</code>
     */
    public Builder addAllDtype(
        java.lang.Iterable<? extends org.tensorflow.framework.DataType> values) {
      ensureDtypeIsMutable();
      for (org.tensorflow.framework.DataType value : values) {
        dtype_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of tensor dtype corresponding to each element of the snapshot.
     * </pre>
     *
     * <code>repeated .tensorflow.DataType dtype = 5;</code>
     */
    public Builder clearDtype() {
      dtype_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of tensor dtype corresponding to each element of the snapshot.
     * </pre>
     *
     * <code>repeated .tensorflow.DataType dtype = 5;</code>
     */
    public java.util.List<java.lang.Integer>
    getDtypeValueList() {
      return java.util.Collections.unmodifiableList(dtype_);
    }
    /**
     * <pre>
     * A list of tensor dtype corresponding to each element of the snapshot.
     * </pre>
     *
     * <code>repeated .tensorflow.DataType dtype = 5;</code>
     */
    public int getDtypeValue(int index) {
      return dtype_.get(index);
    }
    /**
     * <pre>
     * A list of tensor dtype corresponding to each element of the snapshot.
     * </pre>
     *
     * <code>repeated .tensorflow.DataType dtype = 5;</code>
     */
    public Builder setDtypeValue(
        int index, int value) {
      ensureDtypeIsMutable();
      dtype_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of tensor dtype corresponding to each element of the snapshot.
     * </pre>
     *
     * <code>repeated .tensorflow.DataType dtype = 5;</code>
     */
    public Builder addDtypeValue(int value) {
      ensureDtypeIsMutable();
      dtype_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of tensor dtype corresponding to each element of the snapshot.
     * </pre>
     *
     * <code>repeated .tensorflow.DataType dtype = 5;</code>
     */
    public Builder addAllDtypeValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureDtypeIsMutable();
      for (int value : values) {
        dtype_.add(value);
      }
      onChanged();
      return this;
    }

    private boolean finalized_ ;
    /**
     * <code>bool finalized = 1000;</code>
     */
    public boolean getFinalized() {
      return finalized_;
    }
    /**
     * <code>bool finalized = 1000;</code>
     */
    public Builder setFinalized(boolean value) {
      
      finalized_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool finalized = 1000;</code>
     */
    public Builder clearFinalized() {
      
      finalized_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.data.experimental.SnapshotMetadataRecord)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.data.experimental.SnapshotMetadataRecord)
  private static final org.tensorflow.util.SnapshotMetadataRecord DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.util.SnapshotMetadataRecord();
  }

  public static org.tensorflow.util.SnapshotMetadataRecord getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SnapshotMetadataRecord>
      PARSER = new com.google.protobuf.AbstractParser<SnapshotMetadataRecord>() {
    @java.lang.Override
    public SnapshotMetadataRecord parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SnapshotMetadataRecord(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SnapshotMetadataRecord> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SnapshotMetadataRecord> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.util.SnapshotMetadataRecord getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

