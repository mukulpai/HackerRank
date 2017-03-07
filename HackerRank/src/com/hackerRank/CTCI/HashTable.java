package com.hackerRank.CTCI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashTable {

	Map<String, Integer> magazineMap;
	Map<String, Integer> noteMap;

	public HashTable(String magazine, String note) {
		magazineMap = new HashMap<>();
		noteMap = new HashMap<>();
		String[] s1 = magazine.split(" ");
		String[] s2 = note.split(" ");

		for (int i = 0; i < s1.length; i++) {
			magazineMap.put(s1[i], 1);
		}

		for (int i = 0; i < s2.length; i++) {
			noteMap.put(s2[i], 1);
		}

	}

	public boolean solve() {
		for (String k : magazineMap.keySet()) {
			if (noteMap.containsKey(k)) {
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();

		// Eat whitespace to beginning of next line
		scanner.nextLine();

		HashTable s = new HashTable(scanner.nextLine(), scanner.nextLine());
		scanner.close();

		boolean answer = s.solve();
		if (answer)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
