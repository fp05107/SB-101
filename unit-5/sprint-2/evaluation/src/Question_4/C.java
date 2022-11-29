package Question_4;

public class C extends Thread{
	int prod = 1;
	@Override
	public void run() {
		
		for(int i=1;i<=10;i++) {
			prod = prod*i;
		}
		System.out.println(prod);
	}
}
