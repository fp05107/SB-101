package Question_4;

public class A extends Thread{
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
}
