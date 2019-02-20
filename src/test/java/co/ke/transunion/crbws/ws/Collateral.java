/**
 * Collateral.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class Collateral  implements java.io.Serializable {
    private java.lang.String collateralRefNo;

    private java.lang.String collateralType;

    private java.lang.String currency;

    private java.lang.String description;

    private java.lang.Double saleAmount;

    private java.util.Calendar saleDate;

    private java.lang.String tradeSector;

    private java.lang.Double valuationAmount;

    private java.util.Calendar valuationDate;

    public Collateral() {
    }

    public Collateral(
           java.lang.String collateralRefNo,
           java.lang.String collateralType,
           java.lang.String currency,
           java.lang.String description,
           java.lang.Double saleAmount,
           java.util.Calendar saleDate,
           java.lang.String tradeSector,
           java.lang.Double valuationAmount,
           java.util.Calendar valuationDate) {
           this.collateralRefNo = collateralRefNo;
           this.collateralType = collateralType;
           this.currency = currency;
           this.description = description;
           this.saleAmount = saleAmount;
           this.saleDate = saleDate;
           this.tradeSector = tradeSector;
           this.valuationAmount = valuationAmount;
           this.valuationDate = valuationDate;
    }


    /**
     * Gets the collateralRefNo value for this Collateral.
     * 
     * @return collateralRefNo
     */
    public java.lang.String getCollateralRefNo() {
        return collateralRefNo;
    }


    /**
     * Sets the collateralRefNo value for this Collateral.
     * 
     * @param collateralRefNo
     */
    public void setCollateralRefNo(java.lang.String collateralRefNo) {
        this.collateralRefNo = collateralRefNo;
    }


    /**
     * Gets the collateralType value for this Collateral.
     * 
     * @return collateralType
     */
    public java.lang.String getCollateralType() {
        return collateralType;
    }


    /**
     * Sets the collateralType value for this Collateral.
     * 
     * @param collateralType
     */
    public void setCollateralType(java.lang.String collateralType) {
        this.collateralType = collateralType;
    }


    /**
     * Gets the currency value for this Collateral.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Collateral.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the description value for this Collateral.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Collateral.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the saleAmount value for this Collateral.
     * 
     * @return saleAmount
     */
    public java.lang.Double getSaleAmount() {
        return saleAmount;
    }


    /**
     * Sets the saleAmount value for this Collateral.
     * 
     * @param saleAmount
     */
    public void setSaleAmount(java.lang.Double saleAmount) {
        this.saleAmount = saleAmount;
    }


    /**
     * Gets the saleDate value for this Collateral.
     * 
     * @return saleDate
     */
    public java.util.Calendar getSaleDate() {
        return saleDate;
    }


    /**
     * Sets the saleDate value for this Collateral.
     * 
     * @param saleDate
     */
    public void setSaleDate(java.util.Calendar saleDate) {
        this.saleDate = saleDate;
    }


    /**
     * Gets the tradeSector value for this Collateral.
     * 
     * @return tradeSector
     */
    public java.lang.String getTradeSector() {
        return tradeSector;
    }


    /**
     * Sets the tradeSector value for this Collateral.
     * 
     * @param tradeSector
     */
    public void setTradeSector(java.lang.String tradeSector) {
        this.tradeSector = tradeSector;
    }


    /**
     * Gets the valuationAmount value for this Collateral.
     * 
     * @return valuationAmount
     */
    public java.lang.Double getValuationAmount() {
        return valuationAmount;
    }


    /**
     * Sets the valuationAmount value for this Collateral.
     * 
     * @param valuationAmount
     */
    public void setValuationAmount(java.lang.Double valuationAmount) {
        this.valuationAmount = valuationAmount;
    }


    /**
     * Gets the valuationDate value for this Collateral.
     * 
     * @return valuationDate
     */
    public java.util.Calendar getValuationDate() {
        return valuationDate;
    }


    /**
     * Sets the valuationDate value for this Collateral.
     * 
     * @param valuationDate
     */
    public void setValuationDate(java.util.Calendar valuationDate) {
        this.valuationDate = valuationDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Collateral)) return false;
        Collateral other = (Collateral) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.collateralRefNo==null && other.getCollateralRefNo()==null) || 
             (this.collateralRefNo!=null &&
              this.collateralRefNo.equals(other.getCollateralRefNo()))) &&
            ((this.collateralType==null && other.getCollateralType()==null) || 
             (this.collateralType!=null &&
              this.collateralType.equals(other.getCollateralType()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.saleAmount==null && other.getSaleAmount()==null) || 
             (this.saleAmount!=null &&
              this.saleAmount.equals(other.getSaleAmount()))) &&
            ((this.saleDate==null && other.getSaleDate()==null) || 
             (this.saleDate!=null &&
              this.saleDate.equals(other.getSaleDate()))) &&
            ((this.tradeSector==null && other.getTradeSector()==null) || 
             (this.tradeSector!=null &&
              this.tradeSector.equals(other.getTradeSector()))) &&
            ((this.valuationAmount==null && other.getValuationAmount()==null) || 
             (this.valuationAmount!=null &&
              this.valuationAmount.equals(other.getValuationAmount()))) &&
            ((this.valuationDate==null && other.getValuationDate()==null) || 
             (this.valuationDate!=null &&
              this.valuationDate.equals(other.getValuationDate())));
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
        if (getCollateralRefNo() != null) {
            _hashCode += getCollateralRefNo().hashCode();
        }
        if (getCollateralType() != null) {
            _hashCode += getCollateralType().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSaleAmount() != null) {
            _hashCode += getSaleAmount().hashCode();
        }
        if (getSaleDate() != null) {
            _hashCode += getSaleDate().hashCode();
        }
        if (getTradeSector() != null) {
            _hashCode += getTradeSector().hashCode();
        }
        if (getValuationAmount() != null) {
            _hashCode += getValuationAmount().hashCode();
        }
        if (getValuationDate() != null) {
            _hashCode += getValuationDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Collateral.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "collateral"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collateralRefNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "collateralRefNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collateralType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "collateralType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saleAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "saleAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "saleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradeSector");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tradeSector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valuationAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valuationAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valuationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valuationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
