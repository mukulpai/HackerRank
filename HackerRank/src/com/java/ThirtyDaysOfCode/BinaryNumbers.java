package com.java.ThirtyDaysOfCode;

import java.util.Scanner;

public class BinaryNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int decNum = in.nextInt();

		int count = calculateBinary(decNum);
		in.close();
		System.out.println(count);
	}

	private static int calculateBinary(int decNum) {

		int count = 0, temp = 0, rem;

		while (decNum >= 1) {
			rem = decNum % 2;
			decNum = decNum / 2;
			// stringBuilder.append(rem);
			if (rem == 1) {
				count++;
				if (count >= temp) {
					temp = count;
				}
			} else {
				count = 0;
			}
		}
		// stringBuilder.reverse();
		//
		// for (int i = 1; i < stringBuilder.length(); i++) {
		// if
		// (String.valueOf(1).equals((String.valueOf(stringBuilder.charAt(i))))
		// && (stringBuilder.charAt(i) == stringBuilder.charAt(i - 1))) {
		// temp++;
		// } else if (temp > count) {
		// count = temp;
		// temp = 1;
		// }
		// }
		//
		// if (temp > count)
		// count = temp;
		return count;

	}

}
