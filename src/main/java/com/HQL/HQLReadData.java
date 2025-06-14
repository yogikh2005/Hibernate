package com.HQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.cfgxml.spi.CfgXmlAccessService;
import org.hibernate.cfg.Configuration;

import com.hibernate.Student;


public class HQLReadData {
public static void main(String[] args) {
	
	Configuration configuration=new Configuration();
	configuration.configure("hibernate.cfg.xml");
	SessionFactory sessionFactory=configuration.buildSessionFactory();
	
	String qureyString="from Student";
	String qureyString2="from Student where id=:x";
	String qureyString3="from Student as s where s.id=:x and s.name=:n";
	Session s=sessionFactory.openSession();
	
	Query q=s.createQuery(qureyString3);
	q.setParameter("x",13 );
	q.setParameter("n","YK");
	List<Student>ls=q.list();
	
	
	for(Student stud:ls)
	{
		System.out.println(stud.getId()+":"+stud.getName());
	}
	
	
	sessionFactory.close();
	
}
}
