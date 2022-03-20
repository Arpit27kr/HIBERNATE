package com.lov2code.hibernate.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.jdbc.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	// create isession factory
		
		SessionFactory factory =new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		// create a session
		Session session =factory.getCurrentSession();
		
		try 
		{
			System.out.println("Create 3 more student Object");
			//use the session object 
			Student temp1=new Student("Amit","Fottball");
			Student temp2=new Student("Aman","Basketball");
			Student temp3=new Student("sumit","cricket");
			session.beginTransaction();
			System.out.println("Saving data ");
			session.save(temp1);
			session.save(temp2);
			session.save(temp3);
			session.getTransaction().commit();
			System.out.println("DONE !");
			
			
			
		}
		finally
		{
			factory.close();
		}
		
		
		
		

	}

}
