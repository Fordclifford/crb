/**
 * Shareholding.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class Shareholding  implements java.io.Serializable {
    private java.lang.Integer companyCrn;

    private java.lang.String companyName;

    private java.lang.String numberOfShares;

    private java.lang.Double shareValue;

    public Shareholding() {
    }

    public Shareholding(
           java.lang.Integer companyCrn,
           java.lang.String companyName,
           java.lang.String numberOfShares,
           java.lang.Double shareValue) {
           this.companyCrn = companyCrn;
           this.companyName = companyName;
           this.numberOfShares = numberOfShares;
           this.shareValue = shareValue;
    }


    /**
     * Gets the companyCrn value for this Shareholding.
     * 
     * @return companyCrn
     */
    public java.lang.Integer getCompanyCrn() {
        return companyCrn;
    }


    /**
     * Sets the companyCrn value for this Shareholding.
     * 
     * @param companyCrn
     */
    public void setCompanyCrn(java.lang.Integer companyCrn) {
        this.companyCrn = companyCrn;
    }


    /**
     * Gets the companyName value for this Shareholding.
     * 
     * @return companyName
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this Shareholding.
     * 
     * @param companyName
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the numberOfShares value for this Shareholding.
     * 
     * @return numberOfShares
     */
    public java.lang.String getNumberOfShares() {
        return numberOfShares;
    }


    /**
     * Sets the numberOfShares value for this Shareholding.
     * 
     * @param numberOfShares
     */
    public void setNumberOfShares(java.lang.String numberOfShares) {
        this.numberOfShares = numberOfShares;
    }


    /**
     * Gets the shareValue value for this Shareholding.
     * 
     * @return shareValue
     */
    public java.lang.Double getShareValue() {
        return shareValue;
    }


    /**
     * Sets the shareValue value for this Shareholding.
     * 
     * @param shareValue
     */
    public void setShareValue(java.lang.Double shareValue) {
        this.shareValue = shareValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Shareholding)) return false;
        Shareholding other = (Shareholding) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.companyCrn==null && other.getCompanyCrn()==null) || 
             (this.companyCrn!=null &&
              this.companyCrn.equals(other.getCompanyCrn()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.numberOfShares==null && other.getNumberOfShares()==null) || 
             (this.numberOfShares!=null &&
              this.numberOfShares.equals(other.getNumberOfShares()))) &&
            ((this.shareValue==null && other.getShareValue()==null) || 
             (this.shareValue!=null &&
              this.shareValue.equals(other.getShareValue())));
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
        if (getCompanyCrn() != null) {
            _hashCode += getCompanyCrn().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getNumberOfShares() != null) {
            _hashCode += getNumberOfShares().hashCode();
        }
        if (getShareValue() != null) {
            _hashCode += getShareValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Shareholding.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "shareholding"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyCrn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyCrn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyName"));
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
