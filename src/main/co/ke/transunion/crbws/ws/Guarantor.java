
package co.ke.transunion.crbws.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for guarantor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="guarantor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="crn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disputed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guarantorLimit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="guarantorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanPrincipal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="loanStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guarantor", propOrder = {
    "crn",
    "currency",
    "disputed",
    "guarantorLimit",
    "guarantorType",
    "loanPrincipal",
    "loanStatus"
})
public class Guarantor {

    protected Integer crn;
    protected String currency;
    protected String disputed;
    protected Double guarantorLimit;
    protected String guarantorType;
    protected Double loanPrincipal;
    protected String loanStatus;

    /**
     * Gets the value of the crn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCrn() {
        return crn;
    }

    /**
     * Sets the value of the crn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCrn(Integer value) {
        this.crn = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the disputed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisputed() {
        return disputed;
    }

    /**
     * Sets the value of the disputed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputed(String value) {
        this.disputed = value;
    }

    /**
     * Gets the value of the guarantorLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGuarantorLimit() {
        return guarantorLimit;
    }

    /**
     * Sets the value of the guarantorLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGuarantorLimit(Double value) {
        this.guarantorLimit = value;
    }

    /**
     * Gets the value of the guarantorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuarantorType() {
        return guarantorType;
    }

    /**
     * Sets the value of the guarantorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuarantorType(String value) {
        this.guarantorType = value;
    }

    /**
     * Gets the value of the loanPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLoanPrincipal() {
        return loanPrincipal;
    }

    /**
     * Sets the value of the loanPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLoanPrincipal(Double value) {
        this.loanPrincipal = value;
    }

    /**
     * Gets the value of the loanStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanStatus() {
        return loanStatus;
    }

    /**
     * Sets the value of the loanStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanStatus(String value) {
        this.loanStatus = value;
    }

}
