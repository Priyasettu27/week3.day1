package org.college;

public class College {

	public void collegeName() {
		System.out.println("College Name: SSSS Jain college for women");
	}
	public void collegeCode() {
		System.out.println("collegeCode: 1234");
	}
	public void collegeRank() {
		System.out.println("college rank: #1");
	}
	public static void main(String[] args) {
		College col=new College();
		col.collegeName();
		col.collegeCode();
		col.collegeRank();

	}

}
