package Models;

import java.util.ArrayList;

public class Semaforo {
	protected Boolean isOpen = false;
	
	protected int tempoAbertura = 20;
	protected long lastTimeUpdated = System.currentTimeMillis(); 
	
	protected static int ID = 0;
	protected String RUA;
	
	public Semaforo(){
		
	}
	
	protected webService.client.TransitoWeb wsTransito;
	
	public Semaforo(webService.client.TransitoWeb transitoWeb){
		this.wsTransito = transitoWeb;
		this.ID++;
	}
	
	public long getCurrentTime(){
		return System.currentTimeMillis();
	}
	
	public void verifyToOpen() {
		if((this.getLastTimeUpdated() - this.getCurrentTime())  > tempoAbertura){
			if (this.getTransito().canOpen(this.RUA)){ 
				this.open();
			}
		}
	}

	public void verifyToClose() {
		if((this.getLastTimeUpdated() - this.getCurrentTime())  > tempoAbertura){
			this.close();
		}
	}
	
	public webService.client.TransitoWeb getTransito(){
		return this.wsTransito;
	}

	public long getLastTimeUpdated(){
		return this.lastTimeUpdated;
	}
	
	public void open(){
		isOpen = true;
	}
	
	public void close(){
		isOpen = false;
	}
	
	public Boolean isOpen(){
		return isOpen;
	}
	
	public String getRua(){
		return this.RUA;
	}
	
	public ArrayList<Veiculo> getVeiculos(){
		return this.getTransito().getSortedVeiculos();
	}
}
