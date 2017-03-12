package com.hackerRank.DataStructures.TRIE;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NoPrefixSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		String name;
		String partial;
		Map<String, Integer> contact = new HashMap<>();
		for (int i = 0; i < n; i++) {
			name = in.next();

			// for (int a = 0; a < next.length(); a++) {
			// subS = next.substring(0, a + 1);
			//
			// if (prefixSet.contains(subS)) {
			// System.out.println("BAD SET");
			// System.out.println(next);
			// System.exit(0);
			// }
			// }

			for (int t = 0; t < name.length(); t++) {
				partial = name.substring(0, t + 1);

				if (contact.containsKey(partial)) {
					// int temp = contact.get(partial);
					// contact.put(partial, temp + 1);
					System.out.println("BAD SET");
					System.out.println(name);
					System.exit(0);
				} else {
					contact.put(partial, 1);
				}
			}
		}

		System.out.println("GOOD SET");
	}

}
