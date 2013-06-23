package webService;

import java.util.ArrayList;
import java.util.HashMap;

import javax.jws.WebMethod;
import javax.jws.WebService;

import Models.Semaforo;
import Models.Utils;
import Models.Veiculo;
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
		System.out.println(ruaNome + " quer abrir sinal");
		if(_vias.containsKey(ruaNome)){
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
				return;
			}
		
		Via newVia = new Via();
		newVia.setRua(rua);
		newVia.addSemaforo(sem);
		this.connectVia(newVia);
	}
	
	/*
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
		return Utils.getVeiculoWeb();
	}*/
	
}
