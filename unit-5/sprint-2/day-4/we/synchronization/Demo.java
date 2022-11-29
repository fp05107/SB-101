package synchronization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) throws  ClassNotFoundException, InterruptedException {
		
		A a = new A();
		a.start();
		
		synchronized (a) {
			a.wait();
			System.out.println(a.prod);
			
			
		}
		
	}

}
