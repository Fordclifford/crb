
package co.ke.transunion.crbws.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for summary126 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="summary126">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creditHistory" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="npaAccounts" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="npaClosedAccounts" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="npaOpenAccounts" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="paAccounts" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="paAccountsWithDh" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="paClosedAccounts" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="paClosedAccountsWithDh" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="paOpenAccounts" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *         &lt;element name="paOpenAccountsWithDh" type="{http://ws.crbws.transunion.ke.co/}countSector" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "summary126", propOrder = {
    "creditHistory",
    "npaAccounts",
    "npaClosedAccounts",
    "npaOpenAccounts",
    "paAccounts",
    "paAccountsWithDh",
    "paClosedAccounts",
    "paClosedAccountsWithDh",
    "paOpenAccounts",
    "paOpenAccountsWithDh"
})
public class Summary126 {

    protected CountSector creditHistory;
    protected CountSector npaAccounts;
    protected CountSector npaClosedAccounts;
    protected CountSector npaOpenAccounts;
    protected CountSector paAccounts;
    protected CountSector paAccountsWithDh;
    protected CountSector paClosedAccounts;
    protected CountSector paClosedAccountsWithDh;
    protected CountSector paOpenAccounts;
    protected CountSector paOpenAccountsWithDh;

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

}
