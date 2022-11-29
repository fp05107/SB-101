package Question_5;

import java.io.File;
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
		students.add(new Student(10, "subham", 500, "subham@gmail.com", "subham@1234",new Address("odisha", "soro", "756045")));
		students.add(new Student(11, "bijay", 550, "bijay@gmail.com", "bijay@1234",new Address("odisha", "Bbsr", "576045")));
		students.add(new Student(12, "papulu", 400, "papulu@gmail.com", "papulu@1234",new Address("Tamilnadu", "chennai", "736045")));
		students.add(new Student(13, "gudu", 100, "gudu@gmail.com", "gudu@1234",new Address("delghi", "gudgaon", "758903")));
		students.add(new Student(14, "gora", 600, "gora@gmail.com", "gora@1234",new Address("Maharshtra", "mumbai", "756745")));
		
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
		oos.writeObject(students);
		
		oos.flush();
		oos.close();
		System.out.println("Done------");
	}

}
