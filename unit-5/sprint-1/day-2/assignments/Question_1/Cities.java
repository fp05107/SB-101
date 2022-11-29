package Question_1;
import java.util.*;
public class Cities {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("BBSR","Delhi","SORO","Mumbai","Anantapur","Zpur");
		
		Intr i1 = cities->Collections.sort(cities);
		
		i1.sortIt(list);
		System.out.println(list);
	}
}
