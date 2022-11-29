package synchronization;

import java.io.Serializable;

public class A extends Thread {

	int prod = 1;

	@Override
	public void run() {
		synchronized (this) {
			System.out.println("child thread performing calculation");
			for (int i = 0; i <= 100; i++) {
				prod = prod+i;
			}
			System.out.println("child thread giving the notification");
			this.notify();
		}
	}

}
