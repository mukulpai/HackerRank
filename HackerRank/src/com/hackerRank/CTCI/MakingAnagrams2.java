package com.hackerRank.CTCI;

import java.util.Scanner;

public class MakingAnagrams2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}

	public static int numberNeeded(String first, String second) {
		//
		// String finalString = first + second;
		// char[] charArray = finalString.toCharArray();
		char[] c1 = first.toCharArray();
		char[] c2 = second.toCharArray();

		int[] arr = new int[26];

		for (int i = 0; i < c1.length; i++) {
			arr[c1[i] - 97]++;
		}

		for (int i = 0; i < c2.length; i++) {
			arr[c2[i] - 97]--;
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count = count + Math.abs(arr[i]);
		}
		return count;

	}

}
