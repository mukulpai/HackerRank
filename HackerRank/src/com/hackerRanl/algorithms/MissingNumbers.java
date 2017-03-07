package com.hackerRanl.algorithms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int sizeA = in.nextInt();
		Map<Integer, Integer> mapA = new HashMap<>();
		Map<Integer, Integer> mapB = new HashMap<>();
		for (int i = 0; i < sizeA; i++) {
			int num1 = in.nextInt();
			if (mapA.containsKey(num1)) {
				int count = mapA.get(num1);
				mapA.put(num1, count + 1);
			} else {
				mapA.put(num1, 1);
			}
		}

		int sizeB = in.nextInt();

		for (int i = 0; i < sizeB; i++) {
			int num2 = in.nextInt();

			if (mapB.containsKey(num2)) {
				int count = mapB.get(num2);
				mapB.put(num2, count + 1);
			} else {
				mapB.put(num2, 1);
			}
		}

		Iterator iteratorB = mapB.entrySet().iterator();
	

		while (iteratorB.hasNext()) {

			Entry<Integer, Integer> pairB = (Entry<Integer, Integer>) iteratorB.next();
			Iterator iteratorA = mapA.entrySet().iterator();
			while (iteratorA.hasNext()) {
				Entry<Integer, Integer> pairA = (Entry<Integer, Integer>) iteratorA.next();
				if (pairA.getKey().equals(pairB.getKey())) {
					if (pairB.getValue() > pairA.getValue()) {
						System.out.print(pairB.getKey() + " ");
					}
				}
			}

		}
	}
}
