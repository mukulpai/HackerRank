package com.hackerRank.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class QuickSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();
		List<Integer> arr = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			arr.add(in.nextInt());
		}

		partitionArray(arr);

	}

	private static Collection<? extends Integer> partitionArray(List<Integer> arr) {

		if (arr.size() <= 1) {
			return arr;
		}
		List<Integer> leftList = new ArrayList<>();
		List<Integer> rightList = new ArrayList<>();
		List<Integer> newList = new ArrayList<>();
		// TODO Auto-generated method stub
		int pivot = arr.get(0);
		for (int i = 1; i < arr.size(); i++) {
			if (arr.get(i) < pivot) {
				leftList.add(arr.get(i));
			} else if (arr.get(i) > pivot) {
				rightList.add(arr.get(i));
			}
		}
		newList.addAll(partitionArray(leftList));
		newList.add(pivot);
		newList.addAll(partitionArray(rightList));

		for (int i = 0; i < newList.size(); i++) {
			System.out.print(newList.get(i) + " ");
		}
		System.out.println();
		return newList;

	}

}
