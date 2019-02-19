
package co.ke.transunion.crbws.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for summary137 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="summary137">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arrears30Days" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="arrears60Days" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="arrears90Days" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="arrearsGT90Days" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="arrearsNone" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="avgMobiLoanPrincipalAmount" type="{http://ws.crbws.transunion.ke.co/}countSectorDouble" minOccurs="0"/>
 *         &lt;element name="creditHistory" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="currentAccountsInArrears" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="lastMobiLoanPrincipalAmount" type="{http://ws.crbws.transunion.ke.co/}countSectorDouble" minOccurs="0"/>
 *         &lt;element name="lastMobileLoanListingDate" type="{http://ws.crbws.transunion.ke.co/}dateSector" minOccurs="0"/>
 *         &lt;element name="maxArrears" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="maxMobiLoanPrincipalAmount" type="{http://ws.crbws.transunion.ke.co/}countSectorDouble" minOccurs="0"/>
 *         &lt;element name="minMobiLoanPrincipalAmount" type="{http://ws.crbws.transunion.ke.co/}countSectorDouble" minOccurs="0"/>
 *         &lt;element name="mobiLoanAccounts" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="npaAccounts" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="npaClosedAccounts" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="npaClosedMobiLoanAccounts" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="npaOpenAccounts" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="npaOpenMobiLoanAccounts" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="paAccounts" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="paAccountsWithDh" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="paClosedAccounts" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="paClosedAccountsWithDh" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="paClosedMobiLoanAccounts" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="paClosedMobiLoanAccountsWithDh" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="paOpenAccounts" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="paOpenAccountsWithDh" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="paOpenMobiLoanAccounts" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="paOpenMobiLoanAccountsWithDh" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "summary137", propOrder = {
    "arrears30Days",
    "arrears60Days",
    "arrears90Days",
    "arrearsGT90Days",
    "arrearsNone",
    "avgMobiLoanPrincipalAmount",
    "creditHistory",
    "currentAccountsInArrears",
    "lastMobiLoanPrincipalAmount",
    "lastMobileLoanListingDate",
    "maxArrears",
    "maxMobiLoanPrincipalAmount",
    "minMobiLoanPrincipalAmount",
    "mobiLoanAccounts",
    "npaAccounts",
    "npaClosedAccounts",
    "npaClosedMobiLoanAccounts",
    "npaOpenAccounts",
    "npaOpenMobiLoanAccounts",
    "paAccounts",
    "paAccountsWithDh",
    "paClosedAccounts",
    "paClosedAccountsWithDh",
    "paClosedMobiLoanAccounts",
    "paClosedMobiLoanAccountsWithDh",
    "paOpenAccounts",
    "paOpenAccountsWithDh",
    "paOpenMobiLoanAccounts",
    "paOpenMobiLoanAccountsWithDh"
})
public class Summary137 {

    protected CountSector arrears30Days;
    protected CountSector arrears60Days;
    protected CountSector arrears90Days;
    protected CountSector arrearsGT90Days;
    protected CountSector arrearsNone;
    protected CountSectorDouble avgMobiLoanPrincipalAmount;
    protected CountSector creditHistory;
    protected CountSector currentAccountsInArrears;
    protected CountSectorDouble lastMobiLoanPrincipalAmount;
    protected DateSector lastMobileLoanListingDate;
    protected CountSector maxArrears;
    protected CountSectorDouble maxMobiLoanPrincipalAmount;
    protected CountSectorDouble minMobiLoanPrincipalAmount;
    protected CountSector mobiLoanAccounts;
    protected CountSector npaAccounts;
    protected CountSector npaClosedAccounts;
    protected CountSector npaClosedMobiLoanAccounts;
    protected CountSector npaOpenAccounts;
    protected CountSector npaOpenMobiLoanAccounts;
    protected CountSector paAccounts;
    protected CountSector paAccountsWithDh;
    protected CountSector paClosedAccounts;
    protected CountSector paClosedAccountsWithDh;
    protected CountSector paClosedMobiLoanAccounts;
    protected CountSector paClosedMobiLoanAccountsWithDh;
    protected CountSector paOpenAccounts;
    protected CountSector paOpenAccountsWithDh;
    protected CountSector paOpenMobiLoanAccounts;
    protected CountSector paOpenMobiLoanAccountsWithDh;

