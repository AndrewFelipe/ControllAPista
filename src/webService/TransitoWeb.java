package webService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.jws.WebMethod;
import javax.jws.WebService;

import Models.Semaforo;
import Models.Utils;
import Models.Via;

@WebService
public class TransitoWeb {

	private HashMap<String, Via> _vias;
	
	public TransitoWeb(){
		_vias = new HashMap<String, Via>();
	}
	
	@WebMethod
	public void connectVia(Via rua){
		_vias.put(rua.getRua(), rua);
	}
	
	/*
	 * Verifica retorna se nao tem nenhum semaforo aberto na rua
	 */
	@WebMethod
	public boolean CanOpen(String ruaNome){
		if(_vias.containsKey(ruaNome)){
			System.out.println("Contem a rua: " + ruaNome);
			for (int j=0; j < _vias.get(ruaNome).getSemaforos().size(); j++){
				if(_vias.get(ruaNome).getSemaforos().get(j).isOpen())
					return false;
			}
		}
		
		return true;
	}
	
	@WebMethod
	public void connectSemaforo(String rua, int ID){
		Semaforo sem = new Semaforo();
		sem.setRua(rua);
		sem.setId(ID);
		
		if(_vias.containsKey(rua)){
			_vias.get(rua).addSemaforo(sem);
			System.out.println("Adicionado via tal");
			return;
		}
		
		Via newVia = new Via();
		newVia.setRua(rua);
		newVia.addSemaforo(sem);
		this._vias.put(newVia.getRua(), newVia);
	}
	
	/*
	@WebMethod
	public ArrayList<Models.Veiculo> getSortedVeiculos(){
		ArrayList<Models.Veiculo> veiculosSorted = new ArrayList<Models.Veiculo>();
		
		// random de 4 a 10
		for(int i = 0; i < Utils.getRandomNumber(10, 6); i++){
			// Generate placa with STD5X9X
			String placa = "STD5"+Utils.getRandomNumber(10, 10)+"9"+Utils.getRandomNumber(10, 10);
			//veiculosSorted.add(this.getVeiculoWeb().getVeiculo(placa));
		}
		
		return veiculosSorted;
	}
	*/
	
	@WebMethod
	public Collection<Via> getVias(){
		Collection<Via> vias = this._vias.values();
		return vias;
	}
	
	
	@WebMethod(exclude=true)
	private webService.cliente.VeiculoWeb getVeiculoWeb(){
		return Utils.getVeiculoWeb();
	}
	
}
