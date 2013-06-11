package Models;

import java.util.ArrayList;

public class Estacionamento {
	private int id;
	private int lotacao = 0;
	private ArrayList carroList = new ArrayList<Veiculo>();
	
	public Estacionamento(int id, int lotacao){
		this.id=id;
		this.lotacao = lotacao;
	}
	
	public boolean isLotado(){
		if(carroList.size() < lotacao)
			return false;
		
		return true;
	}
	
	public void reservaEstacionamento(Veiculo carro){
		carroList.add(carro);
	}
	
	public void removeReserva(Veiculo carro){
		carroList.remove(carro);
	}
}
