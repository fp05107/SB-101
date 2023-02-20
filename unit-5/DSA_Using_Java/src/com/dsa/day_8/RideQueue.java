package com.dsa.day_8;

import java.util.*;

class Main2 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int c = 1;
			for (int i = 0; i < n - 1; i++) {
				if (arr[i] >= arr[i + 1]) {
					c++;
				}
			}
			System.out.println(c);
		}
	}
}

public class RideQueue {

}
