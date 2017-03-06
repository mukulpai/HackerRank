package com.hackerRank.implementation;

import java.util.Scanner;

public class JumpOnClouds {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int count = 0;
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = in.nextInt();
		}

		for (int j = 0; j < arr.length;) {
			if (arr[j] == 0) {
				count++;
				if (j + 2 >= arr.length) {
					j = j + 1;
				} else {
					j = j + 2;
				}
			} else {
				j = j + 1;
				count++;
			}
		}
		System.out.println(count);
	}
}
