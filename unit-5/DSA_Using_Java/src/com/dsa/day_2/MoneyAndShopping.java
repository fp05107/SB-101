package com.dsa.day_2;

import java.io.*;
import java.util.*;

public class MoneyAndShopping {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[][] prices = new int[n][3];
			for (int i = 0; i < n; i++) {
				String[] line = br.readLine().split(" ");
				prices[i][0] = Integer.parseInt(line[0]);
				prices[i][1] = Integer.parseInt(line[1]);
				prices[i][2] = Integer.parseInt(line[2]);
			}
			int[][] dp = new int[n][3];
			dp[0][0] = prices[0][0];
			dp[0][1] = prices[0][1];
			dp[0][2] = prices[0][2];
			for (int i = 1; i < n; i++) {
				dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + prices[i][0];
				dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + prices[i][1];
				dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + prices[i][2];
			}
			System.out.println(Math.min(dp[n - 1][0], Math.min(dp[n - 1][1], dp[n - 1][2])));
		}
	}
}
