package webService;

import java.util.ArrayList;

import javax.jws.WebService;

import Models.Semaforo;
import Models.Via;

@WebService
public class TransitoWeb {

	protected ArrayList<Via> vias;
	
	public TransitoWeb(){
		vias = new ArrayList<Via>();
	}
	
	public void connectVia(Via rua){
		vias.add(rua);
	}
	
	public void connectSemaforo(Semaforo sem, String rua){
		for (int i=0; i < vias.size(); i++) {
			
			if(rua == vias.get(i).getRua()){
				vias.get(i).addSemaforo(sem);
			}
			
		}
	}
	
}
