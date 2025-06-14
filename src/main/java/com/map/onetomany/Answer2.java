package com.map.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Answer2 {
	@Id
	@Column(name="answer_id")
	private int answerId;
	private String answer;
	@ManyToOne
	private Question2 question;
	
	
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Answer2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Question2 getQuestion() {
		return question;
	}
	public void setQuestion(Question2 question) {
		this.question = question;
	}
	public Answer2(int answerId, String answer, Question2 question) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.question = question;
	}
	@Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", answer=" + answer + ", question=" + question + "]";
	}
	
}
