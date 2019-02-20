/**
 * RecentEnquiry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class RecentEnquiry  implements java.io.Serializable {
    private java.util.Calendar enquiryDate;

    private java.lang.String enquiryReason;

    private java.lang.String tradeSector;

    public RecentEnquiry() {
    }

    public RecentEnquiry(
           java.util.Calendar enquiryDate,
           java.lang.String enquiryReason,
           java.lang.String tradeSector) {
           this.enquiryDate = enquiryDate;
           this.enquiryReason = enquiryReason;
           this.tradeSector = tradeSector;
    }


    /**
     * Gets the enquiryDate value for this RecentEnquiry.
     * 
     * @return enquiryDate
     */
    public java.util.Calendar getEnquiryDate() {
        return enquiryDate;
    }


    /**
     * Sets the enquiryDate value for this RecentEnquiry.
     * 
     * @param enquiryDate
     */
    public void setEnquiryDate(java.util.Calendar enquiryDate) {
        this.enquiryDate = enquiryDate;
    }


    /**
     * Gets the enquiryReason value for this RecentEnquiry.
     * 
     * @return enquiryReason
     */
    public java.lang.String getEnquiryReason() {
        return enquiryReason;
    }


    /**
     * Sets the enquiryReason value for this RecentEnquiry.
     * 
     * @param enquiryReason
     */
    public void setEnquiryReason(java.lang.String enquiryReason) {
        this.enquiryReason = enquiryReason;
    }


    /**
     * Gets the tradeSector value for this RecentEnquiry.
     * 
     * @return tradeSector
     */
    public java.lang.String getTradeSector() {
        return tradeSector;
    }


    /**
     * Sets the tradeSector value for this RecentEnquiry.
     * 
     * @param tradeSector
     */
    public void setTradeSector(java.lang.String tradeSector) {
        this.tradeSector = tradeSector;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecentEnquiry)) return false;
        RecentEnquiry other = (RecentEnquiry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.enquiryDate==null && other.getEnquiryDate()==null) || 
             (this.enquiryDate!=null &&
              this.enquiryDate.equals(other.getEnquiryDate()))) &&
            ((this.enquiryReason==null && other.getEnquiryReason()==null) || 
             (this.enquiryReason!=null &&
              this.enquiryReason.equals(other.getEnquiryReason()))) &&
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
        if (getEnquiryDate() != null) {
            _hashCode += getEnquiryDate().hashCode();
        }
        if (getEnquiryReason() != null) {
            _hashCode += getEnquiryReason().hashCode();
        }
        if (getTradeSector() != null) {
            _hashCode += getTradeSector().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecentEnquiry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "recentEnquiry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enquiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enquiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enquiryReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enquiryReason"));
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
