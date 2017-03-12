package com.hackerRank.implementation;

import java.util.Scanner;

public class DrawingBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int pages = in.nextInt();

		int pageNumber = in.nextInt();
		boolean isBackward = false;

		if (pageNumber > (pages - pageNumber))
			isBackward = true;

		if (!isBackward) {
			System.out.println(pageNumber / 2);
		} else {
			System.out.println((pages - pageNumber) / 2);
		}
	}

}
