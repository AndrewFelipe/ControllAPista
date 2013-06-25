
package webService.jaxws;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getViasResponse", namespace = "http://webService/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getViasResponse", namespace = "http://webService/")
public class GetViasResponse {

    @XmlElement(name = "return", namespace = "")
    private Collection<Models.Via> _return;

    /**
     * 
     * @return
     *     returns Collection<Via>
     */
    public Collection<Models.Via> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(Collection<Models.Via> _return) {
        this._return = _return;
    }

}
