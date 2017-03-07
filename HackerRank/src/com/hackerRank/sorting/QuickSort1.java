package com.hackerRank.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuickSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();

		int[] arr = new int[size];

		List<Integer> leftList = new ArrayList<>();
		List<Integer> rightList = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			arr[i] = in.nextInt();
		}

		int pivot = arr[0];

		for (int i = 0; i < size; i++) {
			if (arr[i] < pivot) {
				leftList.add(arr[i]);
			} else if (arr[i] > pivot) {
				rightList.add(arr[i]);
			}
		}
		int index = 0;
		for (int i = 0; i < leftList.size(); i++) {
//			arr[index++] = leftList.get(i);
			System.out.print(leftList.get(i) + " ");
		}
		System.out.print(pivot + " ");
		for (int i = 0; i < rightList.size(); i++) {
			System.out.print(rightList.get(i) + " ");
		}

	}

}
