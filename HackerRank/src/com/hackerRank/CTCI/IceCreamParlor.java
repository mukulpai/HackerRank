package com.hackerRank.CTCI;

import java.util.Scanner;

public class IceCreamParlor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int testCase = in.nextInt();

		for (int i = 0; i < testCase; i++) {
			int m = in.nextInt();
			int n = in.nextInt();
			int[] arr = new int[n];

			for (int j = 0; j < n; j++) {
				arr[j] = in.nextInt();
			}

			for (int a = 0; a < n; a++) {
				for (int b = a + 1; b < n; b++) {
					if (arr[a] + arr[b] == m) {
						int op = b + 1;
						System.out.println(a + 1 + " " + op);
					}
				}
			}

		}

	}

}
