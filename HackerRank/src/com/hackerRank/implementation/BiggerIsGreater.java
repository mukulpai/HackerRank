package com.hackerRank.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class BiggerIsGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int tc = in.nextInt();

		for (int t = 0; t < tc; t++) {
			int largestI = -1;
			int largestJ = -1;
			in.nextLine();
			char[] nextArr = in.next().toCharArray();

			for (int i = 0; i < nextArr.length - 1; i++) {
				if (nextArr[i] < nextArr[i + 1]) {
					largestI = i;
				}
			}

			if (largestI == -1) {
				System.out.println("no answer");
			} else {
				for (int j = 0; j < nextArr.length; j++) {
					if (nextArr[largestI] < nextArr[j]) {
						largestJ = j;
					}
				}
				nextArr = swap(nextArr, largestI, largestJ);

				reverse(nextArr, largestI + 1);
			}

		}

	}

	private static void reverse(char[] nextArr, int i) {
		// TODO Auto-generated method stub
		String newChar = new StringBuilder(String.valueOf(nextArr).substring(i)).reverse().toString();
		String newChar2 = new StringBuilder(String.valueOf(nextArr).substring(0, i)).toString();

		System.out.println(newChar2 + newChar);
	}

	private static char[] swap(char[] nextArr, int largestI, int largestJ) {
		// TODO Auto-generated method stub
		char temp = nextArr[largestI];
		nextArr[largestI] = nextArr[largestJ];
		nextArr[largestJ] = temp;
		return nextArr;
	}

}
