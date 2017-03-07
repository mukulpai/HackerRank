package com.hackerRank.sorting;

import java.util.Scanner;

public class InsertionSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = in.nextInt();
		}

		int key = arr[size - 1];

		for (int j = size - 2; j >= 0; j--) {
			if (arr[j] >= key) {
				arr[j + 1] = arr[j];
			} else {
				arr[j + 1] = key;
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

	private static void printArray(int[] arr) {
		
	}

}
