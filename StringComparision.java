package week3.day1;

public class StringComparision {

	public static void main(String[] args) {
		String String1 = "I am Learning Java";
        String String2 = "I am learning java?";
          // Test any of the above Strings equal to one another
        boolean equals1 = String1.equalsIgnoreCase(String2);
        
        // Display the results of the equality checks.
        System.out.println("\"" + String1 + "\" equals \"" +
        		String2 + "\"? " + equals1);
        	}

}
