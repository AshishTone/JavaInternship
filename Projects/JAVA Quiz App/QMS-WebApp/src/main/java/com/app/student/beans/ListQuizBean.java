package com.app.student.beans;

import java.util.List;

import com.app.dao.QuizDao;
import com.app.model.Quiz;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class ListQuizBean {
	public List<Quiz> list;
	
	
	public ListQuizBean() {
		
	}
	
	public void loadQuestions() {
		try {
			QuizDao qd = new QuizDao();
			this.setList(qd.listQuizzes());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
