package com.hackerRank.implementation;

import java.util.Scanner;

public class BreakingRecords {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] score = new int[n];
		for (int score_i = 0; score_i < n; score_i++) {
			score[score_i] = in.nextInt();
		}
		int min = score[0];
		int hs = min;
		int ls = min;
		int countMax = 0;
		int countMin = 0;
		for (int score_i = 1; score_i < n; score_i++) {
			if (score[score_i] > hs) {
				countMax++;
				hs = score[score_i];
			} else if (score[score_i] < ls) {
				countMin++;
				ls = score[score_i];
			} else {
				continue;
			}

		}
		System.out.print(countMax + " " + countMin);
	}

}
