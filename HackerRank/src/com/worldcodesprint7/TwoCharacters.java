package com.worldcodesprint7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class TwoCharacters {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int stringlength = in.nextInt();
		in.nextLine();
		StringBuilder s = new StringBuilder(in.nextLine());
		Map<Character, Integer> map = new HashMap<>();
		String op = null;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				op = s.toString().replaceAll(String.valueOf(s.charAt(i)), "");
				i = 1;
				s = new StringBuilder(op);
			}
		}
		int tempLength = 0;
		for (int i = 0; i < s.length(); i++) {
			char tempChar = s.toString().charAt(i);

			op = s.toString().replaceAll(String.valueOf(tempChar), "");

			if (op.length() > tempLength) {
				tempLength = op.length();
			}
		}
		System.out.println(tempLength);
		// for (int i = 0; i < s.length(); i++) {
		// if (map.containsKey(op.charAt(i))) {
		// int count = map.get(op.charAt(i));
		// map.put(op.charAt(i), count + 1);
		// } else {
		// map.put(op.charAt(i), 1);
		// }
		// }

		// Iterator iterator = map.entrySet().iterator();
		// int min = Collections.min(map.values());
		// int sum = 0;
		// while (iterator.hasNext()) {
		// Map.Entry<Character, Integer> entrySet = (Entry<Character, Integer>)
		// iterator.next();
		//
		// if (entrySet.getValue() > min) {
		// sum = sum + entrySet.getValue();
		// } else {
		// map.remove(entrySet.getKey());
		// break;
		// }
		// }

		// System.out.println(sum);
	}
}