package Models;

import java.util.Random;

public class Utils {

	private static String[] placas = {
		"ZKP",
		"PQK",
		"PPQ",
		"PKA",
		"ADE",
		"ART",
		"EEE"
	};
	
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
	
	public static String getRandomPlaca(){
		return placas[Utils.getRandomNumber(6, 6)] 
		              + Utils.getRandomNumber(9, 9) 
		              + Utils.getRandomNumber(9, 9) 
		              + Utils.getRandomNumber(9, 9);
	}
}
