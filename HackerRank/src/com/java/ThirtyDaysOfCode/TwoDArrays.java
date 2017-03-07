package com.java.ThirtyDaysOfCode;

import java.util.Scanner;

public class TwoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		int sum = -81;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				int temp = hourGlassSum(arr, i, j);

				if (temp >= sum) {
					sum = temp;
				}
			}
		}

		System.out.println(sum);

	}

	private static int hourGlassSum(int[][] arr, int i, int j) {
		return arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]
				+ arr[i + 2][j + 2];

	}

}
