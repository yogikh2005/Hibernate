package com.fetchtehnique;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question3 {		
		@Id
		@Column(name="question_id")
		private int questionId;
		private String question;
		@OneToMany(mappedBy = "question",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
		private List<Answer3>answers;
		
		
		public Question3(int questionId, String question, List<Answer3> answers) {
			super();
			this.questionId = questionId;
			this.question = question;
			this.answers = answers;
		}

		public List<Answer3> getAnswers() {
			return answers;
		}

		public void setAnswers(List<Answer3> answers) {
			this.answers = answers;
		}

		@Override
		public String toString() {
			return "Question [questionId=" + questionId + ", question=" + question + ", answers=" + answers + "]";
		}

		public Question3() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public int getQuestionId() {
			return questionId;
		}
		public void setQuestionId(int questionId) {
			this.questionId = questionId;
		}
		public String getQuestion() {
			return question;
		}
		public void setQuestion(String question) {
			this.question = question;
		}
		

}
