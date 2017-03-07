package com.adinfinitum;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int tc = in.nextInt();

		for (int i = 0; i < tc; i++) {
			int count = 0;
			int num = in.nextInt();
			for (int j = 2; j <= num; j++) {

				if (isPrime(j)) {
					count++;
				}
			}
			System.out.println(count);

		}
	}

	private static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
