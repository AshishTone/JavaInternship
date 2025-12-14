package com.assg02;

import java.util.Scanner;

class ExceptionLineTooLong extends Exception {
 public ExceptionLineTooLong() {
     super("The strings is too long");
 }
}

public class Main {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     try {
         System.out.print("Please enter a string: ");
         String input = scanner.nextLine();

         int length = input.length();
         if (length > 80) {
             throw new ExceptionLineTooLong();
         }

         System.out.println("String accepted. Length: " + length);

     } catch (ExceptionLineTooLong e) {
         System.out.println(e.getMessage());
     } finally {
         scanner.close();
     }
 }
}