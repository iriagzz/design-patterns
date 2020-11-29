package singleton;

public class TesteIncremental {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			Thread threadOne = new Thread(new ThreadTwo());
			Thread threadTwo = new Thread(new ThreadOne());
			threadOne.start();
			threadTwo.start();

		}
	}

}