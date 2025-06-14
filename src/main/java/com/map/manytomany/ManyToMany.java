package com.map.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToMany {

	public static void main(String[] args) {
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		
		Developer developer=new Developer();
		developer.setDid(11);
		developer.setName("Yogi");
		
		Developer developer2=new Developer();
		developer2.setDid(12);
		developer2.setName("YK");
		
		Project project=new Project();
		project.setPid(1);
		project.setPname("LMS");
		
		Project project2=new Project();
		project2.setPid(2);
		project2.setPname("Mail Send");
		
		List<Developer> DevList=new ArrayList<Developer>();
		List<Project>projList=new ArrayList<Project>();
		
		DevList.add(developer);
		DevList.add(developer2);
		
		projList.add(project);
		projList.add(project2);
		
		project.setDevelopers(DevList);
		developer.setProjects(projList);
		
		
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(project2);
		session.save(project);
		session.save(developer);
		session.save(developer2);
		
		
		transaction.commit();
		session.close();
		sessionFactory.close();
		
		
		

	}

}
