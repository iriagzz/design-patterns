package Itens;

public enum Tamanho {
	
	P("pequeno"),
	M("m�dio"),
	G("grande");
	
	private String tamanho;
	
	Tamanho (String tamanho){
		this.tamanho = tamanho;
	}
	
	public String getTamanho() {
		return tamanho;
	}

}
