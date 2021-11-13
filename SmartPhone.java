package week3.day1;

public class SmartPhone extends AndroidPhone {

	public void connectWhatsApp() {
		System.out.println("connectWhatsApp");
	}
	public void takeVideo() {
		System.out.println("Don't Take Video");
	} 
	public static void main(String[] args) {

		SmartPhone mysmartphone=new SmartPhone();
		mysmartphone.connectWhatsApp();
		mysmartphone.takeVideo();
		mysmartphone.sendMsg();
		mysmartphone.makeCall();
		mysmartphone.saveContact();
		
	}

}
