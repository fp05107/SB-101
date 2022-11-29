package Files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		A a = new A();
		a.x = 500;
		a.y = 500;
		a.i = 500;
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.txt"));
		oos.writeObject(a);
		System.out.println("done");
		
	}
}
