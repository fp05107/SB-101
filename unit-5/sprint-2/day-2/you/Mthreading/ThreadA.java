package Mthreading;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ThreadA implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			String tname = Thread.currentThread().getName();
			System.out.println( tname+"Is running");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("end of ThreadA");
	}

	public static void main(String[] args) throws InterruptedException {
//		ThreadA ta = new ThreadA();
//		Thread t = new Thread(ta);
//		t.start();
//		Thread.sleep(3000);
//		System.out.println("End of main");
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> queue = new LinkedList<>();
		stack.toString().replace('[', ' ');
		stack.push(1);
		stack.push(2);
		Collections.reverse(stack);
		System.out.println(stack);
	}
}
