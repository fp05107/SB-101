package Question_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
	
	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>();
		products.add(new Product(10, "fogg", 500, 2));
		products.add(new Product(15, "rolex", 3400, 15));
		products.add(new Product(40, "zebronics", 5700, 20));
		products.add(new Product(20, "adidas", 400, 5));
		products.add(new Product(12, "avon", 5000, 12));
		
		List<Product> products2 = products.stream().filter(e ->e.getQuantity()>10).collect(Collectors.toList());
		Collections.sort(products2,(s1,s2) ->s1.getPrice()>s2.getPrice() ? 1 : -1);
		
		products.stream().forEach(e ->System.out.println(e));
		products2.stream().forEach(e ->System.out.println(e));
	}
}
