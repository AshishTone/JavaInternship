package com.app.model;

import java.time.LocalDateTime;
public class Attempt {
	public int id;
	public int quizId;
	public int student_id;
	public int score;
	public int total;
	public LocalDateTime attemptTime ;
	public Attempt() {
	
		
	}
	public Attempt(int id, int quizId, int student_id, int score, int total, LocalDateTime attemptTime) {
		super();
		this.id = id;
		this.quizId = quizId;
		this.student_id = student_id;
		this.score = score;
		this.total = total;
		this.attemptTime = attemptTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuizId() {
		return quizId;
	}
	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
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
	public LocalDateTime getAttemptTime() {
		return attemptTime;
	}
	public void setAttemptTime(LocalDateTime attemptTime) {
		this.attemptTime = attemptTime;
	}
	@Override
	public String toString() {
		return "Attempt [id=" + id + ", quizId=" + quizId + ", student_id=" + student_id + ", score=" + score
				+ ", total=" + total + ", attemptTime=" + attemptTime + "]";
	}

}
