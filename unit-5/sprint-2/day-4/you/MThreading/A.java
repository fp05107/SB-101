package MThreading;

public class A extends Thread {

	public synchronized void funA(B b1) {
		System.out.println("funA of A starts");
		b1.fun2();
		System.out.println("funA of A ends");
	}

	public synchronized void fun1() {
		System.out.println("inside fun1 of A");
	}

}
