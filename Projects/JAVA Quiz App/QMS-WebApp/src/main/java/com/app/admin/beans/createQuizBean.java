package com.app.admin.beans;

import java.io.File;
import java.util.List;

import com.app.dao.QuestionsDao;
import com.app.dao.QuizDao;
import com.app.model.Questions;
import com.app.util.Dbutil;
import com.app.util.QuestionFileParser;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class createQuizBean {

	private String	quizTitle;
	private String path;
	
	public createQuizBean() {
		
	}
	
	public void createQuiz() {
		int id_quiz = 0;
		try(QuizDao quizdao = new QuizDao()){
			id_quiz = quizdao.insert(getQuizTitle(), 1);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		File file = new File(getPath());
		try {
			List<Questions> list = QuestionFileParser.parse(file);
			for(int i = 0; i < list.size(); i++) {
				list.get(i).setQuizId(id_quiz);
				try(QuestionsDao q = new QuestionsDao()){
					q.insert(list.get(i));
				}
			}
			System.out.println("Executed!");
		}catch(Exception x) {
			x.printStackTrace();
		}
	}
	
}
