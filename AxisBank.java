package bank;

//Method Overriding
public class AxisBank extends BankInfo {
public void Deposit() {
	System.out.println("Deposit:100");
}
	public static void main(String[] args) {
		
	AxisBank depo=new AxisBank();
	depo.Deposit();
	}

}
