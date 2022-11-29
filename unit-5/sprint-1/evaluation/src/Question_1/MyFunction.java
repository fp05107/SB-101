package Question_1;

import java.util.function.Function;

public class MyFunction {
	
	public static void main(String[] args) {
		
//		Function<String,Integer> f2 = s -> Integer.parseInt(s);
//		System.out.println(f2.apply("200")+500);
		
		
		Function<String,Integer> f3 = Integer::parseInt;
		System.out.println(f3.apply("400"));

	}
}
