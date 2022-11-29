package sat.Question_4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		
		File f = new File("studentdata.txt");
		f.createNewFile();
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(10,"subham", 500, "soro"));
		students.add(new Student(11,"suma", 550, "gudgaon"));
		students.add(new Student(12,"rutu", 600, "pune"));
		students.add(new Student(13,"bijay", 700, "maharashtra"));
		students.add(new Student(14,"guru", 590, "delhi"));
	    
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(students);
		oos.flush();
		oos.close();
		System.out.println("Done ------------");
	}

}
