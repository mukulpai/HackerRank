package com.hackerRank.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class MaxPerimeterTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int len = in.nextInt();
		int[] arr = new int[len];

		for (int i = 0; i < len; i++) {
			arr[i] = in.nextInt();
		}

		Arrays.sort(arr);
		boolean isTriangle = false;
		outerloop: for (int i = len - 1; i >= 0; i--) {
			for (int j = i - 2; j >= 0; j--) {
				isTriangle = isTriangle(arr, i, j);
				if (isTriangle) {
					break outerloop;
				}
			}
		}

		if (!isTriangle) {
			System.out.println(-1);
		}
	}

	private static boolean isTriangle(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int[] temp = new int[3];
		if ((arr[i] + arr[i - 1] > arr[j]) && (arr[i] + arr[j] > arr[i - 1]) && (arr[j] + arr[i - 1] > arr[i])) {
			temp[0] = arr[i];
			temp[1] = arr[i - 1];
			temp[2] = arr[j];
			Arrays.sort(temp);

			for (int k = 0; k < 3; k++) {
				System.out.print(temp[k] + " ");
			}
			return true;
		}
		return false;
	}

}
