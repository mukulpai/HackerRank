package com.hackerRank.implementation;

import java.util.Scanner;

public class CavityMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();
		char[][] arr = new char[size][size];

		for (int i = 0; i < size; i++) {
			in.nextLine();
			char[] temp = in.next().toCharArray();
			for (int j = 0; j < size; j++) {

				arr[i][j] = temp[j];
			}
		}

		for (int i = 1; i < size - 1; i++) {
			for (int j = 1; j < size - 1; j++) {

				int curr = arr[i][j];
				if (curr > arr[i][j - 1] && curr > arr[i][j + 1] && curr > arr[i - 1][j] && curr > arr[i + 1][j]) {
					arr[i][j] = 'X';
				}
			}

		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
