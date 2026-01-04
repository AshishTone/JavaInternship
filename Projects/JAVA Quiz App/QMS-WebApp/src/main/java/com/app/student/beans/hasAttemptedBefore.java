package com.app.student.beans;

import com.app.dao.AttemptDao;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class hasAttemptedBefore {
	private int quizId;
	private int studId;
	private boolean status;
	
	public hasAttemptedBefore() {
		
	}
	
	public void hasAttempted() {
		try {
			AttemptDao atm = new AttemptDao();
			status = atm.hasAttemptedAlready(studId, quizId);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
