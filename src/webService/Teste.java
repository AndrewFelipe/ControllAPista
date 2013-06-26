package webService;

import java.util.Collection;
import webService.cliente.Via;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		webService.cliente.TransitoWeb transito = new webService.cliente.TransitoWebService().getTransitoWebPort();
		Collection<Via> vias  = transito.getVias();
		
		for(Via via: vias){  
			System.out.println(via.getRua());
		}  
	}

}
