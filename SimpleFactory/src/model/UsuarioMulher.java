package model;

public class UsuarioMulher extends Usuario {
	
	public UsuarioMulher(String opcao) {
		super(opcao);
	}
	
	public String saudar(String nome) {
		return "Seja Bem-Vinda Sra. " + nome;
	}
}
