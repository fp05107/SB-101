package com.dsa.day_8;


import java.util.*;
public class GeneratePermutration {

}

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		String str = "";
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			str = str + arr[i];
		}
		int index = 0;
		permute(str, index, n - 1);
	}

	private static void permute(String str, int index, int r) {
		if (index == r) {
			for (int i = 0; i < str.length(); i++) {
				System.out.print(str.charAt(i) + " ");
			}
			System.out.println();
			return;
		}
		for (int i = index; i <= r; i++) {
			str = swap(str, i, index);
			permute(str, index + 1, r);
		}

	}

	static String swap(String str, int i, int j) {
		char temp;
		char[] charArray = str.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
}