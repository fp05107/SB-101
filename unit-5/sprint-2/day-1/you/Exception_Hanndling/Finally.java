package Exception_Hanndling;

public class Finally {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("something");
			System.exit(0);
		}finally {
			System.out.println("I will definitely get excuted you can not stop me");
		}
	}
}
