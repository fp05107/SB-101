package MultiThreading;

public class A implements Runnable{
	@Override
	public void run() {
		 System.out.println("Inside the run method");
		 for(int i=0;i<10;i++) {
			 System.out.println(i + Thread.currentThread().getName());
		 }
		 System.out.println("End of the run method");
	}

}
