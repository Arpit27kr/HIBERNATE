 package jdbc_test;

import java.sql.Connection;
import java.sql.DriverManager;

public class testjdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url="jdbc:mysql://localhost:3306/java?useSSL=false&serverTimezone=UTC";
		String user="root";
		String pass="computerforfun";
		
		
		try {
			System.out.println("connect to database");
			
			Connection con=DriverManager.getConnection(url,user,pass);
			System.out.println("successfull");
			
			
			
			
			
		}catch (Exception e)
		
		{
			e.printStackTrace();
		}
		
		
		

	}

}
