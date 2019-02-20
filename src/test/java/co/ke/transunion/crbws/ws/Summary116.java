/**
 * Summary116.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class Summary116  implements java.io.Serializable {
    private co.ke.transunion.crbws.ws.AccountTypeList accountTypeList;

    private co.ke.transunion.crbws.ws.CountSector activeDisputedAccounts;

    private co.ke.transunion.crbws.ws.MoneySector[] activeMaxPrincipalValueList;

    private co.ke.transunion.crbws.ws.MoneySector[] activeTotalBalanceValueList;

    private co.ke.transunion.crbws.ws.MoneySector[] activeTotalPastDueValueList;

    private co.ke.transunion.crbws.ws.CountSector closedAccounts;

    private co.ke.transunion.crbws.ws.CountSector collaterals;

    private co.ke.transunion.crbws.ws.CountSector enquiries31To60Days;

    private co.ke.transunion.crbws.ws.CountSector enquiries61To90Days;

    private co.ke.transunion.crbws.ws.CountSector enquiries91Days;

    private co.ke.transunion.crbws.ws.CountSector enquiriesLast30Days;

    private co.ke.transunion.crbws.ws.DateSector lastEnquiryDate;

    private co.ke.transunion.crbws.ws.DateSector lastNPAListingDate;

    private co.ke.transunion.crbws.ws.DateSector lastPerformingListingDate;

    private co.ke.transunion.crbws.ws.CountSector nonPerformingClosedAccounts;

    private co.ke.transunion.crbws.ws.CountSector nonPerformingOpenAccounts;

    private co.ke.transunion.crbws.ws.CountSector openAccounts;

    private co.ke.transunion.crbws.ws.CountSector performingClosedAccounts;

    private co.ke.transunion.crbws.ws.CountSector performingClosedWDHAccounts;

    private co.ke.transunion.crbws.ws.CountSector performingOpenAccounts;

    private co.ke.transunion.crbws.ws.CountSector performingOpenWDHAccounts;

    private co.ke.transunion.crbws.ws.CountSector totalEnquiries;

    public Summary116() {
    }

    public Summary116(
           co.ke.transunion.crbws.ws.AccountTypeList accountTypeList,
           co.ke.transunion.crbws.ws.CountSector activeDisputedAccounts,
           co.ke.transunion.crbws.ws.MoneySector[] activeMaxPrincipalValueList,
           co.ke.transunion.crbws.ws.MoneySector[] activeTotalBalanceValueList,
           co.ke.transunion.crbws.ws.MoneySector[] activeTotalPastDueValueList,
           co.ke.transunion.crbws.ws.CountSector closedAccounts,
           co.ke.transunion.crbws.ws.CountSector collaterals,
           co.ke.transunion.crbws.ws.CountSector enquiries31To60Days,
           co.ke.transunion.crbws.ws.CountSector enquiries61To90Days,
           co.ke.transunion.crbws.ws.CountSector enquiries91Days,
           co.ke.transunion.crbws.ws.CountSector enquiriesLast30Days,
           co.ke.transunion.crbws.ws.DateSector lastEnquiryDate,
           co.ke.transunion.crbws.ws.DateSector lastNPAListingDate,
           co.ke.transunion.crbws.ws.DateSector lastPerformingListingDate,
           co.ke.transunion.crbws.ws.CountSector nonPerformingClosedAccounts,
           co.ke.transunion.crbws.ws.CountSector nonPerformingOpenAccounts,
           co.ke.transunion.crbws.ws.CountSector openAccounts,
           co.ke.transunion.crbws.ws.CountSector performingClosedAccounts,
           co.ke.transunion.crbws.ws.CountSector performingClosedWDHAccounts,
           co.ke.transunion.crbws.ws.CountSector performingOpenAccounts,
           co.ke.transunion.crbws.ws.CountSector performingOpenWDHAccounts,
           co.ke.transunion.crbws.ws.CountSector totalEnquiries) {
           this.accountTypeList = accountTypeList;
           this.activeDisputedAccounts = activeDisputedAccounts;
           this.activeMaxPrincipalValueList = activeMaxPrincipalValueList;
           this.activeTotalBalanceValueList = activeTotalBalanceValueList;
           this.activeTotalPastDueValueList = activeTotalPastDueValueList;
           this.closedAccounts = closedAccounts;
           this.collaterals = collaterals;
           this.enquiries31To60Days = enquiries31To60Days;
           this.enquiries61To90Days = enquiries61To90Days;
           this.enquiries91Days = enquiries91Days;
           this.enquiriesLast30Days = enquiriesLast30Days;
           this.lastEnquiryDate = lastEnquiryDate;
           this.lastNPAListingDate = lastNPAListingDate;
           this.lastPerformingListingDate = lastPerformingListingDate;
           this.nonPerformingClosedAccounts = nonPerformingClosedAccounts;
           this.nonPerformingOpenAccounts = nonPerformingOpenAccounts;
           this.openAccounts = openAccounts;
           this.performingClosedAccounts = performingClosedAccounts;
           this.performingClosedWDHAccounts = performingClosedWDHAccounts;
           this.performingOpenAccounts = performingOpenAccounts;
           this.performingOpenWDHAccounts = performingOpenWDHAccounts;
           this.totalEnquiries = totalEnquiries;
    }


    /**
     * Gets the accountTypeList value for this Summary116.
     * 
     * @return accountTypeList
     */
    public co.ke.transunion.crbws.ws.AccountTypeList getAccountTypeList() {
        return accountTypeList;
    }


    /**
     * Sets the accountTypeList value for this Summary116.
     * 
     * @param accountTypeList
     */
    public void setAccountTypeList(co.ke.transunion.crbws.ws.AccountTypeList accountTypeList) {
        this.accountTypeList = accountTypeList;
    }


    /**
     * Gets the activeDisputedAccounts value for this Summary116.
     * 
     * @return activeDisputedAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getActiveDisputedAccounts() {
        return activeDisputedAccounts;
    }


    /**
     * Sets the activeDisputedAccounts value for this Summary116.
     * 
     * @param activeDisputedAccounts
     */
    public void setActiveDisputedAccounts(co.ke.transunion.crbws.ws.CountSector activeDisputedAccounts) {
        this.activeDisputedAccounts = activeDisputedAccounts;
    }


    /**
     * Gets the activeMaxPrincipalValueList value for this Summary116.
     * 
     * @return activeMaxPrincipalValueList
     */
    public co.ke.transunion.crbws.ws.MoneySector[] getActiveMaxPrincipalValueList() {
        return activeMaxPrincipalValueList;
    }


    /**
     * Sets the activeMaxPrincipalValueList value for this Summary116.
     * 
     * @param activeMaxPrincipalValueList
     */
    public void setActiveMaxPrincipalValueList(co.ke.transunion.crbws.ws.MoneySector[] activeMaxPrincipalValueList) {
        this.activeMaxPrincipalValueList = activeMaxPrincipalValueList;
    }

    public co.ke.transunion.crbws.ws.MoneySector getActiveMaxPrincipalValueList(int i) {
        return this.activeMaxPrincipalValueList[i];
    }

    public void setActiveMaxPrincipalValueList(int i, co.ke.transunion.crbws.ws.MoneySector _value) {
        this.activeMaxPrincipalValueList[i] = _value;
    }


    /**
     * Gets the activeTotalBalanceValueList value for this Summary116.
     * 
     * @return activeTotalBalanceValueList
     */
    public co.ke.transunion.crbws.ws.MoneySector[] getActiveTotalBalanceValueList() {
        return activeTotalBalanceValueList;
    }


    /**
     * Sets the activeTotalBalanceValueList value for this Summary116.
     * 
     * @param activeTotalBalanceValueList
     */
    public void setActiveTotalBalanceValueList(co.ke.transunion.crbws.ws.MoneySector[] activeTotalBalanceValueList) {
        this.activeTotalBalanceValueList = activeTotalBalanceValueList;
    }

    public co.ke.transunion.crbws.ws.MoneySector getActiveTotalBalanceValueList(int i) {
        return this.activeTotalBalanceValueList[i];
    }

    public void setActiveTotalBalanceValueList(int i, co.ke.transunion.crbws.ws.MoneySector _value) {
        this.activeTotalBalanceValueList[i] = _value;
    }


    /**
     * Gets the activeTotalPastDueValueList value for this Summary116.
     * 
     * @return activeTotalPastDueValueList
     */
    public co.ke.transunion.crbws.ws.MoneySector[] getActiveTotalPastDueValueList() {
        return activeTotalPastDueValueList;
    }


    /**
     * Sets the activeTotalPastDueValueList value for this Summary116.
     * 
     * @param activeTotalPastDueValueList
     */
    public void setActiveTotalPastDueValueList(co.ke.transunion.crbws.ws.MoneySector[] activeTotalPastDueValueList) {
        this.activeTotalPastDueValueList = activeTotalPastDueValueList;
    }

    public co.ke.transunion.crbws.ws.MoneySector getActiveTotalPastDueValueList(int i) {
        return this.activeTotalPastDueValueList[i];
    }

    public void setActiveTotalPastDueValueList(int i, co.ke.transunion.crbws.ws.MoneySector _value) {
        this.activeTotalPastDueValueList[i] = _value;
    }


    /**
     * Gets the closedAccounts value for this Summary116.
     * 
     * @return closedAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getClosedAccounts() {
        return closedAccounts;
    }


    /**
     * Sets the closedAccounts value for this Summary116.
     * 
     * @param closedAccounts
     */
    public void setClosedAccounts(co.ke.transunion.crbws.ws.CountSector closedAccounts) {
        this.closedAccounts = closedAccounts;
    }


    /**
     * Gets the collaterals value for this Summary116.
     * 
     * @return collaterals
     */
    public co.ke.transunion.crbws.ws.CountSector getCollaterals() {
        return collaterals;
    }


    /**
     * Sets the collaterals value for this Summary116.
     * 
     * @param collaterals
     */
    public void setCollaterals(co.ke.transunion.crbws.ws.CountSector collaterals) {
        this.collaterals = collaterals;
    }


    /**
     * Gets the enquiries31To60Days value for this Summary116.
     * 
     * @return enquiries31To60Days
     */
    public co.ke.transunion.crbws.ws.CountSector getEnquiries31To60Days() {
        return enquiries31To60Days;
    }


    /**
     * Sets the enquiries31To60Days value for this Summary116.
     * 
     * @param enquiries31To60Days
     */
    public void setEnquiries31To60Days(co.ke.transunion.crbws.ws.CountSector enquiries31To60Days) {
        this.enquiries31To60Days = enquiries31To60Days;
    }


    /**
     * Gets the enquiries61To90Days value for this Summary116.
     * 
     * @return enquiries61To90Days
     */
    public co.ke.transunion.crbws.ws.CountSector getEnquiries61To90Days() {
        return enquiries61To90Days;
    }


    /**
     * Sets the enquiries61To90Days value for this Summary116.
     * 
     * @param enquiries61To90Days
     */
    public void setEnquiries61To90Days(co.ke.transunion.crbws.ws.CountSector enquiries61To90Days) {
        this.enquiries61To90Days = enquiries61To90Days;
    }


    /**
     * Gets the enquiries91Days value for this Summary116.
     * 
     * @return enquiries91Days
     */
    public co.ke.transunion.crbws.ws.CountSector getEnquiries91Days() {
        return enquiries91Days;
    }


    /**
     * Sets the enquiries91Days value for this Summary116.
     * 
     * @param enquiries91Days
     */
    public void setEnquiries91Days(co.ke.transunion.crbws.ws.CountSector enquiries91Days) {
        this.enquiries91Days = enquiries91Days;
    }


    /**
     * Gets the enquiriesLast30Days value for this Summary116.
     * 
     * @return enquiriesLast30Days
     */
    public co.ke.transunion.crbws.ws.CountSector getEnquiriesLast30Days() {
        return enquiriesLast30Days;
    }


    /**
     * Sets the enquiriesLast30Days value for this Summary116.
     * 
     * @param enquiriesLast30Days
     */
    public void setEnquiriesLast30Days(co.ke.transunion.crbws.ws.CountSector enquiriesLast30Days) {
        this.enquiriesLast30Days = enquiriesLast30Days;
    }


    /**
     * Gets the lastEnquiryDate value for this Summary116.
     * 
     * @return lastEnquiryDate
     */
    public co.ke.transunion.crbws.ws.DateSector getLastEnquiryDate() {
        return lastEnquiryDate;
    }


    /**
     * Sets the lastEnquiryDate value for this Summary116.
     * 
     * @param lastEnquiryDate
     */
    public void setLastEnquiryDate(co.ke.transunion.crbws.ws.DateSector lastEnquiryDate) {
        this.lastEnquiryDate = lastEnquiryDate;
    }


    /**
     * Gets the lastNPAListingDate value for this Summary116.
     * 
     * @return lastNPAListingDate
     */
    public co.ke.transunion.crbws.ws.DateSector getLastNPAListingDate() {
        return lastNPAListingDate;
    }


    /**
     * Sets the lastNPAListingDate value for this Summary116.
     * 
     * @param lastNPAListingDate
     */
    public void setLastNPAListingDate(co.ke.transunion.crbws.ws.DateSector lastNPAListingDate) {
        this.lastNPAListingDate = lastNPAListingDate;
    }


    /**
     * Gets the lastPerformingListingDate value for this Summary116.
     * 
     * @return lastPerformingListingDate
     */
    public co.ke.transunion.crbws.ws.DateSector getLastPerformingListingDate() {
        return lastPerformingListingDate;
    }


    /**
     * Sets the lastPerformingListingDate value for this Summary116.
     * 
     * @param lastPerformingListingDate
     */
    public void setLastPerformingListingDate(co.ke.transunion.crbws.ws.DateSector lastPerformingListingDate) {
        this.lastPerformingListingDate = lastPerformingListingDate;
    }


    /**
     * Gets the nonPerformingClosedAccounts value for this Summary116.
     * 
     * @return nonPerformingClosedAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getNonPerformingClosedAccounts() {
        return nonPerformingClosedAccounts;
    }


    /**
     * Sets the nonPerformingClosedAccounts value for this Summary116.
     * 
     * @param nonPerformingClosedAccounts
     */
    public void setNonPerformingClosedAccounts(co.ke.transunion.crbws.ws.CountSector nonPerformingClosedAccounts) {
        this.nonPerformingClosedAccounts = nonPerformingClosedAccounts;
    }


    /**
     * Gets the nonPerformingOpenAccounts value for this Summary116.
     * 
     * @return nonPerformingOpenAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getNonPerformingOpenAccounts() {
        return nonPerformingOpenAccounts;
    }


    /**
     * Sets the nonPerformingOpenAccounts value for this Summary116.
     * 
     * @param nonPerformingOpenAccounts
     */
    public void setNonPerformingOpenAccounts(co.ke.transunion.crbws.ws.CountSector nonPerformingOpenAccounts) {
        this.nonPerformingOpenAccounts = nonPerformingOpenAccounts;
    }


    /**
     * Gets the openAccounts value for this Summary116.
     * 
     * @return openAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getOpenAccounts() {
        return openAccounts;
    }


    /**
     * Sets the openAccounts value for this Summary116.
     * 
     * @param openAccounts
     */
    public void setOpenAccounts(co.ke.transunion.crbws.ws.CountSector openAccounts) {
        this.openAccounts = openAccounts;
    }


    /**
     * Gets the performingClosedAccounts value for this Summary116.
     * 
     * @return performingClosedAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getPerformingClosedAccounts() {
        return performingClosedAccounts;
    }


    /**
     * Sets the performingClosedAccounts value for this Summary116.
     * 
     * @param performingClosedAccounts
     */
    public void setPerformingClosedAccounts(co.ke.transunion.crbws.ws.CountSector performingClosedAccounts) {
        this.performingClosedAccounts = performingClosedAccounts;
    }


    /**
     * Gets the performingClosedWDHAccounts value for this Summary116.
     * 
     * @return performingClosedWDHAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getPerformingClosedWDHAccounts() {
        return performingClosedWDHAccounts;
    }


    /**
     * Sets the performingClosedWDHAccounts value for this Summary116.
     * 
     * @param performingClosedWDHAccounts
     */
    public void setPerformingClosedWDHAccounts(co.ke.transunion.crbws.ws.CountSector performingClosedWDHAccounts) {
        this.performingClosedWDHAccounts = performingClosedWDHAccounts;
    }


    /**
     * Gets the performingOpenAccounts value for this Summary116.
     * 
     * @return performingOpenAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getPerformingOpenAccounts() {
        return performingOpenAccounts;
    }


    /**
     * Sets the performingOpenAccounts value for this Summary116.
     * 
     * @param performingOpenAccounts
     */
    public void setPerformingOpenAccounts(co.ke.transunion.crbws.ws.CountSector performingOpenAccounts) {
        this.performingOpenAccounts = performingOpenAccounts;
    }


    /**
     * Gets the performingOpenWDHAccounts value for this Summary116.
     * 
     * @return performingOpenWDHAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getPerformingOpenWDHAccounts() {
        return performingOpenWDHAccounts;
    }


    /**
     * Sets the performingOpenWDHAccounts value for this Summary116.
     * 
     * @param performingOpenWDHAccounts
     */
    public void setPerformingOpenWDHAccounts(co.ke.transunion.crbws.ws.CountSector performingOpenWDHAccounts) {
        this.performingOpenWDHAccounts = performingOpenWDHAccounts;
    }


    /**
     * Gets the totalEnquiries value for this Summary116.
     * 
     * @return totalEnquiries
     */
    public co.ke.transunion.crbws.ws.CountSector getTotalEnquiries() {
        return totalEnquiries;
    }


    /**
     * Sets the totalEnquiries value for this Summary116.
     * 
     * @param totalEnquiries
     */
    public void setTotalEnquiries(co.ke.transunion.crbws.ws.CountSector totalEnquiries) {
        this.totalEnquiries = totalEnquiries;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Summary116)) return false;
        Summary116 other = (Summary116) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountTypeList==null && other.getAccountTypeList()==null) || 
             (this.accountTypeList!=null &&
              this.accountTypeList.equals(other.getAccountTypeList()))) &&
            ((this.activeDisputedAccounts==null && other.getActiveDisputedAccounts()==null) || 
             (this.activeDisputedAccounts!=null &&
              this.activeDisputedAccounts.equals(other.getActiveDisputedAccounts()))) &&
            ((this.activeMaxPrincipalValueList==null && other.getActiveMaxPrincipalValueList()==null) || 
             (this.activeMaxPrincipalValueList!=null &&
              java.util.Arrays.equals(this.activeMaxPrincipalValueList, other.getActiveMaxPrincipalValueList()))) &&
            ((this.activeTotalBalanceValueList==null && other.getActiveTotalBalanceValueList()==null) || 
             (this.activeTotalBalanceValueList!=null &&
              java.util.Arrays.equals(this.activeTotalBalanceValueList, other.getActiveTotalBalanceValueList()))) &&
            ((this.activeTotalPastDueValueList==null && other.getActiveTotalPastDueValueList()==null) || 
             (this.activeTotalPastDueValueList!=null &&
              java.util.Arrays.equals(this.activeTotalPastDueValueList, other.getActiveTotalPastDueValueList()))) &&
            ((this.closedAccounts==null && other.getClosedAccounts()==null) || 
             (this.closedAccounts!=null &&
              this.closedAccounts.equals(other.getClosedAccounts()))) &&
            ((this.collaterals==null && other.getCollaterals()==null) || 
             (this.collaterals!=null &&
              this.collaterals.equals(other.getCollaterals()))) &&
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
            ((this.lastEnquiryDate==null && other.getLastEnquiryDate()==null) || 
             (this.lastEnquiryDate!=null &&
              this.lastEnquiryDate.equals(other.getLastEnquiryDate()))) &&
            ((this.lastNPAListingDate==null && other.getLastNPAListingDate()==null) || 
             (this.lastNPAListingDate!=null &&
              this.lastNPAListingDate.equals(other.getLastNPAListingDate()))) &&
            ((this.lastPerformingListingDate==null && other.getLastPerformingListingDate()==null) || 
             (this.lastPerformingListingDate!=null &&
              this.lastPerformingListingDate.equals(other.getLastPerformingListingDate()))) &&
            ((this.nonPerformingClosedAccounts==null && other.getNonPerformingClosedAccounts()==null) || 
             (this.nonPerformingClosedAccounts!=null &&
              this.nonPerformingClosedAccounts.equals(other.getNonPerformingClosedAccounts()))) &&
            ((this.nonPerformingOpenAccounts==null && other.getNonPerformingOpenAccounts()==null) || 
             (this.nonPerformingOpenAccounts!=null &&
              this.nonPerformingOpenAccounts.equals(other.getNonPerformingOpenAccounts()))) &&
            ((this.openAccounts==null && other.getOpenAccounts()==null) || 
             (this.openAccounts!=null &&
              this.openAccounts.equals(other.getOpenAccounts()))) &&
            ((this.performingClosedAccounts==null && other.getPerformingClosedAccounts()==null) || 
             (this.performingClosedAccounts!=null &&
              this.performingClosedAccounts.equals(other.getPerformingClosedAccounts()))) &&
            ((this.performingClosedWDHAccounts==null && other.getPerformingClosedWDHAccounts()==null) || 
             (this.performingClosedWDHAccounts!=null &&
              this.performingClosedWDHAccounts.equals(other.getPerformingClosedWDHAccounts()))) &&
            ((this.performingOpenAccounts==null && other.getPerformingOpenAccounts()==null) || 
             (this.performingOpenAccounts!=null &&
              this.performingOpenAccounts.equals(other.getPerformingOpenAccounts()))) &&
            ((this.performingOpenWDHAccounts==null && other.getPerformingOpenWDHAccounts()==null) || 
             (this.performingOpenWDHAccounts!=null &&
              this.performingOpenWDHAccounts.equals(other.getPerformingOpenWDHAccounts()))) &&
            ((this.totalEnquiries==null && other.getTotalEnquiries()==null) || 
             (this.totalEnquiries!=null &&
              this.totalEnquiries.equals(other.getTotalEnquiries())));
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
        if (getAccountTypeList() != null) {
            _hashCode += getAccountTypeList().hashCode();
        }
        if (getActiveDisputedAccounts() != null) {
            _hashCode += getActiveDisputedAccounts().hashCode();
        }
        if (getActiveMaxPrincipalValueList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActiveMaxPrincipalValueList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActiveMaxPrincipalValueList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getActiveTotalBalanceValueList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActiveTotalBalanceValueList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActiveTotalBalanceValueList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getActiveTotalPastDueValueList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActiveTotalPastDueValueList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActiveTotalPastDueValueList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClosedAccounts() != null) {
            _hashCode += getClosedAccounts().hashCode();
        }
        if (getCollaterals() != null) {
            _hashCode += getCollaterals().hashCode();
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
        if (getLastEnquiryDate() != null) {
            _hashCode += getLastEnquiryDate().hashCode();
        }
        if (getLastNPAListingDate() != null) {
            _hashCode += getLastNPAListingDate().hashCode();
        }
        if (getLastPerformingListingDate() != null) {
            _hashCode += getLastPerformingListingDate().hashCode();
        }
        if (getNonPerformingClosedAccounts() != null) {
            _hashCode += getNonPerformingClosedAccounts().hashCode();
        }
        if (getNonPerformingOpenAccounts() != null) {
            _hashCode += getNonPerformingOpenAccounts().hashCode();
        }
        if (getOpenAccounts() != null) {
            _hashCode += getOpenAccounts().hashCode();
        }
        if (getPerformingClosedAccounts() != null) {
            _hashCode += getPerformingClosedAccounts().hashCode();
        }
        if (getPerformingClosedWDHAccounts() != null) {
            _hashCode += getPerformingClosedWDHAccounts().hashCode();
        }
        if (getPerformingOpenAccounts() != null) {
            _hashCode += getPerformingOpenAccounts().hashCode();
        }
        if (getPerformingOpenWDHAccounts() != null) {
            _hashCode += getPerformingOpenWDHAccounts().hashCode();
        }
        if (getTotalEnquiries() != null) {
            _hashCode += getTotalEnquiries().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Summary116.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "summary116"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountTypeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountTypeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "accountTypeList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeDisputedAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activeDisputedAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeMaxPrincipalValueList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activeMaxPrincipalValueList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "moneySector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeTotalBalanceValueList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activeTotalBalanceValueList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "moneySector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeTotalPastDueValueList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activeTotalPastDueValueList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "moneySector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "closedAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collaterals");
        elemField.setXmlName(new javax.xml.namespace.QName("", "collaterals"));
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
        elemField.setFieldName("lastEnquiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastEnquiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "dateSector"));
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
        elemField.setFieldName("lastPerformingListingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastPerformingListingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "dateSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonPerformingClosedAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nonPerformingClosedAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonPerformingOpenAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nonPerformingOpenAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "openAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performingClosedAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "performingClosedAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performingClosedWDHAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "performingClosedWDHAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performingOpenAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "performingOpenAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performingOpenWDHAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "performingOpenWDHAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalEnquiries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalEnquiries"));
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
