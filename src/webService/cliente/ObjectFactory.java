
package webService.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webService.cliente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SetVeiculoResponse_QNAME = new QName("http://webService/", "setVeiculoResponse");
    private final static QName _GetVeiculo_QNAME = new QName("http://webService/", "getVeiculo");
    private final static QName _SetVeiculo_QNAME = new QName("http://webService/", "setVeiculo");
    private final static QName _GetVeiculoResponse_QNAME = new QName("http://webService/", "getVeiculoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webService.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetVeiculoResponse }
     * 
     */
    public SetVeiculoResponse createSetVeiculoResponse() {
        return new SetVeiculoResponse();
    }

    /**
     * Create an instance of {@link GetVeiculo }
     * 
     */
    public GetVeiculo createGetVeiculo() {
        return new GetVeiculo();
    }

    /**
     * Create an instance of {@link GetVeiculoResponse }
     * 
     */
    public GetVeiculoResponse createGetVeiculoResponse() {
        return new GetVeiculoResponse();
    }

    /**
     * Create an instance of {@link SetVeiculo }
     * 
     */
    public SetVeiculo createSetVeiculo() {
        return new SetVeiculo();
    }

    /**
     * Create an instance of {@link Veiculo }
     * 
     */
    public Veiculo createVeiculo() {
        return new Veiculo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetVeiculoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "setVeiculoResponse")
    public JAXBElement<SetVeiculoResponse> createSetVeiculoResponse(SetVeiculoResponse value) {
        return new JAXBElement<SetVeiculoResponse>(_SetVeiculoResponse_QNAME, SetVeiculoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVeiculo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getVeiculo")
    public JAXBElement<GetVeiculo> createGetVeiculo(GetVeiculo value) {
        return new JAXBElement<GetVeiculo>(_GetVeiculo_QNAME, GetVeiculo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetVeiculo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "setVeiculo")
    public JAXBElement<SetVeiculo> createSetVeiculo(SetVeiculo value) {
        return new JAXBElement<SetVeiculo>(_SetVeiculo_QNAME, SetVeiculo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVeiculoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getVeiculoResponse")
    public JAXBElement<GetVeiculoResponse> createGetVeiculoResponse(GetVeiculoResponse value) {
        return new JAXBElement<GetVeiculoResponse>(_GetVeiculoResponse_QNAME, GetVeiculoResponse.class, null, value);
    }

}
