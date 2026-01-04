package com.app.admin.beans;

import com.app.dao.UserDao;

import com.app.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class LoginBean {
	private String email;
	private String password;
	private User user;
	private int status;
	public LoginBean() {
		
	}
	
	
	public void authenticate() {
		try(UserDao userDao = new UserDao()){
			user =  userDao.Userlogin(this.email, this.password);
			if(user.getRole().equals("ADMIN"))
				status = 1;
			else if(user.getRole().equals("STUDENT"))
				status = 2;
			else
				status = 0;
			
			UserDao u = new UserDao();
			user = u.findByEmail(email);
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
	}
}
