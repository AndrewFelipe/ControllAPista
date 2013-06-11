package webService;

import javax.jws.WebMethod;
import javax.jws.WebService;

import Models.Veiculo;

@WebService
public class VeiculoWeb {

	@WebMethod
	public Veiculo getVeiculo(String placa, Veiculo carro){
		System.out.println(carro.getPlaca());
		
		carro.setMarca("peugeot");
		carro.setModelo("308 nave");
		carro.setPlaca(placa);
		
		return carro;
	}
}
