package Itens;

public enum TipoBrinquedo {

	CARRINHO("carrinho"),
	BONEQUINHA("bonequinha");
	
	private String tipo;
	
	TipoBrinquedo (String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
}
