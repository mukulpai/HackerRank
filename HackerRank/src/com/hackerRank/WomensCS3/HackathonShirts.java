package com.hackerRank.WomensCS3;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class HackathonShirts {

	public static void main(String[] args) {

		// Scanner in = new Scanner(System.in);
		//
		// int tc = in.nextInt();

		// for (int i = 0; i < tc; i++) {
		// int numOfParticipants = in.nextInt();
		//
		// // int[] shirtSizes = new int[numOfParticipants];
		// List<Integer> shirtSizes = new ArrayList<>();
		//
		// for (int m = 0; m < numOfParticipants; m++) {
		// shirtSizes.add(in.nextInt());
		// // shirtSizes[m] = in.nextInt();
		// }
		//
		// int numOfVendors = in.nextInt();
		// int count = 0;
		// for (int v = 0; v < numOfVendors; v++) {
		// int min = in.nextInt();
		// int max = in.nextInt();
		//
		// for (int l = 0; l < numOfParticipants; l++) {
		// if (shirtSizes.get(l) >= min && shirtSizes.get(l) <= max) {
		// count++;
		// shirtSizes.remove(l);
		// numOfParticipants--;
		// break;
		// }
		// }
		//
		// }
		// System.out.println(count);
		// }

		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			int n = in.nextInt();
			int[] sizes = new int[n];
			TreeMap<Integer, String> sizesMap = new TreeMap<Integer, String>();

			for (int sizes_i = 0; sizes_i < n; sizes_i++) {
				sizes[sizes_i] = in.nextInt();
				sizesMap.put(sizes[sizes_i], "");
			}

			int count = 0;
			SortedMap<Integer, String> treemap = new TreeMap<Integer, String>();

			int v = in.nextInt();
			for (int a1 = 0; a1 < v; a1++) {
				int smallest = in.nextInt();
				int largest = in.nextInt();
				treemap = new TreeMap<Integer, String>();
				treemap = sizesMap.subMap(smallest, largest + 1);
				int size = treemap.size();
				if (size > 0) {
					count += size;
					sizesMap.subMap(smallest, largest + 1).clear();
				}
			}

			System.out.println(count);
		}
	}
}
