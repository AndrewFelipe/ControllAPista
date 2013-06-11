package webService;

import javax.xml.ws.Endpoint;

public class PublicService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VeiculoWeb service = new VeiculoWeb();
		Endpoint endpoint = Endpoint.publish("http://localhost:8080/veiculo", service);
		
		//HelloWeb service = new HelloWeb();
		//Endpoint endpoint = Endpoint.publish("http://localhost:8080/hello", service);

	}

}
