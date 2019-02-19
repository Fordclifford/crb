
package co.ke.transunion.crbws.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getProduct163 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getProduct163">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="infinityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyRegNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="director1Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="director1NationalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="director2Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="director2NationalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="director3Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="director3NationalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="director4Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="director4NationalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="director5Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="director5NationalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reportReason" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProduct163", propOrder = {
    "username",
    "password",
    "code",
    "infinityCode",
    "companyName",
    "companyRegNo",
    "director1Name",
    "director1NationalId",
    "director2Name",
    "director2NationalId",
    "director3Name",
    "director3NationalId",
    "director4Name",
    "director4NationalId",
    "director5Name",
    "director5NationalId",
    "reportReason"
})
public class GetProduct163 {

    protected String username;
    protected String password;
    protected String code;
    protected String infinityCode;
    protected String companyName;
    protected String companyRegNo;
    protected String director1Name;
    protected String director1NationalId;
    protected String director2Name;
    protected String director2NationalId;
    protected String director3Name;
    protected String director3NationalId;
    protected String director4Name;
    protected String director4NationalId;
    protected String director5Name;
    protected String director5NationalId;
    protected int reportReason;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the infinityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfinityCode() {
        return infinityCode;
    }

    /**
     * Sets the value of the infinityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfinityCode(String value) {
        this.infinityCode = value;
    }

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
     * Gets the value of the companyRegNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyRegNo() {
        return companyRegNo;
    }

    /**
     * Sets the value of the companyRegNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyRegNo(String value) {
        this.companyRegNo = value;
    }

    /**
     * Gets the value of the director1Name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirector1Name() {
        return director1Name;
    }

    /**
     * Sets the value of the director1Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirector1Name(String value) {
        this.director1Name = value;
    }

    /**
     * Gets the value of the director1NationalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirector1NationalId() {
        return director1NationalId;
    }

    /**
     * Sets the value of the director1NationalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirector1NationalId(String value) {
        this.director1NationalId = value;
    }

    /**
     * Gets the value of the director2Name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirector2Name() {
        return director2Name;
    }

    /**
     * Sets the value of the director2Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirector2Name(String value) {
        this.director2Name = value;
    }

    /**
     * Gets the value of the director2NationalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirector2NationalId() {
        return director2NationalId;
    }

    /**
     * Sets the value of the director2NationalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirector2NationalId(String value) {
        this.director2NationalId = value;
    }

    /**
     * Gets the value of the director3Name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirector3Name() {
        return director3Name;
    }

    /**
     * Sets the value of the director3Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirector3Name(String value) {
        this.director3Name = value;
    }

    /**
     * Gets the value of the director3NationalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirector3NationalId() {
        return director3NationalId;
    }

    /**
     * Sets the value of the director3NationalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirector3NationalId(String value) {
        this.director3NationalId = value;
    }

    /**
     * Gets the value of the director4Name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirector4Name() {
        return director4Name;
    }

    /**
     * Sets the value of the director4Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirector4Name(String value) {
        this.director4Name = value;
    }

    /**
     * Gets the value of the director4NationalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirector4NationalId() {
        return director4NationalId;
    }

    /**
     * Sets the value of the director4NationalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirector4NationalId(String value) {
        this.director4NationalId = value;
    }

    /**
     * Gets the value of the director5Name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirector5Name() {
        return director5Name;
    }

    /**
     * Sets the value of the director5Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirector5Name(String value) {
        this.director5Name = value;
    }

    /**
     * Gets the value of the director5NationalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirector5NationalId() {
        return director5NationalId;
    }

    /**
     * Sets the value of the director5NationalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirector5NationalId(String value) {
        this.director5NationalId = value;
    }

    /**
     * Gets the value of the reportReason property.
     * 
     */
    public int getReportReason() {
        return reportReason;
    }

    /**
     * Sets the value of the reportReason property.
     * 
     */
    public void setReportReason(int value) {
        this.reportReason = value;
    }

}
