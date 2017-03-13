package com.hackerRank.implementation;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class TheTimeInWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dictionary<Integer, String> dict = new Hashtable<>();
		dict.put(00, "o' clock");
		dict.put(01, "one");
		dict.put(02, "two");
		dict.put(03, "three");
		dict.put(04, "four");
		dict.put(05, "five");
		dict.put(06, "six");
		dict.put(07, "seven");
		dict.put(8, "eight");
		dict.put(9, "nine");
		dict.put(10, "ten");
		dict.put(11, "eleven");
		dict.put(12, "twelve");
		dict.put(13, "thirteen");
		dict.put(14, "fourteen");
		dict.put(15, "quarter past");
		dict.put(16, "sixteen");
		dict.put(17, "seventeen");
		dict.put(18, "eighteen");
		dict.put(19, "nineteen");
		dict.put(20, "twenty");
		dict.put(21, "twenty one");
		dict.put(22, "twenty two");
		dict.put(23, "twenty three");
		dict.put(24, "twenty four");
		dict.put(25, "twenty five");
		dict.put(26, "twenty six");
		dict.put(27, "twenty seven");
		dict.put(28, "twenty eight");
		dict.put(29, "twenty nine");
		dict.put(30, "half past");
		dict.put(45, "quarter to");
		dict.put(59, "one minute to");

		Scanner in = new Scanner(System.in);
		int hour = in.nextInt();
		int min = in.nextInt();

		if (min >= 1 && min <= 30) {
			if (min == 15 || min == 30)
				System.out.println(dict.get(min) + " " + dict.get(hour));
			else if (min == 1)
				System.out.println(dict.get(min) + " minute past " + dict.get(hour));
			else
				System.out.println(dict.get(min) + " minutes past " + dict.get(hour));
		} else if (min > 30 && min <= 59) {
			if (min == 45 || min == 59) {
				System.out.println(dict.get(min) + " " + dict.get((hour + 1) % 12));
			} else {
				min = 60 - min;
				System.out.println(dict.get(min) + " minutes to " + dict.get(hour + 1));
			}
		} else if (min == 45) {
			System.out.println(dict.get(min) + " " + dict.get(hour + 1));
		} else if (min == 0) {
			System.out.println(dict.get(hour) + " " + dict.get(min));
		}
		in.close();
	}

}
