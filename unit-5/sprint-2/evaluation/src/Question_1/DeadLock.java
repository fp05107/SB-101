/*
 *-> A lock without key is known as deadlock.
 *
 *-> In deadlock condition two threads wait for each other forever.
 *
 *-> The synchronized keyword is the only reason for deadlock.

 *            
 * 
 * 
 * 
 * 
 */

package Question_1;

public class DeadLock {

	public static void main(String[] args) {
		A a1 = new A();
		B b1 = new B();
		ThreadA t1 = new ThreadA(a1, b1);
		ThreadB t2 = new ThreadB(a1, b1);
		t1.start();
		t2.start();
	}

}
