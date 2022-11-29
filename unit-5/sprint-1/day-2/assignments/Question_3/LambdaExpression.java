package Question_3;

import java.util.Arrays;
import java.util.List;

public class LambdaExpression {
	public static void main(String[] args) {
		
		
		List<String> city = Arrays.asList("Bbsr","Mumbai","Cuttack","Delhi","Soro");
		
		PrintList i = address->System.out.println(address);
		
		i.display(city);
	}
}
