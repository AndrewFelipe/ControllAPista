package Corba;

import generatedCorba.EstacionamentoController;
import generatedCorba.EstacionamentoControllerHelper;

import org.omg.CORBA.BooleanHolder;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

import webService.cliente.Veiculo;

import Generators.VeiculoThread;
import Models.Utils;

public class cliente {

	  public static void main(String args[]) {
	    try {
		      // Cria e inicializa o ORB
		  ORB orb = ORB.init(args, null);
		
		  // Obtem referencia para o servico de nomes
		  org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
		  NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
		 
		      // Obtem referencia para o servidor
		  String name = "Estacionamento";
		  
		  int totalVeiculosThread = 0;
		  while(true){
			  if(totalVeiculosThread < 20){
				  EstacionamentoController server = EstacionamentoControllerHelper.narrow(ncRef.resolve_str(name));
				  
				  new VeiculoThread(server, args).start();
				  System.out.println("Criou veiculo thread.");
				  totalVeiculosThread++;
			  }
			  Thread.sleep(60*3);
		  }
		
		} catch (Exception e) {
		    System.out.println("ERROR : " + e) ;
		        e.printStackTrace(System.out);
		}
	}
}
