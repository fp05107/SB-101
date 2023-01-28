package com.dsa.quicksort;

import java.util.*;

public class QuickSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int low = 0;
		int high = n - 1;
		quickSort(arr, low, high);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(arr[i] + " ");
		}
		System.out.println(sb);

	}

	static String quickSort(int[] arr, int low, int high) {
		if (low >= high) {
			return null;
		}
		if (arr.length <= 1) {
			return null;
		}
		int pivot = partition(arr, low, high);
		quickSort(arr, low, pivot - 1);
		quickSort(arr, pivot + 1, high);
		return null;
	}

	static int partition(int[] arr, int low, int high) {
		int i = low;
		int j = high;
		int pivot = low;
		while (i < j) {
			while (arr[i] <= arr[pivot] && i < high) {
				i++;
			}
			while (arr[j] > arr[pivot] && j > low) {
				j--;
			}
			if (i < j) {
				swap(arr, i, j);
			}
		}
		swap(arr, pivot, j);
		return j;
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}