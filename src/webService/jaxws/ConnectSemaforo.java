
package webService.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "connectSemaforo", namespace = "http://webService/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connectSemaforo", namespace = "http://webService/")
public class ConnectSemaforo {

    @XmlElement(name = "arg0", namespace = "")
    private Models.Semaforo arg0;

    /**
     * 
     * @return
     *     returns Semaforo
     */
    public Models.Semaforo getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(Models.Semaforo arg0) {
        this.arg0 = arg0;
    }

}