    /**
     * Gets the value of the arrears30Days property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getArrears30Days() {
        return arrears30Days;
    }

    /**
     * Sets the value of the arrears30Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setArrears30Days(CountSector value) {
        this.arrears30Days = value;
    }

    /**
     * Gets the value of the arrears60Days property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getArrears60Days() {
        return arrears60Days;
    }

    /**
     * Sets the value of the arrears60Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setArrears60Days(CountSector value) {
        this.arrears60Days = value;
    }

    /**
     * Gets the value of the arrears90Days property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getArrears90Days() {
        return arrears90Days;
    }

    /**
     * Sets the value of the arrears90Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setArrears90Days(CountSector value) {
        this.arrears90Days = value;
    }

    /**
     * Gets the value of the arrearsGT90Days property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getArrearsGT90Days() {
        return arrearsGT90Days;
    }

    /**
     * Sets the value of the arrearsGT90Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setArrearsGT90Days(CountSector value) {
        this.arrearsGT90Days = value;
    }

    /**
     * Gets the value of the arrearsNone property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getArrearsNone() {
        return arrearsNone;
    }

    /**
     * Sets the value of the arrearsNone property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setArrearsNone(CountSector value) {
        this.arrearsNone = value;
    }

    /**
     * Gets the value of the avgMobiLoanPrincipalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CountSectorDouble }
     *     
     */
    public CountSectorDouble getAvgMobiLoanPrincipalAmount() {
        return avgMobiLoanPrincipalAmount;
    }

    /**
     * Sets the value of the avgMobiLoanPrincipalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSectorDouble }
     *     
     */
    public void setAvgMobiLoanPrincipalAmount(CountSectorDouble value) {
        this.avgMobiLoanPrincipalAmount = value;
    }

    /**
     * Gets the value of the creditHistory property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getCreditHistory() {
        return creditHistory;
    }

    /**
     * Sets the value of the creditHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setCreditHistory(CountSector value) {
        this.creditHistory = value;
    }

    /**
     * Gets the value of the currentAccountsInArrears property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getCurrentAccountsInArrears() {
        return currentAccountsInArrears;
    }

    /**
     * Sets the value of the currentAccountsInArrears property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setCurrentAccountsInArrears(CountSector value) {
        this.currentAccountsInArrears = value;
    }

    /**
     * Gets the value of the lastMobiLoanPrincipalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CountSectorDouble }
     *     
     */
    public CountSectorDouble getLastMobiLoanPrincipalAmount() {
        return lastMobiLoanPrincipalAmount;
    }

    /**
     * Sets the value of the lastMobiLoanPrincipalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSectorDouble }
     *     
     */
    public void setLastMobiLoanPrincipalAmount(CountSectorDouble value) {
        this.lastMobiLoanPrincipalAmount = value;
    }

    /**
     * Gets the value of the lastMobileLoanListingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateSector }
     *     
     */
    public DateSector getLastMobileLoanListingDate() {
        return lastMobileLoanListingDate;
    }

    /**
     * Sets the value of the lastMobileLoanListingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateSector }
     *     
     */
    public void setLastMobileLoanListingDate(DateSector value) {
        this.lastMobileLoanListingDate = value;
    }

    /**
     * Gets the value of the maxArrears property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getMaxArrears() {
        return maxArrears;
    }

    /**
     * Sets the value of the maxArrears property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setMaxArrears(CountSector value) {
        this.maxArrears = value;
    }

    /**
     * Gets the value of the maxMobiLoanPrincipalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CountSectorDouble }
     *     
     */
    public CountSectorDouble getMaxMobiLoanPrincipalAmount() {
        return maxMobiLoanPrincipalAmount;
    }

    /**
     * Sets the value of the maxMobiLoanPrincipalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSectorDouble }
     *     
     */
    public void setMaxMobiLoanPrincipalAmount(CountSectorDouble value) {
        this.maxMobiLoanPrincipalAmount = value;
    }

    /**
     * Gets the value of the minMobiLoanPrincipalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CountSectorDouble }
     *     
     */
    public CountSectorDouble getMinMobiLoanPrincipalAmount() {
        return minMobiLoanPrincipalAmount;
    }

    /**
     * Sets the value of the minMobiLoanPrincipalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSectorDouble }
     *     
     */
    public void setMinMobiLoanPrincipalAmount(CountSectorDouble value) {
        this.minMobiLoanPrincipalAmount = value;
    }

