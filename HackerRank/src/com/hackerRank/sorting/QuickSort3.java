package com.hackerRank.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QuickSort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list;

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		list = new ArrayList(N);
		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		quickSort(list);
	}

	private static List<Integer> quickSort(List<Integer> list) {
		int size = list.size();
		if (size <= 1)
			return list;
		List<Integer> left = new ArrayList();
		List<Integer> right = new ArrayList();
		List<Integer> equal = new ArrayList();
		List<Integer> newList = new ArrayList();
		int pivot = list.get(0);
		for (int i = 1; i < size; i++) {
			int current = list.get(i);
			if (current < pivot)
				left.add(current);
			if (current > pivot)
				right.add(current);
			if (current == pivot)
				equal.add(current);
		}
		equal.add(pivot);
		newList.addAll(quickSort(left));
		newList.addAll(equal);
		newList.addAll(quickSort(right));
		System.out.println(Arrays.toString(newList.toArray()).replace("[", "").replace(",", "").replace("]", ""));
		return newList;
	}

}
