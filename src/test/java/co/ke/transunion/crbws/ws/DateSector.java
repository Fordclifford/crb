/**
 * DateSector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class DateSector  implements java.io.Serializable {
    private java.util.Calendar mySector;

    private java.util.Calendar otherSectors;

    public DateSector() {
    }

    public DateSector(
           java.util.Calendar mySector,
           java.util.Calendar otherSectors) {
           this.mySector = mySector;
           this.otherSectors = otherSectors;
    }


    /**
     * Gets the mySector value for this DateSector.
     * 
     * @return mySector
     */
    public java.util.Calendar getMySector() {
        return mySector;
    }


    /**
     * Sets the mySector value for this DateSector.
     * 
     * @param mySector
     */
    public void setMySector(java.util.Calendar mySector) {
        this.mySector = mySector;
    }


    /**
     * Gets the otherSectors value for this DateSector.
     * 
     * @return otherSectors
     */
    public java.util.Calendar getOtherSectors() {
        return otherSectors;
    }


    /**
     * Sets the otherSectors value for this DateSector.
     * 
     * @param otherSectors
     */
    public void setOtherSectors(java.util.Calendar otherSectors) {
        this.otherSectors = otherSectors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DateSector)) return false;
        DateSector other = (DateSector) obj;
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
        new org.apache.axis.description.TypeDesc(DateSector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "dateSector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mySector");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mySector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherSectors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "otherSectors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
