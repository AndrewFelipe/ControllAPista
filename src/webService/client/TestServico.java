package webService.client;

public class TestServico {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Veiculo car = new Veiculo();
		
		webService.client.VeiculoWeb port = new VeiculoWebService().getVeiculoWebPort();
		
		car.setPlaca("TESTANDO");
		car = port.getVeiculo("MKP-8860", car);
		System.out.println(car.getModelo());
	}

}
