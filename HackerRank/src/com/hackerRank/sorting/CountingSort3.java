package com.hackerRank.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CountingSort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		List<Integer> list = new ArrayList<>();
		int[] arr = new int[101];
		int nextNum = 0;

		for (int i = 0; i < num; i++) {
			nextNum = in.nextInt();
			in.next();
			list.add(nextNum);
		}

		Collections.sort(list);
		int count = 0;

		for (int m = 0, j = 0; j < list.size() && m < 100; m++) {
			while (list.get(j) <= m) {
				count++;
				j++;
				if (j == list.size()) {
					break;
				}
			}
			arr[m] = count;
			count = 0;
			j = 0;

		}

		for (int k = 0; k < arr.length - 1; k++) {
			System.out.print(arr[k] + " ");
		}
	}

}
