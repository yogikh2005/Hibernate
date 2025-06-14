package com.map.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.map.onetomany.Question2;

public class MapOneToMany {
		public static void main(String args[]) {
			
		
	   SessionFactory factory=new Configuration().configure().buildSessionFactory();
	   
	   Question2 question=new Question2();
	   question.setQuestion("Who is Yogi friends");
	   question.setQuestionId(101);
	
	   Answer2 answer=new Answer2();
	   answer.setAnswer("Sidhant");
	   answer.setAnswerId(11);
	   answer.setQuestion(question);
	   
	   Answer2 answer2=new Answer2();
	   answer2.setAnswer("Abhi");
	   answer2.setAnswerId(12);
	   answer2.setQuestion(question);
	   
	   Answer2 answer3=new Answer2();
	   answer3.setAnswer("Sam");
	   answer3.setAnswerId(13);
	   answer3.setQuestion(question);
	   
	   List<Answer2>anslist=new ArrayList<Answer2>();
	   anslist.add(answer);
	   anslist.add(answer2);
	   anslist.add(answer3);
	   
	   question.setAnswers(anslist);
	   
	   Session session=factory.openSession();
	   Transaction tx=session.beginTransaction();
	   
	   session.save(question);
	   session.save(answer);
	   session.save(answer2);
	   session.save(answer3);
	   tx.commit();

	    Question2 question2=session.get(Question2.class, 101);
	    System.out.println("OneToMany Mapping:");
	    System.out.println("Question:"+question2.getQuestion());
	   int i=1;
	   for(Answer2 a:question.getAnswers())
	   {
		   System.out.println(i+":"+a.getAnswer());
		   i++;
	   }
	   
	   
	   session.close();
	   factory.close();
		
		}
}
