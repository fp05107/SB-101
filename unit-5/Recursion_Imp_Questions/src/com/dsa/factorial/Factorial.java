package com.dsa.factorial;

import java.util.*;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = factorialRecursion(n);
		System.out.println(x);
	}

	static int factorialRecursion(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorialRecursion(n - 1);

	}
}
