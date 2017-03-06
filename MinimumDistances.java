package com.hackerRank.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MinimumDistances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();
		int nextNum = 0;
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> integers = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			nextNum = in.nextInt();
			if (map.containsKey(nextNum)) {
				int temp = map.get(nextNum);
				integers.add(Math.abs(temp - nextNum));
			} else {
				map.put(nextNum, i);
			}
		}
		if (!integers.isEmpty())
			System.out.println(Collections.min(integers));
		else{
			System.out.println(-1);
		}
	}

}
