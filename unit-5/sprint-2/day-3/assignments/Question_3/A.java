package Question_3;

public class A extends Thread{
	@Override
	public void run() {
		
		for(int i=0;i<20;i=i+2) {
			System.out.println(i);
		}
	}

}
