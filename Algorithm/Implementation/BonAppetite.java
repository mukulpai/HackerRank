package com.hackerRank.implementation;

import java.util.Scanner;

public class BonAppetite {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arrSize = in.nextInt();
		int index = in.nextInt();
		int sum = 0;
		for (int i = 0; i < arrSize; i++) {
			int item = in.nextInt();
			if (i != index) {
				sum = sum + item;
			}
		}

		int cost = in.nextInt();
		if ((sum / 2) == cost) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println((cost - (sum/2)));
		}
	}
}
