package singleton;

public class ThreadOne implements Runnable {

	@Override
	public void run() {
		Incremental inc2 = Incremental.getInstance();
		System.out.println(inc2);
	}

}
