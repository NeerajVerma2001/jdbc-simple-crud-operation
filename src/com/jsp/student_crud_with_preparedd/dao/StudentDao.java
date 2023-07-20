package com.jsp.student_crud_with_preparedd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.student_crud_with_preparedd.connection.StudentConnection;
import com.jsp.student_crud_with_preparedd.dto.Student;
import com.mysql.cj.protocol.Resultset;

public class StudentDao 
{
	Connection connection=StudentConnection.getStudentConnection();
/*
 * insert method for student
 */
	public void insertStudent(Student student)
	{      
		/*
		 * JDBC Code
		 */
		System.out.println("Dao method is inserted");
		String insertQuery ="insert into student values(?,?,?,?)";
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
			
			preparedStatement.setInt(1, student.getStudentId());
			preparedStatement.setString(2,student.getStudentName());
			preparedStatement.setString(3, student.getStudentEmail());
			preparedStatement.setDouble(4, student.getStudentPhone());
			preparedStatement.execute();
			
			
		} catch (SQLException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}
	// for updating email 
	public Student updateStudentEmail(int id, String email ) 
	{
		String updateStudentEmail ="update student set email=? where id=?";
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(updateStudentEmail);
			preparedStatement.setString(1, email);
			preparedStatement.setInt(2, id);
			preparedStatement.executeUpdate();
			System.out.println("email updated");
		} 
		catch (SQLException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
		
	}
	
	// for updating name
		public Student updateStudentName(int id, String name ) 
		{
			String updateStudentName ="update student set name=? where id=?";
			try 
			{
				PreparedStatement preparedStatement=connection.prepareStatement(updateStudentName);
				preparedStatement.setString(1, name);
				preparedStatement.setInt(2, id);
				preparedStatement.executeUpdate();
				System.out.println("name updated");
			} 
			catch (SQLException e) 
			{
				// TODO: handle exception
				e.printStackTrace();
			}
			return null;
			
		}
		//for updating phone
		public Student updateStudentphone(int id, long phone ) 
		{
			String updateStudentPhone ="update student set phone=? where id=?";
			try 
			{
				PreparedStatement preparedStatement=connection.prepareStatement(updateStudentPhone);
				preparedStatement.setLong(1, phone);
				preparedStatement.setInt(2, id);
				preparedStatement.executeUpdate();
				System.out.println("data updated");
			} 
			catch (SQLException e) 
			{
				// TODO: handle exception
				e.printStackTrace();
			}
			return null;
			
		}
		//for delete id
		public Student deleteStudentid(int id) 
		{
			String deleteStudentId ="delete from student where id=?";
			try 
			{
				PreparedStatement preparedStatement=connection.prepareStatement(deleteStudentId);
				preparedStatement.setInt(1, id);
				preparedStatement.executeUpdate();
				System.out.println("data delete");
			} 
			catch (SQLException e) 
			{
				// TODO: handle exception
				e.printStackTrace();
			}
			return null;
			
		}
		
		//for display
		public Student dispalyStudentDetails() 
		{
			String displayStudentQuery = "select * from student";
			try 
			{
				PreparedStatement preparedStatement=connection.prepareStatement(displayStudentQuery);
			ResultSet resultSet =preparedStatement.executeQuery();
			resultSet.next();
			int id =resultSet.getInt("id");
			String name= resultSet.getString("name");
			String email=resultSet.getString("email");
			long phone=resultSet.getLong("phone");
			
			System.out.println("id="+id);
			System.out.println("name="+name);
			System.out.println("email="+email);
			System.out.println("phone="+phone);
			
				System.out.println("data displayed");
			} 
			catch (SQLException e) 
			{
				// TODO: handle exception
				e.printStackTrace();
			}
			return null;
			
		}
}







