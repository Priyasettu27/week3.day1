package week3.day1;

//Method Overloading
public class Students {

	public void getStudentInfo(int id,String name) {
		System.out.println("Student id:"+" "+id);
		System.out.println("Student Name:"+" "+name);
		
	}
	public void getStudentInfo(String email,int PhoneNumber) {
		System.out.println("Email ID:"+" "+email);
		System.out.println("PhoneNumber:"+" "+PhoneNumber);
		
	}
		
	public static void main(String[] args) {
		Students stu=new Students();
		stu.getStudentInfo(5061692, "priya");
		stu.getStudentInfo("abc@gmailcom", 999999999);
		
		
		

	}

}
