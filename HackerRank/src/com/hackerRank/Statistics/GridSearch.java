package com.hackerRank.Statistics;

import java.util.Scanner;

public class GridSearch {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		int testCase = in.nextInt();

		for (int i = 0; i < testCase; i++) {

			int ROW = in.nextInt();
			int COL = in.nextInt();

			boolean patternMatch = false;

			int[][] arrBig = new int[ROW][COL];

			arrBig = createArray(ROW, COL, arrBig, in);

			int row = in.nextInt();
			int col = in.nextInt();

			int[][] arrSmall = new int[row][col];
			arrSmall = createArray(row, col, arrSmall, in);

			int firstElement = arrSmall[0][0];

			for (int k = 0; k < ROW; k++) {
				for (int l = 0; l < COL; l++) {
					if (arrBig[k][l] == firstElement && k <= ROW - row && l <= COL - col) {
						if (patternMatch(k, l, row, col, arrBig, arrSmall)) {
							patternMatch = true;
							break;
						} else {
							continue;
						}
					}
				}
			}

			if (patternMatch)
				System.out.println("YES");
			else
				System.out.println("NO");

		}

	}

	private static int[][] createArray(int row, int col, int arr[][], Scanner in) {
		in.nextLine();

		for (int m = 0; m < row; m++) {
			char[] nextIntArr = in.next().toCharArray();
			for (int n = 0; n < col; n++) {
				arr[m][n] = Integer.parseInt(String.valueOf(nextIntArr[n]));
			}
		}

		return arr;
	}

	private static boolean patternMatch(int ROW, int COL, int row, int col, int arrBig[][], int arrSmall[][]) {
		boolean flag = false;
		outerloop: for (int m = ROW, a = 0; m < ROW + row; m++, a++) {
			for (int n = COL, b = 0; n < COL + col; n++, b++) {
				if (arrBig[m][n] == arrSmall[a][b]) {
					flag = true;
					continue;
				} else {
					flag = false;
					break outerloop;
				}
			}
		}
		return flag;
	}
}