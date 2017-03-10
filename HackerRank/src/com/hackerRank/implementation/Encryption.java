package com.hackerRank.implementation;

import java.util.Scanner;

public class Encryption {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String text = in.nextLine();

		int textLength = text.length();

		double column = Math.floor(Math.sqrt(textLength));
		double row = Math.ceil(Math.sqrt(textLength));

		char[][] arr = new char[(int) row][(int) column];

		int c = 0;
		for (int i = 0; i < (int) row; i++) {
			for (int j = 0; j < (int) column; j++) {
				if (c < textLength)
					arr[i][j] = text.charAt(c++);
			}
		}

		for (int i = 0; i < (int) column; i++) {
			for (int j = 0; j < (int) row; j++) {
				System.out.print(arr[j][i]);
			}
			System.out.print(" ");
		}
	}

}
