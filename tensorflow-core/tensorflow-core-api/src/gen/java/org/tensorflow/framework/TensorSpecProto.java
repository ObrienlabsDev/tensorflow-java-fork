// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/struct.proto

package org.tensorflow.framework;

/**
 * <pre>
 * A protobuf to tf.TensorSpec.
 * </pre>
 *
 * Protobuf type {@code tensorflow.TensorSpecProto}
 */
public  final class TensorSpecProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.TensorSpecProto)
    TensorSpecProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TensorSpecProto.newBuilder() to construct.
  private TensorSpecProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TensorSpecProto() {
    name_ = "";
    dtype_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TensorSpecProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TensorSpecProto(
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
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            org.tensorflow.framework.TensorShapeProto.Builder subBuilder = null;
            if (shape_ != null) {
              subBuilder = shape_.toBuilder();
            }
            shape_ = input.readMessage(org.tensorflow.framework.TensorShapeProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(shape_);
              shape_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            dtype_ = rawValue;
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
    return org.tensorflow.framework.StructProtos.internal_static_tensorflow_TensorSpecProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.StructProtos.internal_static_tensorflow_TensorSpecProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.TensorSpecProto.class, org.tensorflow.framework.TensorSpecProto.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SHAPE_FIELD_NUMBER = 2;
  private org.tensorflow.framework.TensorShapeProto shape_;
  /**
   * <code>.tensorflow.TensorShapeProto shape = 2;</code>
   */
  public boolean hasShape() {
    return shape_ != null;
  }
  /**
   * <code>.tensorflow.TensorShapeProto shape = 2;</code>
   */
  public org.tensorflow.framework.TensorShapeProto getShape() {
    return shape_ == null ? org.tensorflow.framework.TensorShapeProto.getDefaultInstance() : shape_;
  }
  /**
   * <code>.tensorflow.TensorShapeProto shape = 2;</code>
   */
  public org.tensorflow.framework.TensorShapeProtoOrBuilder getShapeOrBuilder() {
    return getShape();
  }

  public static final int DTYPE_FIELD_NUMBER = 3;
  private int dtype_;
  /**
   * <code>.tensorflow.DataType dtype = 3;</code>
   */
  public int getDtypeValue() {
    return dtype_;
  }
  /**
   * <code>.tensorflow.DataType dtype = 3;</code>
   */
  public org.tensorflow.framework.DataType getDtype() {
    @SuppressWarnings("deprecation")
    org.tensorflow.framework.DataType result = org.tensorflow.framework.DataType.valueOf(dtype_);
    return result == null ? org.tensorflow.framework.DataType.UNRECOGNIZED : result;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (shape_ != null) {
      output.writeMessage(2, getShape());
    }
    if (dtype_ != org.tensorflow.framework.DataType.DT_INVALID.getNumber()) {
      output.writeEnum(3, dtype_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (shape_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getShape());
    }
    if (dtype_ != org.tensorflow.framework.DataType.DT_INVALID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, dtype_);
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
    if (!(obj instanceof org.tensorflow.framework.TensorSpecProto)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.TensorSpecProto other = (org.tensorflow.framework.TensorSpecProto) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasShape() != other.hasShape()) return false;
    if (hasShape()) {
      if (!getShape()
          .equals(other.getShape())) return false;
    }
    if (dtype_ != other.dtype_) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasShape()) {
      hash = (37 * hash) + SHAPE_FIELD_NUMBER;
      hash = (53 * hash) + getShape().hashCode();
    }
    hash = (37 * hash) + DTYPE_FIELD_NUMBER;
    hash = (53 * hash) + dtype_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.TensorSpecProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.TensorSpecProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.TensorSpecProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.TensorSpecProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.TensorSpecProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.TensorSpecProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.TensorSpecProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.TensorSpecProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.TensorSpecProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.TensorSpecProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.TensorSpecProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.TensorSpecProto parseFrom(
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
  public static Builder newBuilder(org.tensorflow.framework.TensorSpecProto prototype) {
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
   * A protobuf to tf.TensorSpec.
   * </pre>
   *
   * Protobuf type {@code tensorflow.TensorSpecProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.TensorSpecProto)
      org.tensorflow.framework.TensorSpecProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.StructProtos.internal_static_tensorflow_TensorSpecProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.StructProtos.internal_static_tensorflow_TensorSpecProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.TensorSpecProto.class, org.tensorflow.framework.TensorSpecProto.Builder.class);
    }

    // Construct using org.tensorflow.framework.TensorSpecProto.newBuilder()
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
      name_ = "";

      if (shapeBuilder_ == null) {
        shape_ = null;
      } else {
        shape_ = null;
        shapeBuilder_ = null;
      }
      dtype_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.StructProtos.internal_static_tensorflow_TensorSpecProto_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.framework.TensorSpecProto getDefaultInstanceForType() {
      return org.tensorflow.framework.TensorSpecProto.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.framework.TensorSpecProto build() {
      org.tensorflow.framework.TensorSpecProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.framework.TensorSpecProto buildPartial() {
      org.tensorflow.framework.TensorSpecProto result = new org.tensorflow.framework.TensorSpecProto(this);
      result.name_ = name_;
      if (shapeBuilder_ == null) {
        result.shape_ = shape_;
      } else {
        result.shape_ = shapeBuilder_.build();
      }
      result.dtype_ = dtype_;
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
      if (other instanceof org.tensorflow.framework.TensorSpecProto) {
        return mergeFrom((org.tensorflow.framework.TensorSpecProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.TensorSpecProto other) {
      if (other == org.tensorflow.framework.TensorSpecProto.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasShape()) {
        mergeShape(other.getShape());
      }
      if (other.dtype_ != 0) {
        setDtypeValue(other.getDtypeValue());
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
      org.tensorflow.framework.TensorSpecProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.TensorSpecProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private org.tensorflow.framework.TensorShapeProto shape_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.TensorShapeProto, org.tensorflow.framework.TensorShapeProto.Builder, org.tensorflow.framework.TensorShapeProtoOrBuilder> shapeBuilder_;
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public boolean hasShape() {
      return shapeBuilder_ != null || shape_ != null;
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public org.tensorflow.framework.TensorShapeProto getShape() {
      if (shapeBuilder_ == null) {
        return shape_ == null ? org.tensorflow.framework.TensorShapeProto.getDefaultInstance() : shape_;
      } else {
        return shapeBuilder_.getMessage();
      }
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public Builder setShape(org.tensorflow.framework.TensorShapeProto value) {
      if (shapeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        shape_ = value;
        onChanged();
      } else {
        shapeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public Builder setShape(
        org.tensorflow.framework.TensorShapeProto.Builder builderForValue) {
      if (shapeBuilder_ == null) {
        shape_ = builderForValue.build();
        onChanged();
      } else {
        shapeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public Builder mergeShape(org.tensorflow.framework.TensorShapeProto value) {
      if (shapeBuilder_ == null) {
        if (shape_ != null) {
          shape_ =
            org.tensorflow.framework.TensorShapeProto.newBuilder(shape_).mergeFrom(value).buildPartial();
        } else {
          shape_ = value;
        }
        onChanged();
      } else {
        shapeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public Builder clearShape() {
      if (shapeBuilder_ == null) {
        shape_ = null;
        onChanged();
      } else {
        shape_ = null;
        shapeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public org.tensorflow.framework.TensorShapeProto.Builder getShapeBuilder() {
      
      onChanged();
      return getShapeFieldBuilder().getBuilder();
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public org.tensorflow.framework.TensorShapeProtoOrBuilder getShapeOrBuilder() {
      if (shapeBuilder_ != null) {
        return shapeBuilder_.getMessageOrBuilder();
      } else {
        return shape_ == null ?
            org.tensorflow.framework.TensorShapeProto.getDefaultInstance() : shape_;
      }
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.TensorShapeProto, org.tensorflow.framework.TensorShapeProto.Builder, org.tensorflow.framework.TensorShapeProtoOrBuilder> 
        getShapeFieldBuilder() {
      if (shapeBuilder_ == null) {
        shapeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.framework.TensorShapeProto, org.tensorflow.framework.TensorShapeProto.Builder, org.tensorflow.framework.TensorShapeProtoOrBuilder>(
                getShape(),
                getParentForChildren(),
                isClean());
        shape_ = null;
      }
      return shapeBuilder_;
    }

    private int dtype_ = 0;
    /**
     * <code>.tensorflow.DataType dtype = 3;</code>
     */
    public int getDtypeValue() {
      return dtype_;
    }
    /**
     * <code>.tensorflow.DataType dtype = 3;</code>
     */
    public Builder setDtypeValue(int value) {
      dtype_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.DataType dtype = 3;</code>
     */
    public org.tensorflow.framework.DataType getDtype() {
      @SuppressWarnings("deprecation")
      org.tensorflow.framework.DataType result = org.tensorflow.framework.DataType.valueOf(dtype_);
      return result == null ? org.tensorflow.framework.DataType.UNRECOGNIZED : result;
    }
    /**
     * <code>.tensorflow.DataType dtype = 3;</code>
     */
    public Builder setDtype(org.tensorflow.framework.DataType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      dtype_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.DataType dtype = 3;</code>
     */
    public Builder clearDtype() {
      
      dtype_ = 0;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.TensorSpecProto)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.TensorSpecProto)
  private static final org.tensorflow.framework.TensorSpecProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.TensorSpecProto();
  }

  public static org.tensorflow.framework.TensorSpecProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TensorSpecProto>
      PARSER = new com.google.protobuf.AbstractParser<TensorSpecProto>() {
    @java.lang.Override
    public TensorSpecProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TensorSpecProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TensorSpecProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TensorSpecProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.framework.TensorSpecProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

