package com.app.model;

public class Questions {
	public int id ;
	public int quizId;
	public   String text;
	public   String a;
	public   String b;
	public   String c;
	public   String d;
	public char correct;
	
	
	public Questions(int id, int quizId, String text, String a, String b, String c, String d, char correct) {
	
		this.id = id;
		this.quizId = quizId;
		this.text = text;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.correct = correct;
	}
	public Questions() {
	
		// TODO Auto-generated constructor stub
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
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getD() {
		return d;
	}
	public void setD(String d) {
		this.d = d;
	}
	public char getCorrect() {
		return correct;
	}
	public void setCorrect(char correct) {
		this.correct = correct;
	}
	@Override
	public String toString() {
		return "Questions [id=" + id + ", quizId=" + quizId + ", text=" + text + ", a=" + a + ", b=" + b + ", c=" + c
				+ ", d=" + d + ", correct=" + correct + "]";
	}
	
	
	
	
	

}
