package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.model.Attempt;
import com.app.model.Questions;
import com.app.util.Dbutil;

public class AttemptDao implements AutoCloseable {
	private static Connection connection = null;

	public AttemptDao() throws SQLException {
		connection = Dbutil.getConnection();
	}
	
	
	public void recordAttempt(int quizId,int student_id,int score, int total_questions) throws SQLException {
		String sql = " insert into quiz_attempts( quiz_id  ,student_id,final_score,total_questions)values(?,?,?,?)   ";
		try(PreparedStatement ps = connection.prepareStatement(sql)){
			ps.setInt(1,quizId);
			ps.setInt(2,student_id);
			ps.setInt(3,score);
			ps.setInt(4,total_questions);
			ps.executeUpdate();	
			
		
			
		}
			
		}
	public List<Attempt> getAteemptlist(int studentId) throws SQLException {
		List<Attempt> list = new ArrayList<>();
		String sql = "select * from quiz_attempts where student_id =?";
		try (PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setInt(1, studentId);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Attempt atm = new Attempt();
				atm.setId(rs.getInt("attempt_id"));
				atm.setQuizId(rs.getInt("quiz_id"));
				atm.setStudent_id(rs.getInt("student_id"));
				atm.setScore(rs.getInt("final_score"));
				atm.setTotal(rs.getInt("total_questions"));
				
				list.add(atm);

			}
			
		}
		return list;
		
		 
		
		
	}
	 public boolean hasAttemptedAlready(int student_id , int quiz_id) throws SQLException {
		  
		 String sql = " select * from quiz_attempts where  student_id =? and quiz_id =?";
		  try(PreparedStatement ps = connection.prepareStatement(sql)){
			  ps.setInt(1, student_id);
			  ps.setInt(2, quiz_id);
			  
			  ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}
			else {
				return false;
			}
			  
			  
			  
		  }
		  
		  
		
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
