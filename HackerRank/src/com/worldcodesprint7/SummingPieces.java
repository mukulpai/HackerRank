package com.worldcodesprint7;

import java.util.Scanner;

public class SummingPieces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int length = in.nextInt();
		int[] arr = new int[length];
		int sum = 0;
		int prod = 1;
		int total = 0;
		for (int i = 0; i < length; i++) {
			arr[i] = in.nextInt();
		}
		
		
//		int num = 0;
//		while (num < length) {
//			for (int i = num, j = 1; i < length; i++) {
//				sum = sum + arr[i];
//				prod = sum * j++;
//				total = total + prod;
//			}
//			sum = 0;
//			// prod = 0;
//			num++;
//		}
		System.out.println((total + arr[0] + arr[length - 1]) % (int) (Math.pow(10, 9) + 7));
	}
}