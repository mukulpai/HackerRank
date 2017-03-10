package com.hackerRank.implementation;

import java.util.Scanner;

public class AppendDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String s = in.nextLine();
		String t = in.nextLine();
		int k = in.nextInt();
		int count = 0;

		if (s.equals(t)) {
			if ((s.length() + t.length() + 1) % k == 0)
				System.out.println("Yes");
			else
				System.out.println("No");
		} else {
			char[] sChar = s.toCharArray();
			char[] tChar = t.toCharArray();

			if (s.length() > t.length()) {
				count = s.length() - t.length();

				for (int i = 0; i < t.length(); i++) {
					if (sChar[i] == tChar[i]) {
						continue;
					} else {
						count = count + ((t.length() - i) * 2);
						break;
					}
				}

				if (k == count) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}

			} else if (s.length() < t.length()) {

				count = t.length() - s.length();

				for (int i = 0; i < s.length(); i++) {
					if (sChar[i] == tChar[i]) {
						continue;
					} else {
						count = count + ((s.length() - i) * 2);
						break;
					}
				}

				if (k == count || k % count == 0) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}

		}

	}

}
