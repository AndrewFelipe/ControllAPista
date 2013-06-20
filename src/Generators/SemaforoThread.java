package Generators;

import Models.Semaforo;

public class SemaforoThread extends Thread {
	private Semaforo sem = new Semaforo();

	@Override
	public void run() {
		while (true) {
			try
			{
				if(sem.isOpen()){
					sem.verifyToClose();
				}
				else{
					sem.verifyToOpen();
				}
				
				sleep(60*60*3);
				
			} catch (InterruptedException e) {
		    	 System.out.println("thread Interrupted" );
			}
			
			System.out.println(sem.isOpen());
		}
	}
}
