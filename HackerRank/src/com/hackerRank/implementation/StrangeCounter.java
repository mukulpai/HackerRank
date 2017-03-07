package com.hackerRank.implementation;

import java.util.Scanner;

public class StrangeCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();

		long timep = 3;

		while (t > timep) {
			timep = (timep * 2) + 3;
		}
		long op = (timep - t) + 1;
		System.out.println(op);
	}

}
