
package webService.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "connectVia", namespace = "http://webService/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connectVia", namespace = "http://webService/")
public class ConnectVia {

    @XmlElement(name = "arg0", namespace = "")
    private Models.Via arg0;

    /**
     * 
     * @return
     *     returns Via
     */
    public Models.Via getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(Models.Via arg0) {
        this.arg0 = arg0;
    }

}
