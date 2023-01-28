package com.dsa.mrrobbot_elliot;

import java.util.*;

public class MrRobbotElliot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int i = 0; i < tc; i++) {
			int n = sc.nextInt();
			String str = sc.next();
			int low = 0;
			int high = n - 1;
			String ans = "";
			String answer = mrRobotElliot(str, low, high, ans);
			// ans = ans + 'a';
			System.out.println(answer);

		}
	}

	static String mrRobotElliot(String str, int low, int high, String ans) {
		if (low > high) {
			return ans;
		}
		int mid = (int) Math.floor((low + high) / 2);
		ans = ans + str.charAt(mid) + mrRobotElliot(str, low, mid - 1, ans) + mrRobotElliot(str, mid + 1, high, ans);
		return ans;
	}
}