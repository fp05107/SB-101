package Question_4;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		A a = new A();
		B b = new B();
		C c = new C();
		
		a.setName("Kohli");
		b.setName("Dhoni");
		c.setName("Rohit");
		
		b.setPriority(10);
		
		b.start();
		b.join();
		c.start();
		c.join();
		a.start();
		
		
		
	}

}
