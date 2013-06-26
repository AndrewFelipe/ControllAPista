package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Collection;

import Models.Veiculo;
import Models.Via;

public interface ControllerRMI extends Remote {
	
	public Collection<Via> ViasMonitoradas() throws RemoteException;
	public int[] veiculosHora(Via via) throws RemoteException;
	public int[][] velocMediaMaximaHora(Via via) throws RemoteException;
	public boolean excedePesoMaximo(Via via, Veiculo veiculo) throws RemoteException;

}
