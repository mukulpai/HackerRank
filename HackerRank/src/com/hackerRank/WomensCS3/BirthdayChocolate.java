package com.hackerRank.WomensCS3;

import java.util.Scanner;

public class BirthdayChocolate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] squares = new int[n];

		for (int squares_i = 0; squares_i < n; squares_i++) {
			squares[squares_i] = in.nextInt();
		}
		int sum = in.nextInt();
		int count = in.nextInt();
		int cont = 0;
		int tempSum = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n && j < count + i; j++) {
				tempSum = tempSum + squares[j];
			}
			if (tempSum == sum) {
				cont++;
			}
			tempSum = 0;

		}
		System.out.println(cont);

	}
}
