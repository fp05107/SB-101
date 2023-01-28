package com.masai.day_1;

public class Demo {
	
	public static void main(String[] args) {
		
	
//		Wrapper: Boolean,Byte,Character,Double,Float,Integer,Long,Short
//		Primitive: boolean,byte,char ,double, float, int , long,short
		
		Integer number1 = new Integer("55");
		System.out.println(number1);
		
		
		
//		Two ways of creating Wrapper Class Instances are described below.
//		Using a Wrapper Class Constructor
		
		Integer number = new Integer(55);//int
		Integer number2 = new Integer("55");//String

		Float number3 = new Float(55.0);//double argument
		Float number4 = new Float(55.0f);//float argument
		Float number5 = new Float("55.0f");//String

		Character c1 = new Character('C');//Only char constructor
		//Character c2 = new Character(124);//COMPILER ERROR

		Boolean b = new Boolean(true);
		//"true" "True" "tRUe" - all String Values give True
		//Anything else gives false
		Boolean b1 = new Boolean("true");//value stored - true
		Boolean b2 = new Boolean("True");//value stored - true
		Boolean b3 = new Boolean("False");//value stored - false
		Boolean b4 = new Boolean("SomeString");//value stored - false

//		valueOf Static Methods
//		Provide another way of creating a Wrapper Object

		Integer hundred = Integer.valueOf("100");//100 is stored in variable
		Integer seven = Integer.valueOf("111", 2);//binary 111 is converted to 7
		
		
		
		
		
	}

}
