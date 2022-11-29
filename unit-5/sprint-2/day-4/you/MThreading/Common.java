package MThreading;

public class Common {
static public synchronized void fun(String name) {
//	System.out.println(name);
	System.out.print("Welcome");
	try{
	Thread.sleep(1000);
	}
	catch(Exception ee){
	}
	System.out.println(name);
}
}
