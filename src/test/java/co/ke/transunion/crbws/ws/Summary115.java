/**
 * Summary115.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class Summary115  implements java.io.Serializable {
    private co.ke.transunion.crbws.ws.CountSector creditHistory;

    private co.ke.transunion.crbws.ws.CountSector npaAccounts;

    private co.ke.transunion.crbws.ws.CountSector npaClosedAccounts;

    private co.ke.transunion.crbws.ws.CountSector npaOpenAccounts;

    private co.ke.transunion.crbws.ws.CountSector paAccounts;

    private co.ke.transunion.crbws.ws.CountSector paClosedAccounts;

    private co.ke.transunion.crbws.ws.CountSector paOpenAccounts;

    public Summary115() {
    }

    public Summary115(
           co.ke.transunion.crbws.ws.CountSector creditHistory,
           co.ke.transunion.crbws.ws.CountSector npaAccounts,
           co.ke.transunion.crbws.ws.CountSector npaClosedAccounts,
           co.ke.transunion.crbws.ws.CountSector npaOpenAccounts,
           co.ke.transunion.crbws.ws.CountSector paAccounts,
           co.ke.transunion.crbws.ws.CountSector paClosedAccounts,
           co.ke.transunion.crbws.ws.CountSector paOpenAccounts) {
           this.creditHistory = creditHistory;
           this.npaAccounts = npaAccounts;
           this.npaClosedAccounts = npaClosedAccounts;
           this.npaOpenAccounts = npaOpenAccounts;
           this.paAccounts = paAccounts;
           this.paClosedAccounts = paClosedAccounts;
           this.paOpenAccounts = paOpenAccounts;
    }


    /**
     * Gets the creditHistory value for this Summary115.
     * 
     * @return creditHistory
     */
    public co.ke.transunion.crbws.ws.CountSector getCreditHistory() {
        return creditHistory;
    }


    /**
     * Sets the creditHistory value for this Summary115.
     * 
     * @param creditHistory
     */
    public void setCreditHistory(co.ke.transunion.crbws.ws.CountSector creditHistory) {
        this.creditHistory = creditHistory;
    }


    /**
     * Gets the npaAccounts value for this Summary115.
     * 
     * @return npaAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getNpaAccounts() {
        return npaAccounts;
    }


    /**
     * Sets the npaAccounts value for this Summary115.
     * 
     * @param npaAccounts
     */
    public void setNpaAccounts(co.ke.transunion.crbws.ws.CountSector npaAccounts) {
        this.npaAccounts = npaAccounts;
    }


    /**
     * Gets the npaClosedAccounts value for this Summary115.
     * 
     * @return npaClosedAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getNpaClosedAccounts() {
        return npaClosedAccounts;
    }


    /**
     * Sets the npaClosedAccounts value for this Summary115.
     * 
     * @param npaClosedAccounts
     */
    public void setNpaClosedAccounts(co.ke.transunion.crbws.ws.CountSector npaClosedAccounts) {
        this.npaClosedAccounts = npaClosedAccounts;
    }


    /**
     * Gets the npaOpenAccounts value for this Summary115.
     * 
     * @return npaOpenAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getNpaOpenAccounts() {
        return npaOpenAccounts;
    }


    /**
     * Sets the npaOpenAccounts value for this Summary115.
     * 
     * @param npaOpenAccounts
     */
    public void setNpaOpenAccounts(co.ke.transunion.crbws.ws.CountSector npaOpenAccounts) {
        this.npaOpenAccounts = npaOpenAccounts;
    }


    /**
     * Gets the paAccounts value for this Summary115.
     * 
     * @return paAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getPaAccounts() {
        return paAccounts;
    }


    /**
     * Sets the paAccounts value for this Summary115.
     * 
     * @param paAccounts
     */
    public void setPaAccounts(co.ke.transunion.crbws.ws.CountSector paAccounts) {
        this.paAccounts = paAccounts;
    }


    /**
     * Gets the paClosedAccounts value for this Summary115.
     * 
     * @return paClosedAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getPaClosedAccounts() {
        return paClosedAccounts;
    }


    /**
     * Sets the paClosedAccounts value for this Summary115.
     * 
     * @param paClosedAccounts
     */
    public void setPaClosedAccounts(co.ke.transunion.crbws.ws.CountSector paClosedAccounts) {
        this.paClosedAccounts = paClosedAccounts;
    }


    /**
     * Gets the paOpenAccounts value for this Summary115.
     * 
     * @return paOpenAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getPaOpenAccounts() {
        return paOpenAccounts;
    }


    /**
     * Sets the paOpenAccounts value for this Summary115.
     * 
     * @param paOpenAccounts
     */
    public void setPaOpenAccounts(co.ke.transunion.crbws.ws.CountSector paOpenAccounts) {
        this.paOpenAccounts = paOpenAccounts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Summary115)) return false;
        Summary115 other = (Summary115) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creditHistory==null && other.getCreditHistory()==null) || 
             (this.creditHistory!=null &&
              this.creditHistory.equals(other.getCreditHistory()))) &&
            ((this.npaAccounts==null && other.getNpaAccounts()==null) || 
             (this.npaAccounts!=null &&
              this.npaAccounts.equals(other.getNpaAccounts()))) &&
            ((this.npaClosedAccounts==null && other.getNpaClosedAccounts()==null) || 
             (this.npaClosedAccounts!=null &&
              this.npaClosedAccounts.equals(other.getNpaClosedAccounts()))) &&
            ((this.npaOpenAccounts==null && other.getNpaOpenAccounts()==null) || 
             (this.npaOpenAccounts!=null &&
              this.npaOpenAccounts.equals(other.getNpaOpenAccounts()))) &&
            ((this.paAccounts==null && other.getPaAccounts()==null) || 
             (this.paAccounts!=null &&
              this.paAccounts.equals(other.getPaAccounts()))) &&
            ((this.paClosedAccounts==null && other.getPaClosedAccounts()==null) || 
             (this.paClosedAccounts!=null &&
              this.paClosedAccounts.equals(other.getPaClosedAccounts()))) &&
            ((this.paOpenAccounts==null && other.getPaOpenAccounts()==null) || 
             (this.paOpenAccounts!=null &&
              this.paOpenAccounts.equals(other.getPaOpenAccounts())));
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
        if (getCreditHistory() != null) {
            _hashCode += getCreditHistory().hashCode();
        }
        if (getNpaAccounts() != null) {
            _hashCode += getNpaAccounts().hashCode();
        }
        if (getNpaClosedAccounts() != null) {
            _hashCode += getNpaClosedAccounts().hashCode();
        }
        if (getNpaOpenAccounts() != null) {
            _hashCode += getNpaOpenAccounts().hashCode();
        }
        if (getPaAccounts() != null) {
            _hashCode += getPaAccounts().hashCode();
        }
        if (getPaClosedAccounts() != null) {
            _hashCode += getPaClosedAccounts().hashCode();
        }
        if (getPaOpenAccounts() != null) {
            _hashCode += getPaOpenAccounts().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Summary115.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "summary115"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("npaAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "npaAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("npaClosedAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "npaClosedAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("npaOpenAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "npaOpenAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paClosedAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paClosedAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paOpenAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paOpenAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
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
