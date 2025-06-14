package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class FetchDEmo {
	public static void main(String argv[]) { 
		
	 System.out.println("Project Started");
     
     SessionFactory factory=new Configuration().configure().buildSessionFactory();
     Session session=factory.openSession();
     
     Student student = session.get(Student.class, 11);
     System.out.println(student);
     
     Student student2 = session.get(Student.class, 18);//cash memory// call one time qurey
     System.out.println(student2);
     
     Address address = session.load(Address.class, 6);
    // System.out.println(address);
     
     session.close();
     factory.close();
	} 
}
