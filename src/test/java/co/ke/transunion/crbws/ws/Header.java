/**
 * Header.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class Header  implements java.io.Serializable {
    private java.lang.String crbName;

    private java.lang.String pdfId;

    private java.lang.String productDisplayName;

    private java.util.Calendar reportDate;

    private java.lang.String reportType;

    private java.lang.Integer requestNo;

    private java.lang.String requester;

    public Header() {
    }

    public Header(
           java.lang.String crbName,
           java.lang.String pdfId,
           java.lang.String productDisplayName,
           java.util.Calendar reportDate,
           java.lang.String reportType,
           java.lang.Integer requestNo,
           java.lang.String requester) {
           this.crbName = crbName;
           this.pdfId = pdfId;
           this.productDisplayName = productDisplayName;
           this.reportDate = reportDate;
           this.reportType = reportType;
           this.requestNo = requestNo;
           this.requester = requester;
    }


    /**
     * Gets the crbName value for this Header.
     * 
     * @return crbName
     */
    public java.lang.String getCrbName() {
        return crbName;
    }


    /**
     * Sets the crbName value for this Header.
     * 
     * @param crbName
     */
    public void setCrbName(java.lang.String crbName) {
        this.crbName = crbName;
    }


    /**
     * Gets the pdfId value for this Header.
     * 
     * @return pdfId
     */
    public java.lang.String getPdfId() {
        return pdfId;
    }


    /**
     * Sets the pdfId value for this Header.
     * 
     * @param pdfId
     */
    public void setPdfId(java.lang.String pdfId) {
        this.pdfId = pdfId;
    }


    /**
     * Gets the productDisplayName value for this Header.
     * 
     * @return productDisplayName
     */
    public java.lang.String getProductDisplayName() {
        return productDisplayName;
    }


    /**
     * Sets the productDisplayName value for this Header.
     * 
     * @param productDisplayName
     */
    public void setProductDisplayName(java.lang.String productDisplayName) {
        this.productDisplayName = productDisplayName;
    }


    /**
     * Gets the reportDate value for this Header.
     * 
     * @return reportDate
     */
    public java.util.Calendar getReportDate() {
        return reportDate;
    }


    /**
     * Sets the reportDate value for this Header.
     * 
     * @param reportDate
     */
    public void setReportDate(java.util.Calendar reportDate) {
        this.reportDate = reportDate;
    }


    /**
     * Gets the reportType value for this Header.
     * 
     * @return reportType
     */
    public java.lang.String getReportType() {
        return reportType;
    }


    /**
     * Sets the reportType value for this Header.
     * 
     * @param reportType
     */
    public void setReportType(java.lang.String reportType) {
        this.reportType = reportType;
    }


    /**
     * Gets the requestNo value for this Header.
     * 
     * @return requestNo
     */
    public java.lang.Integer getRequestNo() {
        return requestNo;
    }


    /**
     * Sets the requestNo value for this Header.
     * 
     * @param requestNo
     */
    public void setRequestNo(java.lang.Integer requestNo) {
        this.requestNo = requestNo;
    }


    /**
     * Gets the requester value for this Header.
     * 
     * @return requester
     */
    public java.lang.String getRequester() {
        return requester;
    }


    /**
     * Sets the requester value for this Header.
     * 
     * @param requester
     */
    public void setRequester(java.lang.String requester) {
        this.requester = requester;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Header)) return false;
        Header other = (Header) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.crbName==null && other.getCrbName()==null) || 
             (this.crbName!=null &&
              this.crbName.equals(other.getCrbName()))) &&
            ((this.pdfId==null && other.getPdfId()==null) || 
             (this.pdfId!=null &&
              this.pdfId.equals(other.getPdfId()))) &&
            ((this.productDisplayName==null && other.getProductDisplayName()==null) || 
             (this.productDisplayName!=null &&
              this.productDisplayName.equals(other.getProductDisplayName()))) &&
            ((this.reportDate==null && other.getReportDate()==null) || 
             (this.reportDate!=null &&
              this.reportDate.equals(other.getReportDate()))) &&
            ((this.reportType==null && other.getReportType()==null) || 
             (this.reportType!=null &&
              this.reportType.equals(other.getReportType()))) &&
            ((this.requestNo==null && other.getRequestNo()==null) || 
             (this.requestNo!=null &&
              this.requestNo.equals(other.getRequestNo()))) &&
            ((this.requester==null && other.getRequester()==null) || 
             (this.requester!=null &&
              this.requester.equals(other.getRequester())));
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
        if (getCrbName() != null) {
            _hashCode += getCrbName().hashCode();
        }
        if (getPdfId() != null) {
            _hashCode += getPdfId().hashCode();
        }
        if (getProductDisplayName() != null) {
            _hashCode += getProductDisplayName().hashCode();
        }
        if (getReportDate() != null) {
            _hashCode += getReportDate().hashCode();
        }
        if (getReportType() != null) {
            _hashCode += getReportType().hashCode();
        }
        if (getRequestNo() != null) {
            _hashCode += getRequestNo().hashCode();
        }
        if (getRequester() != null) {
            _hashCode += getRequester().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Header.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "header"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crbName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crbName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pdfId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pdfId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productDisplayName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productDisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requester");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requester"));
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
