package com.hackerRank.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ACMICPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int numOfPeople = in.nextInt();
		int topics = in.nextInt();

		Map<Integer, Integer> map = new HashMap<>();
		List<char[]> characters = new ArrayList<>();
		for (int i = 0; i < numOfPeople; i++) {
			in.nextLine();
			characters.add(in.next().toCharArray());
		}

		int max = 0;
		int sum = 0;

		for (int i = 0; i < numOfPeople; i++) {
			char[] arr1 = characters.get(i);

			for (int k = i + 1; k < numOfPeople; k++) {
				char[] arr2 = characters.get(k);

				for (int j = 0; j < topics; j++) {
					sum = sum + (Integer.valueOf(String.valueOf(arr1[j])) | Integer.valueOf(String.valueOf(arr2[j])));
				}

				if (map.containsKey(sum)) {
					int temp = map.get(sum);
					map.put(sum, temp + 1);

				} else {
					map.put(sum, 1);
				}
				sum = 0;
			}
		}

		Set<Integer> integers = map.keySet();
		System.out.println(Collections.max(integers));
		System.out.println(map.get(Collections.max(integers)));

	}

}
