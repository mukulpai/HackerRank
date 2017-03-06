package com.hackerRank.implementation;

import java.util.Scanner;

public class AppleandOrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int r1 = in.nextInt();
		int r2 = in.nextInt();

		int appleTree = in.nextInt();
		int orangeTree = in.nextInt();

		int numApples = in.nextInt();
		int numOranges = in.nextInt();

		int applecount = 0;
		int orangeCount = 0;

		for (int i = 0; i < numApples; i++) {
			int fallenApple = appleTree + in.nextInt();
			if (fallenApple >= r1 && fallenApple <= r2) {
				applecount++;
			}
		}

		for (int j = 0; j < numOranges; j++) {
			int fallenOrange = orangeTree + in.nextInt();

			if (fallenOrange >= r1 && fallenOrange <= r2) {
				orangeCount++;
			}
		}

		System.out.println(applecount);
		System.out.println(orangeCount);
	}

}
