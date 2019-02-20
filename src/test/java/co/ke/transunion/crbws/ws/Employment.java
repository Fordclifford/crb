/**
 * Employment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class Employment  implements java.io.Serializable {
    private java.lang.String designation;

    private java.lang.String employerName;

    private java.lang.String physicalAddress;

    private java.lang.String postalAddress;

    private java.lang.String profession;

    public Employment() {
    }

    public Employment(
           java.lang.String designation,
           java.lang.String employerName,
           java.lang.String physicalAddress,
           java.lang.String postalAddress,
           java.lang.String profession) {
           this.designation = designation;
           this.employerName = employerName;
           this.physicalAddress = physicalAddress;
           this.postalAddress = postalAddress;
           this.profession = profession;
    }


    /**
     * Gets the designation value for this Employment.
     * 
     * @return designation
     */
    public java.lang.String getDesignation() {
        return designation;
    }


    /**
     * Sets the designation value for this Employment.
     * 
     * @param designation
     */
    public void setDesignation(java.lang.String designation) {
        this.designation = designation;
    }


    /**
     * Gets the employerName value for this Employment.
     * 
     * @return employerName
     */
    public java.lang.String getEmployerName() {
        return employerName;
    }


    /**
     * Sets the employerName value for this Employment.
     * 
     * @param employerName
     */
    public void setEmployerName(java.lang.String employerName) {
        this.employerName = employerName;
    }


    /**
     * Gets the physicalAddress value for this Employment.
     * 
     * @return physicalAddress
     */
    public java.lang.String getPhysicalAddress() {
        return physicalAddress;
    }


    /**
     * Sets the physicalAddress value for this Employment.
     * 
     * @param physicalAddress
     */
    public void setPhysicalAddress(java.lang.String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }


    /**
     * Gets the postalAddress value for this Employment.
     * 
     * @return postalAddress
     */
    public java.lang.String getPostalAddress() {
        return postalAddress;
    }


    /**
     * Sets the postalAddress value for this Employment.
     * 
     * @param postalAddress
     */
    public void setPostalAddress(java.lang.String postalAddress) {
        this.postalAddress = postalAddress;
    }


    /**
     * Gets the profession value for this Employment.
     * 
     * @return profession
     */
    public java.lang.String getProfession() {
        return profession;
    }


    /**
     * Sets the profession value for this Employment.
     * 
     * @param profession
     */
    public void setProfession(java.lang.String profession) {
        this.profession = profession;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Employment)) return false;
        Employment other = (Employment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.designation==null && other.getDesignation()==null) || 
             (this.designation!=null &&
              this.designation.equals(other.getDesignation()))) &&
            ((this.employerName==null && other.getEmployerName()==null) || 
             (this.employerName!=null &&
              this.employerName.equals(other.getEmployerName()))) &&
            ((this.physicalAddress==null && other.getPhysicalAddress()==null) || 
             (this.physicalAddress!=null &&
              this.physicalAddress.equals(other.getPhysicalAddress()))) &&
            ((this.postalAddress==null && other.getPostalAddress()==null) || 
             (this.postalAddress!=null &&
              this.postalAddress.equals(other.getPostalAddress()))) &&
            ((this.profession==null && other.getProfession()==null) || 
             (this.profession!=null &&
              this.profession.equals(other.getProfession())));
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
        if (getDesignation() != null) {
            _hashCode += getDesignation().hashCode();
        }
        if (getEmployerName() != null) {
            _hashCode += getEmployerName().hashCode();
        }
        if (getPhysicalAddress() != null) {
            _hashCode += getPhysicalAddress().hashCode();
        }
        if (getPostalAddress() != null) {
            _hashCode += getPostalAddress().hashCode();
        }
        if (getProfession() != null) {
            _hashCode += getProfession().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Employment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "employment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "designation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "employerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("physicalAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "physicalAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postalAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profession");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profession"));
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
