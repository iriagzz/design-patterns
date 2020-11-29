package singleton;

public class ThreadTwo implements Runnable {

	@Override
	public void run() {
		Incremental inc2 = Incremental.getInstance();
		System.out.println(inc2);
		
	}

}
