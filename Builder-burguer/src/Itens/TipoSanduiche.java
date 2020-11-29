package Itens;

public enum TipoSanduiche {

	HAMBURGUER("hamburguer"),
	CHEESEBURGUER("cheeseburguer");
	
	private String tipo;
	
	TipoSanduiche (String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
}
