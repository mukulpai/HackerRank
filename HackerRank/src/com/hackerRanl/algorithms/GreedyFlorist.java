package com.hackerRanl.algorithms;

import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class GreedyFlorist {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		int numOfFlowersToPurchase = in.nextInt();

		int numOfFriends = in.nextInt();
		int sum = 0;

		List<Integer> flowersCost = new ArrayList<Integer>();

		for (int i = 0; i < numOfFlowersToPurchase; i++) {
			flowersCost.add(in.nextInt());
		}
		if (numOfFlowersToPurchase != numOfFriends) {
			Collections.sort(flowersCost);

			for (int i = 0, j = flowersCost.size() - numOfFriends; j >= 0; j--) {
				int flowerPrice = flowersCost.get(j);
				sum = sum + (i++ + 1) * flowerPrice;
			}

			for (int i = numOfFriends; i < numOfFlowersToPurchase; i++) {
				sum = sum + flowersCost.get(i);
			}
		} else {
			for (int i = 0; i < flowersCost.size(); i++) {
				sum = sum + flowersCost.get(i);
			}
		}
		System.out.println(sum);
	}
}