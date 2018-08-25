
package ch.ech.xmlns.ech_0011._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour nationalityStatusType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="nationalityStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="0"/&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "nationalityStatusType")
@XmlEnum
public enum NationalityStatusType {

    @XmlEnumValue("0")
    VALUE_1("0"),
    @XmlEnumValue("1")
    VALUE_2("1"),
    @XmlEnumValue("2")
    VALUE_3("2");
    private final String value;

    NationalityStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NationalityStatusType fromValue(String v) {
        for (NationalityStatusType c: NationalityStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
