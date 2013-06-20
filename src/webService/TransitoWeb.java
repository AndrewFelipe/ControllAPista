package webService;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import Models.Semaforo;
import Models.Utils;
import Models.Veiculo;
import Models.Via;

@WebService
public class TransitoWeb {

	private ArrayList<Via> _vias;
	private webService.client.VeiculoWeb veiculoWeb;
	
	public TransitoWeb(){
		_vias = new ArrayList<Via>();
		this.veiculoWeb = new webService.client.VeiculoWebService().getVeiculoWebPort();
	}
	
	@WebMethod
	public void connectVia(Via rua){
		_vias.add(rua);
	}
	
	/*
	 * Verifica retorna se nao tem nenhum semaforo aberto na rua
	 */
	@WebMethod
	public boolean CanOpen(String ruaNome){
		for (int i=0; i < _vias.size(); i++) {		
			if(ruaNome == _vias.get(i).getRua()){
				for (int j=0; j < _vias.get(i).getSemaforos().size(); j++){
					if(_vias.get(i).getSemaforos().get(j).isOpen())
						return false;
				}
			}
		}
		
		return true;
	}
	
	
	@WebMethod
	public void connectSemaforo(Semaforo sem){
		for (int i=0; i < _vias.size(); i++) {		
			if(sem.getRua() == _vias.get(i).getRua()){
				_vias.get(i).addSemaforo(sem);
			}
		}
	}
	
	@WebMethod
	public ArrayList<Veiculo> getSortedVeiculos(){
		ArrayList<Veiculo> veiculosSorted = new ArrayList<Veiculo>();
		
		// random de 4 a 10
		for(int i = 0; i < Utils.getRandomNumber(10, 6); i++){
			// Generate placa with STD5X9X
			String placa = "STD5"+Utils.getRandomNumber(10, 10)+"9"+Utils.getRandomNumber(10, 10);
			//veiculosSorted.add(this.getVeiculoWeb().getVeiculo(placa));
		}
		
		return veiculosSorted;
	}
	
	
	@WebMethod(exclude=true)
	private webService.client.VeiculoWeb getVeiculoWeb(){
		return this.veiculoWeb;
	}
	
}
