package Generators;

import javax.swing.table.DefaultTableModel;

import Models.Semaforo;
import Models.Utils;
import Views.TelaPrincipal;

public class SemaforoThread extends Thread {
	private Semaforo sem;

	private TelaPrincipal tela;
	private Object[] row;
	
	private int ID = 0;
	
	public SemaforoThread(TelaPrincipal tela){
		this.tela = tela;
		this.ID = tela.getTableSemaforos().getModel().getRowCount();
		this.sem = new Semaforo();
		this.sem.setRua("TESTE");
	}
	
	private Object[] getRow(){
		if(this.row == null)
			this.row = new Object[]{"SEMAFORO " + this.ID, false};
		
		return this.row;
	}
	
	@Override
	public void run() {
		Utils.getTransitoWeb().connectSemaforo(this.sem.getRua(), this.ID);
		javax.swing.JTable table = tela.getTableSemaforos();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		//model.addRow(this.getRow());
		model.insertRow(this.ID, this.getRow());
		
		while (true) {
			try
			{
				if(sem.isOpen()){
					sem.verifyToClose();
				}
				else{
					sem.verifyToOpen();
				}
				
				this.getRow()[1] = sem.isOpen();
				System.out.println("OI: " + sem.isOpen());
				
				//model.insertRow(this.ID, this.getRow());
				model.setValueAt(this.getRow()[1], this.ID, 1);
				sleep(60*60*3);
				
			} catch (InterruptedException e) {
		    	 System.out.println("thread Interrupted" );
			}
		}
	}
}
