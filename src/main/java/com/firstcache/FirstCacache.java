 package com.firstcache;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Student;

public class FirstCacache {

	public static void main(String[] args) {

		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		
		
		Student student=session.get(Student.class,18);
		System.out.println(student);
		
		Student student2=session.get(Student.class, 18);
		System.out.println(student2);
		
		System.out.println(session.contains(student2));
		
		session.close();
		sessionFactory.close();
	}

}
