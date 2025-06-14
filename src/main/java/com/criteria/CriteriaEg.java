package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.hql.internal.ast.tree.RestrictableStatement;

import com.xml.mapping.Person;

public class CriteriaEg {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		
		Criteria criteria= session.createCriteria(Person.class);
		criteria.add(Restrictions.eq("id",1));
		List<Person>list=criteria.list();
		
		
		 for(Person p:list)
		{
			System.out.println(p.getId()+":"+p.getName());
		}
		
		
		
		session.close();
		
	
	
	}

}
