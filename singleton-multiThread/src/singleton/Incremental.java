package singleton;

import java.util.concurrent.TimeUnit;

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
		if (instance == null) {
			//foi necessário colocar esse "delay" para que houvesse o multithread 
			try {
	            Thread.sleep(1000);
	        } catch (InterruptedException ex) {
	            ex.printStackTrace();
	        }
			instance = new Incremental();
		}
		return instance;
	}

	public String toString() {
		return "Incremental " + numero;
	}

}
