package week3.day1;

public class Mobile {

	public void sendMsg(){
		System.out.println("Send Message Successfully");
		
	}
	public void makeCall(){
		System.out.println("Make call successfully");
	}
	public void saveContact() {
		System.out.println("Save contact Successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile myMobile=new Mobile();
		myMobile.sendMsg();
		myMobile.makeCall();
		myMobile.saveContact();
		
	}

}
