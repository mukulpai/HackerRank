package com.hackerRank.implementation;

import java.util.Scanner;

public class JumpOnCloudsRevisited {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int k = in.nextInt();
		int energy = 100;
		boolean flag = true;
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = in.nextInt();
		}
		int next, j = 0;
		int head = j;
		while (flag) {

			j = j + k;
			next = (j) % num;

			if (head != next) {
				if (arr[next] == 1) {
					energy = energy - 3;
				} else {
					energy--;
				}
			} else {
				flag = false;
				if (arr[next] == 1) {
					energy = energy - 3;
				} else {
					energy--;
				}
			}

		}
		System.out.println(energy);
	}
}
