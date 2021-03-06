
package ch.ech.xmlns.ech_0011._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for maritalDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="maritalDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maritalStatus" type="{http://www.ech.ch/xmlns/eCH-0011/3}maritalStatusType"/&gt;
 *         &lt;element name="dateOfMaritalStatus" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="separation" type="{http://www.ech.ch/xmlns/eCH-0011/3}separationType" minOccurs="0"/&gt;
 *         &lt;element name="dateOfSeparation" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="cancelationReason" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="2"/&gt;
 *               &lt;enumeration value="3"/&gt;
 *               &lt;enumeration value="4"/&gt;
 *               &lt;enumeration value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "maritalDataType", propOrder = {
    "maritalStatus",
    "dateOfMaritalStatus",
    "separation",
    "dateOfSeparation",
    "cancelationReason"
})
public class MaritalDataType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MaritalStatusType maritalStatus;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfMaritalStatus;
    @XmlSchemaType(name = "string")
    protected SeparationType separation;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfSeparation;
    protected MaritalDataType.CancellationReason cancelationReason;

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MaritalStatusType }
     *     
     */
    public MaritalStatusType getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaritalStatusType }
     *     
     */
    public void setMaritalStatus(MaritalStatusType value) {
        this.maritalStatus = value;
    }

    public boolean isSetMaritalStatus() {
        return (this.maritalStatus!= null);
    }

    /**
     * Gets the value of the dateOfMaritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfMaritalStatus() {
        return dateOfMaritalStatus;
    }

    /**
     * Sets the value of the dateOfMaritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfMaritalStatus(XMLGregorianCalendar value) {
        this.dateOfMaritalStatus = value;
    }

    public boolean isSetDateOfMaritalStatus() {
        return (this.dateOfMaritalStatus!= null);
    }

    /**
     * Gets the value of the separation property.
     * 
     * @return
     *     possible object is
     *     {@link SeparationType }
     *     
     */
    public SeparationType getSeparation() {
        return separation;
    }

    /**
     * Sets the value of the separation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeparationType }
     *     
     */
    public void setSeparation(SeparationType value) {
        this.separation = value;
    }

    public boolean isSetSeparation() {
        return (this.separation!= null);
    }

    /**
     * Gets the value of the dateOfSeparation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfSeparation() {
        return dateOfSeparation;
    }

    /**
     * Sets the value of the dateOfSeparation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfSeparation(XMLGregorianCalendar value) {
        this.dateOfSeparation = value;
    }

    public boolean isSetDateOfSeparation() {
        return (this.dateOfSeparation!= null);
    }

    /**
     * Gets the value of the cancelationReason property.
     * 
     * @return
     *     possible object is
     *     {@link MaritalDataType.CancellationReason }
     *     
     */
    public MaritalDataType.CancellationReason getCancelationReason() {
        return cancelationReason;
    }

    /**
     * Sets the value of the cancelationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaritalDataType.CancellationReason }
     *     
     */
    public void setCancelationReason(MaritalDataType.CancellationReason value) {
        this.cancelationReason = value;
    }

    public boolean isSetCancelationReason() {
        return (this.cancelationReason!= null);
    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="1"/&gt;
     *     &lt;enumeration value="2"/&gt;
     *     &lt;enumeration value="3"/&gt;
     *     &lt;enumeration value="4"/&gt;
     *     &lt;enumeration value="9"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum CancellationReason {

        @XmlEnumValue("1")
        E1_dissous_judiciairement("1"),
        @XmlEnumValue("2")
        E2_annulation("2"),
        @XmlEnumValue("3")
        E3_disparition("3"),
        @XmlEnumValue("4")
        E4_deces("4"),
        @XmlEnumValue("9")
        E9_inconnu_autre("9");
        private final String value;

        CancellationReason(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static MaritalDataType.CancellationReason fromValue(String v) {
            for (MaritalDataType.CancellationReason c: MaritalDataType.CancellationReason.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
