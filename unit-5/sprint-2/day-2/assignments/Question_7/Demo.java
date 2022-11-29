package Question_7;

public class Demo {
	
	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		
		t1.setName("Subham");
		t2.setName("Bijay");
		
		t1.setPriority(8);
		t2.setPriority(10);
		
		t1.start();
		t2.start();
	}
}
