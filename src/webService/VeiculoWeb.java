package webService;

import java.util.ArrayList;
import java.util.HashMap;

import javax.jws.WebMethod;
import javax.jws.WebService;

import Models.Utils;
import Models.Veiculo;

@WebService
public class VeiculoWeb {

	private String[] _marca = {"Peugeot", "Mercedes", "Volkswagen", "Renault"};
	private String[] _modelos = {"1.0 azul", "1.4 prata", "2.0 Turbo", "1.6 automatico"};
	
	private HashMap<String, Veiculo> _veiculos = new HashMap<String, Veiculo>();

	public VeiculoWeb(){}
	
	@WebMethod
	public Veiculo getVeiculo(String placa){
		if(this._veiculos.containsKey(placa)){
			return this._veiculos.get(placa); 
		}
		
		return this.generatedVeiculoSorted(placa);
	}
	
	@WebMethod(exclude=true)
	private Veiculo generatedVeiculoSorted(String placa){
		Veiculo car = new Veiculo();
		
		int marcaLenght = _marca.length;
		int modeloLenght = _modelos.length;
		
		car.setMarca(this._marca[Utils.getRandomNumber(marcaLenght, marcaLenght)]);
		car.setModelo(this._modelos[Utils.getRandomNumber(modeloLenght, modeloLenght)]);
		car.setPlaca(placa);
		
		this._veiculos.put(placa, car);
		return car;
	}
	
	@WebMethod
	public void setVeiculo(Veiculo carro){
		this._veiculos.put(carro.getPlaca(), carro);
	}
}
