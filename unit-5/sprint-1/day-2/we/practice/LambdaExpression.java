package practice;

public class LambdaExpression {
	
	public static void main(String[] args) {
		
		Intr i1 = (x,y)->{
			System.out.println("Hey There I am Lambda Ex"+" "+(x+y));
		};
		i1.fun1(2,3);
	}

}

@FunctionalInterface
interface Intr{
	void fun1(int x,int y);
}