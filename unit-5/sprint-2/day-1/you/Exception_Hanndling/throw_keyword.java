package Exception_Hanndling;

import java.io.IOException;

public class throw_keyword {

	public static void main(String[] args) {
		
		try {
			method(10);
		}catch(Exception e) {
//			System.out.println(e);
			e.printStackTrace();
		}
		
	}

static void method(int x) throws Exception  {
		if (x < 18) {
			throw new Exception("I am IO ex");
		} else {
			System.out.println("Eligible");
		}
	}
}
