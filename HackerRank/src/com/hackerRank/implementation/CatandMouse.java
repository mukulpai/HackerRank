package com.hackerRank.implementation;

import java.util.Scanner;

public class CatandMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int tc = in.nextInt();

		for (int i = 0; i < tc; i++) {
			int catA = in.nextInt();
			int catB = in.nextInt();
			int mouse = in.nextInt();

			if (Math.abs(catA - mouse) > Math.abs(catB - mouse)) {
				System.out.println("Cat A");
			} else if (Math.abs(catA - mouse) > Math.abs(catB - mouse)) {
				System.out.println("Cat B");
			} else {
				System.out.println("Mouse C");
			}
		}

		in.close();
	}

}
