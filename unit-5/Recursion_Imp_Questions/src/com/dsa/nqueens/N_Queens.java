package com.dsa.nqueens;

import java.util.*;

public class N_Queens {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = 0;
			}
		}
		nQueens(arr, 0);
		System.out.println(count);
	}

	public static int count = 0;

	static void nQueens(int[][] board, int row) {
		if (row == board.length) {
			count++;
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if (checkSafe(board, row, i) == true) {
				board[row][i] = 1;
				nQueens(board, row + 1);
				board[row][i] = 0;
			}
		}
	}

	static boolean checkSafe(int[][] board, int row, int col) {
		for (int i = row - 1; i >= 0; i--) {
			if (board[i][col] == 1)
				return false;
		}
		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1)
				return false;
		}
		for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
			if (board[i][j] == 1)
				return false;
		}
		return true;
	}
}
