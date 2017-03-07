package com.hackerRank.sorting;

import java.util.Scanner;

public class InsertionSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertionSortPart2(ar);

	}

	public static void insertionSortPart2(int[] ar) {
		int count = 0;
		for (int i = 1; i < ar.length; i++) {

			int value = ar[i];
			int temp = i;

			while (temp > 0 && ar[temp - 1] > value) {
				ar[temp] = ar[temp - 1];
				temp = temp - 1;
				count++;
			}
			ar[temp] = value;

		}
		System.out.println(count);  

	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
