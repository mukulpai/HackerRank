package com.hackerRank.implementation;

import java.util.Scanner;

public class AlmostSorted {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int size = in.nextInt();

		int[] arr = new int[size];
		int[] arr2 = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = in.nextInt();
			arr2[i] = arr[i];
		}

		if (!checkSwapSort(arr))
			checkReverseSort(arr2);
	}

	private static boolean checkSwapSort(int[] arr) {
		int count = 0;
		boolean isSwap = false;
		int l = 0, r = 0;
		boolean isSorted = false;

		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
					isSorted = false;
					count++;
					l = i + 1;
					r = i + 2;
				}
			}
		}

		if (count == 1) {
			isSwap = true;
			System.out.println("yes");
			System.out.println("swap " + l + " " + r);
		}
		return isSwap;
	}

	private static void checkReverseSort(int[] arr) {
		int count = 0;
		int l = 1, r = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				int j = i;
				l = j;
				while (arr[j] < arr[j - 1]) {
					j++;
					count += 1;
				}

				r = j;
				i = j + 1;
			}
		}
		if (count == (r - l)) {
			System.out.println("yes");
			System.out.println("reverse " + l + " " + r);
		} else {
			System.out.println("no");
		}

	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}