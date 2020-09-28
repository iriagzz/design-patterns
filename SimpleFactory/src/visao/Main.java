package visao;

import model.FactoryUsuario;
import model.Usuario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FactoryUsuario fabrica = new FactoryUsuario();
		
		Usuario user = fabrica.getUsuario("default");
		
		System.out.println(user.saudar("Ana"));
		

	}

}
