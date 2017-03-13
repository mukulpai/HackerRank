package com.hackerRank.implementation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HappyLadyBugs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int tc = in.nextInt();

		for (int i = 0; i < tc; i++) {
			int length = in.nextInt();

			char[] arr = in.next().toCharArray();
			Map<Character, Integer> map = new HashMap<>();
			for (int j = 0; j < length; j++) {
				if (map.containsKey(arr[j])) {
					int temp = map.get(arr[j]);
					map.put(arr[j], temp + 1);
				} else {
					map.put(arr[j], 1);
				}

			}

			Set<Entry<Character, Integer>> set = map.entrySet();

			Iterator<Entry<Character, Integer>> it = set.iterator();
			boolean isUnderscorepresent = false;
			boolean isAlphaPresent = false;
			int alphaCount = 0;
			while (it.hasNext()) {
				Entry<Character, Integer> t = it.next();
				if (t.getKey().equals('_') && t.getValue() >= 1) {
					isUnderscorepresent = true;
				} else {
					if (t.getValue() > 1) {
						isAlphaPresent = true;
						alphaCount++;
					} else {
						if (!isUnderscorepresent) {
							isAlphaPresent = false;
							break;
						} else {
							alphaCount++;
						}
					}
				}
			}

			if (isAlphaPresent && isUnderscorepresent) {
				System.out.println("YES");
			} else if (isUnderscorepresent && alphaCount == 0) {
				System.out.println("YES");
			} else if (isAlphaPresent && !isUnderscorepresent) {
				boolean isTrue = false;
				int count = 0;
				outer: for (int j = 0; j < length;) {
					if (j < length - 1) {
						while (j < length - 1 && arr[j] == arr[++j]) {
							count++;
						}
						if (count >= 1) {
							isTrue = true;
						} else {
							isTrue = false;
							break outer;
						}
					} else {
						break;
					}
				}
				if (isTrue) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			} else {
				System.out.println("NO");
			}
		}

	}

}
