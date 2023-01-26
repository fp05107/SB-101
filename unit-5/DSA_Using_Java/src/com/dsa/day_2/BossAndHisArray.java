package com.dsa.day_2;

import java.util.*;

public class BossAndHisArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			bossAndArray(arr, n);
		}
	}

	static void bossAndArray(int[] arr, int n) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < n; i++) {
			Integer x = arr[i];
			if (hm.get(x) == null) {
				hm.put(x, 1);
			} else {
				hm.put(x, hm.get(x) + 1);
			}
		}
		List<Integer> list = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			list.add(entry.getValue());
		}
		Collections.sort(list);

		int i = 0;
		int j = list.size() - 1;
		while (i < j) {
			if (list.get(i) == 1 && list.get(j) > 1) {
				i++;
			}
			if (list.get(j) == 1 && list.get(i) > 1) {
				j--;
			}
			if (list.get(i) == 1 && list.get(j) == 1) {
				i++;
				j--;
			}
			if (list.get(i) > 1 && list.get(j) > 1) {
				while (list.get(i) > 1 && list.get(j) > 1) {
					list.set(i, list.get(i) - 1);
					list.set(j, list.get(j) - 1);
				}
			}
		}
		int sum = 0;
		for (int k = 0; k < list.size(); k++) {
			sum += list.get(k);
		}
		System.out.println(sum);
	}
}
