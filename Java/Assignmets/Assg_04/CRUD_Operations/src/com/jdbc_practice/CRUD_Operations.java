package com.jdbc_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUD_Operations {
	private static final String URL = "jdbc:mysql://localhost:3306/classwork";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "manager";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(URL,USERNAME,PASSWORD);			
	}
	
	public static void displayBooks() {
		try {
			Connection connection = getConnection();			
			String sql = "SELECT * FROM books";
			PreparedStatement selectStatement = connection.prepareStatement(sql);
			ResultSet rs = selectStatement.executeQuery();
			while(rs.next()) {
				System.out.println("id: "+rs.getInt(1)+" Name: "+rs.getString(2)+" Author: "+rs.getString(3)+" Subject: "+rs.getString(4)+" Price: "+rs.getFloat(5));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void addBook(int id,String name,String author,String sub,float price) {
		try {
			
			Connection connection = getConnection();
			String sql = "INSERT INTO books(id, name, author, subject, price) VALUES(?,?,?,?,?)";
			PreparedStatement insertStatement = connection.prepareStatement(sql);
			insertStatement.setInt(1, id);
			insertStatement.setString(2, name);
			insertStatement.setString(3, author);
			insertStatement.setString(4, sub);
			insertStatement.setFloat(5, price);
			insertStatement.executeUpdate();
			System.out.println("Added Successfully!");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void updateBook(int id) {
		try {
			Connection connection = getConnection();
			String sql = "UPDATE books SET author = ? WHERE id = ?";
			PreparedStatement updateStatement = connection.prepareStatement(sql);
			updateStatement.setString(1, "Unknown!");
			updateStatement.setInt(2, id);
			updateStatement.executeUpdate();
			System.out.println("Updated Successfully!");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteBook(int id) {
		String sql = "DELETE FROM books WHERE id = ?";
		try {
			Connection connection = getConnection();
			PreparedStatement deleteStatement = connection.prepareStatement(sql);
			deleteStatement.setInt(1, id);
			deleteStatement.executeUpdate();
			System.out.println("Deleted Successfully!");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		displayBooks();
		
		addBook(8003,"Book Num3","Author Num3","Sub Num3",200);
		addBook(8002,"Book Num2","Author Num2","Sub Num2",200);
		
		//updateBook(9009); 
		
		
		deleteBook(9009);
		
		displayBooks();
	}
}
