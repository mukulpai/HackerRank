package com.hackerRank.WeekOfCode;

import java.util.Scanner;

public class CandyReplenishRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int candies = n;
		int time = in.nextInt();
		in.nextLine();
		String[] arr = in.nextLine().split(" ");
		int sum = 0;
		int replinish = 0;
		for (int i = 0; i < time; i++) {
			int remaining = candies - Integer.parseInt(arr[i]);

			if (remaining < 5 && !(i == time - 1)) {
				replinish = n - remaining;
				candies = remaining + replinish;
				sum = sum + (replinish);
			} else {
				candies = remaining;
			}
		}

		System.out.println(sum);
	}

}
