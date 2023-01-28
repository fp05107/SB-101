package com.masai.day_1;

public class IsPrime {

	public static void main(String s[]) {
//		System.out.println(prime(11) ? "11 is prime" : "11 is not prime");
		sampleMethod();
	}

	public static boolean prime(int input) {
		boolean result = true;
		// Write code here to assign true to the variable result, if input is prime
		// otherwise assign false.
		for (int i = 1; i < input - 1; i++) {
			if (i % input == 0) {
				result = false;
				break;
			}
		}
		return result;
	}

	public static void sampleMethod() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				int number = (int) (Math.random() * 10);
				System.out.println(number);
			}
		}
	}

}
