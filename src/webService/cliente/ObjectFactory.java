
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

    private final static QName _CanOpen_QNAME = new QName("http://webService/", "CanOpen");
    private final static QName _GetViasResponse_QNAME = new QName("http://webService/", "getViasResponse");
    private final static QName _GetVias_QNAME = new QName("http://webService/", "getVias");
    private final static QName _ConnectSemaforo_QNAME = new QName("http://webService/", "connectSemaforo");
    private final static QName _ConnectSemaforoResponse_QNAME = new QName("http://webService/", "connectSemaforoResponse");
    private final static QName _ConnectViaResponse_QNAME = new QName("http://webService/", "connectViaResponse");
    private final static QName _CanOpenResponse_QNAME = new QName("http://webService/", "CanOpenResponse");
    private final static QName _ConnectVia_QNAME = new QName("http://webService/", "connectVia");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webService.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConnectVia }
     * 
     */
    public ConnectVia createConnectVia() {
        return new ConnectVia();
    }

    /**
     * Create an instance of {@link ConnectSemaforoResponse }
     * 
     */
    public ConnectSemaforoResponse createConnectSemaforoResponse() {
        return new ConnectSemaforoResponse();
    }

    /**
     * Create an instance of {@link GetVias }
     * 
     */
    public GetVias createGetVias() {
        return new GetVias();
    }

    /**
     * Create an instance of {@link CanOpenResponse }
     * 
     */
    public CanOpenResponse createCanOpenResponse() {
        return new CanOpenResponse();
    }

    /**
     * Create an instance of {@link ConnectSemaforo }
     * 
     */
    public ConnectSemaforo createConnectSemaforo() {
        return new ConnectSemaforo();
    }

    /**
     * Create an instance of {@link GetViasResponse }
     * 
     */
    public GetViasResponse createGetViasResponse() {
        return new GetViasResponse();
    }

    /**
     * Create an instance of {@link ConnectViaResponse }
     * 
     */
    public ConnectViaResponse createConnectViaResponse() {
        return new ConnectViaResponse();
    }

    /**
     * Create an instance of {@link CanOpen }
     * 
     */
    public CanOpen createCanOpen() {
        return new CanOpen();
    }

    /**
     * Create an instance of {@link Via }
     * 
     */
    public Via createVia() {
        return new Via();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanOpen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "CanOpen")
    public JAXBElement<CanOpen> createCanOpen(CanOpen value) {
        return new JAXBElement<CanOpen>(_CanOpen_QNAME, CanOpen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetViasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getViasResponse")
    public JAXBElement<GetViasResponse> createGetViasResponse(GetViasResponse value) {
        return new JAXBElement<GetViasResponse>(_GetViasResponse_QNAME, GetViasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVias }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getVias")
    public JAXBElement<GetVias> createGetVias(GetVias value) {
        return new JAXBElement<GetVias>(_GetVias_QNAME, GetVias.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectSemaforo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "connectSemaforo")
    public JAXBElement<ConnectSemaforo> createConnectSemaforo(ConnectSemaforo value) {
        return new JAXBElement<ConnectSemaforo>(_ConnectSemaforo_QNAME, ConnectSemaforo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectSemaforoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "connectSemaforoResponse")
    public JAXBElement<ConnectSemaforoResponse> createConnectSemaforoResponse(ConnectSemaforoResponse value) {
        return new JAXBElement<ConnectSemaforoResponse>(_ConnectSemaforoResponse_QNAME, ConnectSemaforoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectViaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "connectViaResponse")
    public JAXBElement<ConnectViaResponse> createConnectViaResponse(ConnectViaResponse value) {
        return new JAXBElement<ConnectViaResponse>(_ConnectViaResponse_QNAME, ConnectViaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanOpenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "CanOpenResponse")
    public JAXBElement<CanOpenResponse> createCanOpenResponse(CanOpenResponse value) {
        return new JAXBElement<CanOpenResponse>(_CanOpenResponse_QNAME, CanOpenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectVia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "connectVia")
    public JAXBElement<ConnectVia> createConnectVia(ConnectVia value) {
        return new JAXBElement<ConnectVia>(_ConnectVia_QNAME, ConnectVia.class, null, value);
    }

}
