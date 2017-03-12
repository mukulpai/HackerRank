package com.hackerRank.DataStructures;

import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int tc = in.nextInt();
		in.nextLine();
		long max = 0;
		long current = 0;
		Stack<String> characters = new Stack<>();
		for (int i = 0; i < tc; i++) {

			String next = in.nextLine();

			if (next.charAt(0) == '1') {
				long nextValue = Integer.valueOf(next.substring(2));
				if (!characters.empty())
					current = Integer.valueOf(characters.peek());
				characters.push(String.valueOf(nextValue));
				if (nextValue >= max) {
					max = nextValue;
				} else {
					max = current;
				}

			} else if (next.charAt(0) == '2' && !characters.empty()) {
				characters.pop();
			}

			if (next.charAt(0) == '3' && !characters.empty()) {
				System.out.println(Integer.valueOf(String.valueOf(max)));
			}

		}
	}

}