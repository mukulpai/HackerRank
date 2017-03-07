package com.java.strings;

import java.util.Scanner;

public class CeasarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		char[] c = in.next().toCharArray();
		int k = in.nextInt();
		char[] op = new char[num];
		for (int i = 0; i < num; i++) {
			int ascii = (int) c[i];
			if (ascii >= 65 && ascii <= 90) {
				if (ascii + (k % 26) >= 91) {
					op[i] = (char) (ascii + (k % 26) - 26);
				} else {
					op[i] = (char) (ascii + (k % 26));
				}
				System.out.print(op[i]);
			} else if (ascii >= 97 && ascii <= 122) {
				if (ascii + (k % 26) >= 123)

					op[i] = (char) (ascii + (k % 26) - 26);
				else
					op[i] = (char) (ascii + (k % 26));
				System.out.print(op[i]);
			} else {

				System.out.print(c[i]);
			}
		}

	}
}
