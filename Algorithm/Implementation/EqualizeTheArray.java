package com.practise.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class EqualizeTheArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		int nextNum = 0;
		int[] arr = new int[100];

		for (int i = 1; i <= num; i++) {
			nextNum = in.nextInt();
			arr[nextNum] = arr[nextNum] + 1;
		}

		Arrays.sort(arr);
		int sum = 0;
		for (int i = arr.length - 2; i >= 0; i--) {
			sum = sum + arr[i];
		}

		System.out.println(sum);
	}

}
