package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import Models.Utils;
import Models.Veiculo;

public class ControllerRMIServer extends UnicastRemoteObject implements ControllerRMI {
	
	public ControllerRMIServer() throws RemoteException{
		super();
	}

	@Override
	public List<webService.cliente.Via> ViasMonitoradas() throws RemoteException {
		return Utils.getTransitoWeb().getVias();
	}

	@Override
	public int[] veiculosHora(webService.cliente.Via via) throws RemoteException {
		
		int[] totalVeiculosHora = new int[24];
		
			/*for (Semaforo sem : via.){
				totalVeiculosHora[j] = totalVeiculosHora[j] + via.getSemaforos().get(i).getVeiculosHora()[j];
			}*/
			
		return totalVeiculosHora;
	}

	@Override
	public int[][] velocMediaMaximaHora(webService.cliente.Via via) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean excedePesoMaximo(webService.cliente.Via via, Veiculo veiculo)
			throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

}
