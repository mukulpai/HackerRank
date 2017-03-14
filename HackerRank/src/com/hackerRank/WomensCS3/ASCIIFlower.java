package com.hackerRank.WomensCS3;

import java.util.Scanner;

public class ASCIIFlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int r = in.nextInt();
		int c = in.nextInt();

		StringBuilder row = new StringBuilder("..O..");
		StringBuilder row2 = new StringBuilder("O.o.O");

		for (int k = 0; k < r; k++) {
			for (int m = 0; m < c; m++) {
				System.out.print(row.toString());
			}
			System.out.println();
			for (int m = 0; m < c; m++) {
				System.out.print(row2.toString());
			}
			System.out.println();
			for (int m = 0; m < c; m++) {
				System.out.print(row.toString());
			}
			System.out.println();
		}

	}

}
