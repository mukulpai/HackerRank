package com.hackerRank.implementation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NonDivisibleSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		int k = in.nextInt();
		int[] arr = new int[num];
		Set<Integer> integers = new HashSet<>();
		for (int i = 0; i < num; i++) {
			arr[i] = in.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				sum = arr[i] + arr[j];
				if (sum >= k && sum % k != 0) {
					integers.add(arr[i]);
					integers.add(arr[j]);
				}
			}
		}
		System.out.println(integers.size());
	}

}
