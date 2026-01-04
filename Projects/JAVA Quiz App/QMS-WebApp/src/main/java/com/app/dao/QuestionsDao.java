package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.model.Questions;
import com.app.util.Dbutil;

public class QuestionsDao implements AutoCloseable {
	private static Connection connection = null;

	public QuestionsDao() throws SQLException {
		connection = Dbutil.getConnection();
	}

	public void insert(Questions q) throws Exception {
		System.out.println("inserting quetion!");
		String sql = "insert into questions (quiz_id , question_text, option_a , option_b , option_c, option_d , correct_option  ) values(?,?,?,?,?,?,?)";
		try (PreparedStatement ps = connection.prepareStatement(sql)) {

			ps.setInt(1, q.quizId);
			ps.setString(2, q.text);
			ps.setString(3, q.a);
			ps.setString(4, q.b);
			ps.setString(5, q.c);
			ps.setString(6, q.d);
			ps.setString(7, String.valueOf(q.correct));
			ps.executeUpdate();
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<Questions> getQuestions(int quizId) throws SQLException {
		List<Questions> list = new ArrayList<>();
		String sql = "select * from questions where quiz_id =?";
		try (PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setInt(1, quizId);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Questions q = new Questions();
				q.setId(rs.getInt("question_id"));
				q.setQuizId(rs.getInt("quiz_id"));
				q.setText(rs.getString("question_text"));
				q.setA(rs.getString("option_a"));
				q.setB(rs.getString("option_b"));
				q.setC(rs.getString("option_c"));
				q.setD(rs.getString("option_d"));
				q.setCorrect((rs.getString("correct_option")).charAt(0));
				list.add(q);

			}
			
		}
		return list;
	}
	
	public List<Questions> getAllQuestions() throws SQLException {
		List<Questions> list = new ArrayList<>();
		String sql = "select * from questions";
		try (PreparedStatement ps = connection.prepareStatement(sql)) {
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Questions q = new Questions();
				q.setId(rs.getInt("question_id"));
				q.setQuizId(rs.getInt("quiz_id"));
				q.setText(rs.getString("question_text"));
				q.setA(rs.getString("option_a"));
				q.setB(rs.getString("option_b"));
				q.setC(rs.getString("option_c"));
				q.setD(rs.getString("option_d"));
				q.setCorrect((rs.getString("correct_option")).charAt(0));
				list.add(q);

			}
			
		}
		return list;
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		if (connection != null) {
			connection.close();
			connection = null;
		}
	}

}
