/**
 * Account402.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class Account402  implements java.io.Serializable {
    private java.lang.Double balanceAmount;

    private java.lang.String category;

    private java.lang.String subscriberShortCode;

    public Account402() {
    }

    public Account402(
           java.lang.Double balanceAmount,
           java.lang.String category,
           java.lang.String subscriberShortCode) {
           this.balanceAmount = balanceAmount;
           this.category = category;
           this.subscriberShortCode = subscriberShortCode;
    }


    /**
     * Gets the balanceAmount value for this Account402.
     * 
     * @return balanceAmount
     */
    public java.lang.Double getBalanceAmount() {
        return balanceAmount;
    }


    /**
     * Sets the balanceAmount value for this Account402.
     * 
     * @param balanceAmount
     */
    public void setBalanceAmount(java.lang.Double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }


    /**
     * Gets the category value for this Account402.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this Account402.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the subscriberShortCode value for this Account402.
     * 
     * @return subscriberShortCode
     */
    public java.lang.String getSubscriberShortCode() {
        return subscriberShortCode;
    }


    /**
     * Sets the subscriberShortCode value for this Account402.
     * 
     * @param subscriberShortCode
     */
    public void setSubscriberShortCode(java.lang.String subscriberShortCode) {
        this.subscriberShortCode = subscriberShortCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Account402)) return false;
        Account402 other = (Account402) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.balanceAmount==null && other.getBalanceAmount()==null) || 
             (this.balanceAmount!=null &&
              this.balanceAmount.equals(other.getBalanceAmount()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.subscriberShortCode==null && other.getSubscriberShortCode()==null) || 
             (this.subscriberShortCode!=null &&
              this.subscriberShortCode.equals(other.getSubscriberShortCode())));
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
        if (getBalanceAmount() != null) {
            _hashCode += getBalanceAmount().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getSubscriberShortCode() != null) {
            _hashCode += getSubscriberShortCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Account402.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "account402"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balanceAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberShortCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriberShortCode"));
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
