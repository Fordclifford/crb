
package co.ke.transunion.crbws.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for countSectorDouble complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="countSectorDouble">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mySector" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="otherSectors" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "countSectorDouble", propOrder = {
    "mySector",
    "otherSectors"
})
public class CountSectorDouble {

    protected Double mySector;
    protected Double otherSectors;

    /**
     * Gets the value of the mySector property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMySector() {
        return mySector;
    }

    /**
     * Sets the value of the mySector property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMySector(Double value) {
        this.mySector = value;
    }

    /**
     * Gets the value of the otherSectors property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOtherSectors() {
        return otherSectors;
    }

    /**
     * Sets the value of the otherSectors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOtherSectors(Double value) {
        this.otherSectors = value;
    }

}
