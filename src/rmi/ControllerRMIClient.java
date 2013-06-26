package rmi;

import java.rmi.Naming;
import java.util.ArrayList;
import java.util.List;

import Models.Via;

public class ControllerRMIClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			System.out.println("Init RMI Client");
			
			ControllerRMI control = (ControllerRMI)Naming.lookup("//" + args[0] + "/ControllerRMI");
			
			List<webService.cliente.Via> listVias = control.ViasMonitoradas();
			int[] qtdVeiculosHora = new int[23];
			int[][] VelocMediaMaximaHora = new int[24][2];
			
			// listar a quantidade de veiculos/hora para cada via do sistema
			for (int i = 0; i < listVias.size(); i++){
				
				System.out.println("Qtd de Veiculos na Via " + listVias.get(i).getRua());
				
				qtdVeiculosHora = control.veiculosHora(listVias.get(i));
				VelocMediaMaximaHora = control.velocMediaMaximaHora(listVias.get(i));
				
				for (int j = 0; j < 24; j++){
					System.out.println("Das " + String.valueOf(j) + ":00 as " + String.valueOf(j) + ":59 => " + 
																								String.valueOf(qtdVeiculosHora[j]));
				}
				
				System.out.println();
				
				System.out.println("Velocidades Media e Maxima registradas na via " + listVias.get(i).getRua());
				// listar as velocidades medias e maximas, no intervalo de uma hora, de cada uma das vias
				for (int j = 0; j < 24; j++){
					System.out.println("Das " + String.valueOf(j) + ":00 as " + String.valueOf(j) + ":59 => Velocidade Media Registrada: " + 
																								String.valueOf(VelocMediaMaximaHora[j][0]) +
																								" km/h || Velocidade Maxima Registrada: "  +
																								String.valueOf(VelocMediaMaximaHora[j][1]));
				}
				
			}
			
			
		} catch(Exception ex) {
			System.out.println("Exception: " + ex.getMessage());
		}

	}

}
