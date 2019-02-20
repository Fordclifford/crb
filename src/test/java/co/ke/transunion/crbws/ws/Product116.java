/**
 * Product116.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class Product116  implements java.io.Serializable {
    private co.ke.transunion.crbws.ws.Account116[] accountList;

    private co.ke.transunion.crbws.ws.Collateral[] collateralList;

    private co.ke.transunion.crbws.ws.CreditApplication[] creditApplicationList;

    private co.ke.transunion.crbws.ws.Header header;

    private co.ke.transunion.crbws.ws.PersonalProfile116 personalProfile;

    private java.lang.Integer responseCode;

    private co.ke.transunion.crbws.ws.ScoreOutput116 scoreOutput;

    private co.ke.transunion.crbws.ws.Summary116 summary;

    public Product116() {
    }

    public Product116(
           co.ke.transunion.crbws.ws.Account116[] accountList,
           co.ke.transunion.crbws.ws.Collateral[] collateralList,
           co.ke.transunion.crbws.ws.CreditApplication[] creditApplicationList,
           co.ke.transunion.crbws.ws.Header header,
           co.ke.transunion.crbws.ws.PersonalProfile116 personalProfile,
           java.lang.Integer responseCode,
           co.ke.transunion.crbws.ws.ScoreOutput116 scoreOutput,
           co.ke.transunion.crbws.ws.Summary116 summary) {
           this.accountList = accountList;
           this.collateralList = collateralList;
           this.creditApplicationList = creditApplicationList;
           this.header = header;
           this.personalProfile = personalProfile;
           this.responseCode = responseCode;
           this.scoreOutput = scoreOutput;
           this.summary = summary;
    }


    /**
     * Gets the accountList value for this Product116.
     * 
     * @return accountList
     */
    public co.ke.transunion.crbws.ws.Account116[] getAccountList() {
        return accountList;
    }


    /**
     * Sets the accountList value for this Product116.
     * 
     * @param accountList
     */
    public void setAccountList(co.ke.transunion.crbws.ws.Account116[] accountList) {
        this.accountList = accountList;
    }

    public co.ke.transunion.crbws.ws.Account116 getAccountList(int i) {
        return this.accountList[i];
    }

    public void setAccountList(int i, co.ke.transunion.crbws.ws.Account116 _value) {
        this.accountList[i] = _value;
    }


    /**
     * Gets the collateralList value for this Product116.
     * 
     * @return collateralList
     */
    public co.ke.transunion.crbws.ws.Collateral[] getCollateralList() {
        return collateralList;
    }


    /**
     * Sets the collateralList value for this Product116.
     * 
     * @param collateralList
     */
    public void setCollateralList(co.ke.transunion.crbws.ws.Collateral[] collateralList) {
        this.collateralList = collateralList;
    }

    public co.ke.transunion.crbws.ws.Collateral getCollateralList(int i) {
        return this.collateralList[i];
    }

    public void setCollateralList(int i, co.ke.transunion.crbws.ws.Collateral _value) {
        this.collateralList[i] = _value;
    }


    /**
     * Gets the creditApplicationList value for this Product116.
     * 
     * @return creditApplicationList
     */
    public co.ke.transunion.crbws.ws.CreditApplication[] getCreditApplicationList() {
        return creditApplicationList;
    }


    /**
     * Sets the creditApplicationList value for this Product116.
     * 
     * @param creditApplicationList
     */
    public void setCreditApplicationList(co.ke.transunion.crbws.ws.CreditApplication[] creditApplicationList) {
        this.creditApplicationList = creditApplicationList;
    }

    public co.ke.transunion.crbws.ws.CreditApplication getCreditApplicationList(int i) {
        return this.creditApplicationList[i];
    }

    public void setCreditApplicationList(int i, co.ke.transunion.crbws.ws.CreditApplication _value) {
        this.creditApplicationList[i] = _value;
    }


    /**
     * Gets the header value for this Product116.
     * 
     * @return header
     */
    public co.ke.transunion.crbws.ws.Header getHeader() {
        return header;
    }


    /**
     * Sets the header value for this Product116.
     * 
     * @param header
     */
    public void setHeader(co.ke.transunion.crbws.ws.Header header) {
        this.header = header;
    }


    /**
     * Gets the personalProfile value for this Product116.
     * 
     * @return personalProfile
     */
    public co.ke.transunion.crbws.ws.PersonalProfile116 getPersonalProfile() {
        return personalProfile;
    }


    /**
     * Sets the personalProfile value for this Product116.
     * 
     * @param personalProfile
     */
    public void setPersonalProfile(co.ke.transunion.crbws.ws.PersonalProfile116 personalProfile) {
        this.personalProfile = personalProfile;
    }


    /**
     * Gets the responseCode value for this Product116.
     * 
     * @return responseCode
     */
    public java.lang.Integer getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this Product116.
     * 
     * @param responseCode
     */
    public void setResponseCode(java.lang.Integer responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the scoreOutput value for this Product116.
     * 
     * @return scoreOutput
     */
    public co.ke.transunion.crbws.ws.ScoreOutput116 getScoreOutput() {
        return scoreOutput;
    }


    /**
     * Sets the scoreOutput value for this Product116.
     * 
     * @param scoreOutput
     */
    public void setScoreOutput(co.ke.transunion.crbws.ws.ScoreOutput116 scoreOutput) {
        this.scoreOutput = scoreOutput;
    }


    /**
     * Gets the summary value for this Product116.
     * 
     * @return summary
     */
    public co.ke.transunion.crbws.ws.Summary116 getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this Product116.
     * 
     * @param summary
     */
    public void setSummary(co.ke.transunion.crbws.ws.Summary116 summary) {
        this.summary = summary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Product116)) return false;
        Product116 other = (Product116) obj;
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
            ((this.collateralList==null && other.getCollateralList()==null) || 
             (this.collateralList!=null &&
              java.util.Arrays.equals(this.collateralList, other.getCollateralList()))) &&
            ((this.creditApplicationList==null && other.getCreditApplicationList()==null) || 
             (this.creditApplicationList!=null &&
              java.util.Arrays.equals(this.creditApplicationList, other.getCreditApplicationList()))) &&
            ((this.header==null && other.getHeader()==null) || 
             (this.header!=null &&
              this.header.equals(other.getHeader()))) &&
            ((this.personalProfile==null && other.getPersonalProfile()==null) || 
             (this.personalProfile!=null &&
              this.personalProfile.equals(other.getPersonalProfile()))) &&
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
        if (getCollateralList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCollateralList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCollateralList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreditApplicationList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreditApplicationList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreditApplicationList(), i);
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
        new org.apache.axis.description.TypeDesc(Product116.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "product116"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "account116"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collateralList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "collateralList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "collateral"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditApplicationList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditApplicationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "creditApplication"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "personalProfile116"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scoreOutput");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scoreOutput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "scoreOutput116"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "summary116"));
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
