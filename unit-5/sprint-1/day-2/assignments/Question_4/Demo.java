package Question_4;
import java.util.*;
public class Demo {
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		list.add(new Product(5, "Rolex", 1, 500));
		list.add(new Product(3, "Ceat", 10, 40000));
		list.add(new Product(8, "Mrf", 23, 10000));
		list.add(new Product(1, "Adidas", 18, 30000));
		list.add(new Product(9, "Fogg", 0, 200));
		
		X x = (products)->{
			
		};
		
	}
}

@FunctionalInterface
interface X{
	void byPrice(List<Demo> list);
}