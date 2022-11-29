package Question2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {
	static int getANumber() {
		return 100;
	}
	
	public static void main(String[] args) {
		
		Predicate<Integer> p1 = (i)-> i>=0;
		System.out.println(p1.test(10));
		
		Consumer<String> c1 = new MyConsumer();
		c1.accept("Subham");
		
		Consumer<String> c2 = (s)->System.out.println("Welcome"+s);
		c2.accept("Subham");
		
		Supplier<Integer> s1 = new MySupplier();
		System.out.println(s1.get());
		
		Supplier<Integer> s2 = ()->200;
		System.out.println(s2.get());
		
		Supplier<Integer> s3 = Demo::getANumber;
		System.out.println(s3.get());
		
		Function<String, Integer> f1 = new MyFunction();
		int x = f1.apply("subham");
		System.out.println(x);
		
	}
}
