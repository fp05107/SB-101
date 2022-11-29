package Mthreading;

public class X extends Thread{
	
	@Override
	public void run() {
		
		System.out.println("Inside the run method");
		for(int i=0;i<10;i++) {
			System.out.println("Inside run method "+ i);
		}
		System.out.println("End of run method");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside the main of x");
		
		X x1 = new X();
		x1.start();
		for(int i=20;i<30;i++) {
			System.out.println("Inside main method "+ i);
		}
		
		System.out.println("End of main method");
	}
	
	
}
