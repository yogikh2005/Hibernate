package com.xml.mapping;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Demo {

	public static void main(String[] args) {

		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session s=sessionFactory.openSession();
		
		Person person=new Person(3,"jk");
		
		Transaction txTransaction=s.beginTransaction();
		
		s.save(person);
		
		txTransaction.commit();
		s.close();
		sessionFactory.close();
		

	}

}
