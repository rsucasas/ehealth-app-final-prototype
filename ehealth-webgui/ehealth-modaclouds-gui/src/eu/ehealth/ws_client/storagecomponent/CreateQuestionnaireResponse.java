
package eu.ehealth.ws_client.storagecomponent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.ehealth.ws_client.xsd.OperationResult;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="out" type="{http://aladdin-project.eu/xsd}OperationResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "out"
})
@XmlRootElement(name = "CreateQuestionnaireResponse")
public class CreateQuestionnaireResponse {

    @XmlElement(required = true)
    protected OperationResult out;

    /**
     * Obtiene el valor de la propiedad out.
     * 
     * @return
     *     possible object is
     *     {@link OperationResult }
     *     
     */
    public OperationResult getOut() {
        return out;
    }

    /**
     * Define el valor de la propiedad out.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationResult }
     *     
     */
    public void setOut(OperationResult value) {
        this.out = value;
    }

}
