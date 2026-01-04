package com.app.student.beans;

import com.app.dao.UserDao;
import com.app.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class StudentRegistrationBean {
	private String name;
	private String email;
	private String password;
	User user;
	
	public StudentRegistrationBean() {
		
	}
	
	public void registerUser() {
		try(UserDao userDao = new UserDao()){
			UserDao.studentRegister(name, email, password);
			System.out.println("Registeration complete!");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
