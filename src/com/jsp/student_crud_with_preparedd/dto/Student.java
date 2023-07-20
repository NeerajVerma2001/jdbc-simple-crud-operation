package com.jsp.student_crud_with_preparedd.dto;
/**
 * 
 * @author admin
 *
 */
public class Student 
{
	private int studentId;
	private String studentName;
	private String studentEmail;
	private long studentPhone;
	
	/*
	 * ALT+SHIFT+S+S+A FOR toString
	 * 
	 */
	
	
	/*
	 * ============================================================alt+shift+s+r ==== for toString===================================================
	 */
	
	/*
	 * =========================================================alt+s+a+r for parametrized constructor=======================================================
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}
//	
//	public Student(int studentId, String studentName, String studentEmail, long studentPhone) 
//	{
//		super();
//		this.studentId = studentId;
//		this.studentName = studentName;
//		this.studentEmail = studentEmail;
//		this.studentPhone = studentPhone;
//	}
//	
	/*
	 *============================= alt+s+r for setter and getter method
	 */
	
//	@Override
//	public String toString() {
//		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail=" + studentEmail
//				+ ", studentPhone=" + studentPhone + ", getStudentId()=" + getStudentId() + ", getStudentName()="
//				+ getStudentName() + ", getStudentEmail()=" + getStudentEmail() + ", getStudentPhone()="
//				+ getStudentPhone() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
//				+ super.toString() + "]";
//	}

	public int getStudentId() 
	{
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public long getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(long studentPhone) {
		this.studentPhone = studentPhone;
	}
	
	
}
