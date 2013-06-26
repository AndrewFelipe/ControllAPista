package Models;

import java.util.ArrayList;
import java.util.Collection;

public class Via {

	protected Collection<Semaforo> semaforos;
	protected String rua;
	
	public Via(){
		this.semaforos = new ArrayList<Semaforo>();
	}
	
	public Via(String ruaNome){
		this.semaforos = new ArrayList<Semaforo>();
		this.setRua(ruaNome);
	}
	
	public void addSemaforo(Semaforo sem){
		semaforos.add(sem);
	}
	
	public void removeSemaforo(Semaforo sem){
		semaforos.remove(sem);
	}
	
	public void setRua(String ruaNome){
		rua = ruaNome;
	}

	public String getRua() {
		return rua;
	}
	
	public Collection<Semaforo> getSemaforos(){
		return this.semaforos;
	}
}
