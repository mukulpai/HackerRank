package com.hackerRank.implementation;

import java.util.Scanner;

public class DesignPDFViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int[] height = new int[26];

		for (int i = 0; i < 26; i++) {
			height[i] = in.nextInt();
		}

		char[] input = in.next().toCharArray();
		int value = 0;
		int max = height[(int) input[0] - 97];
		for (int j = 0; j < input.length; j++) {
			value = (int) input[j] - 97;
			max = calcMax(height[value], max);
		}
		System.out.println(max * input.length);
	}

	private static int calcMax(int i, int max) {
		// TODO Auto-generated method stub
		if (i > max) {
			max = i;
		}
		return max;
	}

}
