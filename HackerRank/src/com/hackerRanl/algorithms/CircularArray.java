package com.hackerRanl.algorithms;

import java.util.Scanner;

public class CircularArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int k = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		while (k >= 1) {
			int temp = arr[n - 1];
			for (int j = n; j >= 2; j--) {
				arr[j - 1] = arr[j - 2];
			}
			arr[0] = temp;
			k--;
		}
		for (int i = 0; i < n; i++) {
			System.out.println();
		}
	}
}
