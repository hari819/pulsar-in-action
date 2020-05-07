/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.gottaeat.domain.payment;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class PaymentAmount extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2781426983753128472L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PaymentAmount\",\"namespace\":\"com.gottaeat.domain.payment\",\"fields\":[{\"name\":\"food_total\",\"type\":\"float\"},{\"name\":\"tax\",\"type\":\"float\"},{\"name\":\"total\",\"type\":\"float\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<PaymentAmount> ENCODER =
      new BinaryMessageEncoder<PaymentAmount>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<PaymentAmount> DECODER =
      new BinaryMessageDecoder<PaymentAmount>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<PaymentAmount> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<PaymentAmount> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<PaymentAmount> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<PaymentAmount>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this PaymentAmount to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a PaymentAmount from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a PaymentAmount instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static PaymentAmount fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public float food_total;
  @Deprecated public float tax;
  @Deprecated public float total;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public PaymentAmount() {}

  /**
   * All-args constructor.
   * @param food_total The new value for food_total
   * @param tax The new value for tax
   * @param total The new value for total
   */
  public PaymentAmount(java.lang.Float food_total, java.lang.Float tax, java.lang.Float total) {
    this.food_total = food_total;
    this.tax = tax;
    this.total = total;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return food_total;
    case 1: return tax;
    case 2: return total;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: food_total = (java.lang.Float)value$; break;
    case 1: tax = (java.lang.Float)value$; break;
    case 2: total = (java.lang.Float)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'food_total' field.
   * @return The value of the 'food_total' field.
   */
  public float getFoodTotal() {
    return food_total;
  }


  /**
   * Sets the value of the 'food_total' field.
   * @param value the value to set.
   */
  public void setFoodTotal(float value) {
    this.food_total = value;
  }

  /**
   * Gets the value of the 'tax' field.
   * @return The value of the 'tax' field.
   */
  public float getTax() {
    return tax;
  }


  /**
   * Sets the value of the 'tax' field.
   * @param value the value to set.
   */
  public void setTax(float value) {
    this.tax = value;
  }

  /**
   * Gets the value of the 'total' field.
   * @return The value of the 'total' field.
   */
  public float getTotal() {
    return total;
  }


  /**
   * Sets the value of the 'total' field.
   * @param value the value to set.
   */
  public void setTotal(float value) {
    this.total = value;
  }

  /**
   * Creates a new PaymentAmount RecordBuilder.
   * @return A new PaymentAmount RecordBuilder
   */
  public static com.gottaeat.domain.payment.PaymentAmount.Builder newBuilder() {
    return new com.gottaeat.domain.payment.PaymentAmount.Builder();
  }

  /**
   * Creates a new PaymentAmount RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new PaymentAmount RecordBuilder
   */
  public static com.gottaeat.domain.payment.PaymentAmount.Builder newBuilder(com.gottaeat.domain.payment.PaymentAmount.Builder other) {
    if (other == null) {
      return new com.gottaeat.domain.payment.PaymentAmount.Builder();
    } else {
      return new com.gottaeat.domain.payment.PaymentAmount.Builder(other);
    }
  }

  /**
   * Creates a new PaymentAmount RecordBuilder by copying an existing PaymentAmount instance.
   * @param other The existing instance to copy.
   * @return A new PaymentAmount RecordBuilder
   */
  public static com.gottaeat.domain.payment.PaymentAmount.Builder newBuilder(com.gottaeat.domain.payment.PaymentAmount other) {
    if (other == null) {
      return new com.gottaeat.domain.payment.PaymentAmount.Builder();
    } else {
      return new com.gottaeat.domain.payment.PaymentAmount.Builder(other);
    }
  }

  /**
   * RecordBuilder for PaymentAmount instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PaymentAmount>
    implements org.apache.avro.data.RecordBuilder<PaymentAmount> {

    private float food_total;
    private float tax;
    private float total;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.gottaeat.domain.payment.PaymentAmount.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.food_total)) {
        this.food_total = data().deepCopy(fields()[0].schema(), other.food_total);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.tax)) {
        this.tax = data().deepCopy(fields()[1].schema(), other.tax);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.total)) {
        this.total = data().deepCopy(fields()[2].schema(), other.total);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing PaymentAmount instance
     * @param other The existing instance to copy.
     */
    private Builder(com.gottaeat.domain.payment.PaymentAmount other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.food_total)) {
        this.food_total = data().deepCopy(fields()[0].schema(), other.food_total);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.tax)) {
        this.tax = data().deepCopy(fields()[1].schema(), other.tax);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.total)) {
        this.total = data().deepCopy(fields()[2].schema(), other.total);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'food_total' field.
      * @return The value.
      */
    public float getFoodTotal() {
      return food_total;
    }


    /**
      * Sets the value of the 'food_total' field.
      * @param value The value of 'food_total'.
      * @return This builder.
      */
    public com.gottaeat.domain.payment.PaymentAmount.Builder setFoodTotal(float value) {
      validate(fields()[0], value);
      this.food_total = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'food_total' field has been set.
      * @return True if the 'food_total' field has been set, false otherwise.
      */
    public boolean hasFoodTotal() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'food_total' field.
      * @return This builder.
      */
    public com.gottaeat.domain.payment.PaymentAmount.Builder clearFoodTotal() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'tax' field.
      * @return The value.
      */
    public float getTax() {
      return tax;
    }


    /**
      * Sets the value of the 'tax' field.
      * @param value The value of 'tax'.
      * @return This builder.
      */
    public com.gottaeat.domain.payment.PaymentAmount.Builder setTax(float value) {
      validate(fields()[1], value);
      this.tax = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'tax' field has been set.
      * @return True if the 'tax' field has been set, false otherwise.
      */
    public boolean hasTax() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'tax' field.
      * @return This builder.
      */
    public com.gottaeat.domain.payment.PaymentAmount.Builder clearTax() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'total' field.
      * @return The value.
      */
    public float getTotal() {
      return total;
    }


    /**
      * Sets the value of the 'total' field.
      * @param value The value of 'total'.
      * @return This builder.
      */
    public com.gottaeat.domain.payment.PaymentAmount.Builder setTotal(float value) {
      validate(fields()[2], value);
      this.total = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'total' field has been set.
      * @return True if the 'total' field has been set, false otherwise.
      */
    public boolean hasTotal() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'total' field.
      * @return This builder.
      */
    public com.gottaeat.domain.payment.PaymentAmount.Builder clearTotal() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public PaymentAmount build() {
      try {
        PaymentAmount record = new PaymentAmount();
        record.food_total = fieldSetFlags()[0] ? this.food_total : (java.lang.Float) defaultValue(fields()[0]);
        record.tax = fieldSetFlags()[1] ? this.tax : (java.lang.Float) defaultValue(fields()[1]);
        record.total = fieldSetFlags()[2] ? this.total : (java.lang.Float) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<PaymentAmount>
    WRITER$ = (org.apache.avro.io.DatumWriter<PaymentAmount>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<PaymentAmount>
    READER$ = (org.apache.avro.io.DatumReader<PaymentAmount>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeFloat(this.food_total);

    out.writeFloat(this.tax);

    out.writeFloat(this.total);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.food_total = in.readFloat();

      this.tax = in.readFloat();

      this.total = in.readFloat();

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.food_total = in.readFloat();
          break;

        case 1:
          this.tax = in.readFloat();
          break;

        case 2:
          this.total = in.readFloat();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










