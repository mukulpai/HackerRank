package com.hackerRank.DataStructures.LinkedList;

import java.util.ArrayList;
import java.util.List;
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
		System.out.println("Read end");
		System.out.println("");
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

	public Node runnerExecution(Node head) {
		if (head == null) {
			return head;
		}
		Node current = head;
		Node runner = head.next.next;
		Node temp;
		while (runner != null) {
			runner = runner.next.next;
			current = current.next;
		}

		runner = head;

		while (current.next != null) {
			temp = runner.next;
			runner.next = current.next;
			runner.next.next = temp;
			current = current.next;
			runner = temp;
		}
		return head;

	}

	public Node reverse(Node head) {

		if (head == null || head.next == null) {
			return head;
		}

		Node remaining = reverse(head.next);

		head.next.next = head;
		head.next = null;

		return remaining;
	}

	boolean hasCycle(Node head) {
		List<Node> list = new ArrayList<>();
		if (head == null) {
			return false;
		}

		while (head.next != null) {
			if (list.contains(head)) {
				return true;
			} else {
				list.add(head);
				head = head.next;
			}
		}
		return false;
	}

	public Node RemoveDuplicates(Node head) {
		if (head == null) {
			return head;
		}
		while (head.data == head.next.data) {
			if (head.next.next == null) {
				head.next = head.next.next;
				return head;
			} else {
				head.next = head.next.next;
			}
		}

		Node current = head;
		while (current.next != null) {
			if (current.next.next != null && current.next.data == current.next.next.data) {
				current.next = current.next.next;
				current = current.next;
			} else {
				current = current.next;
			}
		}
		return head;
	}

	public void palindrome(Node head, Node tail) {

		if (head == null || tail == null) {
			return;
		}

		boolean flag = true;

		while (head != null && tail != null) {
			if (head.data != tail.data) {
				flag = false;
			}
			head = head.next;
			tail = tail.next;
		}

		if (flag) {
			System.out.println("PALINDROME!!");
		} else {
			System.out.println("NOT A PALINDROME!!");
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int size = in.nextInt();
		LinkedList list = new LinkedList();
		// append
		for (int i = 0; i < size; i++) {

			head = list.append(in.nextInt());
		}

		// prepend
		// for (int i = 0; i < size; i++) {
		//
		// head = list.prepend(in.nextInt());
		// }

		// runner technique
		// list.runnerExecution(head);
		// delete
		// list.delete(3);

		// read list
		list.read(head);
		//
		Node tail = list.reverse(head);

		list.palindrome(head, tail);
		list.read(head);
	}
}
