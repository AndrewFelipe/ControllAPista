
package webService.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for semaforo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="semaforo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "semaforo", propOrder = {
    "rua"
})
public class Semaforo {

    protected String rua;

    /**
     * Gets the value of the rua property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRua() {
        return rua;
    }

    /**
     * Sets the value of the rua property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRua(String value) {
        this.rua = value;
    }

}
