package com.hackerRank.WeekOfCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.SliderUI;

public class Poles {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int poles = in.nextInt();
		int stacks = in.nextInt();

		int[] altitudeArr = new int[poles];
		int[] weightArr = new int[poles];
		List<Integer> maxIndex = new ArrayList<Integer>();
		int max = 0;
		int index = 0;
		int maxWeight = 0;
		for (int i = 0; i < poles; i++) {
			altitudeArr[i] = in.nextInt();
			int weight = in.nextInt();
			weightArr[i] = weight;
			if (weight > max) {
				max = weight;
				maxIndex.add(i);

			}
		}

		Collections.sort(maxIndex);
		int sum = 0;
		if (stacks == 1) {

			while (poles > 0) {
				sum = sum + (altitudeArr[poles - 1] - altitudeArr[0]) * weightArr[poles - 1];
				poles--;
			}
			System.out.println(sum);
		} else if (stacks > 1) {
			maxWeight = stacks - 1;
			int w = 1;
			while (maxWeight > 0) {
				index = maxIndex.get(maxIndex.size() - w);
				maxWeight--;
				w++;

				while (poles - 1 != index) {
					sum = sum + (altitudeArr[poles - 1] - altitudeArr[index]) * weightArr[poles - 1];
					poles--;
				}
			}
			sum = sum + (altitudeArr[index - 1] - altitudeArr[0]) * weightArr[index - 1];
			System.out.println(sum);

		}

	}

}
