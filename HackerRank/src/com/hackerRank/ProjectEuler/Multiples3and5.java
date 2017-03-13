package com.hackerRank.ProjectEuler;

import java.util.Scanner;

public class Multiples3and5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int tc = in.nextInt();
		long nextNum = 0;
		long sum = 0;
		long sum2 = 0;
		long sum3 = 0;
		for (int i = 0; i < tc; i++) {
			nextNum = in.nextInt();

			long n3 = (nextNum - 1) / 3;
			sum = 3 * ((n3 * (n3 + 1)) / 2);
			long n5 = (nextNum - 1) / 5;
			sum2 = 5 * ((n5 * (n5 + 1)) / 2);
			long n15 = (nextNum - 1) / 15;
			sum3 = 15 * ((n15 * (n15 + 1)) / 2);
			System.out.println(sum + sum2 - sum3);
			sum = 0;
			sum2 = 0;
			sum3 = 0;
		}
	}

}
