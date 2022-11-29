package Exception_Hanndling;

public class Try_Catch {
	
	public static void main(String[] args) {
		
		try {
			int x = 100;
			System.out.println(x);
			try {
				String s = "subu";
				int z = Integer.parseInt(s);
				try {
					int[] arr = {1,2};
					System.out.println(arr[9]);
				}catch(ArrayIndexOutOfBoundsException a) {
					System.out.println(a);
				}
				finally {
					System.out.println("Hi am inner finally");
				}
			}
			catch(NumberFormatException n) {
				System.out.println(n);
			}
			finally {
				System.out.println("Hi am innerrrr finally");
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
