/**
 * Account116.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class Account116  implements java.io.Serializable {
    private java.util.Calendar accountClosedDate;

    private java.lang.String accountNo;

    private java.util.Calendar accountOpeningDate;

    private java.lang.String accountOwner;

    private java.lang.String accountStatus;

    private java.lang.String accountType;

    private java.lang.Double arrearAmount;

    private java.lang.Integer arrearDays;

    private java.lang.Double balanceAmount;

    private java.lang.String currency;

    private java.lang.String disputed;

    private java.lang.String groupName;

    private java.lang.String groupNumber;

    private java.lang.Boolean hasDefaultHistory;

    private java.lang.Boolean isMyAccount;

    private java.lang.Boolean isNonPerforming;

    private java.lang.Integer joinLoanParticipants;

    private java.util.Calendar lastPaymentDate;

    private java.util.Calendar listingDate;

    private java.util.Calendar maturityDate;

    private java.util.Calendar pastDueDate;

    private java.lang.Double principalAmount;

    private java.lang.Integer repaymentDuration;

    private java.lang.String repaymentTerm;

    private java.lang.Double scheduledPaymentAmount;

    private java.lang.String tradeSector;

    private java.lang.Integer worstArrear;

    public Account116() {
    }

    public Account116(
           java.util.Calendar accountClosedDate,
           java.lang.String accountNo,
           java.util.Calendar accountOpeningDate,
           java.lang.String accountOwner,
           java.lang.String accountStatus,
           java.lang.String accountType,
           java.lang.Double arrearAmount,
           java.lang.Integer arrearDays,
           java.lang.Double balanceAmount,
           java.lang.String currency,
           java.lang.String disputed,
           java.lang.String groupName,
           java.lang.String groupNumber,
           java.lang.Boolean hasDefaultHistory,
           java.lang.Boolean isMyAccount,
           java.lang.Boolean isNonPerforming,
           java.lang.Integer joinLoanParticipants,
           java.util.Calendar lastPaymentDate,
           java.util.Calendar listingDate,
           java.util.Calendar maturityDate,
           java.util.Calendar pastDueDate,
           java.lang.Double principalAmount,
           java.lang.Integer repaymentDuration,
           java.lang.String repaymentTerm,
           java.lang.Double scheduledPaymentAmount,
           java.lang.String tradeSector,
           java.lang.Integer worstArrear) {
           this.accountClosedDate = accountClosedDate;
           this.accountNo = accountNo;
           this.accountOpeningDate = accountOpeningDate;
           this.accountOwner = accountOwner;
           this.accountStatus = accountStatus;
           this.accountType = accountType;
           this.arrearAmount = arrearAmount;
           this.arrearDays = arrearDays;
           this.balanceAmount = balanceAmount;
           this.currency = currency;
           this.disputed = disputed;
           this.groupName = groupName;
           this.groupNumber = groupNumber;
           this.hasDefaultHistory = hasDefaultHistory;
           this.isMyAccount = isMyAccount;
           this.isNonPerforming = isNonPerforming;
           this.joinLoanParticipants = joinLoanParticipants;
           this.lastPaymentDate = lastPaymentDate;
           this.listingDate = listingDate;
           this.maturityDate = maturityDate;
           this.pastDueDate = pastDueDate;
           this.principalAmount = principalAmount;
           this.repaymentDuration = repaymentDuration;
           this.repaymentTerm = repaymentTerm;
           this.scheduledPaymentAmount = scheduledPaymentAmount;
           this.tradeSector = tradeSector;
           this.worstArrear = worstArrear;
    }


    /**
     * Gets the accountClosedDate value for this Account116.
     * 
     * @return accountClosedDate
     */
    public java.util.Calendar getAccountClosedDate() {
        return accountClosedDate;
    }


    /**
     * Sets the accountClosedDate value for this Account116.
     * 
     * @param accountClosedDate
     */
    public void setAccountClosedDate(java.util.Calendar accountClosedDate) {
        this.accountClosedDate = accountClosedDate;
    }


    /**
     * Gets the accountNo value for this Account116.
     * 
     * @return accountNo
     */
    public java.lang.String getAccountNo() {
        return accountNo;
    }


    /**
     * Sets the accountNo value for this Account116.
     * 
     * @param accountNo
     */
    public void setAccountNo(java.lang.String accountNo) {
        this.accountNo = accountNo;
    }


    /**
     * Gets the accountOpeningDate value for this Account116.
     * 
     * @return accountOpeningDate
     */
    public java.util.Calendar getAccountOpeningDate() {
        return accountOpeningDate;
    }


    /**
     * Sets the accountOpeningDate value for this Account116.
     * 
     * @param accountOpeningDate
     */
    public void setAccountOpeningDate(java.util.Calendar accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }


    /**
     * Gets the accountOwner value for this Account116.
     * 
     * @return accountOwner
     */
    public java.lang.String getAccountOwner() {
        return accountOwner;
    }


    /**
     * Sets the accountOwner value for this Account116.
     * 
     * @param accountOwner
     */
    public void setAccountOwner(java.lang.String accountOwner) {
        this.accountOwner = accountOwner;
    }


    /**
     * Gets the accountStatus value for this Account116.
     * 
     * @return accountStatus
     */
    public java.lang.String getAccountStatus() {
        return accountStatus;
    }


    /**
     * Sets the accountStatus value for this Account116.
     * 
     * @param accountStatus
     */
    public void setAccountStatus(java.lang.String accountStatus) {
        this.accountStatus = accountStatus;
    }


    /**
     * Gets the accountType value for this Account116.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this Account116.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the arrearAmount value for this Account116.
     * 
     * @return arrearAmount
     */
    public java.lang.Double getArrearAmount() {
        return arrearAmount;
    }


    /**
     * Sets the arrearAmount value for this Account116.
     * 
     * @param arrearAmount
     */
    public void setArrearAmount(java.lang.Double arrearAmount) {
        this.arrearAmount = arrearAmount;
    }


    /**
     * Gets the arrearDays value for this Account116.
     * 
     * @return arrearDays
     */
    public java.lang.Integer getArrearDays() {
        return arrearDays;
    }


    /**
     * Sets the arrearDays value for this Account116.
     * 
     * @param arrearDays
     */
    public void setArrearDays(java.lang.Integer arrearDays) {
        this.arrearDays = arrearDays;
    }


    /**
     * Gets the balanceAmount value for this Account116.
     * 
     * @return balanceAmount
     */
    public java.lang.Double getBalanceAmount() {
        return balanceAmount;
    }


    /**
     * Sets the balanceAmount value for this Account116.
     * 
     * @param balanceAmount
     */
    public void setBalanceAmount(java.lang.Double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }


    /**
     * Gets the currency value for this Account116.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Account116.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the disputed value for this Account116.
     * 
     * @return disputed
     */
    public java.lang.String getDisputed() {
        return disputed;
    }


    /**
     * Sets the disputed value for this Account116.
     * 
     * @param disputed
     */
    public void setDisputed(java.lang.String disputed) {
        this.disputed = disputed;
    }


    /**
     * Gets the groupName value for this Account116.
     * 
     * @return groupName
     */
    public java.lang.String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this Account116.
     * 
     * @param groupName
     */
    public void setGroupName(java.lang.String groupName) {
        this.groupName = groupName;
    }


    /**
     * Gets the groupNumber value for this Account116.
     * 
     * @return groupNumber
     */
    public java.lang.String getGroupNumber() {
        return groupNumber;
    }


    /**
     * Sets the groupNumber value for this Account116.
     * 
     * @param groupNumber
     */
    public void setGroupNumber(java.lang.String groupNumber) {
        this.groupNumber = groupNumber;
    }


    /**
     * Gets the hasDefaultHistory value for this Account116.
     * 
     * @return hasDefaultHistory
     */
    public java.lang.Boolean getHasDefaultHistory() {
        return hasDefaultHistory;
    }


    /**
     * Sets the hasDefaultHistory value for this Account116.
     * 
     * @param hasDefaultHistory
     */
    public void setHasDefaultHistory(java.lang.Boolean hasDefaultHistory) {
        this.hasDefaultHistory = hasDefaultHistory;
    }


    /**
     * Gets the isMyAccount value for this Account116.
     * 
     * @return isMyAccount
     */
    public java.lang.Boolean getIsMyAccount() {
        return isMyAccount;
    }


    /**
     * Sets the isMyAccount value for this Account116.
     * 
     * @param isMyAccount
     */
    public void setIsMyAccount(java.lang.Boolean isMyAccount) {
        this.isMyAccount = isMyAccount;
    }


    /**
     * Gets the isNonPerforming value for this Account116.
     * 
     * @return isNonPerforming
     */
    public java.lang.Boolean getIsNonPerforming() {
        return isNonPerforming;
    }


    /**
     * Sets the isNonPerforming value for this Account116.
     * 
     * @param isNonPerforming
     */
    public void setIsNonPerforming(java.lang.Boolean isNonPerforming) {
        this.isNonPerforming = isNonPerforming;
    }


    /**
     * Gets the joinLoanParticipants value for this Account116.
     * 
     * @return joinLoanParticipants
     */
    public java.lang.Integer getJoinLoanParticipants() {
        return joinLoanParticipants;
    }


    /**
     * Sets the joinLoanParticipants value for this Account116.
     * 
     * @param joinLoanParticipants
     */
    public void setJoinLoanParticipants(java.lang.Integer joinLoanParticipants) {
        this.joinLoanParticipants = joinLoanParticipants;
    }


    /**
     * Gets the lastPaymentDate value for this Account116.
     * 
     * @return lastPaymentDate
     */
    public java.util.Calendar getLastPaymentDate() {
        return lastPaymentDate;
    }


    /**
     * Sets the lastPaymentDate value for this Account116.
     * 
     * @param lastPaymentDate
     */
    public void setLastPaymentDate(java.util.Calendar lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
    }


    /**
     * Gets the listingDate value for this Account116.
     * 
     * @return listingDate
     */
    public java.util.Calendar getListingDate() {
        return listingDate;
    }


    /**
     * Sets the listingDate value for this Account116.
     * 
     * @param listingDate
     */
    public void setListingDate(java.util.Calendar listingDate) {
        this.listingDate = listingDate;
    }


    /**
     * Gets the maturityDate value for this Account116.
     * 
     * @return maturityDate
     */
    public java.util.Calendar getMaturityDate() {
        return maturityDate;
    }


    /**
     * Sets the maturityDate value for this Account116.
     * 
     * @param maturityDate
     */
    public void setMaturityDate(java.util.Calendar maturityDate) {
        this.maturityDate = maturityDate;
    }


    /**
     * Gets the pastDueDate value for this Account116.
     * 
     * @return pastDueDate
     */
    public java.util.Calendar getPastDueDate() {
        return pastDueDate;
    }


    /**
     * Sets the pastDueDate value for this Account116.
     * 
     * @param pastDueDate
     */
    public void setPastDueDate(java.util.Calendar pastDueDate) {
        this.pastDueDate = pastDueDate;
    }


    /**
     * Gets the principalAmount value for this Account116.
     * 
     * @return principalAmount
     */
    public java.lang.Double getPrincipalAmount() {
        return principalAmount;
    }


    /**
     * Sets the principalAmount value for this Account116.
     * 
     * @param principalAmount
     */
    public void setPrincipalAmount(java.lang.Double principalAmount) {
        this.principalAmount = principalAmount;
    }


    /**
     * Gets the repaymentDuration value for this Account116.
     * 
     * @return repaymentDuration
     */
    public java.lang.Integer getRepaymentDuration() {
        return repaymentDuration;
    }


    /**
     * Sets the repaymentDuration value for this Account116.
     * 
     * @param repaymentDuration
     */
    public void setRepaymentDuration(java.lang.Integer repaymentDuration) {
        this.repaymentDuration = repaymentDuration;
    }


    /**
     * Gets the repaymentTerm value for this Account116.
     * 
     * @return repaymentTerm
     */
    public java.lang.String getRepaymentTerm() {
        return repaymentTerm;
    }


    /**
     * Sets the repaymentTerm value for this Account116.
     * 
     * @param repaymentTerm
     */
    public void setRepaymentTerm(java.lang.String repaymentTerm) {
        this.repaymentTerm = repaymentTerm;
    }


    /**
     * Gets the scheduledPaymentAmount value for this Account116.
     * 
     * @return scheduledPaymentAmount
     */
    public java.lang.Double getScheduledPaymentAmount() {
        return scheduledPaymentAmount;
    }


    /**
     * Sets the scheduledPaymentAmount value for this Account116.
     * 
     * @param scheduledPaymentAmount
     */
    public void setScheduledPaymentAmount(java.lang.Double scheduledPaymentAmount) {
        this.scheduledPaymentAmount = scheduledPaymentAmount;
    }


    /**
     * Gets the tradeSector value for this Account116.
     * 
     * @return tradeSector
     */
    public java.lang.String getTradeSector() {
        return tradeSector;
    }


    /**
     * Sets the tradeSector value for this Account116.
     * 
     * @param tradeSector
     */
    public void setTradeSector(java.lang.String tradeSector) {
        this.tradeSector = tradeSector;
    }


    /**
     * Gets the worstArrear value for this Account116.
     * 
     * @return worstArrear
     */
    public java.lang.Integer getWorstArrear() {
        return worstArrear;
    }


    /**
     * Sets the worstArrear value for this Account116.
     * 
     * @param worstArrear
     */
    public void setWorstArrear(java.lang.Integer worstArrear) {
        this.worstArrear = worstArrear;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Account116)) return false;
        Account116 other = (Account116) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountClosedDate==null && other.getAccountClosedDate()==null) || 
             (this.accountClosedDate!=null &&
              this.accountClosedDate.equals(other.getAccountClosedDate()))) &&
            ((this.accountNo==null && other.getAccountNo()==null) || 
             (this.accountNo!=null &&
              this.accountNo.equals(other.getAccountNo()))) &&
            ((this.accountOpeningDate==null && other.getAccountOpeningDate()==null) || 
             (this.accountOpeningDate!=null &&
              this.accountOpeningDate.equals(other.getAccountOpeningDate()))) &&
            ((this.accountOwner==null && other.getAccountOwner()==null) || 
             (this.accountOwner!=null &&
              this.accountOwner.equals(other.getAccountOwner()))) &&
            ((this.accountStatus==null && other.getAccountStatus()==null) || 
             (this.accountStatus!=null &&
              this.accountStatus.equals(other.getAccountStatus()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.arrearAmount==null && other.getArrearAmount()==null) || 
             (this.arrearAmount!=null &&
              this.arrearAmount.equals(other.getArrearAmount()))) &&
            ((this.arrearDays==null && other.getArrearDays()==null) || 
             (this.arrearDays!=null &&
              this.arrearDays.equals(other.getArrearDays()))) &&
            ((this.balanceAmount==null && other.getBalanceAmount()==null) || 
             (this.balanceAmount!=null &&
              this.balanceAmount.equals(other.getBalanceAmount()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.disputed==null && other.getDisputed()==null) || 
             (this.disputed!=null &&
              this.disputed.equals(other.getDisputed()))) &&
            ((this.groupName==null && other.getGroupName()==null) || 
             (this.groupName!=null &&
              this.groupName.equals(other.getGroupName()))) &&
            ((this.groupNumber==null && other.getGroupNumber()==null) || 
             (this.groupNumber!=null &&
              this.groupNumber.equals(other.getGroupNumber()))) &&
            ((this.hasDefaultHistory==null && other.getHasDefaultHistory()==null) || 
             (this.hasDefaultHistory!=null &&
              this.hasDefaultHistory.equals(other.getHasDefaultHistory()))) &&
            ((this.isMyAccount==null && other.getIsMyAccount()==null) || 
             (this.isMyAccount!=null &&
              this.isMyAccount.equals(other.getIsMyAccount()))) &&
            ((this.isNonPerforming==null && other.getIsNonPerforming()==null) || 
             (this.isNonPerforming!=null &&
              this.isNonPerforming.equals(other.getIsNonPerforming()))) &&
            ((this.joinLoanParticipants==null && other.getJoinLoanParticipants()==null) || 
             (this.joinLoanParticipants!=null &&
              this.joinLoanParticipants.equals(other.getJoinLoanParticipants()))) &&
            ((this.lastPaymentDate==null && other.getLastPaymentDate()==null) || 
             (this.lastPaymentDate!=null &&
              this.lastPaymentDate.equals(other.getLastPaymentDate()))) &&
            ((this.listingDate==null && other.getListingDate()==null) || 
             (this.listingDate!=null &&
              this.listingDate.equals(other.getListingDate()))) &&
            ((this.maturityDate==null && other.getMaturityDate()==null) || 
             (this.maturityDate!=null &&
              this.maturityDate.equals(other.getMaturityDate()))) &&
            ((this.pastDueDate==null && other.getPastDueDate()==null) || 
             (this.pastDueDate!=null &&
              this.pastDueDate.equals(other.getPastDueDate()))) &&
            ((this.principalAmount==null && other.getPrincipalAmount()==null) || 
             (this.principalAmount!=null &&
              this.principalAmount.equals(other.getPrincipalAmount()))) &&
            ((this.repaymentDuration==null && other.getRepaymentDuration()==null) || 
             (this.repaymentDuration!=null &&
              this.repaymentDuration.equals(other.getRepaymentDuration()))) &&
            ((this.repaymentTerm==null && other.getRepaymentTerm()==null) || 
             (this.repaymentTerm!=null &&
              this.repaymentTerm.equals(other.getRepaymentTerm()))) &&
            ((this.scheduledPaymentAmount==null && other.getScheduledPaymentAmount()==null) || 
             (this.scheduledPaymentAmount!=null &&
              this.scheduledPaymentAmount.equals(other.getScheduledPaymentAmount()))) &&
            ((this.tradeSector==null && other.getTradeSector()==null) || 
             (this.tradeSector!=null &&
              this.tradeSector.equals(other.getTradeSector()))) &&
            ((this.worstArrear==null && other.getWorstArrear()==null) || 
             (this.worstArrear!=null &&
              this.worstArrear.equals(other.getWorstArrear())));
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
        if (getAccountClosedDate() != null) {
            _hashCode += getAccountClosedDate().hashCode();
        }
        if (getAccountNo() != null) {
            _hashCode += getAccountNo().hashCode();
        }
        if (getAccountOpeningDate() != null) {
            _hashCode += getAccountOpeningDate().hashCode();
        }
        if (getAccountOwner() != null) {
            _hashCode += getAccountOwner().hashCode();
        }
        if (getAccountStatus() != null) {
            _hashCode += getAccountStatus().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getArrearAmount() != null) {
            _hashCode += getArrearAmount().hashCode();
        }
        if (getArrearDays() != null) {
            _hashCode += getArrearDays().hashCode();
        }
        if (getBalanceAmount() != null) {
            _hashCode += getBalanceAmount().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDisputed() != null) {
            _hashCode += getDisputed().hashCode();
        }
        if (getGroupName() != null) {
            _hashCode += getGroupName().hashCode();
        }
        if (getGroupNumber() != null) {
            _hashCode += getGroupNumber().hashCode();
        }
        if (getHasDefaultHistory() != null) {
            _hashCode += getHasDefaultHistory().hashCode();
        }
        if (getIsMyAccount() != null) {
            _hashCode += getIsMyAccount().hashCode();
        }
        if (getIsNonPerforming() != null) {
            _hashCode += getIsNonPerforming().hashCode();
        }
        if (getJoinLoanParticipants() != null) {
            _hashCode += getJoinLoanParticipants().hashCode();
        }
        if (getLastPaymentDate() != null) {
            _hashCode += getLastPaymentDate().hashCode();
        }
        if (getListingDate() != null) {
            _hashCode += getListingDate().hashCode();
        }
        if (getMaturityDate() != null) {
            _hashCode += getMaturityDate().hashCode();
        }
        if (getPastDueDate() != null) {
            _hashCode += getPastDueDate().hashCode();
        }
        if (getPrincipalAmount() != null) {
            _hashCode += getPrincipalAmount().hashCode();
        }
        if (getRepaymentDuration() != null) {
            _hashCode += getRepaymentDuration().hashCode();
        }
        if (getRepaymentTerm() != null) {
            _hashCode += getRepaymentTerm().hashCode();
        }
        if (getScheduledPaymentAmount() != null) {
            _hashCode += getScheduledPaymentAmount().hashCode();
        }
        if (getTradeSector() != null) {
            _hashCode += getTradeSector().hashCode();
        }
        if (getWorstArrear() != null) {
            _hashCode += getWorstArrear().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Account116.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "account116"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountClosedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountClosedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountOpeningDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountOpeningDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrearAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arrearAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrearDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arrearDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balanceAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disputed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disputed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasDefaultHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasDefaultHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMyAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isMyAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNonPerforming");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isNonPerforming"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("joinLoanParticipants");
        elemField.setXmlName(new javax.xml.namespace.QName("", "joinLoanParticipants"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPaymentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastPaymentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maturityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maturityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pastDueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pastDueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("principalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "principalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repaymentDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repaymentDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repaymentTerm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repaymentTerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledPaymentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheduledPaymentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("worstArrear");
        elemField.setXmlName(new javax.xml.namespace.QName("", "worstArrear"));
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
