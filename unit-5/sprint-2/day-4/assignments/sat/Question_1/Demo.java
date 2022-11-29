package sat.Question_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("abc.txt");
		f.createNewFile();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name here");
		String name = br.readLine();
		System.out.println("Enter address here");
		String address = br.readLine();
		
		FileWriter fw = new FileWriter("abc.txt");
		fw.write(name);
		fw.write(address);
		System.out.println("Done-eeeeeee");
		
		fw.flush();
		fw.close();
		
	}
}
