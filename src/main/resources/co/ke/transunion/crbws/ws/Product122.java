
package co.ke.transunion.crbws.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for product122 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="product122">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountList" type="{http://ws.crbws.transunion.ke.co/}account122" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="header" type="{http://ws.crbws.transunion.ke.co/}header122" minOccurs="0"/>
 *         &lt;element name="personalProfile" type="{http://ws.crbws.transunion.ke.co/}personalProfile122" minOccurs="0"/>
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="scoreOutput" type="{http://ws.crbws.transunion.ke.co/}scoreOutput122" minOccurs="0"/>
 *         &lt;element name="summary" type="{http://ws.crbws.transunion.ke.co/}summary122" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product122", propOrder = {
    "accountList",
    "header",
    "personalProfile",
    "responseCode",
    "scoreOutput",
    "summary"
})
public class Product122 {

    @XmlElement(nillable = true)
    protected List<Account122> accountList;
    protected Header122 header;
    protected PersonalProfile122 personalProfile;
    protected Integer responseCode;
    protected ScoreOutput122 scoreOutput;
    protected Summary122 summary;

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
     * {@link Account122 }
     * 
     * 
     */
    public List<Account122> getAccountList() {
        if (accountList == null) {
            accountList = new ArrayList<Account122>();
        }
        return this.accountList;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Header122 }
     *     
     */
    public Header122 getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header122 }
     *     
     */
    public void setHeader(Header122 value) {
        this.header = value;
    }

    /**
     * Gets the value of the personalProfile property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalProfile122 }
     *     
     */
    public PersonalProfile122 getPersonalProfile() {
        return personalProfile;
    }

    /**
     * Sets the value of the personalProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalProfile122 }
     *     
     */
    public void setPersonalProfile(PersonalProfile122 value) {
        this.personalProfile = value;
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
     *     {@link ScoreOutput122 }
     *     
     */
    public ScoreOutput122 getScoreOutput() {
        return scoreOutput;
    }

    /**
     * Sets the value of the scoreOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoreOutput122 }
     *     
     */
    public void setScoreOutput(ScoreOutput122 value) {
        this.scoreOutput = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link Summary122 }
     *     
     */
    public Summary122 getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Summary122 }
     *     
     */
    public void setSummary(Summary122 value) {
        this.summary = value;
    }

}
