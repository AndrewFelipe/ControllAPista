
package webService.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getVeiculoResponse", namespace = "http://webService/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVeiculoResponse", namespace = "http://webService/")
public class GetVeiculoResponse {

    @XmlElement(name = "return", namespace = "")
    private Models.Veiculo _return;

    /**
     * 
     * @return
     *     returns Veiculo
     */
    public Models.Veiculo getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(Models.Veiculo _return) {
        this._return = _return;
    }

}
