/**
 * Product100.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class Product100  implements java.io.Serializable {
    private co.ke.transunion.crbws.ws.Account[] accountList;

    private co.ke.transunion.crbws.ws.AlsoKnownAsConsumer[] alsoKnownAsList;

    private co.ke.transunion.crbws.ws.BouncedCheque[] bouncedChequeList;

    private co.ke.transunion.crbws.ws.DisputeStatement[] disputeStatementList;

    private co.ke.transunion.crbws.ws.Header header;

    private co.ke.transunion.crbws.ws.PersonalProfile personalProfile;

    private co.ke.transunion.crbws.ws.RecentEnquiry[] recentEnquiryList;

    private java.lang.Integer responseCode;

    private co.ke.transunion.crbws.ws.Summary100 summary;

    public Product100() {
    }

    public Product100(
           co.ke.transunion.crbws.ws.Account[] accountList,
           co.ke.transunion.crbws.ws.AlsoKnownAsConsumer[] alsoKnownAsList,
           co.ke.transunion.crbws.ws.BouncedCheque[] bouncedChequeList,
           co.ke.transunion.crbws.ws.DisputeStatement[] disputeStatementList,
           co.ke.transunion.crbws.ws.Header header,
           co.ke.transunion.crbws.ws.PersonalProfile personalProfile,
           co.ke.transunion.crbws.ws.RecentEnquiry[] recentEnquiryList,
           java.lang.Integer responseCode,
           co.ke.transunion.crbws.ws.Summary100 summary) {
           this.accountList = accountList;
           this.alsoKnownAsList = alsoKnownAsList;
           this.bouncedChequeList = bouncedChequeList;
           this.disputeStatementList = disputeStatementList;
           this.header = header;
           this.personalProfile = personalProfile;
           this.recentEnquiryList = recentEnquiryList;
           this.responseCode = responseCode;
           this.summary = summary;
    }


    /**
     * Gets the accountList value for this Product100.
     * 
     * @return accountList
     */
    public co.ke.transunion.crbws.ws.Account[] getAccountList() {
        return accountList;
    }


    /**
     * Sets the accountList value for this Product100.
     * 
     * @param accountList
     */
    public void setAccountList(co.ke.transunion.crbws.ws.Account[] accountList) {
        this.accountList = accountList;
    }

    public co.ke.transunion.crbws.ws.Account getAccountList(int i) {
        return this.accountList[i];
    }

    public void setAccountList(int i, co.ke.transunion.crbws.ws.Account _value) {
        this.accountList[i] = _value;
    }


    /**
     * Gets the alsoKnownAsList value for this Product100.
     * 
     * @return alsoKnownAsList
     */
    public co.ke.transunion.crbws.ws.AlsoKnownAsConsumer[] getAlsoKnownAsList() {
        return alsoKnownAsList;
    }


    /**
     * Sets the alsoKnownAsList value for this Product100.
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
     * Gets the bouncedChequeList value for this Product100.
     * 
     * @return bouncedChequeList
     */
    public co.ke.transunion.crbws.ws.BouncedCheque[] getBouncedChequeList() {
        return bouncedChequeList;
    }


    /**
     * Sets the bouncedChequeList value for this Product100.
     * 
     * @param bouncedChequeList
     */
    public void setBouncedChequeList(co.ke.transunion.crbws.ws.BouncedCheque[] bouncedChequeList) {
        this.bouncedChequeList = bouncedChequeList;
    }

    public co.ke.transunion.crbws.ws.BouncedCheque getBouncedChequeList(int i) {
        return this.bouncedChequeList[i];
    }

    public void setBouncedChequeList(int i, co.ke.transunion.crbws.ws.BouncedCheque _value) {
        this.bouncedChequeList[i] = _value;
    }


    /**
     * Gets the disputeStatementList value for this Product100.
     * 
     * @return disputeStatementList
     */
    public co.ke.transunion.crbws.ws.DisputeStatement[] getDisputeStatementList() {
        return disputeStatementList;
    }


    /**
     * Sets the disputeStatementList value for this Product100.
     * 
     * @param disputeStatementList
     */
    public void setDisputeStatementList(co.ke.transunion.crbws.ws.DisputeStatement[] disputeStatementList) {
        this.disputeStatementList = disputeStatementList;
    }

    public co.ke.transunion.crbws.ws.DisputeStatement getDisputeStatementList(int i) {
        return this.disputeStatementList[i];
    }

    public void setDisputeStatementList(int i, co.ke.transunion.crbws.ws.DisputeStatement _value) {
        this.disputeStatementList[i] = _value;
    }


    /**
     * Gets the header value for this Product100.
     * 
     * @return header
     */
    public co.ke.transunion.crbws.ws.Header getHeader() {
        return header;
    }


    /**
     * Sets the header value for this Product100.
     * 
     * @param header
     */
    public void setHeader(co.ke.transunion.crbws.ws.Header header) {
        this.header = header;
    }


    /**
     * Gets the personalProfile value for this Product100.
     * 
     * @return personalProfile
     */
    public co.ke.transunion.crbws.ws.PersonalProfile getPersonalProfile() {
        return personalProfile;
    }


    /**
     * Sets the personalProfile value for this Product100.
     * 
     * @param personalProfile
     */
    public void setPersonalProfile(co.ke.transunion.crbws.ws.PersonalProfile personalProfile) {
        this.personalProfile = personalProfile;
    }


    /**
     * Gets the recentEnquiryList value for this Product100.
     * 
     * @return recentEnquiryList
     */
    public co.ke.transunion.crbws.ws.RecentEnquiry[] getRecentEnquiryList() {
        return recentEnquiryList;
    }


    /**
     * Sets the recentEnquiryList value for this Product100.
     * 
     * @param recentEnquiryList
     */
    public void setRecentEnquiryList(co.ke.transunion.crbws.ws.RecentEnquiry[] recentEnquiryList) {
        this.recentEnquiryList = recentEnquiryList;
    }

    public co.ke.transunion.crbws.ws.RecentEnquiry getRecentEnquiryList(int i) {
        return this.recentEnquiryList[i];
    }

    public void setRecentEnquiryList(int i, co.ke.transunion.crbws.ws.RecentEnquiry _value) {
        this.recentEnquiryList[i] = _value;
    }


    /**
     * Gets the responseCode value for this Product100.
     * 
     * @return responseCode
     */
    public java.lang.Integer getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this Product100.
     * 
     * @param responseCode
     */
    public void setResponseCode(java.lang.Integer responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the summary value for this Product100.
     * 
     * @return summary
     */
    public co.ke.transunion.crbws.ws.Summary100 getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this Product100.
     * 
     * @param summary
     */
    public void setSummary(co.ke.transunion.crbws.ws.Summary100 summary) {
        this.summary = summary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Product100)) return false;
        Product100 other = (Product100) obj;
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
            ((this.alsoKnownAsList==null && other.getAlsoKnownAsList()==null) || 
             (this.alsoKnownAsList!=null &&
              java.util.Arrays.equals(this.alsoKnownAsList, other.getAlsoKnownAsList()))) &&
            ((this.bouncedChequeList==null && other.getBouncedChequeList()==null) || 
             (this.bouncedChequeList!=null &&
              java.util.Arrays.equals(this.bouncedChequeList, other.getBouncedChequeList()))) &&
            ((this.disputeStatementList==null && other.getDisputeStatementList()==null) || 
             (this.disputeStatementList!=null &&
              java.util.Arrays.equals(this.disputeStatementList, other.getDisputeStatementList()))) &&
            ((this.header==null && other.getHeader()==null) || 
             (this.header!=null &&
              this.header.equals(other.getHeader()))) &&
            ((this.personalProfile==null && other.getPersonalProfile()==null) || 
             (this.personalProfile!=null &&
              this.personalProfile.equals(other.getPersonalProfile()))) &&
            ((this.recentEnquiryList==null && other.getRecentEnquiryList()==null) || 
             (this.recentEnquiryList!=null &&
              java.util.Arrays.equals(this.recentEnquiryList, other.getRecentEnquiryList()))) &&
            ((this.responseCode==null && other.getResponseCode()==null) || 
             (this.responseCode!=null &&
              this.responseCode.equals(other.getResponseCode()))) &&
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
        if (getBouncedChequeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBouncedChequeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBouncedChequeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDisputeStatementList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisputeStatementList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisputeStatementList(), i);
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
        if (getRecentEnquiryList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecentEnquiryList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecentEnquiryList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResponseCode() != null) {
            _hashCode += getResponseCode().hashCode();
        }
        if (getSummary() != null) {
            _hashCode += getSummary().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Product100.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "product100"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alsoKnownAsList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alsoKnownAsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "alsoKnownAsConsumer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bouncedChequeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bouncedChequeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "bouncedCheque"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disputeStatementList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disputeStatementList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "disputeStatement"));
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
        elemField.setFieldName("recentEnquiryList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recentEnquiryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "recentEnquiry"));
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
        elemField.setFieldName("summary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "summary100"));
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
