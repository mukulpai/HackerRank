package com.hackerRank.implementation;

import java.util.Scanner;

public class KaprekarDigit {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int r1 = in.nextInt();
		int r2 = in.nextInt();
		char[] digits = new char[20];
		boolean flag = false;
		for (int i = r1; i <= r2; i++) {
			int d = String.valueOf(i).length();
			long prod = (long) Math.pow(i, 2);
			digits = String.valueOf(prod).toCharArray();
			long d1, d2 = 0;
			int digLen = digits.length;

			d2 = d;
			d1 = digLen - d2;
			;
			StringBuilder builder = new StringBuilder();
			StringBuilder builder2 = new StringBuilder();
			int j = 0;
			for (; j < d1; j++) {
				builder.append(digits[j]);
			}
			for (int m = j; m < j + d2; m++) {
				builder2.append(digits[m]);
			}
			if (i == 1) {
				System.out.print(i + " ");
			}
			if (builder.length() != 0 && builder2.length() != 0) {
				// if (!(Integer.valueOf(builder.toString()) % 10 == 0)) {
				if ((Integer.valueOf(builder.toString()) + Integer.valueOf(builder2.toString())) == i) {
					System.out.print(i + " ");
					flag = true;
					// }
				}
			}

		}
		if (!flag)
			System.out.println("INVALID RANGE");
	}
}
