/**
 * BouncedCheque.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class BouncedCheque  implements java.io.Serializable {
    private java.util.Calendar bouncedDate;

    private java.lang.String bouncedReason;

    private java.lang.String chequeAccountType;

    private java.lang.Double chequeAmount;

    private java.util.Calendar chequeDate;

    private java.lang.String chequeNo;

    private java.lang.String currency;

    private java.lang.String tradeSector;

    public BouncedCheque() {
    }

    public BouncedCheque(
           java.util.Calendar bouncedDate,
           java.lang.String bouncedReason,
           java.lang.String chequeAccountType,
           java.lang.Double chequeAmount,
           java.util.Calendar chequeDate,
           java.lang.String chequeNo,
           java.lang.String currency,
           java.lang.String tradeSector) {
           this.bouncedDate = bouncedDate;
           this.bouncedReason = bouncedReason;
           this.chequeAccountType = chequeAccountType;
           this.chequeAmount = chequeAmount;
           this.chequeDate = chequeDate;
           this.chequeNo = chequeNo;
           this.currency = currency;
           this.tradeSector = tradeSector;
    }


    /**
     * Gets the bouncedDate value for this BouncedCheque.
     * 
     * @return bouncedDate
     */
    public java.util.Calendar getBouncedDate() {
        return bouncedDate;
    }


    /**
     * Sets the bouncedDate value for this BouncedCheque.
     * 
     * @param bouncedDate
     */
    public void setBouncedDate(java.util.Calendar bouncedDate) {
        this.bouncedDate = bouncedDate;
    }


    /**
     * Gets the bouncedReason value for this BouncedCheque.
     * 
     * @return bouncedReason
     */
    public java.lang.String getBouncedReason() {
        return bouncedReason;
    }


    /**
     * Sets the bouncedReason value for this BouncedCheque.
     * 
     * @param bouncedReason
     */
    public void setBouncedReason(java.lang.String bouncedReason) {
        this.bouncedReason = bouncedReason;
    }


    /**
     * Gets the chequeAccountType value for this BouncedCheque.
     * 
     * @return chequeAccountType
     */
    public java.lang.String getChequeAccountType() {
        return chequeAccountType;
    }


    /**
     * Sets the chequeAccountType value for this BouncedCheque.
     * 
     * @param chequeAccountType
     */
    public void setChequeAccountType(java.lang.String chequeAccountType) {
        this.chequeAccountType = chequeAccountType;
    }


    /**
     * Gets the chequeAmount value for this BouncedCheque.
     * 
     * @return chequeAmount
     */
    public java.lang.Double getChequeAmount() {
        return chequeAmount;
    }


    /**
     * Sets the chequeAmount value for this BouncedCheque.
     * 
     * @param chequeAmount
     */
    public void setChequeAmount(java.lang.Double chequeAmount) {
        this.chequeAmount = chequeAmount;
    }


    /**
     * Gets the chequeDate value for this BouncedCheque.
     * 
     * @return chequeDate
     */
    public java.util.Calendar getChequeDate() {
        return chequeDate;
    }


    /**
     * Sets the chequeDate value for this BouncedCheque.
     * 
     * @param chequeDate
     */
    public void setChequeDate(java.util.Calendar chequeDate) {
        this.chequeDate = chequeDate;
    }


    /**
     * Gets the chequeNo value for this BouncedCheque.
     * 
     * @return chequeNo
     */
    public java.lang.String getChequeNo() {
        return chequeNo;
    }


    /**
     * Sets the chequeNo value for this BouncedCheque.
     * 
     * @param chequeNo
     */
    public void setChequeNo(java.lang.String chequeNo) {
        this.chequeNo = chequeNo;
    }


    /**
     * Gets the currency value for this BouncedCheque.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this BouncedCheque.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the tradeSector value for this BouncedCheque.
     * 
     * @return tradeSector
     */
    public java.lang.String getTradeSector() {
        return tradeSector;
    }


    /**
     * Sets the tradeSector value for this BouncedCheque.
     * 
     * @param tradeSector
     */
    public void setTradeSector(java.lang.String tradeSector) {
        this.tradeSector = tradeSector;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BouncedCheque)) return false;
        BouncedCheque other = (BouncedCheque) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bouncedDate==null && other.getBouncedDate()==null) || 
             (this.bouncedDate!=null &&
              this.bouncedDate.equals(other.getBouncedDate()))) &&
            ((this.bouncedReason==null && other.getBouncedReason()==null) || 
             (this.bouncedReason!=null &&
              this.bouncedReason.equals(other.getBouncedReason()))) &&
            ((this.chequeAccountType==null && other.getChequeAccountType()==null) || 
             (this.chequeAccountType!=null &&
              this.chequeAccountType.equals(other.getChequeAccountType()))) &&
            ((this.chequeAmount==null && other.getChequeAmount()==null) || 
             (this.chequeAmount!=null &&
              this.chequeAmount.equals(other.getChequeAmount()))) &&
            ((this.chequeDate==null && other.getChequeDate()==null) || 
             (this.chequeDate!=null &&
              this.chequeDate.equals(other.getChequeDate()))) &&
            ((this.chequeNo==null && other.getChequeNo()==null) || 
             (this.chequeNo!=null &&
              this.chequeNo.equals(other.getChequeNo()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.tradeSector==null && other.getTradeSector()==null) || 
             (this.tradeSector!=null &&
              this.tradeSector.equals(other.getTradeSector())));
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
        if (getBouncedDate() != null) {
            _hashCode += getBouncedDate().hashCode();
        }
        if (getBouncedReason() != null) {
            _hashCode += getBouncedReason().hashCode();
        }
        if (getChequeAccountType() != null) {
            _hashCode += getChequeAccountType().hashCode();
        }
        if (getChequeAmount() != null) {
            _hashCode += getChequeAmount().hashCode();
        }
        if (getChequeDate() != null) {
            _hashCode += getChequeDate().hashCode();
        }
        if (getChequeNo() != null) {
            _hashCode += getChequeNo().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getTradeSector() != null) {
            _hashCode += getTradeSector().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BouncedCheque.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "bouncedCheque"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bouncedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bouncedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bouncedReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bouncedReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeAccountType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chequeAccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chequeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chequeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chequeNo"));
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
        elemField.setFieldName("tradeSector");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tradeSector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
