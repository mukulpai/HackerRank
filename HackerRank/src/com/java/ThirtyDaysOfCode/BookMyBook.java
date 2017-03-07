package com.java.ThirtyDaysOfCode;

public class BookMyBook extends Book {

	public int price;

	public BookMyBook(String title, String author, int price) {
		super(title, author);
		this.price = price;
		// TODO Auto-generated constructor stub
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
	}

}
