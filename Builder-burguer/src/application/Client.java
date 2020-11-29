package application;

import builder.Atendente;
import diretor.Funcionario;

public class Client {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		Atendente atendente = new Atendente();

		System.out.println(funcionario.montarPedido(atendente));

	}

}
