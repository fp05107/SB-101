package Question_1;

public class A extends Thread{
	int prod = 1;
	@Override
	public  void run() {
		synchronized (this) {
			
			for (int i = 1; i <= 10; i++) {
				prod = prod * i;
			}
			this.notify();
		}
	}

}
