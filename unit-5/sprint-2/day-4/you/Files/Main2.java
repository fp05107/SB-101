package Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main2 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.txt"));
		Object obj = ois.readObject();
		A a1 = (A)obj;
		System.out.println(a1.i);
		System.out.println(a1.x);
		System.out.println(a1.y);
	}

}
