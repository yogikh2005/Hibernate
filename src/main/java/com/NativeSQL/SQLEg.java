package com.NativeSQL;


import java.rmi.StubNotFoundException;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.hibernate.Student;



public class SQLEg {

	public static void main(String[] args) {
	
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		String querString="Select *from student_info";
		NativeQuery query=session.createSQLQuery(querString);
		 
		List<Object[]>list=query.list();
		
		for(Object[] student:list )
		{
			System.out.println(Arrays.deepToString(student));
			System.out.println(student[0]+":"+student[4]);
		}
		
		
		
		
		session.close();
		sessionFactory.close();
	}

}
