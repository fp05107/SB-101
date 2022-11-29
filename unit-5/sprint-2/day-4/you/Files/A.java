package Files;

import java.io.Serializable;

public class A implements Serializable{
	
	transient static int i = 100;
	int x = 100;
	transient int y = 100;
	void fun() {
		System.out.println("Inside fun");
	}
}
