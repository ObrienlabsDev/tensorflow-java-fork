// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/util/saved_tensor_slice.proto

package org.tensorflow.util;

/**
 * <pre>
 * Each record in a v3 checkpoint file is a serialized SavedTensorSlices
 * message.
 * </pre>
 *
 * Protobuf type {@code tensorflow.SavedTensorSlices}
 */
public  final class SavedTensorSlices extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.SavedTensorSlices)
    SavedTensorSlicesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SavedTensorSlices.newBuilder() to construct.
  private SavedTensorSlices(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SavedTensorSlices() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SavedTensorSlices();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SavedTensorSlices(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            org.tensorflow.util.SavedTensorSliceMeta.Builder subBuilder = null;
            if (meta_ != null) {
              subBuilder = meta_.toBuilder();
            }
            meta_ = input.readMessage(org.tensorflow.util.SavedTensorSliceMeta.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(meta_);
              meta_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            org.tensorflow.util.SavedSlice.Builder subBuilder = null;
            if (data_ != null) {
              subBuilder = data_.toBuilder();
            }
            data_ = input.readMessage(org.tensorflow.util.SavedSlice.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(data_);
              data_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.util.SavedTensorSliceProtos.internal_static_tensorflow_SavedTensorSlices_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.util.SavedTensorSliceProtos.internal_static_tensorflow_SavedTensorSlices_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.util.SavedTensorSlices.class, org.tensorflow.util.SavedTensorSlices.Builder.class);
  }

  public static final int META_FIELD_NUMBER = 1;
  private org.tensorflow.util.SavedTensorSliceMeta meta_;
  /**
   * <pre>
   * This is only present at the first item of each checkpoint file and serves
   * as a table of contents, listing all the tensor slices saved in this file.
   * </pre>
   *
   * <code>.tensorflow.SavedTensorSliceMeta meta = 1;</code>
   */
  public boolean hasMeta() {
    return meta_ != null;
  }
  /**
   * <pre>
   * This is only present at the first item of each checkpoint file and serves
   * as a table of contents, listing all the tensor slices saved in this file.
   * </pre>
   *
   * <code>.tensorflow.SavedTensorSliceMeta meta = 1;</code>
   */
  public org.tensorflow.util.SavedTensorSliceMeta getMeta() {
    return meta_ == null ? org.tensorflow.util.SavedTensorSliceMeta.getDefaultInstance() : meta_;
  }
  /**
   * <pre>
   * This is only present at the first item of each checkpoint file and serves
   * as a table of contents, listing all the tensor slices saved in this file.
   * </pre>
   *
   * <code>.tensorflow.SavedTensorSliceMeta meta = 1;</code>
   */
  public org.tensorflow.util.SavedTensorSliceMetaOrBuilder getMetaOrBuilder() {
    return getMeta();
  }

  public static final int DATA_FIELD_NUMBER = 2;
  private org.tensorflow.util.SavedSlice data_;
  /**
   * <pre>
   * This exists in all but the first item of each checkpoint file.
   * </pre>
   *
   * <code>.tensorflow.SavedSlice data = 2;</code>
   */
  public boolean hasData() {
    return data_ != null;
  }
  /**
   * <pre>
   * This exists in all but the first item of each checkpoint file.
   * </pre>
   *
   * <code>.tensorflow.SavedSlice data = 2;</code>
   */
  public org.tensorflow.util.SavedSlice getData() {
    return data_ == null ? org.tensorflow.util.SavedSlice.getDefaultInstance() : data_;
  }
  /**
   * <pre>
   * This exists in all but the first item of each checkpoint file.
   * </pre>
   *
   * <code>.tensorflow.SavedSlice data = 2;</code>
   */
  public org.tensorflow.util.SavedSliceOrBuilder getDataOrBuilder() {
    return getData();
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
    if (meta_ != null) {
      output.writeMessage(1, getMeta());
    }
    if (data_ != null) {
      output.writeMessage(2, getData());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (meta_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMeta());
    }
    if (data_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getData());
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
    if (!(obj instanceof org.tensorflow.util.SavedTensorSlices)) {
      return super.equals(obj);
    }
    org.tensorflow.util.SavedTensorSlices other = (org.tensorflow.util.SavedTensorSlices) obj;

    if (hasMeta() != other.hasMeta()) return false;
    if (hasMeta()) {
      if (!getMeta()
          .equals(other.getMeta())) return false;
    }
    if (hasData() != other.hasData()) return false;
    if (hasData()) {
      if (!getData()
          .equals(other.getData())) return false;
    }
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
    if (hasMeta()) {
      hash = (37 * hash) + META_FIELD_NUMBER;
      hash = (53 * hash) + getMeta().hashCode();
    }
    if (hasData()) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.util.SavedTensorSlices parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.util.SavedTensorSlices parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.util.SavedTensorSlices parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.util.SavedTensorSlices parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.util.SavedTensorSlices parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.util.SavedTensorSlices parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.util.SavedTensorSlices parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.util.SavedTensorSlices parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.util.SavedTensorSlices parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.util.SavedTensorSlices parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.util.SavedTensorSlices parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.util.SavedTensorSlices parseFrom(
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
  public static Builder newBuilder(org.tensorflow.util.SavedTensorSlices prototype) {
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
   * Each record in a v3 checkpoint file is a serialized SavedTensorSlices
   * message.
   * </pre>
   *
   * Protobuf type {@code tensorflow.SavedTensorSlices}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.SavedTensorSlices)
      org.tensorflow.util.SavedTensorSlicesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.util.SavedTensorSliceProtos.internal_static_tensorflow_SavedTensorSlices_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.util.SavedTensorSliceProtos.internal_static_tensorflow_SavedTensorSlices_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.util.SavedTensorSlices.class, org.tensorflow.util.SavedTensorSlices.Builder.class);
    }

    // Construct using org.tensorflow.util.SavedTensorSlices.newBuilder()
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
      if (metaBuilder_ == null) {
        meta_ = null;
      } else {
        meta_ = null;
        metaBuilder_ = null;
      }
      if (dataBuilder_ == null) {
        data_ = null;
      } else {
        data_ = null;
        dataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.util.SavedTensorSliceProtos.internal_static_tensorflow_SavedTensorSlices_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.util.SavedTensorSlices getDefaultInstanceForType() {
      return org.tensorflow.util.SavedTensorSlices.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.util.SavedTensorSlices build() {
      org.tensorflow.util.SavedTensorSlices result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.util.SavedTensorSlices buildPartial() {
      org.tensorflow.util.SavedTensorSlices result = new org.tensorflow.util.SavedTensorSlices(this);
      if (metaBuilder_ == null) {
        result.meta_ = meta_;
      } else {
        result.meta_ = metaBuilder_.build();
      }
      if (dataBuilder_ == null) {
        result.data_ = data_;
      } else {
        result.data_ = dataBuilder_.build();
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
      if (other instanceof org.tensorflow.util.SavedTensorSlices) {
        return mergeFrom((org.tensorflow.util.SavedTensorSlices)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.util.SavedTensorSlices other) {
      if (other == org.tensorflow.util.SavedTensorSlices.getDefaultInstance()) return this;
      if (other.hasMeta()) {
        mergeMeta(other.getMeta());
      }
      if (other.hasData()) {
        mergeData(other.getData());
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
      org.tensorflow.util.SavedTensorSlices parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.util.SavedTensorSlices) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.tensorflow.util.SavedTensorSliceMeta meta_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.util.SavedTensorSliceMeta, org.tensorflow.util.SavedTensorSliceMeta.Builder, org.tensorflow.util.SavedTensorSliceMetaOrBuilder> metaBuilder_;
    /**
     * <pre>
     * This is only present at the first item of each checkpoint file and serves
     * as a table of contents, listing all the tensor slices saved in this file.
     * </pre>
     *
     * <code>.tensorflow.SavedTensorSliceMeta meta = 1;</code>
     */
    public boolean hasMeta() {
      return metaBuilder_ != null || meta_ != null;
    }
    /**
     * <pre>
     * This is only present at the first item of each checkpoint file and serves
     * as a table of contents, listing all the tensor slices saved in this file.
     * </pre>
     *
     * <code>.tensorflow.SavedTensorSliceMeta meta = 1;</code>
     */
    public org.tensorflow.util.SavedTensorSliceMeta getMeta() {
      if (metaBuilder_ == null) {
        return meta_ == null ? org.tensorflow.util.SavedTensorSliceMeta.getDefaultInstance() : meta_;
      } else {
        return metaBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * This is only present at the first item of each checkpoint file and serves
     * as a table of contents, listing all the tensor slices saved in this file.
     * </pre>
     *
     * <code>.tensorflow.SavedTensorSliceMeta meta = 1;</code>
     */
    public Builder setMeta(org.tensorflow.util.SavedTensorSliceMeta value) {
      if (metaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        meta_ = value;
        onChanged();
      } else {
        metaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * This is only present at the first item of each checkpoint file and serves
     * as a table of contents, listing all the tensor slices saved in this file.
     * </pre>
     *
     * <code>.tensorflow.SavedTensorSliceMeta meta = 1;</code>
     */
    public Builder setMeta(
        org.tensorflow.util.SavedTensorSliceMeta.Builder builderForValue) {
      if (metaBuilder_ == null) {
        meta_ = builderForValue.build();
        onChanged();
      } else {
        metaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * This is only present at the first item of each checkpoint file and serves
     * as a table of contents, listing all the tensor slices saved in this file.
     * </pre>
     *
     * <code>.tensorflow.SavedTensorSliceMeta meta = 1;</code>
     */
    public Builder mergeMeta(org.tensorflow.util.SavedTensorSliceMeta value) {
      if (metaBuilder_ == null) {
        if (meta_ != null) {
          meta_ =
            org.tensorflow.util.SavedTensorSliceMeta.newBuilder(meta_).mergeFrom(value).buildPartial();
        } else {
          meta_ = value;
        }
        onChanged();
      } else {
        metaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * This is only present at the first item of each checkpoint file and serves
     * as a table of contents, listing all the tensor slices saved in this file.
     * </pre>
     *
     * <code>.tensorflow.SavedTensorSliceMeta meta = 1;</code>
     */
    public Builder clearMeta() {
      if (metaBuilder_ == null) {
        meta_ = null;
        onChanged();
      } else {
        meta_ = null;
        metaBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * This is only present at the first item of each checkpoint file and serves
     * as a table of contents, listing all the tensor slices saved in this file.
     * </pre>
     *
     * <code>.tensorflow.SavedTensorSliceMeta meta = 1;</code>
     */
    public org.tensorflow.util.SavedTensorSliceMeta.Builder getMetaBuilder() {
      
      onChanged();
      return getMetaFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * This is only present at the first item of each checkpoint file and serves
     * as a table of contents, listing all the tensor slices saved in this file.
     * </pre>
     *
     * <code>.tensorflow.SavedTensorSliceMeta meta = 1;</code>
     */
    public org.tensorflow.util.SavedTensorSliceMetaOrBuilder getMetaOrBuilder() {
      if (metaBuilder_ != null) {
        return metaBuilder_.getMessageOrBuilder();
      } else {
        return meta_ == null ?
            org.tensorflow.util.SavedTensorSliceMeta.getDefaultInstance() : meta_;
      }
    }
    /**
     * <pre>
     * This is only present at the first item of each checkpoint file and serves
     * as a table of contents, listing all the tensor slices saved in this file.
     * </pre>
     *
     * <code>.tensorflow.SavedTensorSliceMeta meta = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.util.SavedTensorSliceMeta, org.tensorflow.util.SavedTensorSliceMeta.Builder, org.tensorflow.util.SavedTensorSliceMetaOrBuilder> 
        getMetaFieldBuilder() {
      if (metaBuilder_ == null) {
        metaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.util.SavedTensorSliceMeta, org.tensorflow.util.SavedTensorSliceMeta.Builder, org.tensorflow.util.SavedTensorSliceMetaOrBuilder>(
                getMeta(),
                getParentForChildren(),
                isClean());
        meta_ = null;
      }
      return metaBuilder_;
    }

    private org.tensorflow.util.SavedSlice data_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.util.SavedSlice, org.tensorflow.util.SavedSlice.Builder, org.tensorflow.util.SavedSliceOrBuilder> dataBuilder_;
    /**
     * <pre>
     * This exists in all but the first item of each checkpoint file.
     * </pre>
     *
     * <code>.tensorflow.SavedSlice data = 2;</code>
     */
    public boolean hasData() {
      return dataBuilder_ != null || data_ != null;
    }
    /**
     * <pre>
     * This exists in all but the first item of each checkpoint file.
     * </pre>
     *
     * <code>.tensorflow.SavedSlice data = 2;</code>
     */
    public org.tensorflow.util.SavedSlice getData() {
      if (dataBuilder_ == null) {
        return data_ == null ? org.tensorflow.util.SavedSlice.getDefaultInstance() : data_;
      } else {
        return dataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * This exists in all but the first item of each checkpoint file.
     * </pre>
     *
     * <code>.tensorflow.SavedSlice data = 2;</code>
     */
    public Builder setData(org.tensorflow.util.SavedSlice value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        data_ = value;
        onChanged();
      } else {
        dataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * This exists in all but the first item of each checkpoint file.
     * </pre>
     *
     * <code>.tensorflow.SavedSlice data = 2;</code>
     */
    public Builder setData(
        org.tensorflow.util.SavedSlice.Builder builderForValue) {
      if (dataBuilder_ == null) {
        data_ = builderForValue.build();
        onChanged();
      } else {
        dataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * This exists in all but the first item of each checkpoint file.
     * </pre>
     *
     * <code>.tensorflow.SavedSlice data = 2;</code>
     */
    public Builder mergeData(org.tensorflow.util.SavedSlice value) {
      if (dataBuilder_ == null) {
        if (data_ != null) {
          data_ =
            org.tensorflow.util.SavedSlice.newBuilder(data_).mergeFrom(value).buildPartial();
        } else {
          data_ = value;
        }
        onChanged();
      } else {
        dataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * This exists in all but the first item of each checkpoint file.
     * </pre>
     *
     * <code>.tensorflow.SavedSlice data = 2;</code>
     */
    public Builder clearData() {
      if (dataBuilder_ == null) {
        data_ = null;
        onChanged();
      } else {
        data_ = null;
        dataBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * This exists in all but the first item of each checkpoint file.
     * </pre>
     *
     * <code>.tensorflow.SavedSlice data = 2;</code>
     */
    public org.tensorflow.util.SavedSlice.Builder getDataBuilder() {
      
      onChanged();
      return getDataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * This exists in all but the first item of each checkpoint file.
     * </pre>
     *
     * <code>.tensorflow.SavedSlice data = 2;</code>
     */
    public org.tensorflow.util.SavedSliceOrBuilder getDataOrBuilder() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilder();
      } else {
        return data_ == null ?
            org.tensorflow.util.SavedSlice.getDefaultInstance() : data_;
      }
    }
    /**
     * <pre>
     * This exists in all but the first item of each checkpoint file.
     * </pre>
     *
     * <code>.tensorflow.SavedSlice data = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.util.SavedSlice, org.tensorflow.util.SavedSlice.Builder, org.tensorflow.util.SavedSliceOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.util.SavedSlice, org.tensorflow.util.SavedSlice.Builder, org.tensorflow.util.SavedSliceOrBuilder>(
                getData(),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.SavedTensorSlices)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.SavedTensorSlices)
  private static final org.tensorflow.util.SavedTensorSlices DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.util.SavedTensorSlices();
  }

  public static org.tensorflow.util.SavedTensorSlices getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SavedTensorSlices>
      PARSER = new com.google.protobuf.AbstractParser<SavedTensorSlices>() {
    @java.lang.Override
    public SavedTensorSlices parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SavedTensorSlices(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SavedTensorSlices> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SavedTensorSlices> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.util.SavedTensorSlices getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

