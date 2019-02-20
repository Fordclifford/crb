/**
 * Shareholder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class Shareholder  implements java.io.Serializable {
    private java.lang.String fullName;

    private java.lang.String numberOfShares;

    private java.lang.Double shareValue;

    private java.lang.Integer shareholderCrn;

    public Shareholder() {
    }

    public Shareholder(
           java.lang.String fullName,
           java.lang.String numberOfShares,
           java.lang.Double shareValue,
           java.lang.Integer shareholderCrn) {
           this.fullName = fullName;
           this.numberOfShares = numberOfShares;
           this.shareValue = shareValue;
           this.shareholderCrn = shareholderCrn;
    }


    /**
     * Gets the fullName value for this Shareholder.
     * 
     * @return fullName
     */
    public java.lang.String getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this Shareholder.
     * 
     * @param fullName
     */
    public void setFullName(java.lang.String fullName) {
        this.fullName = fullName;
    }


    /**
     * Gets the numberOfShares value for this Shareholder.
     * 
     * @return numberOfShares
     */
    public java.lang.String getNumberOfShares() {
        return numberOfShares;
    }


    /**
     * Sets the numberOfShares value for this Shareholder.
     * 
     * @param numberOfShares
     */
    public void setNumberOfShares(java.lang.String numberOfShares) {
        this.numberOfShares = numberOfShares;
    }


    /**
     * Gets the shareValue value for this Shareholder.
     * 
     * @return shareValue
     */
    public java.lang.Double getShareValue() {
        return shareValue;
    }


    /**
     * Sets the shareValue value for this Shareholder.
     * 
     * @param shareValue
     */
    public void setShareValue(java.lang.Double shareValue) {
        this.shareValue = shareValue;
    }


    /**
     * Gets the shareholderCrn value for this Shareholder.
     * 
     * @return shareholderCrn
     */
    public java.lang.Integer getShareholderCrn() {
        return shareholderCrn;
    }


    /**
     * Sets the shareholderCrn value for this Shareholder.
     * 
     * @param shareholderCrn
     */
    public void setShareholderCrn(java.lang.Integer shareholderCrn) {
        this.shareholderCrn = shareholderCrn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Shareholder)) return false;
        Shareholder other = (Shareholder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              this.fullName.equals(other.getFullName()))) &&
            ((this.numberOfShares==null && other.getNumberOfShares()==null) || 
             (this.numberOfShares!=null &&
              this.numberOfShares.equals(other.getNumberOfShares()))) &&
            ((this.shareValue==null && other.getShareValue()==null) || 
             (this.shareValue!=null &&
              this.shareValue.equals(other.getShareValue()))) &&
            ((this.shareholderCrn==null && other.getShareholderCrn()==null) || 
             (this.shareholderCrn!=null &&
              this.shareholderCrn.equals(other.getShareholderCrn())));
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
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        if (getNumberOfShares() != null) {
            _hashCode += getNumberOfShares().hashCode();
        }
        if (getShareValue() != null) {
            _hashCode += getShareValue().hashCode();
        }
        if (getShareholderCrn() != null) {
            _hashCode += getShareholderCrn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Shareholder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "shareholder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfShares");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfShares"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shareValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shareValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shareholderCrn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shareholderCrn"));
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
