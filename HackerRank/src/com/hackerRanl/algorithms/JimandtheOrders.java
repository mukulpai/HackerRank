package com.hackerRanl.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JimandtheOrders {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		int totalOrder = in.nextInt();

		List<Integer> totalTimeTakenArr = new ArrayList<Integer>();
		List<Integer> sortedArr = new ArrayList<Integer>();

		for (int i = 0; i < totalOrder; i++) {

			int orderPlacedAtTime = in.nextInt();
			int orderProcessTime = in.nextInt();

			totalTimeTakenArr.add(orderPlacedAtTime + orderProcessTime);
			sortedArr.add(orderPlacedAtTime + orderProcessTime);

		}

		Collections.sort(sortedArr);

		for (int j = 0; j < sortedArr.size(); j++) {
			int value = sortedArr.get(j);
			int index = totalTimeTakenArr.indexOf(value);
			System.out.print(index + 1 + " ");
			totalTimeTakenArr.set(index, 0);

		}
	}
}