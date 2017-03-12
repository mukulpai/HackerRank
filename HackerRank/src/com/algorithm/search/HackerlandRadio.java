package com.algorithm.search;

import java.util.Arrays;
import java.util.Scanner;

public class HackerlandRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int numOfHouses = in.nextInt();
		int numOfRadio = in.nextInt();

		int[] arr = new int[numOfHouses];

		// Set<Integer> arr = new TreeSet<>();
		for (int i = 0; i < numOfHouses; i++) {
			arr[i] = in.nextInt();
		}

		// Object[] arr1 = arr.toArray();
		// int min = (int) arr1[0];
		// int max = (int) arr1[arr.size() - 1];
		Arrays.sort(arr);
		int numOfTransmitters = 0;
		int i = 0;
		while (i < numOfHouses) {
			numOfTransmitters++;
			int loc = arr[i] + numOfRadio;
			while (i < numOfHouses && arr[i] <= loc)
				i++;
			loc = arr[--i] + numOfRadio;
			while (i < numOfHouses && arr[i] <= loc)
				i++;
		}
		System.out.println(numOfTransmitters);
	}

}
