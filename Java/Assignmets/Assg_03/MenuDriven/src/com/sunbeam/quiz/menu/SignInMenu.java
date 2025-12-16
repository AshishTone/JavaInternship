package com.sunbeam.quiz.menu;

import java.util.Scanner;

public class SignInMenu {
	private static int signInMenuOptions(Scanner sc) {
		System.out.println("**************SignInMenu**************");
		System.out.println("0. Logout");
		System.out.println("1. View Qizzes");
		System.out.println("2. Take Quiz");
		System.out.println("3. View Scores");
		System.out.println("4. Update Mobile");
		System.out.print("Enter your choice - ");
		return sc.nextInt();
	}

	public static void signInMenu(Scanner sc) {
		int choice;
		while ((choice = signInMenuOptions(sc)) != 0) {
			switch (choice) {
			case 1:
				System.out.println("Attempt Quiz Case Selected");
				break;
			case 2:
				System.out.println("Display Marks Case Selected");
				break;
			case 3:
				System.out.println("Display Profile Case Selected");
				break;
			case 4:
				System.out.println("Update Mobile Case Selected");
				break;
			default:
				System.out.println("Wrong Choice...");
				break;
			}
		}
	}
}
