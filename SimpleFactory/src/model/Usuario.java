package model;

public class Usuario {

	private String opcao;
	
	public Usuario() {}
	
	public Usuario(String opcao) {
		super();
		this.opcao = opcao;
	}

	public String getOpcao() {
		return opcao;
	}

	public void setOpcao(String opcao) {
		this.opcao = opcao;
	}

	public String saudar(String nome) {
		return "Sejx Bem-Vindx " + nome;
	}
	
}
