package rmi;

import Models.Via;

public class FluxoVeiculosVia {
	
	private Via via;
	private int[] totalVeiculosHora = new int[23];
	
	public FluxoVeiculosVia(Via via) {
		this.via = via;
	}
	
	public Via getVia() {
		return this.via;
	}
	
	public void medeFluxo() {
		
		for (int i = 0; i < via.getSemaforos().size(); i++){
			for (int j = 0; j < 24; j++){
				//totalVeiculosHora[j] = totalVeiculosHora[j] + via.getSemaforos().get(i).getVeiculosHora()[j];
			}
		}
	}
	
	public int[] getTotalVeiculosHora(){
		return this.totalVeiculosHora;
	}

}
