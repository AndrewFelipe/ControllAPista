package Generators;

import javax.swing.table.DefaultTableModel;

import org.omg.CORBA.BooleanHolder;

import webService.cliente.Veiculo;

import Models.Utils;
import generatedCorba.EstacionamentoController;

public class VeiculoThread extends Thread {

	private EstacionamentoController server;
	private String[] args;
	public VeiculoThread(EstacionamentoController server, String[] args) {
		super();
		this.args = args;
		this.server = server;
	}
	
	@Override
	public void run() {
		
		BooleanHolder ret = new BooleanHolder();
		
		Veiculo car = Utils.getVeiculoWeb().getVeiculo(Utils.getRandomPlaca());
		
		Utils.getVeiculoWeb().setVeiculo(car);

		while (true) {
			try
			{
				  server.reservaEstacionamento(car.getPlaca(), ret);
				  //System.out.println("RESERVOU: " + ret.value);
				  
				  Thread.sleep(Utils.getRandomNumber(5*60*60, 3*60*60));
				  
				  server.removeReserva(car.getPlaca(), ret);
				  //System.out.println("REMOVEU RESERVE: " + ret.value);
				  
				  server.isLotado(ret);
				  //System.out.println("LOTADO:" + ret.value);
				  
			} catch (InterruptedException e) {
		    	 System.out.println("thread Interrupted" );
			}
		}
	}
}
