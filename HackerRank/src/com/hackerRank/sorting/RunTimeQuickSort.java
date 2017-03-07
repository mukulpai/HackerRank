package com.hackerRank.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunTimeQuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();

		List<Integer> arr = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			arr.add(in.nextInt());
		}
		int count = 0;
		quickSort(arr, count);
		System.out.println(count);

	}

	private static List<Integer> quickSort(List<Integer> arr, int count) {
		// TODO Auto-generated method stub
		int size = arr.size();
		if (size < 2) {
			return arr;
		}

		List<Integer> leftArr = new ArrayList<>();
		List<Integer> rightArr = new ArrayList<>();
		List<Integer> integers = new ArrayList<>();

		int pivot = arr.get(size - 1);

		for (int i = 0; i <= size - 2; i++) {
			if (arr.get(i) < pivot) {
				leftArr.add(arr.get(i));
				count++;
			} else {
				rightArr.add(arr.get(i));
				count++;
			}
		}
		System.out.println(count);
		// integers.addAll(quickSort(leftArr, count));
		// integers.add(pivot);
		// integers.addAll(quickSort(rightArr, count));

		integers.addAll(quickSort(leftArr, count));
		integers.add(pivot);
		integers.addAll(quickSort(rightArr, count));
		
		System.out.println(count);
		// for (int j = 0; j < integers.size(); j++) {
		// System.out.print(integers.get(j) + " ");
		// }

		// System.out.println();
		return integers;

	}
}
