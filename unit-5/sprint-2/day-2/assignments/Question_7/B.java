package Question_7;

public class B implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			
			System.out.println(Thread.currentThread().getName()+Thread.currentThread().getPriority());
			
		}
		
	}

}
