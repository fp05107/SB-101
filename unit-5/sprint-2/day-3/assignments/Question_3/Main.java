package Question_3;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		A a = new A();
		a.start();
		a.join();
		for(int i=1;i<20;i=i+2) {
			System.out.println(i);
		}
	}
}
