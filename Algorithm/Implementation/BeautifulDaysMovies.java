package com.hackerRank.implementation;

import java.util.Scanner;

public class BeautifulDaysMovies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int r1 = in.nextInt();
		int r2 = in.nextInt();

		int x = in.nextInt();

		int rev = 0;
		int count = 0;
		for (int i = r1; i <= r2; i++) {
			rev = reverse(i);
			if (Math.abs(i - rev) % x == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

	private static int reverse(int i) {

		StringBuilder builder = new StringBuilder(String.valueOf(i));

		return Integer.valueOf(builder.reverse().toString());
	}

}
