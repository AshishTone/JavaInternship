package com.app.admin.beans;

import java.util.List;

import com.app.dao.AttemptDao;
import com.app.model.Attempt;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class ViewResultBean {
	public List<Attempt> list;
	
	public ViewResultBean() {
		
	}
	
	public void loadAttempts() {
		try {
			AttemptDao atm = new AttemptDao();
			this.list = atm.getAllAteemptlist();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
