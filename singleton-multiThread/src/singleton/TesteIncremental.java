package singleton;

public class TesteIncremental {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			Thread threadOne = new Thread(new ThreadOne());
			Thread threadTwo = new Thread(new ThreadTwo());
			threadOne.start();
			threadTwo.start();

		}

	}

}