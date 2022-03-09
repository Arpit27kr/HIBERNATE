package com.luv2code.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.entity.student;


public class studentdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create session factory 
		
		SessionFactory factory =new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(student.class).buildSessionFactory();
		
		
		// create session
		Session session =factory.getCurrentSession();
		
		
		// save / retrieve objects 
		try
		{
			//create student object 
			
			System.out.println("Creating the object for student");
			student temp=new student("paul","wall","paul@gmail.com");
			
			// start transaction
			session.beginTransaction();
			
			
			// save the student
			session.save(temp);
			
			// commit the transaction
			session.getTransaction().commit();
			
			
		}finally
		{
			factory.close();
		}
		
		
		
		
		
		

	}

}
