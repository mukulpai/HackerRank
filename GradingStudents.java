package com.hackerRank.implementation;

import java.util.Scanner;

public class GradingStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int numOfStudents = in.nextInt();

		int initialGrade = 0;
		int remainder = 0;
		int diff = 0;
		for (int i = 0; i < numOfStudents; i++) {
			initialGrade = in.nextInt();

			if (initialGrade >= 38) {
				remainder = initialGrade % 5;
				diff = 5 - remainder;

				if (diff < 3) {
					initialGrade = initialGrade + diff;
				}

				System.out.println(initialGrade);
			} else {
				System.out.println(initialGrade);
			}

		}
		in.close();
	}

}
