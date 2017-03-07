package com.java.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringConstruction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int tc = in.nextInt();

		for (int i = 0; i < tc; i++) {
			char[] c = in.next().toCharArray();
			Set<Character> charactes = new HashSet<>();

			for (char curr : c) {
				charactes.add(curr);
			}

			System.out.println(charactes.size());

		}
		in.close();
	}

}
