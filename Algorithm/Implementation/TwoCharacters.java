package com.practise.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TwoCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		char[] input = in.next().toCharArray();

		Arrays.sort(input);

		// count unique characters
		Map<Integer, List<Character>> charCount = countChar(input);

		
		System.out.println(charCount);
	}

	private static Map<Integer, List<Character>> countChar(char[] input) {
		int count = 1;
		Map<Integer, List<Character>> map = new HashMap<>();

		List<Character> list = new ArrayList<>();
		list.add(input[0]);
		for (int i = 0; i < input.length - 1; i++) {
			if (input[i] != input[i + 1]) {
				count++;
				list.add(input[i + 1]);
			}
		}
		map.put(count, list);
		return map;
	}
}
