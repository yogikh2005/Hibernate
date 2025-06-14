 package com.HQL;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.cfgxml.spi.CfgXmlAccessService;
import org.hibernate.cfg.Configuration;

import com.hibernate.Student;
public class HQLDeleteData {
	
	public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session s=sessionFactory.openSession();
		Transaction tx=s.beginTransaction();
		
		Query qurey=s.createQuery("delete from Student where id=:x");
		
		qurey.setParameter("x", 13);
		int res=qurey.executeUpdate();
		System.out.println("Deleted");
		System.out.println("No of rows:"+res);

		tx.commit();
		sessionFactory.close();
		s.close();
		
	}
}


