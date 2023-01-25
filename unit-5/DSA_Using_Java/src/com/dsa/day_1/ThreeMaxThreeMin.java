package com.dsa.day_1;

import java.util.*;

public class ThreeMaxThreeMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Set<Integer> set = new TreeSet<>();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			set.add(arr[i]);
		}

		if (set.size() < 6) {
			System.out.println("Not Possible");
			System.out.println("Not Possible");
		} else {
			StringBuilder sb1 = new StringBuilder();
			StringBuilder sb2 = new StringBuilder();

			List<Integer> list = new ArrayList<>(set);
			for (int i = 0; i < 3; i++) {
				sb1.append(list.get(i) + " ");
			}
			for (int i = list.size() - 3; i <= list.size() - 1; i++) {
				sb2.append(list.get(i) + " ");
			}
			System.out.println(sb1);
			System.out.println(sb2);
		}

	}
}