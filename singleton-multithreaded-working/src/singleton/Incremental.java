package singleton;

public class Incremental {

	private static int count = 0;
	private int numero;

	public Incremental() {
		numero = ++count;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	// singleton
	private static Incremental instance; // atributo "de mim mesmo"

	// metodo que instancia o objeto
	public static Incremental getInstance() {

		// o resultado da variável local parece desnecessário mas, melhora o desempenho
		// do nosso código. Nos casos em que a instância já foi
		// inicializada (na maioria das vezes), o campo volátil é acessado apenas uma
		// vez (devido ao “return resultado;” ao invés de “return instance;”)

		// A palavra-chave sincronizada garante que, se um objeto for procurado para
		// modificação, nenhum outro thread poderá acessar esse objeto e esperar até que
		// o thread de modificação seja concluído.
		
		Incremental resultado = instance;
		if (resultado != null) {
			return resultado;
		}
		synchronized (Incremental.class) {
			if (instance == null) {
				//foi necessário colocar esse "delay" para que houvesse o multithread 
				try {
		            Thread.sleep(1000);
		        } catch (InterruptedException ex) {
		            ex.printStackTrace();
		        }
				instance = new Incremental();
			}
		}
		return instance;
	}

	// esta foi a outra forma que achei 'synchronized'

	public synchronized static Incremental getInstance1() {
		if (instance == null) {
			instance = new Incremental();
		}
		return instance;
	}

	public String toString() {
		return "Incremental " + this.numero;
	}

}