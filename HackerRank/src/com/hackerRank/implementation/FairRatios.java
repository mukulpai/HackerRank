package com.hackerRank.implementation;

import java.util.Scanner;

public class FairRatios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = in.nextInt();
		}
		int count = 0;
		for (int i = 0; i < size;) {
			if (arr[i] % 2 == 0) {
				i++;
			} else {

				if (!(i + 1 == size)) {
					arr[i] = arr[i] + 1;
					arr[i + 1] = arr[i + 1] + 1;
					count = count + 2;
					
				}
				i++;
			}
		}

		if (arr[size - 1] % 2 == 0) {
			System.out.println(count);
		} else {
			System.out.println("NO");
		}
	}

}
