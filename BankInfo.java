package bank;

public class BankInfo {

	public void saving() {
		System.out.println("Savings:10,000");
	}
	public void fixed() {
		System.out.println("fixed:5");
	}
	public void Deposit() {
		System.out.println("Deposit:500");
	}
	public static void main(String[] args) {
		BankInfo info=new BankInfo();
		info.saving();
		info.fixed();
		info.Deposit();

	}

}
