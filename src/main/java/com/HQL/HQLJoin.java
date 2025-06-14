package com.HQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLJoin {
public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session s=sessionFactory.openSession();
		Transaction tx=s.beginTransaction();
		
		Query qurey=s.createQuery("select q.question,q.questionId,a.answer from Question2 as q INNER JOIN q.answers as a");
		List<Object []> list= qurey.getResultList();
		
		for(Object[] arr:list)
		{
			System.out.println(Arrays.toString(arr));
			
		}
		

		tx.commit();
		sessionFactory.close();
		s.close();
		
	}

}
