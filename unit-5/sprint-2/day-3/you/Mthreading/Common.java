package Mthreading;

public class Common {

	public synchronized void fun1(String name) {
		// TODO Auto-generated method stub
		
		System.out.print("Welcome");
		try{
		Thread.sleep(1000);
		}
		catch(Exception ee){
		}
		System.out.println(name);
		
	}

}
