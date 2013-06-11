package Models;

import java.util.ArrayList;

public class Via {
	
	private String nome = "";

	protected ArrayList<Semaforo> semaforos;
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
}
