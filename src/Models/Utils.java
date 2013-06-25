package Models;

import java.util.Random;

public class Utils {

	public	static int getRandomNumber(int faixa, int randomLengh){
		Random generator = new Random();
		int i = faixa - generator.nextInt(randomLengh);
		
		return i;
	}
	
	public static webService.cliente.TransitoWeb getTransitoWeb(){
		System.out.println("instanciando transitoWeb");
		return new webService.cliente.TransitoWebService().getTransitoWebPort();
	}

	public static webService.cliente.VeiculoWeb getVeiculoWeb() {
		return new webService.cliente.VeiculoWebService().getVeiculoWebPort();
	}
}
