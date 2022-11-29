package Mthreading;

public class B extends Thread{
	
	Common c;
	String name;

	public B(Common c, String name) {
		this.c = c;
		this.name = name;
	}

	@Override
	public void run() {
		c.fun1(name);
	}
}
