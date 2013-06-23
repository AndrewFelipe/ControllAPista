package Models;

import java.util.Random;

import webService.client.TransitoWeb;
import webService.client.TransitoWebService;
import webService.client.VeiculoWeb;

public class Utils {

	public	static int getRandomNumber(int faixa, int randomLengh){
		Random generator = new Random();
		int i = faixa - generator.nextInt(randomLengh);
		
		return i;
	}
	
	public static webService.client.TransitoWeb getTransitoWeb(){
		return new webService.client.TransitoWebService().getTransitoWebPort();
	}

	public static webService.client.VeiculoWeb getVeiculoWeb() {
		return new webService.client.VeiculoWebService().getVeiculoWebPort();
	}
}
