package com.lov2code.hibernate.operation;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import hibernate.jdbc.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// create isession factory
		
		SessionFactory factory =new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		// create a session
		Session session =factory.getCurrentSession();
		
		try 
		{
			System.out.println("Create a student Object");
			//use the session object 
			Student temp1=new Student("Amit","Fottball");
			session.beginTransaction();
			System.out.println("Saving data ");
			session.save(temp1);
			session.getTransaction().commit();
			System.out.println("DONE !");
			
			
			
		}
		finally
		{
			factory.close();
		}
		
		
		
		 
		
		
		
		
		

	}

}
