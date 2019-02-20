/**
 * CorporateProfile159.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class CorporateProfile159  implements java.io.Serializable {
    private java.util.Calendar companyCeaseDate;

    private java.lang.String companyName;

    private java.util.Calendar companyRegDate;

    private java.lang.String companyRegNo;

    private java.lang.String companyStatus;

    private java.lang.String companyType;

    private java.lang.Integer crn;

    private java.lang.String industry;

    private java.lang.String taxNo;

    private java.lang.String vatNo;

    public CorporateProfile159() {
    }

    public CorporateProfile159(
           java.util.Calendar companyCeaseDate,
           java.lang.String companyName,
           java.util.Calendar companyRegDate,
           java.lang.String companyRegNo,
           java.lang.String companyStatus,
           java.lang.String companyType,
           java.lang.Integer crn,
           java.lang.String industry,
           java.lang.String taxNo,
           java.lang.String vatNo) {
           this.companyCeaseDate = companyCeaseDate;
           this.companyName = companyName;
           this.companyRegDate = companyRegDate;
           this.companyRegNo = companyRegNo;
           this.companyStatus = companyStatus;
           this.companyType = companyType;
           this.crn = crn;
           this.industry = industry;
           this.taxNo = taxNo;
           this.vatNo = vatNo;
    }


    /**
     * Gets the companyCeaseDate value for this CorporateProfile159.
     * 
     * @return companyCeaseDate
     */
    public java.util.Calendar getCompanyCeaseDate() {
        return companyCeaseDate;
    }


    /**
     * Sets the companyCeaseDate value for this CorporateProfile159.
     * 
     * @param companyCeaseDate
     */
    public void setCompanyCeaseDate(java.util.Calendar companyCeaseDate) {
        this.companyCeaseDate = companyCeaseDate;
    }


    /**
     * Gets the companyName value for this CorporateProfile159.
     * 
     * @return companyName
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this CorporateProfile159.
     * 
     * @param companyName
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the companyRegDate value for this CorporateProfile159.
     * 
     * @return companyRegDate
     */
    public java.util.Calendar getCompanyRegDate() {
        return companyRegDate;
    }


    /**
     * Sets the companyRegDate value for this CorporateProfile159.
     * 
     * @param companyRegDate
     */
    public void setCompanyRegDate(java.util.Calendar companyRegDate) {
        this.companyRegDate = companyRegDate;
    }


    /**
     * Gets the companyRegNo value for this CorporateProfile159.
     * 
     * @return companyRegNo
     */
    public java.lang.String getCompanyRegNo() {
        return companyRegNo;
    }


    /**
     * Sets the companyRegNo value for this CorporateProfile159.
     * 
     * @param companyRegNo
     */
    public void setCompanyRegNo(java.lang.String companyRegNo) {
        this.companyRegNo = companyRegNo;
    }


    /**
     * Gets the companyStatus value for this CorporateProfile159.
     * 
     * @return companyStatus
     */
    public java.lang.String getCompanyStatus() {
        return companyStatus;
    }


    /**
     * Sets the companyStatus value for this CorporateProfile159.
     * 
     * @param companyStatus
     */
    public void setCompanyStatus(java.lang.String companyStatus) {
        this.companyStatus = companyStatus;
    }


    /**
     * Gets the companyType value for this CorporateProfile159.
     * 
     * @return companyType
     */
    public java.lang.String getCompanyType() {
        return companyType;
    }


    /**
     * Sets the companyType value for this CorporateProfile159.
     * 
     * @param companyType
     */
    public void setCompanyType(java.lang.String companyType) {
        this.companyType = companyType;
    }


    /**
     * Gets the crn value for this CorporateProfile159.
     * 
     * @return crn
     */
    public java.lang.Integer getCrn() {
        return crn;
    }


    /**
     * Sets the crn value for this CorporateProfile159.
     * 
     * @param crn
     */
    public void setCrn(java.lang.Integer crn) {
        this.crn = crn;
    }


    /**
     * Gets the industry value for this CorporateProfile159.
     * 
     * @return industry
     */
    public java.lang.String getIndustry() {
        return industry;
    }


    /**
     * Sets the industry value for this CorporateProfile159.
     * 
     * @param industry
     */
    public void setIndustry(java.lang.String industry) {
        this.industry = industry;
    }


    /**
     * Gets the taxNo value for this CorporateProfile159.
     * 
     * @return taxNo
     */
    public java.lang.String getTaxNo() {
        return taxNo;
    }


    /**
     * Sets the taxNo value for this CorporateProfile159.
     * 
     * @param taxNo
     */
    public void setTaxNo(java.lang.String taxNo) {
        this.taxNo = taxNo;
    }


    /**
     * Gets the vatNo value for this CorporateProfile159.
     * 
     * @return vatNo
     */
    public java.lang.String getVatNo() {
        return vatNo;
    }


    /**
     * Sets the vatNo value for this CorporateProfile159.
     * 
     * @param vatNo
     */
    public void setVatNo(java.lang.String vatNo) {
        this.vatNo = vatNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CorporateProfile159)) return false;
        CorporateProfile159 other = (CorporateProfile159) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.companyCeaseDate==null && other.getCompanyCeaseDate()==null) || 
             (this.companyCeaseDate!=null &&
              this.companyCeaseDate.equals(other.getCompanyCeaseDate()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.companyRegDate==null && other.getCompanyRegDate()==null) || 
             (this.companyRegDate!=null &&
              this.companyRegDate.equals(other.getCompanyRegDate()))) &&
            ((this.companyRegNo==null && other.getCompanyRegNo()==null) || 
             (this.companyRegNo!=null &&
              this.companyRegNo.equals(other.getCompanyRegNo()))) &&
            ((this.companyStatus==null && other.getCompanyStatus()==null) || 
             (this.companyStatus!=null &&
              this.companyStatus.equals(other.getCompanyStatus()))) &&
            ((this.companyType==null && other.getCompanyType()==null) || 
             (this.companyType!=null &&
              this.companyType.equals(other.getCompanyType()))) &&
            ((this.crn==null && other.getCrn()==null) || 
             (this.crn!=null &&
              this.crn.equals(other.getCrn()))) &&
            ((this.industry==null && other.getIndustry()==null) || 
             (this.industry!=null &&
              this.industry.equals(other.getIndustry()))) &&
            ((this.taxNo==null && other.getTaxNo()==null) || 
             (this.taxNo!=null &&
              this.taxNo.equals(other.getTaxNo()))) &&
            ((this.vatNo==null && other.getVatNo()==null) || 
             (this.vatNo!=null &&
              this.vatNo.equals(other.getVatNo())));
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
        if (getCompanyCeaseDate() != null) {
            _hashCode += getCompanyCeaseDate().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getCompanyRegDate() != null) {
            _hashCode += getCompanyRegDate().hashCode();
        }
        if (getCompanyRegNo() != null) {
            _hashCode += getCompanyRegNo().hashCode();
        }
        if (getCompanyStatus() != null) {
            _hashCode += getCompanyStatus().hashCode();
        }
        if (getCompanyType() != null) {
            _hashCode += getCompanyType().hashCode();
        }
        if (getCrn() != null) {
            _hashCode += getCrn().hashCode();
        }
        if (getIndustry() != null) {
            _hashCode += getIndustry().hashCode();
        }
        if (getTaxNo() != null) {
            _hashCode += getTaxNo().hashCode();
        }
        if (getVatNo() != null) {
            _hashCode += getVatNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CorporateProfile159.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "corporateProfile159"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyCeaseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyCeaseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyRegDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyRegDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyRegNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyRegNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "industry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vatNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vatNo"));
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
