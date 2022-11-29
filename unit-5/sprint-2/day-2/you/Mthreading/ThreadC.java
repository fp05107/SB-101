package Mthreading;

public class ThreadC extends Thread {

	@Override
	public void run() {
		for (int i = 20; i < 30; i++) {
			String x = Thread.currentThread().getName();
			System.out.println("Running "+x);
		}
		System.out.println("end of ThreadC");
	}
}
