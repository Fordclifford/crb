/**
 * Guarantor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class Guarantor  implements java.io.Serializable {
    private java.lang.String currency;

    private java.lang.String disputed;

    private java.lang.String guarantorAccountType;

    private java.lang.Integer guarantorCrn;

    private java.lang.Double guarantorLimit;

    private java.lang.String guarantorType;

    private java.lang.String loanStatus;

    private java.lang.Double principalAmount;

    public Guarantor() {
    }

    public Guarantor(
           java.lang.String currency,
           java.lang.String disputed,
           java.lang.String guarantorAccountType,
           java.lang.Integer guarantorCrn,
           java.lang.Double guarantorLimit,
           java.lang.String guarantorType,
           java.lang.String loanStatus,
           java.lang.Double principalAmount) {
           this.currency = currency;
           this.disputed = disputed;
           this.guarantorAccountType = guarantorAccountType;
           this.guarantorCrn = guarantorCrn;
           this.guarantorLimit = guarantorLimit;
           this.guarantorType = guarantorType;
           this.loanStatus = loanStatus;
           this.principalAmount = principalAmount;
    }


    /**
     * Gets the currency value for this Guarantor.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Guarantor.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the disputed value for this Guarantor.
     * 
     * @return disputed
     */
    public java.lang.String getDisputed() {
        return disputed;
    }


    /**
     * Sets the disputed value for this Guarantor.
     * 
     * @param disputed
     */
    public void setDisputed(java.lang.String disputed) {
        this.disputed = disputed;
    }


    /**
     * Gets the guarantorAccountType value for this Guarantor.
     * 
     * @return guarantorAccountType
     */
    public java.lang.String getGuarantorAccountType() {
        return guarantorAccountType;
    }


    /**
     * Sets the guarantorAccountType value for this Guarantor.
     * 
     * @param guarantorAccountType
     */
    public void setGuarantorAccountType(java.lang.String guarantorAccountType) {
        this.guarantorAccountType = guarantorAccountType;
    }


    /**
     * Gets the guarantorCrn value for this Guarantor.
     * 
     * @return guarantorCrn
     */
    public java.lang.Integer getGuarantorCrn() {
        return guarantorCrn;
    }


    /**
     * Sets the guarantorCrn value for this Guarantor.
     * 
     * @param guarantorCrn
     */
    public void setGuarantorCrn(java.lang.Integer guarantorCrn) {
        this.guarantorCrn = guarantorCrn;
    }


    /**
     * Gets the guarantorLimit value for this Guarantor.
     * 
     * @return guarantorLimit
     */
    public java.lang.Double getGuarantorLimit() {
        return guarantorLimit;
    }


    /**
     * Sets the guarantorLimit value for this Guarantor.
     * 
     * @param guarantorLimit
     */
    public void setGuarantorLimit(java.lang.Double guarantorLimit) {
        this.guarantorLimit = guarantorLimit;
    }


    /**
     * Gets the guarantorType value for this Guarantor.
     * 
     * @return guarantorType
     */
    public java.lang.String getGuarantorType() {
        return guarantorType;
    }


    /**
     * Sets the guarantorType value for this Guarantor.
     * 
     * @param guarantorType
     */
    public void setGuarantorType(java.lang.String guarantorType) {
        this.guarantorType = guarantorType;
    }


    /**
     * Gets the loanStatus value for this Guarantor.
     * 
     * @return loanStatus
     */
    public java.lang.String getLoanStatus() {
        return loanStatus;
    }


    /**
     * Sets the loanStatus value for this Guarantor.
     * 
     * @param loanStatus
     */
    public void setLoanStatus(java.lang.String loanStatus) {
        this.loanStatus = loanStatus;
    }


    /**
     * Gets the principalAmount value for this Guarantor.
     * 
     * @return principalAmount
     */
    public java.lang.Double getPrincipalAmount() {
        return principalAmount;
    }


    /**
     * Sets the principalAmount value for this Guarantor.
     * 
     * @param principalAmount
     */
    public void setPrincipalAmount(java.lang.Double principalAmount) {
        this.principalAmount = principalAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Guarantor)) return false;
        Guarantor other = (Guarantor) obj;
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
            ((this.disputed==null && other.getDisputed()==null) || 
             (this.disputed!=null &&
              this.disputed.equals(other.getDisputed()))) &&
            ((this.guarantorAccountType==null && other.getGuarantorAccountType()==null) || 
             (this.guarantorAccountType!=null &&
              this.guarantorAccountType.equals(other.getGuarantorAccountType()))) &&
            ((this.guarantorCrn==null && other.getGuarantorCrn()==null) || 
             (this.guarantorCrn!=null &&
              this.guarantorCrn.equals(other.getGuarantorCrn()))) &&
            ((this.guarantorLimit==null && other.getGuarantorLimit()==null) || 
             (this.guarantorLimit!=null &&
              this.guarantorLimit.equals(other.getGuarantorLimit()))) &&
            ((this.guarantorType==null && other.getGuarantorType()==null) || 
             (this.guarantorType!=null &&
              this.guarantorType.equals(other.getGuarantorType()))) &&
            ((this.loanStatus==null && other.getLoanStatus()==null) || 
             (this.loanStatus!=null &&
              this.loanStatus.equals(other.getLoanStatus()))) &&
            ((this.principalAmount==null && other.getPrincipalAmount()==null) || 
             (this.principalAmount!=null &&
              this.principalAmount.equals(other.getPrincipalAmount())));
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
        if (getDisputed() != null) {
            _hashCode += getDisputed().hashCode();
        }
        if (getGuarantorAccountType() != null) {
            _hashCode += getGuarantorAccountType().hashCode();
        }
        if (getGuarantorCrn() != null) {
            _hashCode += getGuarantorCrn().hashCode();
        }
        if (getGuarantorLimit() != null) {
            _hashCode += getGuarantorLimit().hashCode();
        }
        if (getGuarantorType() != null) {
            _hashCode += getGuarantorType().hashCode();
        }
        if (getLoanStatus() != null) {
            _hashCode += getLoanStatus().hashCode();
        }
        if (getPrincipalAmount() != null) {
            _hashCode += getPrincipalAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Guarantor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "guarantor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disputed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disputed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guarantorAccountType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "guarantorAccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guarantorCrn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "guarantorCrn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guarantorLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "guarantorLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guarantorType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "guarantorType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loanStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("principalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "principalAmount"));
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
