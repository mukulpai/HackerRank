package com.hackerRank.Statistics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MeanMedianMode {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		float num = in.nextFloat();
		int nextNum = 0;
		float[] arr = new float[(int) num];
		float sum = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < num; i++) {
			nextNum = in.nextInt();
			arr[i] = nextNum;
			sum = sum + nextNum;

			if (map.containsKey(nextNum)) {
				int count = map.get(nextNum);
				map.put(nextNum, count + 1);
			} else {
				map.put(nextNum, 1);
			}

		}
		float mean = sum / num;
		System.out.println(String.format("%.1f", mean));

		Arrays.sort(arr);
		float meadian = 0;
		float midValue = num / 2;
		if (num % 2 == 0) {
			meadian = (arr[(int) midValue] + arr[(int) ((num / 2) - 1)]) / 2;
		} else {
			meadian = arr[(int) ((num / 2) - 1)];

		}
		System.out.println(meadian);

		ArrayList<Integer> arrayList = new ArrayList<>();

		Iterator iterator = map.entrySet().iterator();
		int min = Collections.min(map.values());
		boolean flag = false;
		while (iterator.hasNext()) {
			Map.Entry entry = (Entry) iterator.next();

			if ((int) entry.getValue() > min) {
				min = (int) entry.getValue();
				arrayList.clear();
				arrayList.add((int) entry.getKey());
				flag = true;
			} else if ((int) entry.getValue() >= min) {
				arrayList.add((int) entry.getKey());
				flag = true;
			}
		}
		if (flag)
			System.out.println(Collections.min(arrayList));
		else
			System.out.println(Collections.min(map.keySet()));
	}
}
