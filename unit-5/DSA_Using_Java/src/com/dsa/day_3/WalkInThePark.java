package com.dsa.day_3;

import java.util.*;

public class WalkInThePark {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			char[][] arr = new char[n][m];
			for (int i = 0; i < n; i++) {
				String s = sc.next();
				for (int j = 0; j < m; j++) {
					arr[i][j] = s.charAt(j);
				}
			}
			walkInPark(arr, n, m);
		}
	}

	static void walkInPark(char[][] arr, int n, int m) {
		int count = 0;
		int i = 0;
		int j = 0;
		char cell = arr[i][j];
		while (i >= 0 && j >= 0 && i < n && j < m) {
			if (cell == '0') {
				break;
			} else if (cell == 'R') {
				arr[i][j] = '0';
				count++;
				if (j + 1 < m) {

					j = j + 1;
					cell = arr[i][j];
				} else {
					break;
				}
			} else if (cell == 'L') {
				arr[i][j] = '0';
				count++;
				if (j - 1 >= 0) {
					j = j - 1;
					cell = arr[i][j];
				} else {
					break;
				}
			} else if (cell == 'D') {
				arr[i][j] = '0';
				count++;
				if (i + 1 < n) {

					i = i + 1;
					cell = arr[i][j];
				} else {
					break;
				}
			} else if (cell == 'U') {
				arr[i][j] = '0';
				count++;
				if (i - 1 >= 0) {

					i = i - 1;
					cell = arr[i][j];
				} else {
					break;
				}
			}
		}
		System.out.println(count);
	}
}
