package com.hackerRank.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class HurdleRace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] height = new int[n];
		for (int height_i = 0; height_i < n; height_i++) {
			height[height_i] = in.nextInt();
		}

		Arrays.sort(height);

		int result = height[height.length - 1] - k;

		if (result < 0)
			result = 0;
		
		System.out.println(result);
	}

}
