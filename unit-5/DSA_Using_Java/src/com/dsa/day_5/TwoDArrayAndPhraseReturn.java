package com.dsa.day_5;

import java.util.*;

class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		char[][] arr = new char[n][m];
		for (int i = 0; i < n; i++) {
			// String s = sc.next();
			for (int j = 0; j < m; j++) {
				String s = sc.next();
				arr[i][j] = s.charAt(0);
			}
		}
		if (solve(arr, n, m)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");

		}
	}

	static boolean solve(char[][] arr, int n, int m) {
		String s = "masaischool";
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == s.charAt(0)) {
					if (check(arr, i, j, s, 0)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	static boolean check(char[][] grid, int i, int j, String s, int count) {
		if (count == s.length()) {
			return true;
		}
		if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || s.charAt(count) != grid[i][j]) {
			return false;
		}
		boolean ans = false;
		ans = check(grid, i - 1, j, s, count + 1) || check(grid, i - 1, j - 1, s, count + 1)
				|| check(grid, i - 1, j + 1, s, count + 1) || check(grid, i + 1, j, s, count + 1)
				|| check(grid, i + 1, j + 1, s, count + 1) || check(grid, i + 1, j - 1, s, count + 1)
				|| check(grid, i, j - 1, s, count + 1) || check(grid, i, j + 1, s, count + 1);
		return ans;
	}
}

public class TwoDArrayAndPhraseReturn {

}
