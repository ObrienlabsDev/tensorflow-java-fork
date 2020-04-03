// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/data/experimental/snapshot.proto

package org.tensorflow.util;

/**
 * <pre>
 * Each SnapshotRecord represents one batch of pre-processed input data. A batch
 * consists of a list of tensors that we encode as TensorProtos. This message
 * doesn't store the structure of the batch.
 * </pre>
 *
 * Protobuf type {@code tensorflow.data.experimental.SnapshotRecord}
 */
public  final class SnapshotRecord extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.data.experimental.SnapshotRecord)
    SnapshotRecordOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SnapshotRecord.newBuilder() to construct.
  private SnapshotRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SnapshotRecord() {
    tensor_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SnapshotRecord();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SnapshotRecord(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              tensor_ = new java.util.ArrayList<org.tensorflow.framework.TensorProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            tensor_.add(
                input.readMessage(org.tensorflow.framework.TensorProto.parser(), extensionRegistry));
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
        tensor_ = java.util.Collections.unmodifiableList(tensor_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.util.SnapshotProtos.internal_static_tensorflow_data_experimental_SnapshotRecord_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.util.SnapshotProtos.internal_static_tensorflow_data_experimental_SnapshotRecord_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.util.SnapshotRecord.class, org.tensorflow.util.SnapshotRecord.Builder.class);
  }

  public static final int TENSOR_FIELD_NUMBER = 1;
  private java.util.List<org.tensorflow.framework.TensorProto> tensor_;
  /**
   * <code>repeated .tensorflow.TensorProto tensor = 1;</code>
   */
  public java.util.List<org.tensorflow.framework.TensorProto> getTensorList() {
    return tensor_;
  }
  /**
   * <code>repeated .tensorflow.TensorProto tensor = 1;</code>
   */
  public java.util.List<? extends org.tensorflow.framework.TensorProtoOrBuilder> 
      getTensorOrBuilderList() {
    return tensor_;
  }
  /**
   * <code>repeated .tensorflow.TensorProto tensor = 1;</code>
   */
  public int getTensorCount() {
    return tensor_.size();
  }
  /**
   * <code>repeated .tensorflow.TensorProto tensor = 1;</code>
   */
  public org.tensorflow.framework.TensorProto getTensor(int index) {
    return tensor_.get(index);
  }
  /**
   * <code>repeated .tensorflow.TensorProto tensor = 1;</code>
   */
  public org.tensorflow.framework.TensorProtoOrBuilder getTensorOrBuilder(
      int index) {
    return tensor_.get(index);
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
    for (int i = 0; i < tensor_.size(); i++) {
      output.writeMessage(1, tensor_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < tensor_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, tensor_.get(i));
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
    if (!(obj instanceof org.tensorflow.util.SnapshotRecord)) {
      return super.equals(obj);
    }
    org.tensorflow.util.SnapshotRecord other = (org.tensorflow.util.SnapshotRecord) obj;

    if (!getTensorList()
        .equals(other.getTensorList())) return false;
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
    if (getTensorCount() > 0) {
      hash = (37 * hash) + TENSOR_FIELD_NUMBER;
      hash = (53 * hash) + getTensorList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.util.SnapshotRecord parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.util.SnapshotRecord parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.util.SnapshotRecord parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.util.SnapshotRecord parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.util.SnapshotRecord parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.util.SnapshotRecord parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.util.SnapshotRecord parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.util.SnapshotRecord parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.util.SnapshotRecord parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.util.SnapshotRecord parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.util.SnapshotRecord parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.util.SnapshotRecord parseFrom(
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
  public static Builder newBuilder(org.tensorflow.util.SnapshotRecord prototype) {
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
   * Each SnapshotRecord represents one batch of pre-processed input data. A batch
   * consists of a list of tensors that we encode as TensorProtos. This message
   * doesn't store the structure of the batch.
   * </pre>
   *
   * Protobuf type {@code tensorflow.data.experimental.SnapshotRecord}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.data.experimental.SnapshotRecord)
      org.tensorflow.util.SnapshotRecordOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.util.SnapshotProtos.internal_static_tensorflow_data_experimental_SnapshotRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.util.SnapshotProtos.internal_static_tensorflow_data_experimental_SnapshotRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.util.SnapshotRecord.class, org.tensorflow.util.SnapshotRecord.Builder.class);
    }

    // Construct using org.tensorflow.util.SnapshotRecord.newBuilder()
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
        getTensorFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (tensorBuilder_ == null) {
        tensor_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        tensorBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.util.SnapshotProtos.internal_static_tensorflow_data_experimental_SnapshotRecord_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.util.SnapshotRecord getDefaultInstanceForType() {
      return org.tensorflow.util.SnapshotRecord.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.util.SnapshotRecord build() {
      org.tensorflow.util.SnapshotRecord result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.util.SnapshotRecord buildPartial() {
      org.tensorflow.util.SnapshotRecord result = new org.tensorflow.util.SnapshotRecord(this);
      int from_bitField0_ = bitField0_;
      if (tensorBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          tensor_ = java.util.Collections.unmodifiableList(tensor_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tensor_ = tensor_;
      } else {
        result.tensor_ = tensorBuilder_.build();
      }
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
      if (other instanceof org.tensorflow.util.SnapshotRecord) {
        return mergeFrom((org.tensorflow.util.SnapshotRecord)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.util.SnapshotRecord other) {
      if (other == org.tensorflow.util.SnapshotRecord.getDefaultInstance()) return this;
      if (tensorBuilder_ == null) {
        if (!other.tensor_.isEmpty()) {
          if (tensor_.isEmpty()) {
            tensor_ = other.tensor_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTensorIsMutable();
            tensor_.addAll(other.tensor_);
          }
          onChanged();
        }
      } else {
        if (!other.tensor_.isEmpty()) {
          if (tensorBuilder_.isEmpty()) {
            tensorBuilder_.dispose();
            tensorBuilder_ = null;
            tensor_ = other.tensor_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tensorBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTensorFieldBuilder() : null;
          } else {
            tensorBuilder_.addAllMessages(other.tensor_);
          }
        }
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
      org.tensorflow.util.SnapshotRecord parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.util.SnapshotRecord) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.tensorflow.framework.TensorProto> tensor_ =
      java.util.Collections.emptyList();
    private void ensureTensorIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tensor_ = new java.util.ArrayList<org.tensorflow.framework.TensorProto>(tensor_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.framework.TensorProto, org.tensorflow.framework.TensorProto.Builder, org.tensorflow.framework.TensorProtoOrBuilder> tensorBuilder_;

    /**
     * <code>repeated .tensorflow.TensorProto tensor = 1;</code>
     */
    public java.util.List<org.tensorflow.framework.TensorProto> getTensorList() {
      if (tensorBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tensor_);
      } else {
        return tensorBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tensorflow.TensorProto tensor = 1;</code>
     */
    public int getTensorCount() {
      if (tensorBuilder_ == null) {
        return tensor_.size();
      } else {
        return tensorBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tensorflow.TensorProto tensor = 1;</code>
     */
    public org.tensorflow.framework.TensorProto getTensor(int index) {
      if (tensorBuilder_ == null) {
        return tensor_.get(index);
      } else {
        return tensorBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tensorflow.TensorProto tensor = 1;</code>
     */
    public Builder setTensor(
        int index, org.tensorflow.framework.TensorProto value) {
      if (tensorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTensorIsMutable();
        tensor_.set(index, value);
        onChanged();
      } else {
        tensorBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.TensorProto tensor = 1;</code>
     */
    public Builder setTensor(
        int index, org.tensorflow.framework.TensorProto.Builder builderForValue) {
      if (tensorBuilder_ == null) {
        ensureTensorIsMutable();
        tensor_.set(index, builderForValue.build());
        onChanged();
      } else {
        tensorBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.TensorProto tensor = 1;</code>
     */
    public Builder addTensor(org.tensorflow.framework.TensorProto value) {
      if (tensorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTensorIsMutable();
        tensor_.add(value);
        onChanged();
      } else {
        tensorBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.TensorProto tensor = 1;</code>
     */
    public Builder addTensor(
        int index, org.tensorflow.framework.TensorProto value) {
      if (tensorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTensorIsMutable();
        tensor_.add(index, value);
        onChanged();
      } else {
        tensorBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.TensorProto tensor = 1;</code>
     */
    public Builder addTensor(
        org.tensorflow.framework.TensorProto.Builder builderForValue) {
      if (tensorBuilder_ == null) {
        ensureTensorIsMutable();
        tensor_.add(builderForValue.build());
        onChanged();
      } else {
        tensorBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.TensorProto tensor = 1;</code>
     */
    public Builder addTensor(
        int index, org.tensorflow.framework.TensorProto.Builder builderForValue) {
      if (tensorBuilder_ == null) {
        ensureTensorIsMutable();
        tensor_.add(index, builderForValue.build());
        onChanged();
      } else {
        tensorBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.TensorProto tensor = 1;</code>
     */
    public Builder addAllTensor(
        java.lang.Iterable<? extends org.tensorflow.framework.TensorProto> values) {
      if (tensorBuilder_ == null) {
        ensureTensorIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tensor_);
        onChanged();
      } else {
        tensorBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.TensorProto tensor = 1;</code>
     */
    public Builder clearTensor() {
      if (tensorBuilder_ == null) {
        tensor_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tensorBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.TensorProto tensor = 1;</code>
     */
    public Builder removeTensor(int index) {
      if (tensorBuilder_ == null) {
        ensureTensorIsMutable();
        tensor_.remove(index);
        onChanged();
      } else {
        tensorBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.TensorProto tensor = 1;</code>
     */
    public org.tensorflow.framework.TensorProto.Builder getTensorBuilder(
        int index) {
      return getTensorFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tensorflow.TensorProto tensor = 1;</code>
     */
    public org.tensorflow.framework.TensorProtoOrBuilder getTensorOrBuilder(
        int index) {
      if (tensorBuilder_ == null) {
        return tensor_.get(index);  } else {
        return tensorBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tensorflow.TensorProto tensor = 1;</code>
     */
    public java.util.List<? extends org.tensorflow.framework.TensorProtoOrBuilder> 
         getTensorOrBuilderList() {
      if (tensorBuilder_ != null) {
        return tensorBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tensor_);
      }
    }
    /**
     * <code>repeated .tensorflow.TensorProto tensor = 1;</code>
     */
    public org.tensorflow.framework.TensorProto.Builder addTensorBuilder() {
      return getTensorFieldBuilder().addBuilder(
          org.tensorflow.framework.TensorProto.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.TensorProto tensor = 1;</code>
     */
    public org.tensorflow.framework.TensorProto.Builder addTensorBuilder(
        int index) {
      return getTensorFieldBuilder().addBuilder(
          index, org.tensorflow.framework.TensorProto.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.TensorProto tensor = 1;</code>
     */
    public java.util.List<org.tensorflow.framework.TensorProto.Builder> 
         getTensorBuilderList() {
      return getTensorFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.framework.TensorProto, org.tensorflow.framework.TensorProto.Builder, org.tensorflow.framework.TensorProtoOrBuilder> 
        getTensorFieldBuilder() {
      if (tensorBuilder_ == null) {
        tensorBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.tensorflow.framework.TensorProto, org.tensorflow.framework.TensorProto.Builder, org.tensorflow.framework.TensorProtoOrBuilder>(
                tensor_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        tensor_ = null;
      }
      return tensorBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.data.experimental.SnapshotRecord)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.data.experimental.SnapshotRecord)
  private static final org.tensorflow.util.SnapshotRecord DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.util.SnapshotRecord();
  }

  public static org.tensorflow.util.SnapshotRecord getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SnapshotRecord>
      PARSER = new com.google.protobuf.AbstractParser<SnapshotRecord>() {
    @java.lang.Override
    public SnapshotRecord parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SnapshotRecord(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SnapshotRecord> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SnapshotRecord> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.util.SnapshotRecord getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

