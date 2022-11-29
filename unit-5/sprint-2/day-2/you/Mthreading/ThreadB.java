package Mthreading;

public class ThreadB extends Thread {

	@Override
	public void run() {
		for (int i = 50; i < 60; i++) {
			String tname = Thread.currentThread().getName();
			System.out.println(tname + "running B");
		}
		System.out.println("end of ThreadB");
	}
}
