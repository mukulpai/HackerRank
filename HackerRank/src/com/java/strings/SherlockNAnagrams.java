package com.java.strings;

import java.util.Scanner;

public class SherlockNAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int tc = in.nextInt();
		int count = 0;

		for (int m = 0; m < tc; m++) {
			String s = in.next();
			in.nextLine();
			for (int len = 1; len < s.length(); len++) {
				char[] chararr1 = new char[100];
				char[] chararr2 = new char[100];

				for (int i = 0; i < s.length() - len; i++) {
					chararr1 = s.substring(i, i + len).toCharArray();

					for (int j = i + 1; j < s.length() - len + 1; j++) {
						chararr2 = s.substring(j, j + len).toCharArray();

						if (isAnagram(chararr1, chararr2)) {
							count++;
						}
					}
				}

			}

		}

		System.out.println(count);
	}

	private static boolean isAnagram(char[] chararr1, char[] chararr2) {

		int[] charCount1 = new int[26];
		int[] charCount2 = new int[26];

		for (int c = 0; c < chararr1.length; c++) {
			charCount1[chararr1[c] - 'a']++;
		}

		for (int c = 0; c < chararr2.length; c++) {
			charCount2[chararr2[c] - 'a']++;
		}

		for (int c = 0; c < 25; c++) {
			if (charCount1[c] != charCount2[c])
				return false;
		}

		return true;
	}

}
