package com.fetchtehnique;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchTechnique {
		public static void main(String args[]) {
			
		
	   SessionFactory factory=new Configuration().configure().buildSessionFactory();
	   /*
	   Question3 question=new Question3();
	   question.setQuestion("Who is Yogi friends");
	   question.setQuestionId(101);
	
	   Answer3 answer=new Answer3();
	   answer.setAnswer("Sidhant");
	   answer.setAnswerId(11);
	   answer.setQuestion(question);
	   
	   Answer3 answer2=new Answer3();
	   answer2.setAnswer("Abhi");
	   answer2.setAnswerId(12);
	   answer2.setQuestion(question);
	   
	   Answer3 answer3=new Answer3();
	   answer3.setAnswer("Sam");
	   answer3.setAnswerId(13);
	   answer3.setQuestion(question);
	   
	   List<Answer3>anslist=new ArrayList<Answer3>();
	   anslist.add(answer);
	   anslist.add(answer2);
	   anslist.add(answer3);
	   
	   question.setAnswers(anslist);
	   */
	   Session session=factory.openSession();
	   Transaction tx=session.beginTransaction();
	   /*
	   session.save(question);
	   session.save(answer);
	   session.save(answer2);
	   session.save(answer3);
	  */

	    Question3 question2=session.get(Question3.class, 101);
	    System.out.println("Lazy fetching:");
	    System.out.println("Question:"+question2.getQuestionId());
	    System.out.println("Question:"+question2.getQuestion());
	 
	    /*int i=1;
	   for(Answer3 a:question.getAnswers())
	   {
		   System.out.println(i+":"+a.getAnswer());
		   i++;
	   }
	   */
	    tx.commit();
	   session.close();
	   factory.close();
		
		}
}
