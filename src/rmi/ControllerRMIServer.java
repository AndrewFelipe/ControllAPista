package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Collection;

import Models.Utils;
import Models.Veiculo;
import Models.Via;

public class ControllerRMIServer extends UnicastRemoteObject implements ControllerRMI {
	
	public ControllerRMIServer() throws RemoteException{
		super();
	}

	@Override
	public Collection<Via> ViasMonitoradas() throws RemoteException {
		return Utils.getTransitoWeb().getVias();
	}

	@Override
	public int[] veiculosHora(Via via) throws RemoteException {
		
		int[] totalVeiculosHora = new int[24];
		
		for (int i = 0; i < via.getSemaforos().size(); i++){
			for (int j = 0; j < 24; j++){
				totalVeiculosHora[j] = totalVeiculosHora[j] + via.getSemaforos().get(i).getVeiculosHora()[j];
			}
		}
		return totalVeiculosHora;
	}

	@Override
	public int[][] velocMediaMaximaHora(Via via) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean excedePesoMaximo(Via via, Veiculo veiculo)
			throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

}
