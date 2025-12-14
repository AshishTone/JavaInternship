package com.assg02;

import java.util.Comparator;

class SortByRollNo implements Comparator<Student> {
 @Override
 public int compare(Student a, Student b) {
     return a.getRollNo() - b.getRollNo();
 }
}

class SortByName implements Comparator<Student> {
 @Override
 public int compare(Student a, Student b) {
     return a.getName().compareToIgnoreCase(b.getName());
 }
}

class SortByMarks implements Comparator<Student> {
 @Override
 public int compare(Student a, Student b) {
     return Double.compare(b.getMarks(), a.getMarks());
 }
}