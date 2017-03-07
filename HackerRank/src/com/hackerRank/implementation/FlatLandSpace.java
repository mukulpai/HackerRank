package com.hackerRank.implementation;

import java.util.Scanner;

public class FlatLandSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int citySize = in.nextInt();
		int stationCount = in.nextInt();
		int[] sarr = new int[stationCount];
		for (int i = 0; i < stationCount; i++) {
			sarr[i] = in.nextInt();
		}
		int result, large = 0;
		if (citySize != stationCount) {

			for (int i = 0; i < citySize; i++) {
				result = Math.abs(i - sarr[0]);
				for (int j = 0; j < stationCount; j++) {

					if (Math.abs(i - sarr[j]) < result) {
						result = Math.abs(i - sarr[j]);
					}
				}
				if (large < result)
					large = result;
			}
			System.out.println(large);
		} else {
			System.out.println(0);
		}
	}

}
