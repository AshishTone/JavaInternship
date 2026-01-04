package com.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Dbutil {
	private static final String URL = "jdbc:mysql://localhost:3306/quiz_management";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "manager";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL,USERNAME,PASSWORD);
	}
}
