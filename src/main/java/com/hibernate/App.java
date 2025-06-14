package com.hibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Project Started");
        
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        
        Student student=new Student();
        Address add=new Address(); 
        
        student.setId(11);
        student.setName("Yogi");
        student.setCity("Daund");
       
        add.setDist("Pune");
        add.setDate(new Date());
        add.setStreet("NH65");
        
        FileInputStream img=new FileInputStream("C:/data/Hibernate/src/main/java/abd.jpg");
        byte[] data=new byte[img.available()];
        img.read(data);
        //add.setImg(data);
        
        
        System.out.println(student);
        System.out.println(add);
        
        Session session=factory.openSession();
        
        session.beginTransaction();
        session.save(student);
        session.save(add);
        session.getTransaction().commit();
        
        session.close();
        
    }
}
