
package co.ke.transunion.crbws.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for product131 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="product131">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountList" type="{http://ws.crbws.transunion.ke.co/}account131" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="header" type="{http://ws.crbws.transunion.ke.co/}header131" minOccurs="0"/>
 *         &lt;element name="personalProfile" type="{http://ws.crbws.transunion.ke.co/}personalProfile131" minOccurs="0"/>
 *         &lt;element name="phoneList" type="{http://ws.crbws.transunion.ke.co/}phone" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="scoreOutput" type="{http://ws.crbws.transunion.ke.co/}scoreOutput131" minOccurs="0"/>
 *         &lt;element name="summary" type="{http://ws.crbws.transunion.ke.co/}summary131" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product131", propOrder = {
    "accountList",
    "header",
    "personalProfile",
    "phoneList",
    "responseCode",
    "scoreOutput",
    "summary"
})
public class Product131 {

    @XmlElement(nillable = true)
    protected List<Account131> accountList;
    protected Header131 header;
    protected PersonalProfile131 personalProfile;
    @XmlElement(nillable = true)
    protected List<Phone> phoneList;
    protected Integer responseCode;
    protected ScoreOutput131 scoreOutput;
    protected Summary131 summary;

    /**
     * Gets the value of the accountList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Account131 }
     * 
     * 
     */
    public List<Account131> getAccountList() {
        if (accountList == null) {
            accountList = new ArrayList<Account131>();
        }
        return this.accountList;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Header131 }
     *     
     */
    public Header131 getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header131 }
     *     
     */
    public void setHeader(Header131 value) {
        this.header = value;
    }

    /**
     * Gets the value of the personalProfile property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalProfile131 }
     *     
     */
    public PersonalProfile131 getPersonalProfile() {
        return personalProfile;
    }

    /**
     * Sets the value of the personalProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalProfile131 }
     *     
     */
    public void setPersonalProfile(PersonalProfile131 value) {
        this.personalProfile = value;
    }

    /**
     * Gets the value of the phoneList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Phone }
     * 
     * 
     */
    public List<Phone> getPhoneList() {
        if (phoneList == null) {
            phoneList = new ArrayList<Phone>();
        }
        return this.phoneList;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResponseCode(Integer value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the scoreOutput property.
     * 
     * @return
     *     possible object is
     *     {@link ScoreOutput131 }
     *     
     */
    public ScoreOutput131 getScoreOutput() {
        return scoreOutput;
    }

    /**
     * Sets the value of the scoreOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoreOutput131 }
     *     
     */
    public void setScoreOutput(ScoreOutput131 value) {
        this.scoreOutput = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link Summary131 }
     *     
     */
    public Summary131 getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Summary131 }
     *     
     */
    public void setSummary(Summary131 value) {
        this.summary = value;
    }

}
