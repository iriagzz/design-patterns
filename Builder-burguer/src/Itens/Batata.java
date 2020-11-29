package Itens;

public class Batata {

	private Tamanho tamanho;

	public Batata(Tamanho tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return "Batata: " + this.tamanho.getTamanho();
	}

}
