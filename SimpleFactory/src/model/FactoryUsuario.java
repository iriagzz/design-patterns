package model;

public class FactoryUsuario {
	
	public FactoryUsuario() {}
	
	public Usuario getUsuario(String opcao) {
		
		if (opcao.equalsIgnoreCase("homem"))
			return new UsuarioHomem("homem");
		
		else if(opcao.equalsIgnoreCase("mulher"))
			return new UsuarioMulher("mulher");
		
		else 
			return new Usuario();
		
	}

}
