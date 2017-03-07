package com.algorithm.search;

import java.util.Scanner;

public class ConnectedCell {

	static int[][] matrix;

	static int m, n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		m = in.nextInt();
		n = in.nextInt();
		matrix = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = in.nextInt();
			}
		}

		int large = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 1)
					large = Math.max(large, cells(i, j));
			}
		}
		System.out.println(large);
		in.close();
	}

	private static int cells(int i, int j) {
		// TODO Auto-generated method stub

		if ((i < 0 || j < 0) || (i >= m || j >= n) || matrix[i][j] == 0 || matrix[i][j] == -1)
			return 0;

		matrix[i][j] = -1;

		return 1 + cells(i - 1, j - 1) + cells(i - 1, j) + cells(i - 1, j + 1) + cells(i, j - 1) + cells(i, j + 1)
				+ cells(i + 1, j - 1) + cells(i + 1, j) + cells(i + 1, j + 1);
	}

}
