package com.hackerRank.Strings;

import java.util.Scanner;

public class BeautifulBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		in.nextLine();
		String s1 = in.nextLine();
		int count = 0;
		for (int i = 0; i < s1.length() - 2; i++) {

			if (s1.charAt(i) != 'S') {
				count++;
			}
			if (s1.charAt(i + 1) != '0') {
				count++;
			}
			if (s1.charAt(i + 2) != 'S') {
				count++;
			}
			i = i + 2;
		}

		System.out.println(count);
		in.close();
	}

}
