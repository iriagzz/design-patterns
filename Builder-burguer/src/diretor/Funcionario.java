package diretor;

import builder.Atendente;
import pedido.Pedido;

public class Funcionario {

	
	
	public Pedido montarPedido(Atendente atendente) {
	
		atendente.prepararSanduiche();
		atendente.prepararBatata();
		atendente.separarBrinquedo();
		atendente.prepararRefrigerante();
		
		return atendente.prepararPedido();
		
	}
	
}
