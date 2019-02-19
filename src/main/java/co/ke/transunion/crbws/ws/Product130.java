
package co.ke.transunion.crbws.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for product130 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="product130">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountList" type="{http://ws.crbws.transunion.ke.co/}account130" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="alsoKnownAsList" type="{http://ws.crbws.transunion.ke.co/}alsoKnownAsConsumer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="disputeStatementList" type="{http://ws.crbws.transunion.ke.co/}disputeStatement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="emailList" type="{http://ws.crbws.transunion.ke.co/}email" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="employmentList" type="{http://ws.crbws.transunion.ke.co/}employment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="header" type="{http://ws.crbws.transunion.ke.co/}header" minOccurs="0"/>
 *         &lt;element name="personalProfile" type="{http://ws.crbws.transunion.ke.co/}personalProfile" minOccurs="0"/>
 *         &lt;element name="phoneList" type="{http://ws.crbws.transunion.ke.co/}phone" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="physicalAddressList" type="{http://ws.crbws.transunion.ke.co/}physicalAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="postalAddressList" type="{http://ws.crbws.transunion.ke.co/}postalAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="scoreOutput" type="{http://ws.crbws.transunion.ke.co/}scoreOutput130" minOccurs="0"/>
 *         &lt;element name="summary" type="{http://ws.crbws.transunion.ke.co/}summary130" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product130", propOrder = {
    "accountList",
    "alsoKnownAsList",
    "disputeStatementList",
    "emailList",
    "employmentList",
    "header",
    "personalProfile",
    "phoneList",
    "physicalAddressList",
    "postalAddressList",
    "responseCode",
    "scoreOutput",
    "summary"
})
public class Product130 {

    @XmlElement(nillable = true)
    protected List<Account130> accountList;
    @XmlElement(nillable = true)
    protected List<AlsoKnownAsConsumer> alsoKnownAsList;
    @XmlElement(nillable = true)
    protected List<DisputeStatement> disputeStatementList;
    @XmlElement(nillable = true)
    protected List<Email> emailList;
    @XmlElement(nillable = true)
    protected List<Employment> employmentList;
    protected Header header;
    protected PersonalProfile personalProfile;
    @XmlElement(nillable = true)
    protected List<Phone> phoneList;
    @XmlElement(nillable = true)
    protected List<PhysicalAddress> physicalAddressList;
    @XmlElement(nillable = true)
    protected List<PostalAddress> postalAddressList;
    protected Integer responseCode;
    protected ScoreOutput130 scoreOutput;
    protected Summary130 summary;

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
     * {@link Account130 }
     * 
     * 
     */
    public List<Account130> getAccountList() {
        if (accountList == null) {
            accountList = new ArrayList<Account130>();
        }
        return this.accountList;
    }

    /**
     * Gets the value of the alsoKnownAsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alsoKnownAsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlsoKnownAsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlsoKnownAsConsumer }
     * 
     * 
     */
    public List<AlsoKnownAsConsumer> getAlsoKnownAsList() {
        if (alsoKnownAsList == null) {
            alsoKnownAsList = new ArrayList<AlsoKnownAsConsumer>();
        }
        return this.alsoKnownAsList;
    }

    /**
     * Gets the value of the disputeStatementList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disputeStatementList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisputeStatementList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisputeStatement }
     * 
     * 
     */
    public List<DisputeStatement> getDisputeStatementList() {
        if (disputeStatementList == null) {
            disputeStatementList = new ArrayList<DisputeStatement>();
        }
        return this.disputeStatementList;
    }

    /**
     * Gets the value of the emailList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Email }
     * 
     * 
     */
    public List<Email> getEmailList() {
        if (emailList == null) {
            emailList = new ArrayList<Email>();
        }
        return this.emailList;
    }

    /**
     * Gets the value of the employmentList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employmentList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmploymentList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Employment }
     * 
     * 
     */
    public List<Employment> getEmploymentList() {
        if (employmentList == null) {
            employmentList = new ArrayList<Employment>();
        }
        return this.employmentList;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setHeader(Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the personalProfile property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalProfile }
     *     
     */
    public PersonalProfile getPersonalProfile() {
        return personalProfile;
    }

    /**
     * Sets the value of the personalProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalProfile }
     *     
     */
    public void setPersonalProfile(PersonalProfile value) {
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
     * Gets the value of the physicalAddressList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAddressList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAddressList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalAddress }
     * 
     * 
     */
    public List<PhysicalAddress> getPhysicalAddressList() {
        if (physicalAddressList == null) {
            physicalAddressList = new ArrayList<PhysicalAddress>();
        }
        return this.physicalAddressList;
    }

    /**
     * Gets the value of the postalAddressList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postalAddressList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostalAddressList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostalAddress }
     * 
     * 
     */
    public List<PostalAddress> getPostalAddressList() {
        if (postalAddressList == null) {
            postalAddressList = new ArrayList<PostalAddress>();
        }
        return this.postalAddressList;
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
     *     {@link ScoreOutput130 }
     *     
     */
    public ScoreOutput130 getScoreOutput() {
        return scoreOutput;
    }

    /**
     * Sets the value of the scoreOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoreOutput130 }
     *     
     */
    public void setScoreOutput(ScoreOutput130 value) {
        this.scoreOutput = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link Summary130 }
     *     
     */
    public Summary130 getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Summary130 }
     *     
     */
    public void setSummary(Summary130 value) {
        this.summary = value;
    }

}
