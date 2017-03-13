package com.hackerRank.DataStructures.LinkedList;

import java.util.Scanner;

public class InsertElements {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int size = in.nextInt();

		for (int i = 0; i < size; i++) {
			Node head = new Node(i);
			head = head.insertElements(in.nextInt());
		}
	}
}
