package com.dsa.day_6;

import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			String str = sc.next();
			System.out.println(minMovesToMakePalindrome(str));
		}
	}

	public static int minMovesToMakePalindrome(String s) {
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (hm.get(c) == null) {
				hm.put(c, 1);
			} else {
				hm.put(c, hm.get(c) + 1);
			}
		}

		int odd = 0;
		if (hm.size() % 2 != 0) {
			for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
				if (odd == 2) {
					// System.out.println(-1);
					return -1;
				}
				if (entry.getValue() % 2 != 0) {
					odd++;
				}
			}
		} else {
			for (Map.Entry<Character, Integer> entry : hm.entrySet()) {

				if (entry.getValue() % 2 != 0) {
					// System.out.println(-1);
					return -1;
				}
			}
		}

		int ans = 0;
		int start = 0, end = s.length() - 1;

		char ch[] = s.toCharArray();

		while (start < end) {
			int r = end;
			if (ch[start] == ch[end]) {
				start++;
				end--;
				continue;
			}
			while (ch[start] != ch[r]) {
				r--;
			}
			if (start == r) {
				swap(ch, r, r + 1);
				ans++;
			} else {
				while (r < end) {
					swap(ch, r, r + 1);
					ans++;
					r++;
				}
			}
		}
		return ans;
	}

	static void swap(char ch[], int i, int j) {
		char c = ch[i];
		ch[i] = ch[j];
		ch[j] = c;
	}
}

public class MinimumSwapsToMakePallindrome {

}
