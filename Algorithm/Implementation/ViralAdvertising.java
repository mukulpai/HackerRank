package com.hackerRank.implementation;

import java.util.Scanner;

public class ViralAdvertising {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int days = in.nextInt();
		int like = 0;
		int ppl = 5;
		calculate(like, ppl, days);
		in.close();
	}

	private static void calculate(int like, int ppl, int days) {
		int result = 0;
		for (int i = 0; i < days; i++) {
			like = ppl / 2;
			result = result + like;
			ppl = like * 3;
		}
		System.out.println(result);
	}
}
