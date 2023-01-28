package com.dsa.generatesubsequence;

import java.util.*;

public class GenerateSubsequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int index = 0;
		Stack<Character> stack = new Stack<>();
		generateSubSequence(n, s, index, stack);
	}

	static String generateSubSequence(int n, String s, int index, Stack<Character> stack) {

		if (stack.size() > 0) {
			String bag = "";
			for (int j = 0; j < stack.size(); j++) {
				bag = bag + stack.get(j);
			}
			System.out.println(bag);
		}
		if (n == index) {
			return "false";
		}

		for (int i = index; i < n; i++) {
			stack.push(s.charAt(i));
			generateSubSequence(n, s, i + 1, stack);
			stack.pop();
		}
		return "c";

	}
}
