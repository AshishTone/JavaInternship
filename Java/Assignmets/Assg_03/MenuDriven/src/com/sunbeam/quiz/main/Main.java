package com.sunbeam.quiz.main;

import java.util.Scanner;

import com.sunbeam.quiz.menu.MainMenu;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// MainMenu.mainMenu(sc);
		MainMenu.mainMenuWithEnum(sc);

		sc.close();
	}

}
