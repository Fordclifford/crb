/**
 * Product126.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class Product126  implements java.io.Serializable {
    private co.ke.transunion.crbws.ws.Account126[] accountList;

    private co.ke.transunion.crbws.ws.Header header;

    private co.ke.transunion.crbws.ws.PersonalProfile126 personalProfile;

    private co.ke.transunion.crbws.ws.Phone[] phoneList;

    private java.lang.Integer responseCode;

    private co.ke.transunion.crbws.ws.ScoreOutput126 scoreOutput;

    private co.ke.transunion.crbws.ws.Summary126 summary;

    public Product126() {
    }

    public Product126(
           co.ke.transunion.crbws.ws.Account126[] accountList,
           co.ke.transunion.crbws.ws.Header header,
           co.ke.transunion.crbws.ws.PersonalProfile126 personalProfile,
           co.ke.transunion.crbws.ws.Phone[] phoneList,
           java.lang.Integer responseCode,
           co.ke.transunion.crbws.ws.ScoreOutput126 scoreOutput,
           co.ke.transunion.crbws.ws.Summary126 summary) {
           this.accountList = accountList;
           this.header = header;
           this.personalProfile = personalProfile;
           this.phoneList = phoneList;
           this.responseCode = responseCode;
           this.scoreOutput = scoreOutput;
           this.summary = summary;
    }


    /**
     * Gets the accountList value for this Product126.
     * 
     * @return accountList
     */
    public co.ke.transunion.crbws.ws.Account126[] getAccountList() {
        return accountList;
    }


    /**
     * Sets the accountList value for this Product126.
     * 
     * @param accountList
     */
    public void setAccountList(co.ke.transunion.crbws.ws.Account126[] accountList) {
        this.accountList = accountList;
    }

    public co.ke.transunion.crbws.ws.Account126 getAccountList(int i) {
        return this.accountList[i];
    }

    public void setAccountList(int i, co.ke.transunion.crbws.ws.Account126 _value) {
        this.accountList[i] = _value;
    }


    /**
     * Gets the header value for this Product126.
     * 
     * @return header
     */
    public co.ke.transunion.crbws.ws.Header getHeader() {
        return header;
    }


    /**
     * Sets the header value for this Product126.
     * 
     * @param header
     */
    public void setHeader(co.ke.transunion.crbws.ws.Header header) {
        this.header = header;
    }


    /**
     * Gets the personalProfile value for this Product126.
     * 
     * @return personalProfile
     */
    public co.ke.transunion.crbws.ws.PersonalProfile126 getPersonalProfile() {
        return personalProfile;
    }


    /**
     * Sets the personalProfile value for this Product126.
     * 
     * @param personalProfile
     */
    public void setPersonalProfile(co.ke.transunion.crbws.ws.PersonalProfile126 personalProfile) {
        this.personalProfile = personalProfile;
    }


    /**
     * Gets the phoneList value for this Product126.
     * 
     * @return phoneList
     */
    public co.ke.transunion.crbws.ws.Phone[] getPhoneList() {
        return phoneList;
    }


    /**
     * Sets the phoneList value for this Product126.
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
     * Gets the responseCode value for this Product126.
     * 
     * @return responseCode
     */
    public java.lang.Integer getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this Product126.
     * 
     * @param responseCode
     */
    public void setResponseCode(java.lang.Integer responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the scoreOutput value for this Product126.
     * 
     * @return scoreOutput
     */
    public co.ke.transunion.crbws.ws.ScoreOutput126 getScoreOutput() {
        return scoreOutput;
    }


    /**
     * Sets the scoreOutput value for this Product126.
     * 
     * @param scoreOutput
     */
    public void setScoreOutput(co.ke.transunion.crbws.ws.ScoreOutput126 scoreOutput) {
        this.scoreOutput = scoreOutput;
    }


    /**
     * Gets the summary value for this Product126.
     * 
     * @return summary
     */
    public co.ke.transunion.crbws.ws.Summary126 getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this Product126.
     * 
     * @param summary
     */
    public void setSummary(co.ke.transunion.crbws.ws.Summary126 summary) {
        this.summary = summary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Product126)) return false;
        Product126 other = (Product126) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountList==null && other.getAccountList()==null) || 
             (this.accountList!=null &&
              java.util.Arrays.equals(this.accountList, other.getAccountList()))) &&
            ((this.header==null && other.getHeader()==null) || 
             (this.header!=null &&
              this.header.equals(other.getHeader()))) &&
            ((this.personalProfile==null && other.getPersonalProfile()==null) || 
             (this.personalProfile!=null &&
              this.personalProfile.equals(other.getPersonalProfile()))) &&
            ((this.phoneList==null && other.getPhoneList()==null) || 
             (this.phoneList!=null &&
              java.util.Arrays.equals(this.phoneList, other.getPhoneList()))) &&
            ((this.responseCode==null && other.getResponseCode()==null) || 
             (this.responseCode!=null &&
              this.responseCode.equals(other.getResponseCode()))) &&
            ((this.scoreOutput==null && other.getScoreOutput()==null) || 
             (this.scoreOutput!=null &&
              this.scoreOutput.equals(other.getScoreOutput()))) &&
            ((this.summary==null && other.getSummary()==null) || 
             (this.summary!=null &&
              this.summary.equals(other.getSummary())));
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
        if (getAccountList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountList(), i);
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
        if (getResponseCode() != null) {
            _hashCode += getResponseCode().hashCode();
        }
        if (getScoreOutput() != null) {
            _hashCode += getScoreOutput().hashCode();
        }
        if (getSummary() != null) {
            _hashCode += getSummary().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Product126.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "product126"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "account126"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "personalProfile126"));
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
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scoreOutput");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scoreOutput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "scoreOutput126"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "summary126"));
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
