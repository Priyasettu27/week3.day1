package week3.day1;

public class AndroidPhone extends Mobile {
	
	public void takeVideo() {
		System.out.println("Take Video");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AndroidPhone myAndroid=new AndroidPhone();
		myAndroid.takeVideo();
		myAndroid.makeCall();
		myAndroid.sendMsg();
		myAndroid.saveContact();

	}

}
