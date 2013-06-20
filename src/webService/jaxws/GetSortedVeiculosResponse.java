
package webService.jaxws;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getSortedVeiculosResponse", namespace = "http://webService/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSortedVeiculosResponse", namespace = "http://webService/")
public class GetSortedVeiculosResponse {

    @XmlElement(name = "return", namespace = "")
    private ArrayList<Models.Veiculo> _return;

    /**
     * 
     * @return
     *     returns ArrayList<Veiculo>
     */
    public ArrayList<Models.Veiculo> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(ArrayList<Models.Veiculo> _return) {
        this._return = _return;
    }

}
