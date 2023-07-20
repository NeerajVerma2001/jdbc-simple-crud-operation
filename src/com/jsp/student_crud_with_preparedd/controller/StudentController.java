package com.jsp.student_crud_with_preparedd.controller;

import java.util.Scanner;

import com.jsp.student_crud_with_preparedd.Service.StudentService;
import com.jsp.student_crud_with_preparedd.dto.Student;

public class StudentController 
{
//	public static void main(String[] args) {
//		Student student = new Student(101,"aman","aman123@gmail.com",83727648);
//		StudentDao studentDao= new StudentDao();
//		studentDao.insertStudent(student);
//		System.out.println("inserted");
//	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1. Insert\n2. UpdateEmail\n3. UpdateName\n4. UpdatePhone\n5. DeleteStudent\n6. Display");
		while(true)
		{
			Student student = new Student();
			StudentService service = new StudentService();
			
			
			int ch = scanner.nextInt();
			switch(ch) 
			{
			case 1:{
				System.out.println("Enter your id");
				student.setStudentId(scanner.nextInt());
				System.out.println("Enter your name");
				student.setStudentName(scanner.next());
				System.out.println("Enter your email");
				student.setStudentEmail(scanner.next());
				System.out.println("Enter your phone");
				student.setStudentPhone(scanner.nextLong());
				
				service.insertStudent(student);
			}break;
			case 2:{
				System.out.println("Enter your id");
				int id = scanner.nextInt();
				System.out.println("Enter your email");
				String email = scanner.next();
				
				service.updateStudentEmail(id, email);

			}break;
			case 3:
			{
				System.out.println("Enter your id");
				int id = scanner.nextInt();
				System.out.println("Enter your name");
				String name = scanner.next();
				
				service.updateStudentName(id, name);
			}break;
			
			case 4:
			{
				System.out.println("Enter your id");
				int id = scanner.nextInt();
				System.out.println("Enter your phone");
				Long phone = scanner.nextLong();
				
				service.updateStudentPhone(id,phone);
			}break;
			
			
		case 5:
		{
			System.out.println("Enter your id");
			int id = scanner.nextInt();
			
			service.deleteStudentId(id);
			
		}break;
		
		case 6:
		{
//			System.out.println("Enter your id");
//			int id = scanner.nextInt();
			
			service.displayStudentDetails();
		}break;
		
		}
		}
	}
}
