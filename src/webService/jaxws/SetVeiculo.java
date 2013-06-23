
package webService.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "setVeiculo", namespace = "http://webService/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setVeiculo", namespace = "http://webService/")
public class SetVeiculo {

    @XmlElement(name = "arg0", namespace = "")
    private Models.Veiculo arg0;

    /**
     * 
     * @return
     *     returns Veiculo
     */
    public Models.Veiculo getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(Models.Veiculo arg0) {
        this.arg0 = arg0;
    }

}
