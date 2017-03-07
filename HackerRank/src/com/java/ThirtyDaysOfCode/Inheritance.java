package com.java.ThirtyDaysOfCode;

import java.util.Scanner;

public class Inheritance extends Person {
	private int[] testScores;

	Inheritance(String firstName, String lastName, int identification, int score[]) {
		super(firstName, lastName, identification);

		this.testScores = score;

	}

	char calculate() {
		int sum = 0, avg = 0;
		for (int i = 0; i < testScores.length; i++) {
			sum = sum + testScores[i];
		}

		avg = sum / testScores.length;

		if (avg >= 90 && avg <= 100) {
			return 'O';
		} else if (avg >= 80 && avg < 90) {
			return 'E';
		} else if (avg >= 70 && avg < 80) {
			return 'A';
		} else if (avg >= 55 && avg < 70) {
			return 'P';
		} else if (avg >= 40 && avg < 55) {
			return 'D';
		} else if (avg < 40) {
			return 'T';
		}
		return 0;

	}

}
