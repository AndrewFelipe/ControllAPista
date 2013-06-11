package Models;

public class Semaforo {

	protected Boolean isOpen = false;
	
	public void open(){
		isOpen = true;
	}
	
	public void close(){
		isOpen = false;
	}
	
	public Boolean isOpen(){
		return isOpen;
	}
}
