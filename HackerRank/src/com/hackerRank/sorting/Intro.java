package com.hackerRank.sorting;

import java.util.Scanner;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int key = in.nextInt();

		int arrSize = in.nextInt();

		for (int i = 0; i < arrSize; i++) {
			if (in.nextInt() == key) {
				System.out.println(i);
			}
		}
	}

}
