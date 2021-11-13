package org.student;
import org.department.Department;

//Multilevel Inheritance
public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name: Priya");
	}
	public void studentDept() {
		System.out.println("Student Department: BCA");
	}
	public void studentId() {
		System.out.println("Student ID: 5061692");
	}
	public static void main(String[] args) {
		Student stu=new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentDept();
		stu.studentId();

	}

}
