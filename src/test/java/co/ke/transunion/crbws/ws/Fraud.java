/**
 * Fraud.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class Fraud  implements java.io.Serializable {
    private java.lang.String currency;

    private java.lang.Double fraudAmount;

    private java.lang.String fraudStatus;

    private java.util.Calendar incidentDate;

    private java.lang.String incidentDetails;

    private java.lang.Double lossAmount;

    private java.lang.String tradeSector;

    public Fraud() {
    }

    public Fraud(
           java.lang.String currency,
           java.lang.Double fraudAmount,
           java.lang.String fraudStatus,
           java.util.Calendar incidentDate,
           java.lang.String incidentDetails,
           java.lang.Double lossAmount,
           java.lang.String tradeSector) {
           this.currency = currency;
           this.fraudAmount = fraudAmount;
           this.fraudStatus = fraudStatus;
           this.incidentDate = incidentDate;
           this.incidentDetails = incidentDetails;
           this.lossAmount = lossAmount;
           this.tradeSector = tradeSector;
    }


    /**
     * Gets the currency value for this Fraud.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Fraud.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the fraudAmount value for this Fraud.
     * 
     * @return fraudAmount
     */
    public java.lang.Double getFraudAmount() {
        return fraudAmount;
    }


    /**
     * Sets the fraudAmount value for this Fraud.
     * 
     * @param fraudAmount
     */
    public void setFraudAmount(java.lang.Double fraudAmount) {
        this.fraudAmount = fraudAmount;
    }


    /**
     * Gets the fraudStatus value for this Fraud.
     * 
     * @return fraudStatus
     */
    public java.lang.String getFraudStatus() {
        return fraudStatus;
    }


    /**
     * Sets the fraudStatus value for this Fraud.
     * 
     * @param fraudStatus
     */
    public void setFraudStatus(java.lang.String fraudStatus) {
        this.fraudStatus = fraudStatus;
    }


    /**
     * Gets the incidentDate value for this Fraud.
     * 
     * @return incidentDate
     */
    public java.util.Calendar getIncidentDate() {
        return incidentDate;
    }


    /**
     * Sets the incidentDate value for this Fraud.
     * 
     * @param incidentDate
     */
    public void setIncidentDate(java.util.Calendar incidentDate) {
        this.incidentDate = incidentDate;
    }


    /**
     * Gets the incidentDetails value for this Fraud.
     * 
     * @return incidentDetails
     */
    public java.lang.String getIncidentDetails() {
        return incidentDetails;
    }


    /**
     * Sets the incidentDetails value for this Fraud.
     * 
     * @param incidentDetails
     */
    public void setIncidentDetails(java.lang.String incidentDetails) {
        this.incidentDetails = incidentDetails;
    }


    /**
     * Gets the lossAmount value for this Fraud.
     * 
     * @return lossAmount
     */
    public java.lang.Double getLossAmount() {
        return lossAmount;
    }


    /**
     * Sets the lossAmount value for this Fraud.
     * 
     * @param lossAmount
     */
    public void setLossAmount(java.lang.Double lossAmount) {
        this.lossAmount = lossAmount;
    }


    /**
     * Gets the tradeSector value for this Fraud.
     * 
     * @return tradeSector
     */
    public java.lang.String getTradeSector() {
        return tradeSector;
    }


    /**
     * Sets the tradeSector value for this Fraud.
     * 
     * @param tradeSector
     */
    public void setTradeSector(java.lang.String tradeSector) {
        this.tradeSector = tradeSector;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Fraud)) return false;
        Fraud other = (Fraud) obj;
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
            ((this.fraudAmount==null && other.getFraudAmount()==null) || 
             (this.fraudAmount!=null &&
              this.fraudAmount.equals(other.getFraudAmount()))) &&
            ((this.fraudStatus==null && other.getFraudStatus()==null) || 
             (this.fraudStatus!=null &&
              this.fraudStatus.equals(other.getFraudStatus()))) &&
            ((this.incidentDate==null && other.getIncidentDate()==null) || 
             (this.incidentDate!=null &&
              this.incidentDate.equals(other.getIncidentDate()))) &&
            ((this.incidentDetails==null && other.getIncidentDetails()==null) || 
             (this.incidentDetails!=null &&
              this.incidentDetails.equals(other.getIncidentDetails()))) &&
            ((this.lossAmount==null && other.getLossAmount()==null) || 
             (this.lossAmount!=null &&
              this.lossAmount.equals(other.getLossAmount()))) &&
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
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getFraudAmount() != null) {
            _hashCode += getFraudAmount().hashCode();
        }
        if (getFraudStatus() != null) {
            _hashCode += getFraudStatus().hashCode();
        }
        if (getIncidentDate() != null) {
            _hashCode += getIncidentDate().hashCode();
        }
        if (getIncidentDetails() != null) {
            _hashCode += getIncidentDetails().hashCode();
        }
        if (getLossAmount() != null) {
            _hashCode += getLossAmount().hashCode();
        }
        if (getTradeSector() != null) {
            _hashCode += getTradeSector().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Fraud.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "fraud"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fraudAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fraudAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fraudStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fraudStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incidentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "incidentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incidentDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "incidentDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lossAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lossAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
