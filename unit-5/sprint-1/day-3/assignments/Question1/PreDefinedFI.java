package Question1;
/*
 * 
1. Predicate<T>
2. Consumer<T>
3. Supplier<T>
4. Function<T,R>

import java.util.function.Predicate;
public class Main {
public static void main(String[] args) {
Predicate<Integer> p = i -> i > 0;
System.out.println(p.test(10));//true
System.out.println(p.test(-10));//false
}
}


import java.util.function.Consumer;
public class Main {
public static void main(String[] args) {
Consumer<Student> c = s -> {
System.out.println("Roll is "+s.getRoll());
System.out.println("Name is "+s.getName());
System.out.println("Marks is "+s.getMarks());
};
c.accept(new Student(10,"Amit",850));
}
}

import java.util.function.Supplier;
public class Main {
public static void main(String[] args) {
Supplier<String> s = () -> "This is from Lambda Expression";
System.out.println(s.get());
Supplier<Student> s2 = () -> new Student(10,"Ram",850);
System.out.println(s2.get().getName());
}}


import java.util.function.Function;
public class Main {
public static void main(String[] args) {
Function<Integer,String> f = i -> "This is a numner "+i;
System.out.println(f.apply(10));
Function<String,Integer> f2 = s -> Integer.parseInt(s);
System.out.println(f2.apply("200")+500);
Function<String,Integer> f3 = Integer::parseInt;
System.out.println(f3.apply("400")+200);
}
}

 */

public class PreDefinedFI {

}
