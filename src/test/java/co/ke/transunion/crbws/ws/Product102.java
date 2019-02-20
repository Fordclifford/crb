/**
 * Product102.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class Product102  implements java.io.Serializable {
    private co.ke.transunion.crbws.ws.AlsoKnownAsConsumer[] alsoKnownAsList;

    private co.ke.transunion.crbws.ws.Header header;

    private co.ke.transunion.crbws.ws.PersonalProfile personalProfile;

    private java.lang.Integer responseCode;

    public Product102() {
    }

    public Product102(
           co.ke.transunion.crbws.ws.AlsoKnownAsConsumer[] alsoKnownAsList,
           co.ke.transunion.crbws.ws.Header header,
           co.ke.transunion.crbws.ws.PersonalProfile personalProfile,
           java.lang.Integer responseCode) {
           this.alsoKnownAsList = alsoKnownAsList;
           this.header = header;
           this.personalProfile = personalProfile;
           this.responseCode = responseCode;
    }


    /**
     * Gets the alsoKnownAsList value for this Product102.
     * 
     * @return alsoKnownAsList
     */
    public co.ke.transunion.crbws.ws.AlsoKnownAsConsumer[] getAlsoKnownAsList() {
        return alsoKnownAsList;
    }


    /**
     * Sets the alsoKnownAsList value for this Product102.
     * 
     * @param alsoKnownAsList
     */
    public void setAlsoKnownAsList(co.ke.transunion.crbws.ws.AlsoKnownAsConsumer[] alsoKnownAsList) {
        this.alsoKnownAsList = alsoKnownAsList;
    }

    public co.ke.transunion.crbws.ws.AlsoKnownAsConsumer getAlsoKnownAsList(int i) {
        return this.alsoKnownAsList[i];
    }

    public void setAlsoKnownAsList(int i, co.ke.transunion.crbws.ws.AlsoKnownAsConsumer _value) {
        this.alsoKnownAsList[i] = _value;
    }


    /**
     * Gets the header value for this Product102.
     * 
     * @return header
     */
    public co.ke.transunion.crbws.ws.Header getHeader() {
        return header;
    }


    /**
     * Sets the header value for this Product102.
     * 
     * @param header
     */
    public void setHeader(co.ke.transunion.crbws.ws.Header header) {
        this.header = header;
    }


    /**
     * Gets the personalProfile value for this Product102.
     * 
     * @return personalProfile
     */
    public co.ke.transunion.crbws.ws.PersonalProfile getPersonalProfile() {
        return personalProfile;
    }


    /**
     * Sets the personalProfile value for this Product102.
     * 
     * @param personalProfile
     */
    public void setPersonalProfile(co.ke.transunion.crbws.ws.PersonalProfile personalProfile) {
        this.personalProfile = personalProfile;
    }


    /**
     * Gets the responseCode value for this Product102.
     * 
     * @return responseCode
     */
    public java.lang.Integer getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this Product102.
     * 
     * @param responseCode
     */
    public void setResponseCode(java.lang.Integer responseCode) {
        this.responseCode = responseCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Product102)) return false;
        Product102 other = (Product102) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alsoKnownAsList==null && other.getAlsoKnownAsList()==null) || 
             (this.alsoKnownAsList!=null &&
              java.util.Arrays.equals(this.alsoKnownAsList, other.getAlsoKnownAsList()))) &&
            ((this.header==null && other.getHeader()==null) || 
             (this.header!=null &&
              this.header.equals(other.getHeader()))) &&
            ((this.personalProfile==null && other.getPersonalProfile()==null) || 
             (this.personalProfile!=null &&
              this.personalProfile.equals(other.getPersonalProfile()))) &&
            ((this.responseCode==null && other.getResponseCode()==null) || 
             (this.responseCode!=null &&
              this.responseCode.equals(other.getResponseCode())));
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
        if (getAlsoKnownAsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlsoKnownAsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlsoKnownAsList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHeader() != null) {
            _hashCode += getHeader().hashCode();
        }
        if (getPersonalProfile() != null) {
            _hashCode += getPersonalProfile().hashCode();
        }
        if (getResponseCode() != null) {
            _hashCode += getResponseCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Product102.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "product102"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alsoKnownAsList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alsoKnownAsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "alsoKnownAsConsumer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("header");
        elemField.setXmlName(new javax.xml.namespace.QName("", "header"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "header"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personalProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "personalProfile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseCode"));
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
