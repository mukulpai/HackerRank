package com.hackerRank.Strings;

import java.util.Scanner;

public class CamelCase {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		char[] s = in.nextLine().toCharArray();
		int count = 0;

		if (s != null) {
			if (Integer.valueOf(s[0]) >= 97 && Integer.valueOf(s[0]) <= 122) {
				count = 1;
			}

			for (int i = 1; i < s.length; i++) {
				if (Integer.valueOf(s[i]) >= 65 && Integer.valueOf(s[i]) <= 90) {
					count++;
				}
			}
		} else {
			count = -1;
		}
		System.out.println(count);
		in.close();

	}
}

