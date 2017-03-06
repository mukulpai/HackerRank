package com.hackerRank.implementation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ManasaAndStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int tc = in.nextInt();
		for (int i = 0; i < tc; i++) {

			int size = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			SortedSet<Integer> integers = new TreeSet<>();

			for (int j = 0; j < size; j++) {
				integers.add(a * (size - 1 - j) + (b * j));
			}

			for (Integer e : integers) {
				System.out.println(e + " ");
			}
			System.out.println();
		}
	}

}
