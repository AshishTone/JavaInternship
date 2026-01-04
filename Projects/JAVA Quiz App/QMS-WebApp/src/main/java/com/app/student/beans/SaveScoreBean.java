package com.app.student.beans;

import com.app.dao.AttemptDao;

import lombok.AllArgsConstructor;
import lombok.Data;

public class SaveScoreBean {
	private int quizId;
	private int studId;
	private int score;
	private int total;
	
	public void saveScoreBean() {
		
	}
	
	public int getQuizId() {
		return quizId;
	}

	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void saveAttempt() {
		try {
			AttemptDao at = new AttemptDao();
			at.recordAttempt(quizId, studId, score, total);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(quizId);
		System.out.println(studId);
		System.out.println(score);
		System.out.println(total);
	}
}
