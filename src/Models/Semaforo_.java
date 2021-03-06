package Models;
/*
public class Semaforo {
	protected Boolean isOpen = false;
	
	protected static int tempoAbertura = 1;
	protected long lastTimeUpdated = System.currentTimeMillis(); 
	
	protected static int ID = 0;
	protected String RUA;
	
	protected webService.cliente.TransitoWeb wsTransito;
	
	public Semaforo(){
		this.ID++;
	}
	
	public long getCurrentTime(){
		return System.currentTimeMillis();
	}
	
	public void verifyToOpen() {
		if((this.getLastTimeUpdated() - this.getCurrentTime())  < tempoAbertura){
			if (this.getTransito().canOpen(this.RUA)){ 
				System.out.println("opening");
				this.open();
			}
		}
	}

	public void verifyToClose() {
		if((this.getLastTimeUpdated() - this.getCurrentTime())  < tempoAbertura){
			System.out.println("fechando");
			this.close();
		}
	}
	
	public webService.cliente.TransitoWeb getTransito(){
		return Utils.getTransitoWeb();
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
	
	public void connectToSemaforo(){
		this.getTransito().connectSemaforo(this.RUA, this.ID);
	}
	
	public String getRua(){
		return this.RUA;
	}
	
	public void setRua(String rua){
		this.RUA = rua;
	}
	
	public List<webService.client.Veiculo> getVeiculos(){
		return this.getTransito().getSortedVeiculos();
	}

	public void setId(int id) {
		this.ID = id;
	}
}
*/
