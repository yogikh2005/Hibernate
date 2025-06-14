package com.lifecycle;

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
        
        Student2 student=new Student2();
   
        student.setId(188);
        student.setName("Yogi");
        student.setCity("Daund");
        student.setCertificate(new Certificate2("Java FullStack","3 months"));
        System.out.println(student);
       
        //student: TransientX
        Session session=factory.openSession();
        session.beginTransaction();
        
        session.save(student);
        //student :persistent-session,database
        student.setName("YK");
        
        
        session.getTransaction().commit();
        
        //student:detached
        student.setName("YMK");
        System.out.println(student);
        session.close();
        
    }
}
