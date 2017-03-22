package com.hackerRank.WeekOfCode;

import java.util.Scanner;

public class MinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int num = in.nextInt();

		StringBuilder output = new StringBuilder();

		for (int i = 0; i < num - 1; i++) {
			output.append("min(int, ");
		}
		output.append("int");
		for (int i = 0; i < num - 1; i++) {
			output.append(")");
		}
		System.out.println(output.toString());
	}

}
