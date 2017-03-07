package com.hackerRank.CTCI;

import java.util.Scanner;

public class ArrayLeftRot {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();

		int d = in.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = in.nextInt();
		}
		int rot = d % size;
		if (rot == 0) {
			printArray(arr);
		} else {
			while (rot > 0) {
				int k = arr[0];
				for (int i = 0; i < size - 1; i++) {
					arr[i] = arr[i + 1];
				}

				arr[size-1] = k;
				rot--;
			}
			printArray(arr);
		}
	}

	private static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}