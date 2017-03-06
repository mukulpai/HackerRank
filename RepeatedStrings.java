package com.hackerRank.implementation;

import java.util.Scanner;

public class RepeatedStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		long n = in.nextLong();
		long count = 0;

		if (s.length() == 1 && s.charAt(0) == 'a') {
			System.out.println(n);
		} else {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'a') {
					count++;
				}
			}

			long num = n / s.length();
			count = count * num;

			for (int i = 0; i < n % s.length(); i++) {
				if (s.charAt(i) == 'a') {
					count++;
				}
			}
			System.out.println(count);
		}

		in.close();

	}

}
