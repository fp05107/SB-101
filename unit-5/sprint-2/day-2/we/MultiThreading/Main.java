package MultiThreading;

public class Main {
	
	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		t2.setPriority(10);
		t1.setPriority(1);
		Thread.currentThread().setPriority(5);
		t1.setName("Subu");
		
		t1.start();
		t2.start();
		Thread.currentThread().setName("Rutu");
//		a.start();
//		a.start();
//		a.run();
		
		for(int i=10;i<20;i++) {
			System.out.println(i+Thread.currentThread().getName());
		}
		System.out.println("End of main thread");
	}
}
