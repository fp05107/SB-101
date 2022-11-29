package sat.Question_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new FileReader("abc.txt"));
		
		String s = bf.readLine();
		System.out.println(s);
		
	}

}
