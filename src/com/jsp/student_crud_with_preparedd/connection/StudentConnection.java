package com.jsp.student_crud_with_preparedd.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentConnection 
{
	public static Connection getStudentConnection()
	{
		try 
		{
			// step 1 load/register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2 create connection
			String url ="jdbc:mysql://localhost:3307/student_crud_with_preparedd";
			String user = "root";
			String pass ="root";
			
				Connection connection= DriverManager.getConnection(url, user, pass);
			
			return connection;
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
		
	}
}
