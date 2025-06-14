package com.map.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapOneToOne {
		public static void main(String args[]) {
			
		
	   SessionFactory factory=new Configuration().configure().buildSessionFactory();
	   
	   Question question=new Question();
	   question.setQuestion("Who is Yogi friend");
	   question.setQuestionId(101);
	
	   Answer answer=new Answer();
	   answer.setAnswer("Sidhant");
	   answer.setAnswerId(11);
	   answer.setQuestion(question);
	   question.setAnswer(answer);
	   
	   Session session=factory.openSession();
	   Transaction tx=session.beginTransaction();
	   
	   session.save(question);
	   session.save(answer);
	    	   
	   tx.commit();

	   Question question2=session.get(Question.class, 101);
	   System.out.println("OneToOne Mapping");
	   System.out.println("Question:"+question2.getQuestion());
	   System.out.println("Answer:"+question2.getAnswer().getAnswer());
	   
	   
	   
	   
	   session.close();
	   factory.close();
		
		}
}
