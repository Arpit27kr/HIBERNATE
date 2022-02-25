package com.luv2code.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

public class TestJdbc  {
	
	public static void main(String[] args) throws Exception
	{
		String url ="jdbc:mysql://localhost:3306/jdbc";
		String user="root";
		String pass="computerforfun";
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("CONNECTION TO DATABASE" + url);
			Connection con=DriverManager.getConnection(url,user,pass);
			System.out.println("Connection Successful");
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
