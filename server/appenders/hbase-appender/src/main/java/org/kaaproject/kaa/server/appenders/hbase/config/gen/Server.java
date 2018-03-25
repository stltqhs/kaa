/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */

package org.kaaproject.kaa.server.appenders.hbase.config.gen;  

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Server extends org.apache.avro.specific.SpecificRecordBase 
    implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = 
      new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":"
          + "\"Server\",\"namespace\":\"org.kaaproject.kaa.server.appenders"
          + ".hbase.config.gen\",\"fields\":[{\"name\":\"zkQuorum\",\"type\":"
          + "\"string\",\"displayName\":\"Zookeeper Quorum\",\"weight\":0.75,"
          + "\"by_default\":\"localhost\"},{\"name\":\"port\",\"type\":\"string\""
          + ",\"displayName\":\"Port\",\"weight\":0.25,\"by_default\":\"2181\"}]}");
  
  public static org.apache.avro.Schema getClassSchema() {
    return SCHEMA$;
  }
  
  @Deprecated public java.lang.CharSequence zkQuorum;
  @Deprecated public java.lang.CharSequence port;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Server() {}

  /**
   * All-args constructor.
   */
  public Server(java.lang.CharSequence zkQuorum, java.lang.CharSequence port) {
    this.zkQuorum = zkQuorum;
    this.port = port;
  }

  public org.apache.avro.Schema getSchema() {
    return SCHEMA$;
  }
  // Used by DatumWriter.  Applications should not call.
  
  /**
   * Get Server object fields.
   */
  public java.lang.Object get(int field) {
    switch (field) {
      case 0: return zkQuorum;
      case 1: return port;
      default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  
  /**
   * Get Server object values.
   */
  @SuppressWarnings(value = "unchecked")
  public void put(int field, java.lang.Object value) {
    switch (field) {
      case 0: zkQuorum = (java.lang.CharSequence)value;
        break;
      case 1: port = (java.lang.CharSequence)value; 
        break;
      default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'zkQuorum' field.
   */
  public java.lang.CharSequence getZkQuorum() {
    return zkQuorum;
  }

  /**
   * Sets the value of the 'zkQuorum' field.
   * @param value the value to set.
   */
  public void setZkQuorum(java.lang.CharSequence value) {
    this.zkQuorum = value;
  }

  /**
   * Gets the value of the 'port' field.
   */
  public java.lang.CharSequence getPort() {
    return port;
  }

  /**
   * Sets the value of the 'port' field.
   * @param value the value to set.
   */
  public void setPort(java.lang.CharSequence value) {
    this.port = value;
  }

  /** Creates a new Server RecordBuilder. */
  public static org.kaaproject.kaa.server.appenders
      .hbase.config.gen.Server.Builder newBuilder() {
    return new org.kaaproject.kaa.server.appenders.hbase.config.gen.Server.Builder();
  }
  
  /** Creates a new Server RecordBuilder by copying an existing Builder. */
  public static org.kaaproject.kaa.server.appenders.hbase.config.gen.Server
      .Builder newBuilder(org.kaaproject.kaa.server.appenders
      .hbase.config.gen.Server.Builder other) {
    return new org.kaaproject.kaa.server.appenders.hbase.config.gen.Server.Builder(other);
  }
  
  /** Creates a new Server RecordBuilder by copying an existing Server instance. */
  public static org.kaaproject.kaa.server.appenders.hbase.config.gen.Server
      .Builder newBuilder(org.kaaproject.kaa.server.appenders
      .hbase.config.gen.Server other) {
    return new org.kaaproject.kaa.server.appenders.hbase.config.gen.Server.Builder(other);
  }
  
  /**
   * RecordBuilder for Server instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Server>
      implements org.apache.avro.data.RecordBuilder<Server> {

    private java.lang.CharSequence zkQuorum;
    private java.lang.CharSequence port;

    /** Creates a new Builder. */
    private Builder() {
      super(org.kaaproject.kaa.server.appenders.hbase.config.gen.Server.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder. */
    private Builder(org.kaaproject.kaa.server.appenders.hbase.config.gen.Server.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.zkQuorum)) {
        this.zkQuorum = data().deepCopy(fields()[0].schema(), other.zkQuorum);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.port)) {
        this.port = data().deepCopy(fields()[1].schema(), other.port);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Server instance. */
    private Builder(org.kaaproject.kaa.server.appenders.hbase.config.gen.Server other) {
            super(org.kaaproject.kaa.server.appenders.hbase.config.gen.Server.SCHEMA$);
      if (isValidValue(fields()[0], other.zkQuorum)) {
        this.zkQuorum = data().deepCopy(fields()[0].schema(), other.zkQuorum);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.port)) {
        this.port = data().deepCopy(fields()[1].schema(), other.port);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'zkQuorum' field. */
    public java.lang.CharSequence getZkQuorum() {
      return zkQuorum;
    }
    
    /** Sets the value of the 'zkQuorum' field. */
    public org.kaaproject.kaa.server.appenders.hbase.config.gen.Server
        .Builder setZkQuorum(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.zkQuorum = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'zkQuorum' field has been set. */
    public boolean hasZkQuorum() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'zkQuorum' field. */
    public org.kaaproject.kaa.server.appenders.hbase.config.gen.Server.Builder clearZkQuorum() {
      zkQuorum = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'port' field. */
    public java.lang.CharSequence getPort() {
      return port;
    }
    
    /** Sets the value of the 'port' field. */
    public org.kaaproject.kaa.server.appenders.hbase.config.gen.Server
        .Builder setPort(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.port = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'port' field has been set. */
    public boolean hasPort() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'port' field. */
    public org.kaaproject.kaa.server.appenders.hbase.config.gen.Server.Builder clearPort() {
      port = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public Server build() {
      try {
        Server record = new Server();
        record.zkQuorum = fieldSetFlags()[0] ? this.zkQuorum : 
          (java.lang.CharSequence) defaultValue(fields()[0]);
        record.port = fieldSetFlags()[1] ? this.port : 
          (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
