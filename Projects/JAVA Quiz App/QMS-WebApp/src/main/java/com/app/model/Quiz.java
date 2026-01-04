package com.app.model;

public class Quiz {
	public int id;
	public String title;
	public Integer creatorId;
	
	public Quiz(int id, String title, Integer creatorId) {
	
		this.id = id;
		this.title = title;
		this.creatorId = creatorId;
	}
	

	public Quiz() {
		
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(Integer creatorId) {
		this.creatorId = creatorId;
	}

}
