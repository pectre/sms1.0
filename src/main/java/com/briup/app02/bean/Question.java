package com.briup.app02.bean;

public class Question {
	private long id;
	private String name;
	private String questiontype;
	
	public Question(long id, String name, String questiontype) {
		super();
		this.id = id;
		this.name = name;
		this.questiontype = questiontype;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuestiontype() {
		return questiontype;
	}
	public void setQuestiontype(String questiontype) {
		this.questiontype = questiontype;
	}

}
