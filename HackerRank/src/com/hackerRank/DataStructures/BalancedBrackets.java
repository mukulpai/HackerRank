package com.hackerRank.DataStructures;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int testCase = in.nextInt();

		for (int m = 0; m < testCase; m++) {

			String s = in.next();
			Stack<Character> stack = new Stack<>();

			boolean flag = false;
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);

				if (ch == '{' || ch == '(' || ch == '[') {
					stack.push(ch);
				} else if (ch == '}') {
					if (!stack.empty() && stack.pop() == '{') {
						flag = true;
					} else {
						flag = false;
						break;
					}
				} else if (ch == ')') {
					if (!stack.empty() && stack.pop() == '(') {
						flag = true;
					} else {
						flag = false;
						break;
					}
				} else if (ch == ']') {
					if (!stack.empty() && stack.pop() == '[') {
						flag = true;
					} else {
						flag = false;
						break;
					}
				}
			}
			if (flag && stack.empty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
