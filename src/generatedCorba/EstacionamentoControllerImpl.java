package generatedCorba;

import java.util.ArrayList;

import org.omg.CORBA.BooleanHolder;

public class EstacionamentoControllerImpl extends EstacionamentoControllerPOA {
	private static int MAXIMO_VAGAS = 10;
	private ArrayList<String> vagas = new ArrayList<String>();
	
	@Override
	public boolean reservaEstacionamento(String placa, BooleanHolder ret) {
		if(!this.isLotado(ret)){
			this.vagas.add(placa);
			ret.value = true;
			return true;
		}
		
		System.out.println("Estacionamento Lotado para Reserva de: " + placa);
		
		ret.value = false;
		return false;
	}

	@Override
	public boolean removeReserva(String placa, BooleanHolder ret) {
		// TODO Auto-generated method stub
		System.out.println("Removendo reserva de: " + placa);
		ret.value = this.vagas.remove(placa);
		return ret.value;
	}

	@Override
	public boolean isLotado(BooleanHolder ret) {
		// TODO Auto-generated method stub
		if(this.vagas.size()  > MAXIMO_VAGAS){
			ret.value = true;
			System.out.println("Esta lotado!");
			return true;
		}

		System.out.println("Há vagas!");
		ret.value = false;
		return false;
	}

}
