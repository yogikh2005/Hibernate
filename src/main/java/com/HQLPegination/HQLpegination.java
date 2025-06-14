package com.HQLPegination;

import java.util.List;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import  org.hibernate.cfg.Configuration;
import com.hibernate.Student;

public class HQLpegination {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Student");
		
		query.setFirstResult(0);
		query.setMaxResults(5);
		
		List<Student>ls=query.list();
		
		for(Student s:ls)
		{
			System.out.println(s.getId()+":"+s.getName());
		}
		
		
		session.close();
		sessionFactory.close();
		
	}
}
