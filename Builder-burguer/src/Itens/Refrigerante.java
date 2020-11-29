package Itens;

public class Refrigerante {

	private TipoRefrigerante refrigerante;
	
	public Refrigerante(TipoRefrigerante refrigerante) {
		this.refrigerante = refrigerante;
	}

	

	@Override
	public String toString() {
		return "Refrigerante: " + this.refrigerante.getTipo();
	}
	
	
	
}
