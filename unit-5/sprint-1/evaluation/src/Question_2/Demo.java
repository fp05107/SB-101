package Question_2;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		
		
		List<Product> list = new ArrayList<>();
		
		Product p1 = new Product(10, "Pen", 5, 1);
		Product p2 = new Product(9, "Pencil", 5, 6);
		Product p3 = new Product(11, "Rubber", 5, 1);
		Product p4 = new Product(12, "Sharpener", 5, 5);
		Product p5 = new Product(7, "Scale", 5, 3);
		Product p6 = new Product(8, "Compass", 5, 0);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		
		
		Collections.sort(list, (s1,s2) -> s1.getPrice() > s2.getPrice() ? +1 : -1 );

		Intr i = System.out::println;
		i.print(list);
	}

}
