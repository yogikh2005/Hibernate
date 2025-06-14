package com.secondcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lifecycle.Student2;



public class SecondCache {

	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		
		
		// 1st use cachebal notaion in entiti class and cache type also
		
		Session session=sessionFactory.openSession();
		
		Student2 student=session.get(Student2.class,18);
		System.out.println(student);
		
	
		session.close();
		 
		System.out.println("---------------------------------------------");
		// 2nd 
		
		Session session2=sessionFactory.openSession();
		
		Student2 student2=session2.get(Student2.class,18);
		System.out.println(student2);
		
		
		session2.close();
		
		//sessionFactory.close();
	}

}
