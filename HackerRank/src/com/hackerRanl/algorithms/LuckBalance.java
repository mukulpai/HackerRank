package com.hackerRanl.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LuckBalance {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		int K = in.nextInt();
		int totalLuck = 0;
		int diff = 0;
		List<Integer> contestImportance1 = new ArrayList<Integer>();

		for (int i = 0; i < N; i++) {
			int amountOfLuck = in.nextInt();
			int contestImportanceRating = in.nextInt();

			totalLuck = totalLuck + amountOfLuck;

			if (contestImportanceRating == 1) {
				contestImportance1.add(amountOfLuck);
			}
		}

		Collections.sort(contestImportance1);

		int mustWinCount = contestImportance1.size() - K;

		for (int i = 0; i < mustWinCount; i++) {
			diff = diff + contestImportance1.get(i);
		}

		System.out.println(totalLuck - 2 * diff);

	}
}