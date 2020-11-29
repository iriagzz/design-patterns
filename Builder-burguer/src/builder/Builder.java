package builder;

import pedido.Pedido;

public abstract class Builder {

	Pedido pedido = new Pedido();
	
	abstract void prepararSanduiche();
	abstract void prepararBatata();
	abstract void separarBrinquedo();
	abstract void prepararRefrigerante();
	
	public Pedido prepararPedido() {
		return pedido;
	}
}
