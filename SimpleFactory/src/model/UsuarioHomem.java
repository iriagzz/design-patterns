package model;

public class UsuarioHomem extends Usuario {
	
	public UsuarioHomem (String opcao) {
		super(opcao);
	}
	
	public String saudar(String nome) {
		return "Seja Bem-Vindo Sr. " + nome;
	}
}


