package com.hackerRank.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PickingNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = in.nextInt();
		}

		Arrays.sort(arr);

		int count = 0;
		int max = 0;
		boolean f = false;
		for (int i = 0; i < size - 1; i++) {
			if (arr[i + 1] - arr[i] <= 1) {
				int j = i;
				while (j < size - 1 && arr[j + 1] - arr[i] <= 1) {
					count++;
					j++;
					f = true;
				}
				if (count > max) {
					max = count;

				}
				count = 0;
				i = j;
			}

		}
		if (f)
			System.out.println(max + 1);
		else
			System.out.println(0);
		in.close();
	}

}
