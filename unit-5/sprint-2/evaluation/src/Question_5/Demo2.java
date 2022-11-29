package Question_5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("studentdata.txt"));
		
		List<Student> list = (List)ois.readObject();
		
		list.add(new Student(14, "rutu", 600, "rutu@gmail.com", "rutu@1234",new Address("odisha", "markona", "756745")));
		
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("studentdata.txt"));
		oos.writeObject(list);
		
		oos.flush();
		oos.close();
		
	}

}
