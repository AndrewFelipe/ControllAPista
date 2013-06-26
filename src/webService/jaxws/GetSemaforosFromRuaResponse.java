
package webService.jaxws;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getSemaforosFromRuaResponse", namespace = "http://webService/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSemaforosFromRuaResponse", namespace = "http://webService/")
public class GetSemaforosFromRuaResponse {

    @XmlElement(name = "return", namespace = "")
    private Collection<Models.Semaforo> _return;

    /**
     * 
     * @return
     *     returns Collection<Semaforo>
     */
    public Collection<Models.Semaforo> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(Collection<Models.Semaforo> _return) {
        this._return = _return;
    }

}
