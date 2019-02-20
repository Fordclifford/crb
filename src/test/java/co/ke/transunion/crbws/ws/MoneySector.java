/**
 * MoneySector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class MoneySector  implements java.io.Serializable {
    private java.lang.String currency;

    private java.lang.Double mySector;

    private java.lang.Double otherSectors;

    public MoneySector() {
    }

    public MoneySector(
           java.lang.String currency,
           java.lang.Double mySector,
           java.lang.Double otherSectors) {
           this.currency = currency;
           this.mySector = mySector;
           this.otherSectors = otherSectors;
    }


    /**
     * Gets the currency value for this MoneySector.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this MoneySector.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the mySector value for this MoneySector.
     * 
     * @return mySector
     */
    public java.lang.Double getMySector() {
        return mySector;
    }


    /**
     * Sets the mySector value for this MoneySector.
     * 
     * @param mySector
     */
    public void setMySector(java.lang.Double mySector) {
        this.mySector = mySector;
    }


    /**
     * Gets the otherSectors value for this MoneySector.
     * 
     * @return otherSectors
     */
    public java.lang.Double getOtherSectors() {
        return otherSectors;
    }


    /**
     * Sets the otherSectors value for this MoneySector.
     * 
     * @param otherSectors
     */
    public void setOtherSectors(java.lang.Double otherSectors) {
        this.otherSectors = otherSectors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MoneySector)) return false;
        MoneySector other = (MoneySector) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.mySector==null && other.getMySector()==null) || 
             (this.mySector!=null &&
              this.mySector.equals(other.getMySector()))) &&
            ((this.otherSectors==null && other.getOtherSectors()==null) || 
             (this.otherSectors!=null &&
              this.otherSectors.equals(other.getOtherSectors())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getMySector() != null) {
            _hashCode += getMySector().hashCode();
        }
        if (getOtherSectors() != null) {
            _hashCode += getOtherSectors().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MoneySector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "moneySector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mySector");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mySector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherSectors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "otherSectors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
