package com.java.ThirtyDaysOfCode;

import java.util.Scanner;

class Person {
	protected static String firstName;
	protected static String lastName;
	protected static int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification) {
		Person.firstName = firstName;
		Person.lastName = lastName;
		Person.idNumber = identification;
	}

	// Print person data
	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		firstName = in.next();
		lastName = in.next();
		idNumber = in.nextInt();
		int testScores = in.nextInt();
		int[] scores = new int[testScores];
		for (int i = 0; i < testScores; i++) {
			scores[i] = in.nextInt();
		}

		Inheritance person = new Inheritance(firstName, lastName, idNumber, scores);
		char output = person.calculate();
		System.out.println("GRADE:" + output);
		in.close();

	}

}
