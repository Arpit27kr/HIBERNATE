package ReadStudent.demo;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import hibernate.jdbc.entity.Student;

public class ReadStudent {

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
			Student temp1=new Student("rahul","chess");
			session.beginTransaction();
			System.out.println("Saving data ");
			System.out.println(temp1);
			session.save(temp1);
			session.getTransaction().commit();
			
			// find out primary key : of table 
			System.out.println("Saved Student Generated id: " +temp1.getRoll());
			
			// now get a anew session
			session=factory.getCurrentSession();
			session.beginTransaction();
			// retrieve the student based on roll : primary key 
		    System.out.println("getting student id with : " +temp1.getRoll());
		    Student mystudent=session.get(Student.class, temp1.getRoll());
		    System.out.println("Get completed " +mystudent);
		    
			// commit transaction
		    session.getTransaction().commit();

			
			System.out.println("DONE !");
			
			
			
		}
		finally
		{
			factory.close();
		}
		
		
		
		 
		
		
		
		
		

	}

}
