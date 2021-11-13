package week3.day1;

public class StringAssignment {

	
	
	public StringAssignment(String string) {
		System.out.println("Construtor is created");
	}

	public static void main(java.lang.String[] args) {
		StringAssignment str3 = new StringAssignment("Kutty");
		 StringAssignment str4 = new StringAssignment("Kutty");
		 
		 if(str3==str4) {
			 System.out.println(" Same text");
		 }
		 else
			 System.out.println("Diff text");
		 
		 System.out.println("***");
		 /* It will return diff text as output because if we use == it will compare the object not the string
		  and == will be used only for primitive data types such as int and long. if you wan to compare string(non primitive) then you have to 
		  use .equals()method to compare the string value.*/
		

	}

}
