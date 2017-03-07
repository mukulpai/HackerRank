package com.hackerRank.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BeautifulTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int size = in.nextInt();
		int k = in.nextInt();
		List<Integer> integers = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			integers.add(in.nextInt());
		}
		int count = 0;
		for (int i = 0; i < size; i++) {
			int temp1 = integers.get(i) + k;
			int temp2 = temp1 + k;

			if (integers.contains(temp1) && integers.contains(temp2)) {
				count++;
			}
		}

		System.out.println(count);
	}

}
