package Mthreading;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		Common c = new Common();
		
		A a = new A(c,"Subham");
		B b = new B(c,"Ram");
		
		a.start();
		b.start();
		
		
	}
}
