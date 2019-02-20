/**
 * Product103.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class Product103  implements java.io.Serializable {
    private co.ke.transunion.crbws.ws.AlsoKnownAsConsumer[] alsoKnownAsList;

    private co.ke.transunion.crbws.ws.Header header;

    private co.ke.transunion.crbws.ws.PersonalProfile personalProfile;

    private co.ke.transunion.crbws.ws.Phone[] phoneList;

    private co.ke.transunion.crbws.ws.PhysicalAddress[] physicalAddressList;

    private co.ke.transunion.crbws.ws.PostalAddress[] postalAddressList;

    private java.lang.Integer responseCode;

    public Product103() {
    }

    public Product103(
           co.ke.transunion.crbws.ws.AlsoKnownAsConsumer[] alsoKnownAsList,
           co.ke.transunion.crbws.ws.Header header,
           co.ke.transunion.crbws.ws.PersonalProfile personalProfile,
           co.ke.transunion.crbws.ws.Phone[] phoneList,
           co.ke.transunion.crbws.ws.PhysicalAddress[] physicalAddressList,
           co.ke.transunion.crbws.ws.PostalAddress[] postalAddressList,
           java.lang.Integer responseCode) {
           this.alsoKnownAsList = alsoKnownAsList;
           this.header = header;
           this.personalProfile = personalProfile;
           this.phoneList = phoneList;
           this.physicalAddressList = physicalAddressList;
           this.postalAddressList = postalAddressList;
           this.responseCode = responseCode;
    }


    /**
     * Gets the alsoKnownAsList value for this Product103.
     * 
     * @return alsoKnownAsList
     */
    public co.ke.transunion.crbws.ws.AlsoKnownAsConsumer[] getAlsoKnownAsList() {
        return alsoKnownAsList;
    }


    /**
     * Sets the alsoKnownAsList value for this Product103.
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
     * Gets the header value for this Product103.
     * 
     * @return header
     */
    public co.ke.transunion.crbws.ws.Header getHeader() {
        return header;
    }


    /**
     * Sets the header value for this Product103.
     * 
     * @param header
     */
    public void setHeader(co.ke.transunion.crbws.ws.Header header) {
        this.header = header;
    }


    /**
     * Gets the personalProfile value for this Product103.
     * 
     * @return personalProfile
     */
    public co.ke.transunion.crbws.ws.PersonalProfile getPersonalProfile() {
        return personalProfile;
    }


    /**
     * Sets the personalProfile value for this Product103.
     * 
     * @param personalProfile
     */
    public void setPersonalProfile(co.ke.transunion.crbws.ws.PersonalProfile personalProfile) {
        this.personalProfile = personalProfile;
    }


    /**
     * Gets the phoneList value for this Product103.
     * 
     * @return phoneList
     */
    public co.ke.transunion.crbws.ws.Phone[] getPhoneList() {
        return phoneList;
    }


    /**
     * Sets the phoneList value for this Product103.
     * 
     * @param phoneList
     */
    public void setPhoneList(co.ke.transunion.crbws.ws.Phone[] phoneList) {
        this.phoneList = phoneList;
    }

    public co.ke.transunion.crbws.ws.Phone getPhoneList(int i) {
        return this.phoneList[i];
    }

    public void setPhoneList(int i, co.ke.transunion.crbws.ws.Phone _value) {
        this.phoneList[i] = _value;
    }


    /**
     * Gets the physicalAddressList value for this Product103.
     * 
     * @return physicalAddressList
     */
    public co.ke.transunion.crbws.ws.PhysicalAddress[] getPhysicalAddressList() {
        return physicalAddressList;
    }


    /**
     * Sets the physicalAddressList value for this Product103.
     * 
     * @param physicalAddressList
     */
    public void setPhysicalAddressList(co.ke.transunion.crbws.ws.PhysicalAddress[] physicalAddressList) {
        this.physicalAddressList = physicalAddressList;
    }

    public co.ke.transunion.crbws.ws.PhysicalAddress getPhysicalAddressList(int i) {
        return this.physicalAddressList[i];
    }

    public void setPhysicalAddressList(int i, co.ke.transunion.crbws.ws.PhysicalAddress _value) {
        this.physicalAddressList[i] = _value;
    }


    /**
     * Gets the postalAddressList value for this Product103.
     * 
     * @return postalAddressList
     */
    public co.ke.transunion.crbws.ws.PostalAddress[] getPostalAddressList() {
        return postalAddressList;
    }


    /**
     * Sets the postalAddressList value for this Product103.
     * 
     * @param postalAddressList
     */
    public void setPostalAddressList(co.ke.transunion.crbws.ws.PostalAddress[] postalAddressList) {
        this.postalAddressList = postalAddressList;
    }

    public co.ke.transunion.crbws.ws.PostalAddress getPostalAddressList(int i) {
        return this.postalAddressList[i];
    }

    public void setPostalAddressList(int i, co.ke.transunion.crbws.ws.PostalAddress _value) {
        this.postalAddressList[i] = _value;
    }


    /**
     * Gets the responseCode value for this Product103.
     * 
     * @return responseCode
     */
    public java.lang.Integer getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this Product103.
     * 
     * @param responseCode
     */
    public void setResponseCode(java.lang.Integer responseCode) {
        this.responseCode = responseCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Product103)) return false;
        Product103 other = (Product103) obj;
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
            ((this.phoneList==null && other.getPhoneList()==null) || 
             (this.phoneList!=null &&
              java.util.Arrays.equals(this.phoneList, other.getPhoneList()))) &&
            ((this.physicalAddressList==null && other.getPhysicalAddressList()==null) || 
             (this.physicalAddressList!=null &&
              java.util.Arrays.equals(this.physicalAddressList, other.getPhysicalAddressList()))) &&
            ((this.postalAddressList==null && other.getPostalAddressList()==null) || 
             (this.postalAddressList!=null &&
              java.util.Arrays.equals(this.postalAddressList, other.getPostalAddressList()))) &&
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
        if (getPhoneList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhoneList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhoneList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPhysicalAddressList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhysicalAddressList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhysicalAddressList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPostalAddressList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPostalAddressList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPostalAddressList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResponseCode() != null) {
            _hashCode += getResponseCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Product103.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "product103"));
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
        elemField.setFieldName("phoneList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "phone"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("physicalAddressList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "physicalAddressList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "physicalAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalAddressList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postalAddressList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "postalAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
