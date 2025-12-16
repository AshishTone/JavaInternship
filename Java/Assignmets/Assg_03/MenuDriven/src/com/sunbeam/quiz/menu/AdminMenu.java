package com.sunbeam.quiz.menu;

import java.util.Scanner;

public class AdminMenu {
	private static int adminMenuOptions(Scanner sc) {
		System.out.println("**************AdminMenu**************");
		System.out.println("0. Signout");
		System.out.println("1. Add a new Quiz");
		System.out.println("2. Schedule the Quiz");
		System.out.println("3. Display All Students");
		System.out.println("4. Find the Student");
		System.out.println("5. Delete Student");
		System.out.println("6. Update Student");
		System.out.print("Enter your choice - ");
		return sc.nextInt();
	}

	public static void adminMenu(Scanner sc) {
		int choice;
		while ((choice = adminMenuOptions(sc)) != 0) {
			switch (choice) {
			case 1:
				System.out.println("Add a new Quiz Case Selected");
				break;
			case 2:
				System.out.println("Schedule the Quiz Case Selected");
				break;
			case 3:
				System.out.println("Display All Students Case Selected");
				break;
			case 4:
				System.out.println("Find the Student Case Selected");
				break;
			case 5:
				System.out.println("Delete Student Case Selected");
				break;
			case 6:
				System.out.println("Update Student Case Selected");
				break;
			default:
				System.out.println("Wrong Choice...");
				break;
			}
		}
	}
}
