package Question_2;

public class MethodReference {
	public static void main(String[] args) {
		
		X x = Integer::parseInt;
		
		System.out.println(x.convetStringToNumber("10"));
	}
}
