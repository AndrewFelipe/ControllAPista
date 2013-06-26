package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import Models.Veiculo;

public interface ControllerRMI extends Remote {
	
	public List<webService.cliente.Via> ViasMonitoradas() throws RemoteException;
	public int[] veiculosHora(webService.cliente.Via via) throws RemoteException;
	public int[][] velocMediaMaximaHora(webService.cliente.Via via) throws RemoteException;
	public boolean excedePesoMaximo(webService.cliente.Via via, Veiculo veiculo) throws RemoteException;

}
