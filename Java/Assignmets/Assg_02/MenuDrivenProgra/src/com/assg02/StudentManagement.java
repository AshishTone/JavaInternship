package com.assg02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections; 

public class StudentManagement {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search by Roll No");
            System.out.println("4. Sort by Roll No");
            System.out.println("5. Sort by Name");
            System.out.println("6. Sort by Marks");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = scanner.nextDouble();
                    
                    students.add(new Student(roll, name, marks));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.println("\n--- Student List ---");
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        for (Student s : students) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll No to search: ");
                    int searchRoll = scanner.nextInt();
                    boolean found = false;
                    for (Student s : students) {
                        if (s.getRollNo() == searchRoll) {
                            System.out.println("Student Found: " + s);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student with Roll No " + searchRoll + " not found.");
                    }
                    break;

                case 4:
                    Collections.sort(students, new SortByRollNo());
                    System.out.println("Sorted by Roll No.");
                    break;

                case 5:
                    Collections.sort(students, new SortByName());
                    System.out.println("Sorted by Name.");
                    break;

                case 6:
                    Collections.sort(students, new SortByMarks());
                    System.out.println("Sorted by Marks (Highest to Lowest).");
                    break;

                case 7:
                    System.out.println("Exiting...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}