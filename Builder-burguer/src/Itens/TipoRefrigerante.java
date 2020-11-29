package Itens;

public enum TipoRefrigerante {

	GUARANA("guaraná"),
	COCA_COLA("coca-cola");
	
	private String tipo;
	
	TipoRefrigerante (String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
}
