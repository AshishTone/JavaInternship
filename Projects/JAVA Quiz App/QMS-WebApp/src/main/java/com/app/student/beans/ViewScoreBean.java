package com.app.student.beans;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

import com.app.dao.AttemptDao;
import com.app.model.Attempt;

@AllArgsConstructor
@Data

public class ViewScoreBean {
	public List<Attempt> list;
	public int studId;
	
	public ViewScoreBean() {
		
	}
	
	public void loadAttempts() {
		try {
			AttemptDao atm = new AttemptDao();
			this.list = atm.getAteemptlist(studId);
			System.out.println("student id is: "  + studId);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
