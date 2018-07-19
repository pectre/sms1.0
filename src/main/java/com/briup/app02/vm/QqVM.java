package com.briup.app02.vm;

import com.briup.app02.bean.Question;
import com.briup.app02.bean.Questionnaire;

public class QqVM {
	private long id;
	private Question question;
	private Questionnaire questionnaire;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public Questionnaire getQuestionnaire() {
		return questionnaire;
	}
	public void setQuestionnaire(Questionnaire questionnaire) {
		this.questionnaire = questionnaire;
	}
	
}
