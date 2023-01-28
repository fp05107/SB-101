package com.dsa.mergesort;

import java.util.*;

public class MergeSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int low = 0;
		int high = n - 1;
		mergeSort(arr, low, high);
		String bag = "";
		for (int i = 0; i < arr.length; i++) {
			bag = bag + arr[i] + " ";
		}
		System.out.println(bag);
	}

	static void mergeSort(int[] arr, int low, int high) {
		if (low == high) {
			return;
		}
		int mid = (int) Math.floor((low + high) / 2);
		// System.out.println(mid);
		mergeSort(arr, low, mid);
		mergeSort(arr, mid + 1, high);
		merge(arr, low, mid, high);
	}

	static void merge(int[] arr, int low, int mid, int high) {
		int[] left_arr = copyArray(arr, low, mid);
		int[] right_arr = copyArray(arr, mid + 1, high);
		int index = low;
		int left = 0;
		int right = 0;

		while (left < left_arr.length && right < right_arr.length) {
			if (left_arr[left] <= right_arr[right]) {
				arr[index] = left_arr[left];
				left++;
			} else {
				arr[index] = right_arr[right];
				right++;
			}
			index++;
		}
		while (left < left_arr.length) {
			arr[index++] = left_arr[left++];
		}
		while (right < right_arr.length) {
			arr[index++] = right_arr[right++];
		}

	}

	static int[] copyArray(int[] arr, int left, int right) {
		int size = right - left + 1;
		int[] ans = new int[size];
		int x = left;
		for (int i = 0; i < size; i++) {
			ans[i] = arr[x];
			x++;
		}
		return ans;
	}
}