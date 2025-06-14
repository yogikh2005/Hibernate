package com.hibernate;

import org.hibernate.Transaction;

import javax.transaction.Transactional.TxType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EMDemo {

	public static void main(String[] args) {
	
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			

	        Student student=new Student();
	        Certificate certificate=new Certificate(); 
	        
	        certificate.setCourse("Full Stack Java");
	        certificate.setDuration("3 months");
	        
	        
	        student.setId(11);
	        student.setName("Yogi");
	        student.setCity("Daund");
	        student.setCertificate(certificate);
	        
	        
	        Student student2=new Student();
	        Certificate certificate2=new Certificate(); 
	        
	        certificate2.setCourse("Mearn Full Stack");
	        certificate2.setDuration("4 months");
	        
	        
	        student2.setId(18);
	        student2.setName("More");
	        student2.setCity("Khed");
	        student2.setCertificate(certificate2);
	        
	        Session session=sessionFactory.openSession();
	        Transaction transaction=session.beginTransaction();
	        
	        session.save(student);
	        session.save(student2);
	        
	        transaction.commit();
	        session.close();
	        sessionFactory.close(); 
	        
	        
	}

}
