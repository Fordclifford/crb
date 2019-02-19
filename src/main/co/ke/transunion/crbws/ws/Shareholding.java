
package co.ke.transunion.crbws.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shareholding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shareholding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberOfShares" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shareHolderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sharePercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shareValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shareholding", propOrder = {
    "companyName",
    "crn",
    "numberOfShares",
    "shareHolderType",
    "sharePercentage",
    "shareValue"
})
public class Shareholding {

    protected String companyName;
    protected Integer crn;
    protected String numberOfShares;
    protected String shareHolderType;
    protected String sharePercentage;
    protected Double shareValue;

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

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
     * Gets the value of the numberOfShares property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfShares() {
        return numberOfShares;
    }

    /**
     * Sets the value of the numberOfShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfShares(String value) {
        this.numberOfShares = value;
    }

    /**
     * Gets the value of the shareHolderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareHolderType() {
        return shareHolderType;
    }

    /**
     * Sets the value of the shareHolderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareHolderType(String value) {
        this.shareHolderType = value;
    }

    /**
     * Gets the value of the sharePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharePercentage() {
        return sharePercentage;
    }

    /**
     * Sets the value of the sharePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharePercentage(String value) {
        this.sharePercentage = value;
    }

    /**
     * Gets the value of the shareValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShareValue() {
        return shareValue;
    }

    /**
     * Sets the value of the shareValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShareValue(Double value) {
        this.shareValue = value;
    }

}
