package com.hackerRank.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class MakeMaxPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		int changes = in.nextInt();
		in.nextLine();
		char[] s = in.nextLine().toCharArray();

		for (int i = 0; i < num / 2; i++) {
			if (!(s[i] == s[num - i - 1])) {
				if (changes > 0) {
					if (s[i] != '9') {
						s[i] = '9';
						changes--;
					}
					if (s[num - i - 1] != '9') {
						s[num - i - 1] = '9';
						changes--;
					}
				} else {
					System.out.println(-1);
					System.exit(0);
				}
			}
		}
		for (int i = 0; i < num; i++) {
			System.out.print(s[i]);
		}
	}

}
