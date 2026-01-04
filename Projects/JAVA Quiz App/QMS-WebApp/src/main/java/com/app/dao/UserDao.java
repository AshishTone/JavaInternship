package com.app.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.model.*;
import com.app.util.Dbutil;

public class UserDao implements AutoCloseable {

	private static Connection connection = null;
	public static User curUser = null;

	public UserDao() throws SQLException {
		connection = Dbutil.getConnection();
	}

	public static boolean Adminlogin(String email, String password) throws SQLException {
		String sql = "select * from users where email =? AND password_hash =? AND role ='Admin'  ";
		try (PreparedStatement ps = connection.prepareStatement(sql);) {
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				curUser = new User();
				curUser.setId(rs.getInt(1));
				curUser.setName(rs.getString(2));
				curUser.setEmail(rs.getString(3));
				curUser.setPassword(rs.getString(4));
				curUser.setRole(rs.getString(5));
				return true;
			}

//			  connection.close();
//			  ps.close();
//			
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return false;

	}

	public static int studentRegister(String name, String email, String password) throws SQLException {
		String sql = " insert into users(name,email,password_hash,role) values(?,?,?,?)";
		try (PreparedStatement ps = connection.prepareStatement(sql);) {

			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.setString(4, "student");
			int i = ps.executeUpdate();
			System.out.println("Number of rows Affected: " + i);
			return i;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public User findByEmail(String email) throws Exception {
		PreparedStatement stmtFindByEmail;
		stmtFindByEmail = connection.prepareStatement("SELECT * FROM users WHERE email=?");
		stmtFindByEmail.setString(1, email);
		try(ResultSet rs = stmtFindByEmail.executeQuery()) {
			if(rs.next()) {
				int userId = rs.getInt("user_id");
				String name = rs.getString("name");
				email = rs.getString("email");
				String passwd = rs.getString("password");
				String role = rs.getString("role");
				User user = new User(userId, name, email, passwd, role);
				return user;
			}
		} // rs.close();
		return null;
	}

	public User Userlogin(String email, String password) throws SQLException {
		String sql = "select * from users where email =? AND password_hash =?";
		User user = new User();
		try (PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setEmail(rs.getString(3));
				user.setPassword(rs.getString(4));
				user.setRole(rs.getString(5));
				return user;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;

	}

	@Override
	public void close() throws SQLException {
		if (connection != null) {
			connection.close();
			connection = null;
		}
	}
}
