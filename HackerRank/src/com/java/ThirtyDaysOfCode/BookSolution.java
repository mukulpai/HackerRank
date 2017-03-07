package com.java.ThirtyDaysOfCode;

import java.util.Scanner;

public class BookSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		String author = sc.nextLine();
		int price = sc.nextInt();
		BookMyBook new_novel = new BookMyBook(title, author, price);
		new_novel.display();
		sc.close();
	}

}
