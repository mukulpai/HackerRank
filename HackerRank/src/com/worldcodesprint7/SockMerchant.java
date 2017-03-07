package com.worldcodesprint7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SockMerchant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int numberOfSocks = in.nextInt();
		Map<Integer, Integer> sockMap = new HashMap<>();
		while (numberOfSocks != 0) {
			int nextInput = in.nextInt();
			if (sockMap.containsKey(nextInput)) {
				int sockColorCount = sockMap.get(nextInput);
				sockMap.put(nextInput, sockColorCount + 1);
				numberOfSocks--;
			} else {
				sockMap.put(nextInput, 1);
				numberOfSocks--;
			}

		}
		int count = 0;
		for (Map.Entry<Integer, Integer> entry : sockMap.entrySet()) {
			int quo = entry.getValue() / 2;
			if (quo > 0)
				count = count + quo;
		}
		System.out.println(count);
	}

}