    /**
     * Gets the value of the mobiLoanAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getMobiLoanAccounts() {
        return mobiLoanAccounts;
    }

    /**
     * Sets the value of the mobiLoanAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setMobiLoanAccounts(CountSector value) {
        this.mobiLoanAccounts = value;
    }

    /**
     * Gets the value of the npaAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getNpaAccounts() {
        return npaAccounts;
    }

    /**
     * Sets the value of the npaAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setNpaAccounts(CountSector value) {
        this.npaAccounts = value;
    }

    /**
     * Gets the value of the npaClosedAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getNpaClosedAccounts() {
        return npaClosedAccounts;
    }

    /**
     * Sets the value of the npaClosedAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setNpaClosedAccounts(CountSector value) {
        this.npaClosedAccounts = value;
    }

    /**
     * Gets the value of the npaClosedMobiLoanAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getNpaClosedMobiLoanAccounts() {
        return npaClosedMobiLoanAccounts;
    }

    /**
     * Sets the value of the npaClosedMobiLoanAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setNpaClosedMobiLoanAccounts(CountSector value) {
        this.npaClosedMobiLoanAccounts = value;
    }

    /**
     * Gets the value of the npaOpenAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getNpaOpenAccounts() {
        return npaOpenAccounts;
    }

    /**
     * Sets the value of the npaOpenAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setNpaOpenAccounts(CountSector value) {
        this.npaOpenAccounts = value;
    }

    /**
     * Gets the value of the npaOpenMobiLoanAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getNpaOpenMobiLoanAccounts() {
        return npaOpenMobiLoanAccounts;
    }

    /**
     * Sets the value of the npaOpenMobiLoanAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setNpaOpenMobiLoanAccounts(CountSector value) {
        this.npaOpenMobiLoanAccounts = value;
    }

    /**
     * Gets the value of the paAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getPaAccounts() {
        return paAccounts;
    }

    /**
     * Sets the value of the paAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setPaAccounts(CountSector value) {
        this.paAccounts = value;
    }

    /**
     * Gets the value of the paAccountsWithDh property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getPaAccountsWithDh() {
        return paAccountsWithDh;
    }

    /**
     * Sets the value of the paAccountsWithDh property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setPaAccountsWithDh(CountSector value) {
        this.paAccountsWithDh = value;
    }

    /**
     * Gets the value of the paClosedAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getPaClosedAccounts() {
        return paClosedAccounts;
    }

    /**
     * Sets the value of the paClosedAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setPaClosedAccounts(CountSector value) {
        this.paClosedAccounts = value;
    }

    /**
     * Gets the value of the paClosedAccountsWithDh property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getPaClosedAccountsWithDh() {
        return paClosedAccountsWithDh;
    }

    /**
     * Sets the value of the paClosedAccountsWithDh property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setPaClosedAccountsWithDh(CountSector value) {
        this.paClosedAccountsWithDh = value;
    }

    /**
     * Gets the value of the paClosedMobiLoanAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getPaClosedMobiLoanAccounts() {
        return paClosedMobiLoanAccounts;
    }

    /**
     * Sets the value of the paClosedMobiLoanAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setPaClosedMobiLoanAccounts(CountSector value) {
        this.paClosedMobiLoanAccounts = value;
    }

    /**
     * Gets the value of the paClosedMobiLoanAccountsWithDh property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getPaClosedMobiLoanAccountsWithDh() {
        return paClosedMobiLoanAccountsWithDh;
    }

    /**
     * Sets the value of the paClosedMobiLoanAccountsWithDh property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setPaClosedMobiLoanAccountsWithDh(CountSector value) {
        this.paClosedMobiLoanAccountsWithDh = value;
    }

    /**
     * Gets the value of the paOpenAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getPaOpenAccounts() {
        return paOpenAccounts;
    }

    /**
     * Sets the value of the paOpenAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setPaOpenAccounts(CountSector value) {
        this.paOpenAccounts = value;
    }

    /**
     * Gets the value of the paOpenAccountsWithDh property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getPaOpenAccountsWithDh() {
        return paOpenAccountsWithDh;
    }

    /**
     * Sets the value of the paOpenAccountsWithDh property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setPaOpenAccountsWithDh(CountSector value) {
        this.paOpenAccountsWithDh = value;
    }

    /**
     * Gets the value of the paOpenMobiLoanAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getPaOpenMobiLoanAccounts() {
        return paOpenMobiLoanAccounts;
    }

    /**
     * Sets the value of the paOpenMobiLoanAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setPaOpenMobiLoanAccounts(CountSector value) {
        this.paOpenMobiLoanAccounts = value;
    }

    /**
     * Gets the value of the paOpenMobiLoanAccountsWithDh property.
     * 
     * @return
     *     possible object is
     *     {@link CountSector }
     *     
     */
    public CountSector getPaOpenMobiLoanAccountsWithDh() {
        return paOpenMobiLoanAccountsWithDh;
    }

    /**
     * Sets the value of the paOpenMobiLoanAccountsWithDh property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountSector }
     *     
     */
    public void setPaOpenMobiLoanAccountsWithDh(CountSector value) {
        this.paOpenMobiLoanAccountsWithDh = value;
    }

}
