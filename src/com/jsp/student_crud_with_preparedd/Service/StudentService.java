package com.jsp.student_crud_with_preparedd.Service;

import com.jsp.student_crud_with_preparedd.dao.StudentDao;
import com.jsp.student_crud_with_preparedd.dto.Student;

public class StudentService {

	StudentDao dao = new StudentDao();
	// insert method
	public void insertStudent(Student student)
	{
		 dao.insertStudent(student);
	}
	//for updating email
	public Student  updateStudentEmail(int id, String email) 
	{
		return dao.updateStudentEmail(id, email);
	}
	
	// for updating name
			public Student updateStudentName(int id, String name ) 
			{
				return dao.updateStudentName(id, name);
			}
			
			//for updating phone
			public Student updateStudentPhone(int id,long phone) 
			{
				return dao.updateStudentphone(id, phone);
			}
			
			//for deleting student ID
			public Student deleteStudentId(int id) 
			{
				return dao.deleteStudentid(id);
			}
			public void displayStudentDetails() 
			{
				// TODO Auto-generated method stub
				dao.dispalyStudentDetails();
				
			}
			

}









