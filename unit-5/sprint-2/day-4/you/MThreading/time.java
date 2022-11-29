package MThreading;

public class time extends Thread{
	
	@Override
	public void run() {
		
		System.out.println("Inside run");
		synchronized(A.class) {
			System.out.println("Inside sync");
		}
		System.out.println("End of run");
	}
}
