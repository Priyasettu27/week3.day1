package org.system;
//single inheritance
public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("15.60-inch");
	}

	public static void main(String[] args) {
		Desktop size=new Desktop();
		size.computerModel();
		size.desktopSize();
		
		

	}

}
