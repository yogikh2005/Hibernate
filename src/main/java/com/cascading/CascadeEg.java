package com.cascading;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.fetchtehnique.Answer3;
import com.fetchtehnique.Question3;

public class CascadeEg {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		
		Question3 question3= new  Question3();
		
		question3.setQuestion("what is fav game");
		question3.setQuestionId(2121);
		
		Answer3 answer=new Answer3(1212,"Chess",question3);
		Answer3 answer2=new Answer3(3451,"Cube solving",question3);
		Answer3 answer3=new Answer3(6278,"ludo",question3);
		
		List<Answer3>aList=new ArrayList<Answer3>();
		aList.add(answer3);
		aList.add(answer2);
		aList.add(answer);
		
		question3.setAnswers(aList);
		
		Transaction txTransaction=session.beginTransaction();
		
		
		session.save(question3);//cascading fecting type Qution
		
		
		
		txTransaction.commit(); 
		
		
		session.close();
		sessionFactory.close();

	}

}
