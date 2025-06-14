package com.HQL;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLUpdateData {
public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session s=sessionFactory.openSession();
		Transaction tx=s.beginTransaction();
		
		Query qurey=s.createQuery("update Student set city=:c where id=:x");
		
		qurey.setParameter("x", 0);
		qurey.setParameter("c", "satara");
		int res=qurey.executeUpdate();
		System.out.println("Update");
		System.out.println("No of rows:"+res);

		tx.commit();
		sessionFactory.close();
		s.close();
		
	}
}
