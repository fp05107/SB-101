package com.dsa.day_4;

import java.util.*;
import java.io.*;

public class SingleNumber {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			int x = singleNumber(arr);
			System.out.println(x);
		}
	}

	public static int singleNumber(int[] nums) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i : nums) {
			if (hm.get(i) == null) {
				hm.put(i, 1);
			} else {
				hm.put(i, hm.get(i) + 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return 0;
	}
}
