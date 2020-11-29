package Itens;

public class Brinquedo {

	private TipoBrinquedo tipo;

	public Brinquedo(TipoBrinquedo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Brinquedo: " + this.tipo.getTipo();
	}
	
}
