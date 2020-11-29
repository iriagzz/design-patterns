package builder;

import javax.swing.JOptionPane;

import Itens.Batata;
import Itens.Brinquedo;
import Itens.Refrigerante;
import Itens.Sanduiche;
import Itens.Tamanho;
import Itens.TipoBrinquedo;
import Itens.TipoRefrigerante;
import Itens.TipoSanduiche;
import pedido.Pedido;

public class Atendente extends Builder {

	@Override
	public void prepararSanduiche() {
		int tipoSanduiche = Integer
				.parseInt(JOptionPane.showInputDialog("Qual o Sanduiche? [1-Hamburguer | 2-Cheeseburguer]"));
		if (tipoSanduiche == 1) {
			TipoSanduiche tipo = TipoSanduiche.HAMBURGUER;
			Sanduiche sanduiche = new Sanduiche(tipo);
			pedido.adicionarForaDaCaixa(sanduiche.toString());
		} else {
			TipoSanduiche tipo = TipoSanduiche.CHEESEBURGUER;
			Sanduiche sanduiche = new Sanduiche(tipo);
			pedido.adicionarForaDaCaixa(sanduiche.toString());
		}

	}

	@Override
	public void prepararBatata() {
		int tamanho = Integer
				.parseInt(JOptionPane.showInputDialog("Qual o tamanho da Batata? [1-Pequeno | 2-Médio | 3-Grande]"));
		if (tamanho == 1) {
			Tamanho tam = Tamanho.P;
			Batata batata = new Batata(tam);
			pedido.adicionarForaDaCaixa(batata.toString());
		}
		if (tamanho == 2) {
			Tamanho tam = Tamanho.M;
			Batata batata = new Batata(tam);
			pedido.adicionarForaDaCaixa(batata.toString());
		} else {
			Tamanho tam = Tamanho.G;
			Batata batata = new Batata(tam);
			pedido.adicionarForaDaCaixa(batata.toString());
		}

	}

	@Override
	public void separarBrinquedo() {
		int tipoBrinquedo = Integer.parseInt(JOptionPane.showInputDialog("Qual o Brinquedo? [1-Boneca | 2-Carro]"));
		if (tipoBrinquedo == 1) {
			TipoBrinquedo tipo = TipoBrinquedo.BONEQUINHA;
			Brinquedo brinquedo = new Brinquedo(tipo);
			pedido.adicionarForaDaCaixa(brinquedo.toString());
		} else {
			TipoBrinquedo tipo = TipoBrinquedo.CARRINHO;
			Brinquedo brinquedo = new Brinquedo(tipo);
			pedido.adicionarForaDaCaixa(brinquedo.toString());
		}

	}

	@Override
	public void prepararRefrigerante() {
		int tipoRefri = Integer.parseInt(JOptionPane.showInputDialog("Qual o Refrigerante? [1-Guarana | 2-Coca-cola]"));
		if (tipoRefri == 1) {
			TipoRefrigerante tipo = TipoRefrigerante.GUARANA;
			Refrigerante refrigerante = new Refrigerante(tipo);
			pedido.adicionarForaDaCaixa(refrigerante.toString());
		} else {
			TipoRefrigerante tipo = TipoRefrigerante.COCA_COLA;
			Refrigerante refrigerante = new Refrigerante(tipo);
			pedido.adicionarForaDaCaixa(refrigerante.toString());
		}

	}

	public Pedido prepararPedido() {
		return pedido;

	}
}
