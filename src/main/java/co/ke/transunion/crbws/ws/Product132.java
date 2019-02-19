
package co.ke.transunion.crbws.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for product132 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="product132">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountList" type="{http://ws.crbws.transunion.ke.co/}account132" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="genericScoreOutput" type="{http://ws.crbws.transunion.ke.co/}scoreOutput132" minOccurs="0"/>
 *         &lt;element name="header" type="{http://ws.crbws.transunion.ke.co/}header132" minOccurs="0"/>
 *         &lt;element name="mobileScoreOutput" type="{http://ws.crbws.transunion.ke.co/}mobileScoreOutput132" minOccurs="0"/>
 *         &lt;element name="personalProfile" type="{http://ws.crbws.transunion.ke.co/}personalProfile132" minOccurs="0"/>
 *         &lt;element name="phoneList" type="{http://ws.crbws.transunion.ke.co/}phone" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="summary" type="{http://ws.crbws.transunion.ke.co/}summary132" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product132", propOrder = {
    "accountList",
    "genericScoreOutput",
    "header",
    "mobileScoreOutput",
    "personalProfile",
    "phoneList",
    "responseCode",
    "summary"
})
public class Product132 {

    @XmlElement(nillable = true)
    protected List<Account132> accountList;
    protected ScoreOutput132 genericScoreOutput;
    protected Header132 header;
    protected MobileScoreOutput132 mobileScoreOutput;
    protected PersonalProfile132 personalProfile;
    @XmlElement(nillable = true)
    protected List<Phone> phoneList;
    protected Integer responseCode;
    protected Summary132 summary;

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
     * {@link Account132 }
     * 
     * 
     */
    public List<Account132> getAccountList() {
        if (accountList == null) {
            accountList = new ArrayList<Account132>();
        }
        return this.accountList;
    }

    /**
     * Gets the value of the genericScoreOutput property.
     * 
     * @return
     *     possible object is
     *     {@link ScoreOutput132 }
     *     
     */
    public ScoreOutput132 getGenericScoreOutput() {
        return genericScoreOutput;
    }

    /**
     * Sets the value of the genericScoreOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoreOutput132 }
     *     
     */
    public void setGenericScoreOutput(ScoreOutput132 value) {
        this.genericScoreOutput = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Header132 }
     *     
     */
    public Header132 getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header132 }
     *     
     */
    public void setHeader(Header132 value) {
        this.header = value;
    }

    /**
     * Gets the value of the mobileScoreOutput property.
     * 
     * @return
     *     possible object is
     *     {@link MobileScoreOutput132 }
     *     
     */
    public MobileScoreOutput132 getMobileScoreOutput() {
        return mobileScoreOutput;
    }

    /**
     * Sets the value of the mobileScoreOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileScoreOutput132 }
     *     
     */
    public void setMobileScoreOutput(MobileScoreOutput132 value) {
        this.mobileScoreOutput = value;
    }

    /**
     * Gets the value of the personalProfile property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalProfile132 }
     *     
     */
    public PersonalProfile132 getPersonalProfile() {
        return personalProfile;
    }

    /**
     * Sets the value of the personalProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalProfile132 }
     *     
     */
    public void setPersonalProfile(PersonalProfile132 value) {
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
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link Summary132 }
     *     
     */
    public Summary132 getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Summary132 }
     *     
     */
    public void setSummary(Summary132 value) {
        this.summary = value;
    }

}
