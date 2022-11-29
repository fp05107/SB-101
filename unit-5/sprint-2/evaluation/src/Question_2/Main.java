package Question_2;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadCalculate tc = new ThreadCalculate();
		
		synchronized (tc) {
			tc.start();
			
			tc.wait();
			
		}
		System.out.println(tc.prod);
	}
}
