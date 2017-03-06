package com.hackerRank.implementation;

import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		boolean flag = true;
		if ((v2 <= v1) && ((x1 - x2) % (v2 - v1) == 0)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
