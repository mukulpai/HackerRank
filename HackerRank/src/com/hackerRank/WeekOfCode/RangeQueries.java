package com.hackerRank.WeekOfCode;

import java.util.Scanner;

public class RangeQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int queries = in.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = in.nextInt();
		}

		for (int j = 0; j < queries; j++) {
			int count = 0;
			int left = in.nextInt();
			int right = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();
			for (int i = left; i <= right; i++) {

				if (arr[i] % x == y) {
					count++;
				}
			}
			System.out.println(count);
		}

	}
}