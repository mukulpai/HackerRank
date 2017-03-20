package com.hackerRank.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MigratingBirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		int arr[] = new int[6];

		for (int i = 0; i < num; i++) {
			int nextNum = in.nextInt();
			arr[nextNum] = arr[nextNum] + 1;
		}

		int max = 0;
		int output = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int j = 1; j < arr.length; j++) {
			if (arr[j] >= max) {
				max = arr[j];
				if (map.containsKey(max)) {
					if (map.get(max) < j)
						output = map.get(max);

				} else {
					map.put(max, j);
					output = j;
				}
			}
		}
		System.out.println(output);
		in.close();
	}

}
