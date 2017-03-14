package com.hackerRank.DataStructures.LinkedList;

import java.util.Scanner;

public class LinkedList {

	static Node head;

	public Node append(int data) {
		if (head == null) {
			head = new Node(data);
			return head;
		}

		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
		return head;
	}

	public Node prepend(int data) {
		if (head == null) {
			head = new Node(data);
			return head;
		}
		Node current = new Node(data);
		current.next = head;
		head = current;
		return head;
	}

	public void read(Node head) {
		if (head == null) {
			System.out.println("Empty Link list");
		}

		Node current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
	}

	public Node delete(int data) {
		if (head.data == data) {
			head = head.next;
			return head;
		}
		Node current = head;
		while (current.next != null) {
			if (current.next.data == data) {
				current.next = current.next.next;
			}
			current = current.next;
		}
		return head;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int size = in.nextInt();
		LinkedList list = new LinkedList();
		// append
		// for (int i = 0; i < size; i++) {
		//
		// head = list.append(in.nextInt());
		// }

		for (int i = 0; i < size; i++) {

			head = list.prepend(in.nextInt());
		}

		list.delete(3);
		// read list
		list.read(head);

	}
}
