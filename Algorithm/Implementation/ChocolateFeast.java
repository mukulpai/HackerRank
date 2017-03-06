package com.hackerRank.implementation;

import java.util.Scanner;

public class ChocolateFeast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int tc = in.nextInt();

		for (int i = 0; i < tc; i++) {

			int chocs = in.nextInt();
			int pricePerChoc = in.nextInt();
			int wrapperTrade = in.nextInt();

			int chocCount = 0;
			int wrapperCollected = 0;
			
			chocCount = chocs / pricePerChoc;
			wrapperCollected = chocs / pricePerChoc;
			
			while (wrapperCollected > wrapperTrade) {
				int tempWrapper = wrapperCollected;
				wrapperCollected = wrapperCollected / wrapperTrade;
				int wrapperRemaining = tempWrapper % wrapperTrade;
				chocCount = chocCount + wrapperCollected;
				wrapperCollected = wrapperCollected + wrapperRemaining;
			}
			System.out.println(chocCount);
		}
	}

}
