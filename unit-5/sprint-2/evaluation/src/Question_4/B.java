package Question_4;

public class B extends Thread{
	int sum = 0;
	@Override
	public void run() {
		
		for(int i=1;i<=20;i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
