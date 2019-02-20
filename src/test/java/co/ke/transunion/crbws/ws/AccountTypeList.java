/**
 * AccountTypeList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class AccountTypeList  implements java.io.Serializable {
    private co.ke.transunion.crbws.ws.AccountTypeSector[] closedNonPerformingAccountType;

    private co.ke.transunion.crbws.ws.AccountTypeSector[] closedPerformingAccountType;

    private co.ke.transunion.crbws.ws.AccountTypeSector[] closedPerformingWDHAccountType;

    private co.ke.transunion.crbws.ws.AccountTypeSector[] openNonPerformingAccountType;

    private co.ke.transunion.crbws.ws.AccountTypeSector[] openPerformingAccountType;

    private co.ke.transunion.crbws.ws.AccountTypeSector[] openPerformingWDHAccountType;

    public AccountTypeList() {
    }

    public AccountTypeList(
           co.ke.transunion.crbws.ws.AccountTypeSector[] closedNonPerformingAccountType,
           co.ke.transunion.crbws.ws.AccountTypeSector[] closedPerformingAccountType,
           co.ke.transunion.crbws.ws.AccountTypeSector[] closedPerformingWDHAccountType,
           co.ke.transunion.crbws.ws.AccountTypeSector[] openNonPerformingAccountType,
           co.ke.transunion.crbws.ws.AccountTypeSector[] openPerformingAccountType,
           co.ke.transunion.crbws.ws.AccountTypeSector[] openPerformingWDHAccountType) {
           this.closedNonPerformingAccountType = closedNonPerformingAccountType;
           this.closedPerformingAccountType = closedPerformingAccountType;
           this.closedPerformingWDHAccountType = closedPerformingWDHAccountType;
           this.openNonPerformingAccountType = openNonPerformingAccountType;
           this.openPerformingAccountType = openPerformingAccountType;
           this.openPerformingWDHAccountType = openPerformingWDHAccountType;
    }


    /**
     * Gets the closedNonPerformingAccountType value for this AccountTypeList.
     * 
     * @return closedNonPerformingAccountType
     */
    public co.ke.transunion.crbws.ws.AccountTypeSector[] getClosedNonPerformingAccountType() {
        return closedNonPerformingAccountType;
    }


    /**
     * Sets the closedNonPerformingAccountType value for this AccountTypeList.
     * 
     * @param closedNonPerformingAccountType
     */
    public void setClosedNonPerformingAccountType(co.ke.transunion.crbws.ws.AccountTypeSector[] closedNonPerformingAccountType) {
        this.closedNonPerformingAccountType = closedNonPerformingAccountType;
    }

    public co.ke.transunion.crbws.ws.AccountTypeSector getClosedNonPerformingAccountType(int i) {
        return this.closedNonPerformingAccountType[i];
    }

    public void setClosedNonPerformingAccountType(int i, co.ke.transunion.crbws.ws.AccountTypeSector _value) {
        this.closedNonPerformingAccountType[i] = _value;
    }


    /**
     * Gets the closedPerformingAccountType value for this AccountTypeList.
     * 
     * @return closedPerformingAccountType
     */
    public co.ke.transunion.crbws.ws.AccountTypeSector[] getClosedPerformingAccountType() {
        return closedPerformingAccountType;
    }


    /**
     * Sets the closedPerformingAccountType value for this AccountTypeList.
     * 
     * @param closedPerformingAccountType
     */
    public void setClosedPerformingAccountType(co.ke.transunion.crbws.ws.AccountTypeSector[] closedPerformingAccountType) {
        this.closedPerformingAccountType = closedPerformingAccountType;
    }

    public co.ke.transunion.crbws.ws.AccountTypeSector getClosedPerformingAccountType(int i) {
        return this.closedPerformingAccountType[i];
    }

    public void setClosedPerformingAccountType(int i, co.ke.transunion.crbws.ws.AccountTypeSector _value) {
        this.closedPerformingAccountType[i] = _value;
    }


    /**
     * Gets the closedPerformingWDHAccountType value for this AccountTypeList.
     * 
     * @return closedPerformingWDHAccountType
     */
    public co.ke.transunion.crbws.ws.AccountTypeSector[] getClosedPerformingWDHAccountType() {
        return closedPerformingWDHAccountType;
    }


    /**
     * Sets the closedPerformingWDHAccountType value for this AccountTypeList.
     * 
     * @param closedPerformingWDHAccountType
     */
    public void setClosedPerformingWDHAccountType(co.ke.transunion.crbws.ws.AccountTypeSector[] closedPerformingWDHAccountType) {
        this.closedPerformingWDHAccountType = closedPerformingWDHAccountType;
    }

    public co.ke.transunion.crbws.ws.AccountTypeSector getClosedPerformingWDHAccountType(int i) {
        return this.closedPerformingWDHAccountType[i];
    }

    public void setClosedPerformingWDHAccountType(int i, co.ke.transunion.crbws.ws.AccountTypeSector _value) {
        this.closedPerformingWDHAccountType[i] = _value;
    }


    /**
     * Gets the openNonPerformingAccountType value for this AccountTypeList.
     * 
     * @return openNonPerformingAccountType
     */
    public co.ke.transunion.crbws.ws.AccountTypeSector[] getOpenNonPerformingAccountType() {
        return openNonPerformingAccountType;
    }


    /**
     * Sets the openNonPerformingAccountType value for this AccountTypeList.
     * 
     * @param openNonPerformingAccountType
     */
    public void setOpenNonPerformingAccountType(co.ke.transunion.crbws.ws.AccountTypeSector[] openNonPerformingAccountType) {
        this.openNonPerformingAccountType = openNonPerformingAccountType;
    }

    public co.ke.transunion.crbws.ws.AccountTypeSector getOpenNonPerformingAccountType(int i) {
        return this.openNonPerformingAccountType[i];
    }

    public void setOpenNonPerformingAccountType(int i, co.ke.transunion.crbws.ws.AccountTypeSector _value) {
        this.openNonPerformingAccountType[i] = _value;
    }


    /**
     * Gets the openPerformingAccountType value for this AccountTypeList.
     * 
     * @return openPerformingAccountType
     */
    public co.ke.transunion.crbws.ws.AccountTypeSector[] getOpenPerformingAccountType() {
        return openPerformingAccountType;
    }


    /**
     * Sets the openPerformingAccountType value for this AccountTypeList.
     * 
     * @param openPerformingAccountType
     */
    public void setOpenPerformingAccountType(co.ke.transunion.crbws.ws.AccountTypeSector[] openPerformingAccountType) {
        this.openPerformingAccountType = openPerformingAccountType;
    }

    public co.ke.transunion.crbws.ws.AccountTypeSector getOpenPerformingAccountType(int i) {
        return this.openPerformingAccountType[i];
    }

    public void setOpenPerformingAccountType(int i, co.ke.transunion.crbws.ws.AccountTypeSector _value) {
        this.openPerformingAccountType[i] = _value;
    }


    /**
     * Gets the openPerformingWDHAccountType value for this AccountTypeList.
     * 
     * @return openPerformingWDHAccountType
     */
    public co.ke.transunion.crbws.ws.AccountTypeSector[] getOpenPerformingWDHAccountType() {
        return openPerformingWDHAccountType;
    }


    /**
     * Sets the openPerformingWDHAccountType value for this AccountTypeList.
     * 
     * @param openPerformingWDHAccountType
     */
    public void setOpenPerformingWDHAccountType(co.ke.transunion.crbws.ws.AccountTypeSector[] openPerformingWDHAccountType) {
        this.openPerformingWDHAccountType = openPerformingWDHAccountType;
    }

    public co.ke.transunion.crbws.ws.AccountTypeSector getOpenPerformingWDHAccountType(int i) {
        return this.openPerformingWDHAccountType[i];
    }

    public void setOpenPerformingWDHAccountType(int i, co.ke.transunion.crbws.ws.AccountTypeSector _value) {
        this.openPerformingWDHAccountType[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountTypeList)) return false;
        AccountTypeList other = (AccountTypeList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.closedNonPerformingAccountType==null && other.getClosedNonPerformingAccountType()==null) || 
             (this.closedNonPerformingAccountType!=null &&
              java.util.Arrays.equals(this.closedNonPerformingAccountType, other.getClosedNonPerformingAccountType()))) &&
            ((this.closedPerformingAccountType==null && other.getClosedPerformingAccountType()==null) || 
             (this.closedPerformingAccountType!=null &&
              java.util.Arrays.equals(this.closedPerformingAccountType, other.getClosedPerformingAccountType()))) &&
            ((this.closedPerformingWDHAccountType==null && other.getClosedPerformingWDHAccountType()==null) || 
             (this.closedPerformingWDHAccountType!=null &&
              java.util.Arrays.equals(this.closedPerformingWDHAccountType, other.getClosedPerformingWDHAccountType()))) &&
            ((this.openNonPerformingAccountType==null && other.getOpenNonPerformingAccountType()==null) || 
             (this.openNonPerformingAccountType!=null &&
              java.util.Arrays.equals(this.openNonPerformingAccountType, other.getOpenNonPerformingAccountType()))) &&
            ((this.openPerformingAccountType==null && other.getOpenPerformingAccountType()==null) || 
             (this.openPerformingAccountType!=null &&
              java.util.Arrays.equals(this.openPerformingAccountType, other.getOpenPerformingAccountType()))) &&
            ((this.openPerformingWDHAccountType==null && other.getOpenPerformingWDHAccountType()==null) || 
             (this.openPerformingWDHAccountType!=null &&
              java.util.Arrays.equals(this.openPerformingWDHAccountType, other.getOpenPerformingWDHAccountType())));
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
        if (getClosedNonPerformingAccountType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClosedNonPerformingAccountType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClosedNonPerformingAccountType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClosedPerformingAccountType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClosedPerformingAccountType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClosedPerformingAccountType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClosedPerformingWDHAccountType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClosedPerformingWDHAccountType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClosedPerformingWDHAccountType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOpenNonPerformingAccountType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOpenNonPerformingAccountType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOpenNonPerformingAccountType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOpenPerformingAccountType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOpenPerformingAccountType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOpenPerformingAccountType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOpenPerformingWDHAccountType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOpenPerformingWDHAccountType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOpenPerformingWDHAccountType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountTypeList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "accountTypeList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedNonPerformingAccountType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "closedNonPerformingAccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "accountTypeSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedPerformingAccountType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "closedPerformingAccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "accountTypeSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedPerformingWDHAccountType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "closedPerformingWDHAccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "accountTypeSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openNonPerformingAccountType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "openNonPerformingAccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "accountTypeSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openPerformingAccountType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "openPerformingAccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "accountTypeSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openPerformingWDHAccountType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "openPerformingWDHAccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "accountTypeSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
