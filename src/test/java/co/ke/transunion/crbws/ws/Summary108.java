/**
 * Summary108.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class Summary108  implements java.io.Serializable {
    private co.ke.transunion.crbws.ws.CountSector closedAccounts;

    private co.ke.transunion.crbws.ws.CountSector creditHistory;

    private co.ke.transunion.crbws.ws.CountSector enquiries31To60Days;

    private co.ke.transunion.crbws.ws.CountSector enquiries61To90Days;

    private co.ke.transunion.crbws.ws.CountSector enquiries91Days;

    private co.ke.transunion.crbws.ws.CountSector enquiriesLast30Days;

    private co.ke.transunion.crbws.ws.DateSector lastNPAListingDate;

    private co.ke.transunion.crbws.ws.DateSector lastPAListingDate;

    private co.ke.transunion.crbws.ws.DateSector lastPAListingDateWithDh;

    private co.ke.transunion.crbws.ws.CountSector npaAccounts;

    private co.ke.transunion.crbws.ws.MoneySector[] npaTotalValueList;

    private co.ke.transunion.crbws.ws.CountSector openAccounts;

    private co.ke.transunion.crbws.ws.CountSector paAccounts;

    private co.ke.transunion.crbws.ws.CountSector paAccountsWithDh;

    private co.ke.transunion.crbws.ws.CountSector paClosedAccounts;

    private co.ke.transunion.crbws.ws.CountSector paClosedAccountsWithDh;

    private co.ke.transunion.crbws.ws.CountSector paOpenAccounts;

    private co.ke.transunion.crbws.ws.CountSector paOpenAccountsWithDh;

    private co.ke.transunion.crbws.ws.MoneySector[] paTotalValueList;

    private co.ke.transunion.crbws.ws.MoneySector[] paTotalValueListWithDh;

    public Summary108() {
    }

    public Summary108(
           co.ke.transunion.crbws.ws.CountSector closedAccounts,
           co.ke.transunion.crbws.ws.CountSector creditHistory,
           co.ke.transunion.crbws.ws.CountSector enquiries31To60Days,
           co.ke.transunion.crbws.ws.CountSector enquiries61To90Days,
           co.ke.transunion.crbws.ws.CountSector enquiries91Days,
           co.ke.transunion.crbws.ws.CountSector enquiriesLast30Days,
           co.ke.transunion.crbws.ws.DateSector lastNPAListingDate,
           co.ke.transunion.crbws.ws.DateSector lastPAListingDate,
           co.ke.transunion.crbws.ws.DateSector lastPAListingDateWithDh,
           co.ke.transunion.crbws.ws.CountSector npaAccounts,
           co.ke.transunion.crbws.ws.MoneySector[] npaTotalValueList,
           co.ke.transunion.crbws.ws.CountSector openAccounts,
           co.ke.transunion.crbws.ws.CountSector paAccounts,
           co.ke.transunion.crbws.ws.CountSector paAccountsWithDh,
           co.ke.transunion.crbws.ws.CountSector paClosedAccounts,
           co.ke.transunion.crbws.ws.CountSector paClosedAccountsWithDh,
           co.ke.transunion.crbws.ws.CountSector paOpenAccounts,
           co.ke.transunion.crbws.ws.CountSector paOpenAccountsWithDh,
           co.ke.transunion.crbws.ws.MoneySector[] paTotalValueList,
           co.ke.transunion.crbws.ws.MoneySector[] paTotalValueListWithDh) {
           this.closedAccounts = closedAccounts;
           this.creditHistory = creditHistory;
           this.enquiries31To60Days = enquiries31To60Days;
           this.enquiries61To90Days = enquiries61To90Days;
           this.enquiries91Days = enquiries91Days;
           this.enquiriesLast30Days = enquiriesLast30Days;
           this.lastNPAListingDate = lastNPAListingDate;
           this.lastPAListingDate = lastPAListingDate;
           this.lastPAListingDateWithDh = lastPAListingDateWithDh;
           this.npaAccounts = npaAccounts;
           this.npaTotalValueList = npaTotalValueList;
           this.openAccounts = openAccounts;
           this.paAccounts = paAccounts;
           this.paAccountsWithDh = paAccountsWithDh;
           this.paClosedAccounts = paClosedAccounts;
           this.paClosedAccountsWithDh = paClosedAccountsWithDh;
           this.paOpenAccounts = paOpenAccounts;
           this.paOpenAccountsWithDh = paOpenAccountsWithDh;
           this.paTotalValueList = paTotalValueList;
           this.paTotalValueListWithDh = paTotalValueListWithDh;
    }


    /**
     * Gets the closedAccounts value for this Summary108.
     * 
     * @return closedAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getClosedAccounts() {
        return closedAccounts;
    }


    /**
     * Sets the closedAccounts value for this Summary108.
     * 
     * @param closedAccounts
     */
    public void setClosedAccounts(co.ke.transunion.crbws.ws.CountSector closedAccounts) {
        this.closedAccounts = closedAccounts;
    }


    /**
     * Gets the creditHistory value for this Summary108.
     * 
     * @return creditHistory
     */
    public co.ke.transunion.crbws.ws.CountSector getCreditHistory() {
        return creditHistory;
    }


    /**
     * Sets the creditHistory value for this Summary108.
     * 
     * @param creditHistory
     */
    public void setCreditHistory(co.ke.transunion.crbws.ws.CountSector creditHistory) {
        this.creditHistory = creditHistory;
    }


    /**
     * Gets the enquiries31To60Days value for this Summary108.
     * 
     * @return enquiries31To60Days
     */
    public co.ke.transunion.crbws.ws.CountSector getEnquiries31To60Days() {
        return enquiries31To60Days;
    }


    /**
     * Sets the enquiries31To60Days value for this Summary108.
     * 
     * @param enquiries31To60Days
     */
    public void setEnquiries31To60Days(co.ke.transunion.crbws.ws.CountSector enquiries31To60Days) {
        this.enquiries31To60Days = enquiries31To60Days;
    }


    /**
     * Gets the enquiries61To90Days value for this Summary108.
     * 
     * @return enquiries61To90Days
     */
    public co.ke.transunion.crbws.ws.CountSector getEnquiries61To90Days() {
        return enquiries61To90Days;
    }


    /**
     * Sets the enquiries61To90Days value for this Summary108.
     * 
     * @param enquiries61To90Days
     */
    public void setEnquiries61To90Days(co.ke.transunion.crbws.ws.CountSector enquiries61To90Days) {
        this.enquiries61To90Days = enquiries61To90Days;
    }


    /**
     * Gets the enquiries91Days value for this Summary108.
     * 
     * @return enquiries91Days
     */
    public co.ke.transunion.crbws.ws.CountSector getEnquiries91Days() {
        return enquiries91Days;
    }


    /**
     * Sets the enquiries91Days value for this Summary108.
     * 
     * @param enquiries91Days
     */
    public void setEnquiries91Days(co.ke.transunion.crbws.ws.CountSector enquiries91Days) {
        this.enquiries91Days = enquiries91Days;
    }


    /**
     * Gets the enquiriesLast30Days value for this Summary108.
     * 
     * @return enquiriesLast30Days
     */
    public co.ke.transunion.crbws.ws.CountSector getEnquiriesLast30Days() {
        return enquiriesLast30Days;
    }


    /**
     * Sets the enquiriesLast30Days value for this Summary108.
     * 
     * @param enquiriesLast30Days
     */
    public void setEnquiriesLast30Days(co.ke.transunion.crbws.ws.CountSector enquiriesLast30Days) {
        this.enquiriesLast30Days = enquiriesLast30Days;
    }


    /**
     * Gets the lastNPAListingDate value for this Summary108.
     * 
     * @return lastNPAListingDate
     */
    public co.ke.transunion.crbws.ws.DateSector getLastNPAListingDate() {
        return lastNPAListingDate;
    }


    /**
     * Sets the lastNPAListingDate value for this Summary108.
     * 
     * @param lastNPAListingDate
     */
    public void setLastNPAListingDate(co.ke.transunion.crbws.ws.DateSector lastNPAListingDate) {
        this.lastNPAListingDate = lastNPAListingDate;
    }


    /**
     * Gets the lastPAListingDate value for this Summary108.
     * 
     * @return lastPAListingDate
     */
    public co.ke.transunion.crbws.ws.DateSector getLastPAListingDate() {
        return lastPAListingDate;
    }


    /**
     * Sets the lastPAListingDate value for this Summary108.
     * 
     * @param lastPAListingDate
     */
    public void setLastPAListingDate(co.ke.transunion.crbws.ws.DateSector lastPAListingDate) {
        this.lastPAListingDate = lastPAListingDate;
    }


    /**
     * Gets the lastPAListingDateWithDh value for this Summary108.
     * 
     * @return lastPAListingDateWithDh
     */
    public co.ke.transunion.crbws.ws.DateSector getLastPAListingDateWithDh() {
        return lastPAListingDateWithDh;
    }


    /**
     * Sets the lastPAListingDateWithDh value for this Summary108.
     * 
     * @param lastPAListingDateWithDh
     */
    public void setLastPAListingDateWithDh(co.ke.transunion.crbws.ws.DateSector lastPAListingDateWithDh) {
        this.lastPAListingDateWithDh = lastPAListingDateWithDh;
    }


    /**
     * Gets the npaAccounts value for this Summary108.
     * 
     * @return npaAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getNpaAccounts() {
        return npaAccounts;
    }


    /**
     * Sets the npaAccounts value for this Summary108.
     * 
     * @param npaAccounts
     */
    public void setNpaAccounts(co.ke.transunion.crbws.ws.CountSector npaAccounts) {
        this.npaAccounts = npaAccounts;
    }


    /**
     * Gets the npaTotalValueList value for this Summary108.
     * 
     * @return npaTotalValueList
     */
    public co.ke.transunion.crbws.ws.MoneySector[] getNpaTotalValueList() {
        return npaTotalValueList;
    }


    /**
     * Sets the npaTotalValueList value for this Summary108.
     * 
     * @param npaTotalValueList
     */
    public void setNpaTotalValueList(co.ke.transunion.crbws.ws.MoneySector[] npaTotalValueList) {
        this.npaTotalValueList = npaTotalValueList;
    }

    public co.ke.transunion.crbws.ws.MoneySector getNpaTotalValueList(int i) {
        return this.npaTotalValueList[i];
    }

    public void setNpaTotalValueList(int i, co.ke.transunion.crbws.ws.MoneySector _value) {
        this.npaTotalValueList[i] = _value;
    }


    /**
     * Gets the openAccounts value for this Summary108.
     * 
     * @return openAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getOpenAccounts() {
        return openAccounts;
    }


    /**
     * Sets the openAccounts value for this Summary108.
     * 
     * @param openAccounts
     */
    public void setOpenAccounts(co.ke.transunion.crbws.ws.CountSector openAccounts) {
        this.openAccounts = openAccounts;
    }


    /**
     * Gets the paAccounts value for this Summary108.
     * 
     * @return paAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getPaAccounts() {
        return paAccounts;
    }


    /**
     * Sets the paAccounts value for this Summary108.
     * 
     * @param paAccounts
     */
    public void setPaAccounts(co.ke.transunion.crbws.ws.CountSector paAccounts) {
        this.paAccounts = paAccounts;
    }


    /**
     * Gets the paAccountsWithDh value for this Summary108.
     * 
     * @return paAccountsWithDh
     */
    public co.ke.transunion.crbws.ws.CountSector getPaAccountsWithDh() {
        return paAccountsWithDh;
    }


    /**
     * Sets the paAccountsWithDh value for this Summary108.
     * 
     * @param paAccountsWithDh
     */
    public void setPaAccountsWithDh(co.ke.transunion.crbws.ws.CountSector paAccountsWithDh) {
        this.paAccountsWithDh = paAccountsWithDh;
    }


    /**
     * Gets the paClosedAccounts value for this Summary108.
     * 
     * @return paClosedAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getPaClosedAccounts() {
        return paClosedAccounts;
    }


    /**
     * Sets the paClosedAccounts value for this Summary108.
     * 
     * @param paClosedAccounts
     */
    public void setPaClosedAccounts(co.ke.transunion.crbws.ws.CountSector paClosedAccounts) {
        this.paClosedAccounts = paClosedAccounts;
    }


    /**
     * Gets the paClosedAccountsWithDh value for this Summary108.
     * 
     * @return paClosedAccountsWithDh
     */
    public co.ke.transunion.crbws.ws.CountSector getPaClosedAccountsWithDh() {
        return paClosedAccountsWithDh;
    }


    /**
     * Sets the paClosedAccountsWithDh value for this Summary108.
     * 
     * @param paClosedAccountsWithDh
     */
    public void setPaClosedAccountsWithDh(co.ke.transunion.crbws.ws.CountSector paClosedAccountsWithDh) {
        this.paClosedAccountsWithDh = paClosedAccountsWithDh;
    }


    /**
     * Gets the paOpenAccounts value for this Summary108.
     * 
     * @return paOpenAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getPaOpenAccounts() {
        return paOpenAccounts;
    }


    /**
     * Sets the paOpenAccounts value for this Summary108.
     * 
     * @param paOpenAccounts
     */
    public void setPaOpenAccounts(co.ke.transunion.crbws.ws.CountSector paOpenAccounts) {
        this.paOpenAccounts = paOpenAccounts;
    }


    /**
     * Gets the paOpenAccountsWithDh value for this Summary108.
     * 
     * @return paOpenAccountsWithDh
     */
    public co.ke.transunion.crbws.ws.CountSector getPaOpenAccountsWithDh() {
        return paOpenAccountsWithDh;
    }


    /**
     * Sets the paOpenAccountsWithDh value for this Summary108.
     * 
     * @param paOpenAccountsWithDh
     */
    public void setPaOpenAccountsWithDh(co.ke.transunion.crbws.ws.CountSector paOpenAccountsWithDh) {
        this.paOpenAccountsWithDh = paOpenAccountsWithDh;
    }


    /**
     * Gets the paTotalValueList value for this Summary108.
     * 
     * @return paTotalValueList
     */
    public co.ke.transunion.crbws.ws.MoneySector[] getPaTotalValueList() {
        return paTotalValueList;
    }


    /**
     * Sets the paTotalValueList value for this Summary108.
     * 
     * @param paTotalValueList
     */
    public void setPaTotalValueList(co.ke.transunion.crbws.ws.MoneySector[] paTotalValueList) {
        this.paTotalValueList = paTotalValueList;
    }

    public co.ke.transunion.crbws.ws.MoneySector getPaTotalValueList(int i) {
        return this.paTotalValueList[i];
    }

    public void setPaTotalValueList(int i, co.ke.transunion.crbws.ws.MoneySector _value) {
        this.paTotalValueList[i] = _value;
    }


    /**
     * Gets the paTotalValueListWithDh value for this Summary108.
     * 
     * @return paTotalValueListWithDh
     */
    public co.ke.transunion.crbws.ws.MoneySector[] getPaTotalValueListWithDh() {
        return paTotalValueListWithDh;
    }


    /**
     * Sets the paTotalValueListWithDh value for this Summary108.
     * 
     * @param paTotalValueListWithDh
     */
    public void setPaTotalValueListWithDh(co.ke.transunion.crbws.ws.MoneySector[] paTotalValueListWithDh) {
        this.paTotalValueListWithDh = paTotalValueListWithDh;
    }

    public co.ke.transunion.crbws.ws.MoneySector getPaTotalValueListWithDh(int i) {
        return this.paTotalValueListWithDh[i];
    }

    public void setPaTotalValueListWithDh(int i, co.ke.transunion.crbws.ws.MoneySector _value) {
        this.paTotalValueListWithDh[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Summary108)) return false;
        Summary108 other = (Summary108) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.closedAccounts==null && other.getClosedAccounts()==null) || 
             (this.closedAccounts!=null &&
              this.closedAccounts.equals(other.getClosedAccounts()))) &&
            ((this.creditHistory==null && other.getCreditHistory()==null) || 
             (this.creditHistory!=null &&
              this.creditHistory.equals(other.getCreditHistory()))) &&
            ((this.enquiries31To60Days==null && other.getEnquiries31To60Days()==null) || 
             (this.enquiries31To60Days!=null &&
              this.enquiries31To60Days.equals(other.getEnquiries31To60Days()))) &&
            ((this.enquiries61To90Days==null && other.getEnquiries61To90Days()==null) || 
             (this.enquiries61To90Days!=null &&
              this.enquiries61To90Days.equals(other.getEnquiries61To90Days()))) &&
            ((this.enquiries91Days==null && other.getEnquiries91Days()==null) || 
             (this.enquiries91Days!=null &&
              this.enquiries91Days.equals(other.getEnquiries91Days()))) &&
            ((this.enquiriesLast30Days==null && other.getEnquiriesLast30Days()==null) || 
             (this.enquiriesLast30Days!=null &&
              this.enquiriesLast30Days.equals(other.getEnquiriesLast30Days()))) &&
            ((this.lastNPAListingDate==null && other.getLastNPAListingDate()==null) || 
             (this.lastNPAListingDate!=null &&
              this.lastNPAListingDate.equals(other.getLastNPAListingDate()))) &&
            ((this.lastPAListingDate==null && other.getLastPAListingDate()==null) || 
             (this.lastPAListingDate!=null &&
              this.lastPAListingDate.equals(other.getLastPAListingDate()))) &&
            ((this.lastPAListingDateWithDh==null && other.getLastPAListingDateWithDh()==null) || 
             (this.lastPAListingDateWithDh!=null &&
              this.lastPAListingDateWithDh.equals(other.getLastPAListingDateWithDh()))) &&
            ((this.npaAccounts==null && other.getNpaAccounts()==null) || 
             (this.npaAccounts!=null &&
              this.npaAccounts.equals(other.getNpaAccounts()))) &&
            ((this.npaTotalValueList==null && other.getNpaTotalValueList()==null) || 
             (this.npaTotalValueList!=null &&
              java.util.Arrays.equals(this.npaTotalValueList, other.getNpaTotalValueList()))) &&
            ((this.openAccounts==null && other.getOpenAccounts()==null) || 
             (this.openAccounts!=null &&
              this.openAccounts.equals(other.getOpenAccounts()))) &&
            ((this.paAccounts==null && other.getPaAccounts()==null) || 
             (this.paAccounts!=null &&
              this.paAccounts.equals(other.getPaAccounts()))) &&
            ((this.paAccountsWithDh==null && other.getPaAccountsWithDh()==null) || 
             (this.paAccountsWithDh!=null &&
              this.paAccountsWithDh.equals(other.getPaAccountsWithDh()))) &&
            ((this.paClosedAccounts==null && other.getPaClosedAccounts()==null) || 
             (this.paClosedAccounts!=null &&
              this.paClosedAccounts.equals(other.getPaClosedAccounts()))) &&
            ((this.paClosedAccountsWithDh==null && other.getPaClosedAccountsWithDh()==null) || 
             (this.paClosedAccountsWithDh!=null &&
              this.paClosedAccountsWithDh.equals(other.getPaClosedAccountsWithDh()))) &&
            ((this.paOpenAccounts==null && other.getPaOpenAccounts()==null) || 
             (this.paOpenAccounts!=null &&
              this.paOpenAccounts.equals(other.getPaOpenAccounts()))) &&
            ((this.paOpenAccountsWithDh==null && other.getPaOpenAccountsWithDh()==null) || 
             (this.paOpenAccountsWithDh!=null &&
              this.paOpenAccountsWithDh.equals(other.getPaOpenAccountsWithDh()))) &&
            ((this.paTotalValueList==null && other.getPaTotalValueList()==null) || 
             (this.paTotalValueList!=null &&
              java.util.Arrays.equals(this.paTotalValueList, other.getPaTotalValueList()))) &&
            ((this.paTotalValueListWithDh==null && other.getPaTotalValueListWithDh()==null) || 
             (this.paTotalValueListWithDh!=null &&
              java.util.Arrays.equals(this.paTotalValueListWithDh, other.getPaTotalValueListWithDh())));
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
        if (getClosedAccounts() != null) {
            _hashCode += getClosedAccounts().hashCode();
        }
        if (getCreditHistory() != null) {
            _hashCode += getCreditHistory().hashCode();
        }
        if (getEnquiries31To60Days() != null) {
            _hashCode += getEnquiries31To60Days().hashCode();
        }
        if (getEnquiries61To90Days() != null) {
            _hashCode += getEnquiries61To90Days().hashCode();
        }
        if (getEnquiries91Days() != null) {
            _hashCode += getEnquiries91Days().hashCode();
        }
        if (getEnquiriesLast30Days() != null) {
            _hashCode += getEnquiriesLast30Days().hashCode();
        }
        if (getLastNPAListingDate() != null) {
            _hashCode += getLastNPAListingDate().hashCode();
        }
        if (getLastPAListingDate() != null) {
            _hashCode += getLastPAListingDate().hashCode();
        }
        if (getLastPAListingDateWithDh() != null) {
            _hashCode += getLastPAListingDateWithDh().hashCode();
        }
        if (getNpaAccounts() != null) {
            _hashCode += getNpaAccounts().hashCode();
        }
        if (getNpaTotalValueList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNpaTotalValueList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNpaTotalValueList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOpenAccounts() != null) {
            _hashCode += getOpenAccounts().hashCode();
        }
        if (getPaAccounts() != null) {
            _hashCode += getPaAccounts().hashCode();
        }
        if (getPaAccountsWithDh() != null) {
            _hashCode += getPaAccountsWithDh().hashCode();
        }
        if (getPaClosedAccounts() != null) {
            _hashCode += getPaClosedAccounts().hashCode();
        }
        if (getPaClosedAccountsWithDh() != null) {
            _hashCode += getPaClosedAccountsWithDh().hashCode();
        }
        if (getPaOpenAccounts() != null) {
            _hashCode += getPaOpenAccounts().hashCode();
        }
        if (getPaOpenAccountsWithDh() != null) {
            _hashCode += getPaOpenAccountsWithDh().hashCode();
        }
        if (getPaTotalValueList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaTotalValueList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaTotalValueList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaTotalValueListWithDh() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaTotalValueListWithDh());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaTotalValueListWithDh(), i);
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
        new org.apache.axis.description.TypeDesc(Summary108.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "summary108"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "closedAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enquiries31To60Days");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enquiries31to60Days"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enquiries61To90Days");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enquiries61to90Days"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enquiries91Days");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enquiries91Days"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enquiriesLast30Days");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enquiriesLast30Days"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastNPAListingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastNPAListingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "dateSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPAListingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastPAListingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "dateSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPAListingDateWithDh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastPAListingDateWithDh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "dateSector"));
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
        elemField.setFieldName("npaTotalValueList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "npaTotalValueList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "moneySector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "openAccounts"));
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
        elemField.setFieldName("paAccountsWithDh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paAccountsWithDh"));
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
        elemField.setFieldName("paClosedAccountsWithDh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paClosedAccountsWithDh"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paOpenAccountsWithDh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paOpenAccountsWithDh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paTotalValueList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paTotalValueList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "moneySector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paTotalValueListWithDh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paTotalValueListWithDh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "moneySector"));
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
