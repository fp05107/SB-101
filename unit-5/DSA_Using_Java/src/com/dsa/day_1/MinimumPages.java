package com.dsa.day_1;

import java.io.*;

public class MinimumPages {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int pages10 = n / 10;
			int pages12 = n / 12;
			int minPages = Integer.MAX_VALUE;

			for (int i = 0; i <= pages10; i++) {
				for (int j = 0; j <= pages12; j++) {
					if (i * 10 + j * 12 == n) {
						minPages = Math.min(minPages, i + j);
					}
				}
			}

			if (minPages == Integer.MAX_VALUE) {
				System.out.println("-1");
			} else {
				System.out.println(minPages);
			}
		}
	}
}
