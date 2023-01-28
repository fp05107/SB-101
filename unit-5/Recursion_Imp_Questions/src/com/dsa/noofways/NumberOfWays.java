package com.dsa.noofways;

import java.util.*;

public class NumberOfWays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = noOfWays(n, 0);
		System.out.println(x);
	}

	static int noOfWays(int n, int result) {

		if (result == n) {
			return 1;
		}
		if (result > n) {
			return 0;
		}

		return noOfWays(n, result + 1) + noOfWays(n, result + 2) + noOfWays(n, result + 3);

	}
}
