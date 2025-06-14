package com.fetchtehnique;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Answer3 {
	@Id
	@Column(name="answer_id")
	private int answerId;
	private String answer;
	@ManyToOne
	private Question3 question;
	
	
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
	public Answer3() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Question3 getQuestion() {
		return question;
	}
	public void setQuestion(Question3 question) {
		this.question = question;
	}
	public Answer3(int answerId, String answer, Question3 question) {
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
