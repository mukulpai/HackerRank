package com.hackerRank.DataStructures.TRIE;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contacts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		String nextOp;
		String name;
		String partial;
		Map<String, Integer> contact = new HashMap<>();
		for (int i = 0; i < num; i++) {
			nextOp = in.next();

			if (nextOp.equals("add")) {
				name = in.next();
				for (int n = 0; n < name.length(); n++) {
					partial = name.substring(0, n + 1);

					if (contact.containsKey(partial)) {
						int temp = contact.get(partial);
						contact.put(partial, temp + 1);
					} else {
						contact.put(partial, 1);
					}
				}
			} else {
				name = in.next();
				if (contact.containsKey(name)) {
					System.out.println(contact.get(name));
				} else {
					System.out.println(0);
				}
			}
		}
	}

}
