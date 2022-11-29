package Question_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		List<Integer> list2 = list.stream().map(s -> {
			int s1 = s*s;
			return s1;
		}).collect(Collectors.toList());
		
		list2.forEach(e ->System.out.println(e));
		list.forEach(e ->System.out.println(e));
	}
}
