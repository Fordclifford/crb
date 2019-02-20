/**
 * Summary125.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class Summary125  implements java.io.Serializable {
    private co.ke.transunion.crbws.ws.CountSectorDouble avgMobiLoanPrincipalAmount;

    private co.ke.transunion.crbws.ws.CountSector creditHistory;

    private co.ke.transunion.crbws.ws.CountSectorDouble lastMobiLoanPrincipalAmount;

    private co.ke.transunion.crbws.ws.CountSectorDouble maxMobiLoanPrincipalAmount;

    private co.ke.transunion.crbws.ws.CountSectorDouble minMobiLoanPrincipalAmount;

    private co.ke.transunion.crbws.ws.CountSector mobiLoanAccounts;

    private co.ke.transunion.crbws.ws.CountSector npaAccounts;

    private co.ke.transunion.crbws.ws.CountSector npaClosedAccounts;

    private co.ke.transunion.crbws.ws.CountSector npaClosedMobiLoanAccounts;

    private co.ke.transunion.crbws.ws.CountSector npaOpenAccounts;

    private co.ke.transunion.crbws.ws.CountSector npaOpenMobiLoanAccounts;

    private co.ke.transunion.crbws.ws.CountSector paAccounts;

    private co.ke.transunion.crbws.ws.CountSector paAccountsWithDh;

    private co.ke.transunion.crbws.ws.CountSector paClosedAccounts;

    private co.ke.transunion.crbws.ws.CountSector paClosedAccountsWithDh;

    private co.ke.transunion.crbws.ws.CountSector paClosedMobiLoanAccounts;

    private co.ke.transunion.crbws.ws.CountSector paClosedMobiLoanAccountsWithDh;

    private co.ke.transunion.crbws.ws.CountSector paOpenAccounts;

    private co.ke.transunion.crbws.ws.CountSector paOpenAccountsWithDh;

    private co.ke.transunion.crbws.ws.CountSector paOpenMobiLoanAccounts;

    private co.ke.transunion.crbws.ws.CountSector paOpenMobiLoanAccountsWithDh;

    public Summary125() {
    }

    public Summary125(
           co.ke.transunion.crbws.ws.CountSectorDouble avgMobiLoanPrincipalAmount,
           co.ke.transunion.crbws.ws.CountSector creditHistory,
           co.ke.transunion.crbws.ws.CountSectorDouble lastMobiLoanPrincipalAmount,
           co.ke.transunion.crbws.ws.CountSectorDouble maxMobiLoanPrincipalAmount,
           co.ke.transunion.crbws.ws.CountSectorDouble minMobiLoanPrincipalAmount,
           co.ke.transunion.crbws.ws.CountSector mobiLoanAccounts,
           co.ke.transunion.crbws.ws.CountSector npaAccounts,
           co.ke.transunion.crbws.ws.CountSector npaClosedAccounts,
           co.ke.transunion.crbws.ws.CountSector npaClosedMobiLoanAccounts,
           co.ke.transunion.crbws.ws.CountSector npaOpenAccounts,
           co.ke.transunion.crbws.ws.CountSector npaOpenMobiLoanAccounts,
           co.ke.transunion.crbws.ws.CountSector paAccounts,
           co.ke.transunion.crbws.ws.CountSector paAccountsWithDh,
           co.ke.transunion.crbws.ws.CountSector paClosedAccounts,
           co.ke.transunion.crbws.ws.CountSector paClosedAccountsWithDh,
           co.ke.transunion.crbws.ws.CountSector paClosedMobiLoanAccounts,
           co.ke.transunion.crbws.ws.CountSector paClosedMobiLoanAccountsWithDh,
           co.ke.transunion.crbws.ws.CountSector paOpenAccounts,
           co.ke.transunion.crbws.ws.CountSector paOpenAccountsWithDh,
           co.ke.transunion.crbws.ws.CountSector paOpenMobiLoanAccounts,
           co.ke.transunion.crbws.ws.CountSector paOpenMobiLoanAccountsWithDh) {
           this.avgMobiLoanPrincipalAmount = avgMobiLoanPrincipalAmount;
           this.creditHistory = creditHistory;
           this.lastMobiLoanPrincipalAmount = lastMobiLoanPrincipalAmount;
           this.maxMobiLoanPrincipalAmount = maxMobiLoanPrincipalAmount;
           this.minMobiLoanPrincipalAmount = minMobiLoanPrincipalAmount;
           this.mobiLoanAccounts = mobiLoanAccounts;
           this.npaAccounts = npaAccounts;
           this.npaClosedAccounts = npaClosedAccounts;
           this.npaClosedMobiLoanAccounts = npaClosedMobiLoanAccounts;
           this.npaOpenAccounts = npaOpenAccounts;
           this.npaOpenMobiLoanAccounts = npaOpenMobiLoanAccounts;
           this.paAccounts = paAccounts;
           this.paAccountsWithDh = paAccountsWithDh;
           this.paClosedAccounts = paClosedAccounts;
           this.paClosedAccountsWithDh = paClosedAccountsWithDh;
           this.paClosedMobiLoanAccounts = paClosedMobiLoanAccounts;
           this.paClosedMobiLoanAccountsWithDh = paClosedMobiLoanAccountsWithDh;
           this.paOpenAccounts = paOpenAccounts;
           this.paOpenAccountsWithDh = paOpenAccountsWithDh;
           this.paOpenMobiLoanAccounts = paOpenMobiLoanAccounts;
           this.paOpenMobiLoanAccountsWithDh = paOpenMobiLoanAccountsWithDh;
    }


    /**
     * Gets the avgMobiLoanPrincipalAmount value for this Summary125.
     * 
     * @return avgMobiLoanPrincipalAmount
     */
    public co.ke.transunion.crbws.ws.CountSectorDouble getAvgMobiLoanPrincipalAmount() {
        return avgMobiLoanPrincipalAmount;
    }


    /**
     * Sets the avgMobiLoanPrincipalAmount value for this Summary125.
     * 
     * @param avgMobiLoanPrincipalAmount
     */
    public void setAvgMobiLoanPrincipalAmount(co.ke.transunion.crbws.ws.CountSectorDouble avgMobiLoanPrincipalAmount) {
        this.avgMobiLoanPrincipalAmount = avgMobiLoanPrincipalAmount;
    }


    /**
     * Gets the creditHistory value for this Summary125.
     * 
     * @return creditHistory
     */
    public co.ke.transunion.crbws.ws.CountSector getCreditHistory() {
        return creditHistory;
    }


    /**
     * Sets the creditHistory value for this Summary125.
     * 
     * @param creditHistory
     */
    public void setCreditHistory(co.ke.transunion.crbws.ws.CountSector creditHistory) {
        this.creditHistory = creditHistory;
    }


    /**
     * Gets the lastMobiLoanPrincipalAmount value for this Summary125.
     * 
     * @return lastMobiLoanPrincipalAmount
     */
    public co.ke.transunion.crbws.ws.CountSectorDouble getLastMobiLoanPrincipalAmount() {
        return lastMobiLoanPrincipalAmount;
    }


    /**
     * Sets the lastMobiLoanPrincipalAmount value for this Summary125.
     * 
     * @param lastMobiLoanPrincipalAmount
     */
    public void setLastMobiLoanPrincipalAmount(co.ke.transunion.crbws.ws.CountSectorDouble lastMobiLoanPrincipalAmount) {
        this.lastMobiLoanPrincipalAmount = lastMobiLoanPrincipalAmount;
    }


    /**
     * Gets the maxMobiLoanPrincipalAmount value for this Summary125.
     * 
     * @return maxMobiLoanPrincipalAmount
     */
    public co.ke.transunion.crbws.ws.CountSectorDouble getMaxMobiLoanPrincipalAmount() {
        return maxMobiLoanPrincipalAmount;
    }


    /**
     * Sets the maxMobiLoanPrincipalAmount value for this Summary125.
     * 
     * @param maxMobiLoanPrincipalAmount
     */
    public void setMaxMobiLoanPrincipalAmount(co.ke.transunion.crbws.ws.CountSectorDouble maxMobiLoanPrincipalAmount) {
        this.maxMobiLoanPrincipalAmount = maxMobiLoanPrincipalAmount;
    }


    /**
     * Gets the minMobiLoanPrincipalAmount value for this Summary125.
     * 
     * @return minMobiLoanPrincipalAmount
     */
    public co.ke.transunion.crbws.ws.CountSectorDouble getMinMobiLoanPrincipalAmount() {
        return minMobiLoanPrincipalAmount;
    }


    /**
     * Sets the minMobiLoanPrincipalAmount value for this Summary125.
     * 
     * @param minMobiLoanPrincipalAmount
     */
    public void setMinMobiLoanPrincipalAmount(co.ke.transunion.crbws.ws.CountSectorDouble minMobiLoanPrincipalAmount) {
        this.minMobiLoanPrincipalAmount = minMobiLoanPrincipalAmount;
    }


    /**
     * Gets the mobiLoanAccounts value for this Summary125.
     * 
     * @return mobiLoanAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getMobiLoanAccounts() {
        return mobiLoanAccounts;
    }


    /**
     * Sets the mobiLoanAccounts value for this Summary125.
     * 
     * @param mobiLoanAccounts
     */
    public void setMobiLoanAccounts(co.ke.transunion.crbws.ws.CountSector mobiLoanAccounts) {
        this.mobiLoanAccounts = mobiLoanAccounts;
    }


    /**
     * Gets the npaAccounts value for this Summary125.
     * 
     * @return npaAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getNpaAccounts() {
        return npaAccounts;
    }


    /**
     * Sets the npaAccounts value for this Summary125.
     * 
     * @param npaAccounts
     */
    public void setNpaAccounts(co.ke.transunion.crbws.ws.CountSector npaAccounts) {
        this.npaAccounts = npaAccounts;
    }


    /**
     * Gets the npaClosedAccounts value for this Summary125.
     * 
     * @return npaClosedAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getNpaClosedAccounts() {
        return npaClosedAccounts;
    }


    /**
     * Sets the npaClosedAccounts value for this Summary125.
     * 
     * @param npaClosedAccounts
     */
    public void setNpaClosedAccounts(co.ke.transunion.crbws.ws.CountSector npaClosedAccounts) {
        this.npaClosedAccounts = npaClosedAccounts;
    }


    /**
     * Gets the npaClosedMobiLoanAccounts value for this Summary125.
     * 
     * @return npaClosedMobiLoanAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getNpaClosedMobiLoanAccounts() {
        return npaClosedMobiLoanAccounts;
    }


    /**
     * Sets the npaClosedMobiLoanAccounts value for this Summary125.
     * 
     * @param npaClosedMobiLoanAccounts
     */
    public void setNpaClosedMobiLoanAccounts(co.ke.transunion.crbws.ws.CountSector npaClosedMobiLoanAccounts) {
        this.npaClosedMobiLoanAccounts = npaClosedMobiLoanAccounts;
    }


    /**
     * Gets the npaOpenAccounts value for this Summary125.
     * 
     * @return npaOpenAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getNpaOpenAccounts() {
        return npaOpenAccounts;
    }


    /**
     * Sets the npaOpenAccounts value for this Summary125.
     * 
     * @param npaOpenAccounts
     */
    public void setNpaOpenAccounts(co.ke.transunion.crbws.ws.CountSector npaOpenAccounts) {
        this.npaOpenAccounts = npaOpenAccounts;
    }


    /**
     * Gets the npaOpenMobiLoanAccounts value for this Summary125.
     * 
     * @return npaOpenMobiLoanAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getNpaOpenMobiLoanAccounts() {
        return npaOpenMobiLoanAccounts;
    }


    /**
     * Sets the npaOpenMobiLoanAccounts value for this Summary125.
     * 
     * @param npaOpenMobiLoanAccounts
     */
    public void setNpaOpenMobiLoanAccounts(co.ke.transunion.crbws.ws.CountSector npaOpenMobiLoanAccounts) {
        this.npaOpenMobiLoanAccounts = npaOpenMobiLoanAccounts;
    }


    /**
     * Gets the paAccounts value for this Summary125.
     * 
     * @return paAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getPaAccounts() {
        return paAccounts;
    }


    /**
     * Sets the paAccounts value for this Summary125.
     * 
     * @param paAccounts
     */
    public void setPaAccounts(co.ke.transunion.crbws.ws.CountSector paAccounts) {
        this.paAccounts = paAccounts;
    }


    /**
     * Gets the paAccountsWithDh value for this Summary125.
     * 
     * @return paAccountsWithDh
     */
    public co.ke.transunion.crbws.ws.CountSector getPaAccountsWithDh() {
        return paAccountsWithDh;
    }


    /**
     * Sets the paAccountsWithDh value for this Summary125.
     * 
     * @param paAccountsWithDh
     */
    public void setPaAccountsWithDh(co.ke.transunion.crbws.ws.CountSector paAccountsWithDh) {
        this.paAccountsWithDh = paAccountsWithDh;
    }


    /**
     * Gets the paClosedAccounts value for this Summary125.
     * 
     * @return paClosedAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getPaClosedAccounts() {
        return paClosedAccounts;
    }


    /**
     * Sets the paClosedAccounts value for this Summary125.
     * 
     * @param paClosedAccounts
     */
    public void setPaClosedAccounts(co.ke.transunion.crbws.ws.CountSector paClosedAccounts) {
        this.paClosedAccounts = paClosedAccounts;
    }


    /**
     * Gets the paClosedAccountsWithDh value for this Summary125.
     * 
     * @return paClosedAccountsWithDh
     */
    public co.ke.transunion.crbws.ws.CountSector getPaClosedAccountsWithDh() {
        return paClosedAccountsWithDh;
    }


    /**
     * Sets the paClosedAccountsWithDh value for this Summary125.
     * 
     * @param paClosedAccountsWithDh
     */
    public void setPaClosedAccountsWithDh(co.ke.transunion.crbws.ws.CountSector paClosedAccountsWithDh) {
        this.paClosedAccountsWithDh = paClosedAccountsWithDh;
    }


    /**
     * Gets the paClosedMobiLoanAccounts value for this Summary125.
     * 
     * @return paClosedMobiLoanAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getPaClosedMobiLoanAccounts() {
        return paClosedMobiLoanAccounts;
    }


    /**
     * Sets the paClosedMobiLoanAccounts value for this Summary125.
     * 
     * @param paClosedMobiLoanAccounts
     */
    public void setPaClosedMobiLoanAccounts(co.ke.transunion.crbws.ws.CountSector paClosedMobiLoanAccounts) {
        this.paClosedMobiLoanAccounts = paClosedMobiLoanAccounts;
    }


    /**
     * Gets the paClosedMobiLoanAccountsWithDh value for this Summary125.
     * 
     * @return paClosedMobiLoanAccountsWithDh
     */
    public co.ke.transunion.crbws.ws.CountSector getPaClosedMobiLoanAccountsWithDh() {
        return paClosedMobiLoanAccountsWithDh;
    }


    /**
     * Sets the paClosedMobiLoanAccountsWithDh value for this Summary125.
     * 
     * @param paClosedMobiLoanAccountsWithDh
     */
    public void setPaClosedMobiLoanAccountsWithDh(co.ke.transunion.crbws.ws.CountSector paClosedMobiLoanAccountsWithDh) {
        this.paClosedMobiLoanAccountsWithDh = paClosedMobiLoanAccountsWithDh;
    }


    /**
     * Gets the paOpenAccounts value for this Summary125.
     * 
     * @return paOpenAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getPaOpenAccounts() {
        return paOpenAccounts;
    }


    /**
     * Sets the paOpenAccounts value for this Summary125.
     * 
     * @param paOpenAccounts
     */
    public void setPaOpenAccounts(co.ke.transunion.crbws.ws.CountSector paOpenAccounts) {
        this.paOpenAccounts = paOpenAccounts;
    }


    /**
     * Gets the paOpenAccountsWithDh value for this Summary125.
     * 
     * @return paOpenAccountsWithDh
     */
    public co.ke.transunion.crbws.ws.CountSector getPaOpenAccountsWithDh() {
        return paOpenAccountsWithDh;
    }


    /**
     * Sets the paOpenAccountsWithDh value for this Summary125.
     * 
     * @param paOpenAccountsWithDh
     */
    public void setPaOpenAccountsWithDh(co.ke.transunion.crbws.ws.CountSector paOpenAccountsWithDh) {
        this.paOpenAccountsWithDh = paOpenAccountsWithDh;
    }


    /**
     * Gets the paOpenMobiLoanAccounts value for this Summary125.
     * 
     * @return paOpenMobiLoanAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getPaOpenMobiLoanAccounts() {
        return paOpenMobiLoanAccounts;
    }


    /**
     * Sets the paOpenMobiLoanAccounts value for this Summary125.
     * 
     * @param paOpenMobiLoanAccounts
     */
    public void setPaOpenMobiLoanAccounts(co.ke.transunion.crbws.ws.CountSector paOpenMobiLoanAccounts) {
        this.paOpenMobiLoanAccounts = paOpenMobiLoanAccounts;
    }


    /**
     * Gets the paOpenMobiLoanAccountsWithDh value for this Summary125.
     * 
     * @return paOpenMobiLoanAccountsWithDh
     */
    public co.ke.transunion.crbws.ws.CountSector getPaOpenMobiLoanAccountsWithDh() {
        return paOpenMobiLoanAccountsWithDh;
    }


    /**
     * Sets the paOpenMobiLoanAccountsWithDh value for this Summary125.
     * 
     * @param paOpenMobiLoanAccountsWithDh
     */
    public void setPaOpenMobiLoanAccountsWithDh(co.ke.transunion.crbws.ws.CountSector paOpenMobiLoanAccountsWithDh) {
        this.paOpenMobiLoanAccountsWithDh = paOpenMobiLoanAccountsWithDh;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Summary125)) return false;
        Summary125 other = (Summary125) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.avgMobiLoanPrincipalAmount==null && other.getAvgMobiLoanPrincipalAmount()==null) || 
             (this.avgMobiLoanPrincipalAmount!=null &&
              this.avgMobiLoanPrincipalAmount.equals(other.getAvgMobiLoanPrincipalAmount()))) &&
            ((this.creditHistory==null && other.getCreditHistory()==null) || 
             (this.creditHistory!=null &&
              this.creditHistory.equals(other.getCreditHistory()))) &&
            ((this.lastMobiLoanPrincipalAmount==null && other.getLastMobiLoanPrincipalAmount()==null) || 
             (this.lastMobiLoanPrincipalAmount!=null &&
              this.lastMobiLoanPrincipalAmount.equals(other.getLastMobiLoanPrincipalAmount()))) &&
            ((this.maxMobiLoanPrincipalAmount==null && other.getMaxMobiLoanPrincipalAmount()==null) || 
             (this.maxMobiLoanPrincipalAmount!=null &&
              this.maxMobiLoanPrincipalAmount.equals(other.getMaxMobiLoanPrincipalAmount()))) &&
            ((this.minMobiLoanPrincipalAmount==null && other.getMinMobiLoanPrincipalAmount()==null) || 
             (this.minMobiLoanPrincipalAmount!=null &&
              this.minMobiLoanPrincipalAmount.equals(other.getMinMobiLoanPrincipalAmount()))) &&
            ((this.mobiLoanAccounts==null && other.getMobiLoanAccounts()==null) || 
             (this.mobiLoanAccounts!=null &&
              this.mobiLoanAccounts.equals(other.getMobiLoanAccounts()))) &&
            ((this.npaAccounts==null && other.getNpaAccounts()==null) || 
             (this.npaAccounts!=null &&
              this.npaAccounts.equals(other.getNpaAccounts()))) &&
            ((this.npaClosedAccounts==null && other.getNpaClosedAccounts()==null) || 
             (this.npaClosedAccounts!=null &&
              this.npaClosedAccounts.equals(other.getNpaClosedAccounts()))) &&
            ((this.npaClosedMobiLoanAccounts==null && other.getNpaClosedMobiLoanAccounts()==null) || 
             (this.npaClosedMobiLoanAccounts!=null &&
              this.npaClosedMobiLoanAccounts.equals(other.getNpaClosedMobiLoanAccounts()))) &&
            ((this.npaOpenAccounts==null && other.getNpaOpenAccounts()==null) || 
             (this.npaOpenAccounts!=null &&
              this.npaOpenAccounts.equals(other.getNpaOpenAccounts()))) &&
            ((this.npaOpenMobiLoanAccounts==null && other.getNpaOpenMobiLoanAccounts()==null) || 
             (this.npaOpenMobiLoanAccounts!=null &&
              this.npaOpenMobiLoanAccounts.equals(other.getNpaOpenMobiLoanAccounts()))) &&
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
            ((this.paClosedMobiLoanAccounts==null && other.getPaClosedMobiLoanAccounts()==null) || 
             (this.paClosedMobiLoanAccounts!=null &&
              this.paClosedMobiLoanAccounts.equals(other.getPaClosedMobiLoanAccounts()))) &&
            ((this.paClosedMobiLoanAccountsWithDh==null && other.getPaClosedMobiLoanAccountsWithDh()==null) || 
             (this.paClosedMobiLoanAccountsWithDh!=null &&
              this.paClosedMobiLoanAccountsWithDh.equals(other.getPaClosedMobiLoanAccountsWithDh()))) &&
            ((this.paOpenAccounts==null && other.getPaOpenAccounts()==null) || 
             (this.paOpenAccounts!=null &&
              this.paOpenAccounts.equals(other.getPaOpenAccounts()))) &&
            ((this.paOpenAccountsWithDh==null && other.getPaOpenAccountsWithDh()==null) || 
             (this.paOpenAccountsWithDh!=null &&
              this.paOpenAccountsWithDh.equals(other.getPaOpenAccountsWithDh()))) &&
            ((this.paOpenMobiLoanAccounts==null && other.getPaOpenMobiLoanAccounts()==null) || 
             (this.paOpenMobiLoanAccounts!=null &&
              this.paOpenMobiLoanAccounts.equals(other.getPaOpenMobiLoanAccounts()))) &&
            ((this.paOpenMobiLoanAccountsWithDh==null && other.getPaOpenMobiLoanAccountsWithDh()==null) || 
             (this.paOpenMobiLoanAccountsWithDh!=null &&
              this.paOpenMobiLoanAccountsWithDh.equals(other.getPaOpenMobiLoanAccountsWithDh())));
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
        if (getAvgMobiLoanPrincipalAmount() != null) {
            _hashCode += getAvgMobiLoanPrincipalAmount().hashCode();
        }
        if (getCreditHistory() != null) {
            _hashCode += getCreditHistory().hashCode();
        }
        if (getLastMobiLoanPrincipalAmount() != null) {
            _hashCode += getLastMobiLoanPrincipalAmount().hashCode();
        }
        if (getMaxMobiLoanPrincipalAmount() != null) {
            _hashCode += getMaxMobiLoanPrincipalAmount().hashCode();
        }
        if (getMinMobiLoanPrincipalAmount() != null) {
            _hashCode += getMinMobiLoanPrincipalAmount().hashCode();
        }
        if (getMobiLoanAccounts() != null) {
            _hashCode += getMobiLoanAccounts().hashCode();
        }
        if (getNpaAccounts() != null) {
            _hashCode += getNpaAccounts().hashCode();
        }
        if (getNpaClosedAccounts() != null) {
            _hashCode += getNpaClosedAccounts().hashCode();
        }
        if (getNpaClosedMobiLoanAccounts() != null) {
            _hashCode += getNpaClosedMobiLoanAccounts().hashCode();
        }
        if (getNpaOpenAccounts() != null) {
            _hashCode += getNpaOpenAccounts().hashCode();
        }
        if (getNpaOpenMobiLoanAccounts() != null) {
            _hashCode += getNpaOpenMobiLoanAccounts().hashCode();
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
        if (getPaClosedMobiLoanAccounts() != null) {
            _hashCode += getPaClosedMobiLoanAccounts().hashCode();
        }
        if (getPaClosedMobiLoanAccountsWithDh() != null) {
            _hashCode += getPaClosedMobiLoanAccountsWithDh().hashCode();
        }
        if (getPaOpenAccounts() != null) {
            _hashCode += getPaOpenAccounts().hashCode();
        }
        if (getPaOpenAccountsWithDh() != null) {
            _hashCode += getPaOpenAccountsWithDh().hashCode();
        }
        if (getPaOpenMobiLoanAccounts() != null) {
            _hashCode += getPaOpenMobiLoanAccounts().hashCode();
        }
        if (getPaOpenMobiLoanAccountsWithDh() != null) {
            _hashCode += getPaOpenMobiLoanAccountsWithDh().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Summary125.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "summary125"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avgMobiLoanPrincipalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "avgMobiLoanPrincipalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSectorDouble"));
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
        elemField.setFieldName("lastMobiLoanPrincipalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastMobiLoanPrincipalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSectorDouble"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxMobiLoanPrincipalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxMobiLoanPrincipalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSectorDouble"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minMobiLoanPrincipalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minMobiLoanPrincipalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSectorDouble"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobiLoanAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobiLoanAccounts"));
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
        elemField.setFieldName("npaClosedMobiLoanAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "npaClosedMobiLoanAccounts"));
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
        elemField.setFieldName("npaOpenMobiLoanAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "npaOpenMobiLoanAccounts"));
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
        elemField.setFieldName("paClosedMobiLoanAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paClosedMobiLoanAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paClosedMobiLoanAccountsWithDh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paClosedMobiLoanAccountsWithDh"));
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
        elemField.setFieldName("paOpenMobiLoanAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paOpenMobiLoanAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paOpenMobiLoanAccountsWithDh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paOpenMobiLoanAccountsWithDh"));
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
