/**
 * AccountTypeSector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class AccountTypeSector  implements java.io.Serializable {
    private java.lang.String accountType;

    private java.lang.Integer mySector;

    private java.lang.Integer otherSector;

    public AccountTypeSector() {
    }

    public AccountTypeSector(
           java.lang.String accountType,
           java.lang.Integer mySector,
           java.lang.Integer otherSector) {
           this.accountType = accountType;
           this.mySector = mySector;
           this.otherSector = otherSector;
    }


    /**
     * Gets the accountType value for this AccountTypeSector.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this AccountTypeSector.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the mySector value for this AccountTypeSector.
     * 
     * @return mySector
     */
    public java.lang.Integer getMySector() {
        return mySector;
    }


    /**
     * Sets the mySector value for this AccountTypeSector.
     * 
     * @param mySector
     */
    public void setMySector(java.lang.Integer mySector) {
        this.mySector = mySector;
    }


    /**
     * Gets the otherSector value for this AccountTypeSector.
     * 
     * @return otherSector
     */
    public java.lang.Integer getOtherSector() {
        return otherSector;
    }


    /**
     * Sets the otherSector value for this AccountTypeSector.
     * 
     * @param otherSector
     */
    public void setOtherSector(java.lang.Integer otherSector) {
        this.otherSector = otherSector;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountTypeSector)) return false;
        AccountTypeSector other = (AccountTypeSector) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.mySector==null && other.getMySector()==null) || 
             (this.mySector!=null &&
              this.mySector.equals(other.getMySector()))) &&
            ((this.otherSector==null && other.getOtherSector()==null) || 
             (this.otherSector!=null &&
              this.otherSector.equals(other.getOtherSector())));
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
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getMySector() != null) {
            _hashCode += getMySector().hashCode();
        }
        if (getOtherSector() != null) {
            _hashCode += getOtherSector().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountTypeSector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "accountTypeSector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mySector");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mySector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherSector");
        elemField.setXmlName(new javax.xml.namespace.QName("", "otherSector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
