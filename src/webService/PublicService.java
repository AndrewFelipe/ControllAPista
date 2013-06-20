package webService;

import javax.xml.ws.Endpoint;


public class PublicService {

	public static void main(String[] args) {
		
		TransitoWeb serviceTransito = new TransitoWeb();
		Endpoint endpoint = Endpoint.publish("http://localhost:8080/transito", serviceTransito);
		
		VeiculoWeb serviceVeiculo = new VeiculoWeb();
		Endpoint endpointVeiculo = Endpoint.publish("http://localhost:8080/veiculo", serviceVeiculo);
		
		//HelloWeb service = new HelloWeb();
		//Endpoint endpoint = Endpoint.publish("http://localhost:8080/hello", service);

	}

}
