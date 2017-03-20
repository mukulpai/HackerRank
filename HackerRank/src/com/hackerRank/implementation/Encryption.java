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

		float rootLength = (float) Math.sqrt(textLength);

		int row = (int) Math.floor(rootLength);
		int column = (int) Math.ceil(rootLength);

		while (row * column < textLength) {
			if (row < column) {
				row = row + 1;
			} else
				column = column + 1;
		}

		char[][] arr = new char[row][column];

		int c = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (c < textLength)
					arr[i][j] = text.charAt(c++);
			}
		}
		c = 0;
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++) {
				if ((int) arr[j][i] != 0) {
					output.append(arr[j][i]);
					c++;
				}

			}
			if (c < textLength)
				output.append(" ");
		}
		System.out.println(output.toString());
	}

}
