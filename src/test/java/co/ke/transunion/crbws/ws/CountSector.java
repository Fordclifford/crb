/**
 * CountSector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class CountSector  implements java.io.Serializable {
    private java.lang.Integer mySector;

    private java.lang.Integer otherSectors;

    public CountSector() {
    }

    public CountSector(
           java.lang.Integer mySector,
           java.lang.Integer otherSectors) {
           this.mySector = mySector;
           this.otherSectors = otherSectors;
    }


    /**
     * Gets the mySector value for this CountSector.
     * 
     * @return mySector
     */
    public java.lang.Integer getMySector() {
        return mySector;
    }


    /**
     * Sets the mySector value for this CountSector.
     * 
     * @param mySector
     */
    public void setMySector(java.lang.Integer mySector) {
        this.mySector = mySector;
    }


    /**
     * Gets the otherSectors value for this CountSector.
     * 
     * @return otherSectors
     */
    public java.lang.Integer getOtherSectors() {
        return otherSectors;
    }


    /**
     * Sets the otherSectors value for this CountSector.
     * 
     * @param otherSectors
     */
    public void setOtherSectors(java.lang.Integer otherSectors) {
        this.otherSectors = otherSectors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CountSector)) return false;
        CountSector other = (CountSector) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mySector==null && other.getMySector()==null) || 
             (this.mySector!=null &&
              this.mySector.equals(other.getMySector()))) &&
            ((this.otherSectors==null && other.getOtherSectors()==null) || 
             (this.otherSectors!=null &&
              this.otherSectors.equals(other.getOtherSectors())));
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
        if (getMySector() != null) {
            _hashCode += getMySector().hashCode();
        }
        if (getOtherSectors() != null) {
            _hashCode += getOtherSectors().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CountSector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mySector");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mySector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherSectors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "otherSectors"));
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
