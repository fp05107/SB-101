package Mthreading;

import java.util.Stack;

public class A extends Thread {

	Common c;
	String name;

	public A(Common c, String name) {
		this.c = c;
		this.name = name;
	}

	@Override
	public void run() {
		c.fun1(name);
	}

}
