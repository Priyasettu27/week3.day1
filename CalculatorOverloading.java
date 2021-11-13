package week3.day1;



public class CalculatorOverloading {
	
	//add -methods with 2 int and 3 int
	public void add(int num1,int num2) {
		System.out.println(num1+num2);
	}
	public void add1(int num1, int num2,int num3) {
		System.out.println(num1+num2+num3);
	}
	//sub -2 methods for subtract, 1 method with 2 int args , 1 method with 2 double args
	public void sub(int num1,int num2) {
		System.out.println(num1-num2);
	}

	public void sub1(double num1,double num2) {
		System.out.println(num1-num2);
	}
	//Multi-methods with 2 int args, 1method with 1 int and 1 double args
	
	public void multi(int num1,int num2) {
		System.out.println(num1*num2);
	}
	public void multi1(int num1,double num2) {
		System.out.println(num1*num2);
	}
	//divide-1 method with 2 int args, one to divide one double number with one int
	
	public void div(int num1,int num2) {
		System.out.println(num1/num2);
	}
	public void div1(double num1,int num2) {
		System.out.println(num1/num2);
	}
	public static void main(String[] args) {
	
		CalculatorOverloading calc=new CalculatorOverloading();
		calc.add(10, 5);
		calc.add1(10, 10, 10);
		calc.sub(10, 20);
		calc.sub1(30.5, 20.5);
		calc.multi(2, 3);
		calc.multi1(2, 12.5);
		calc.div(10, 5);
		calc.div1(34.5, 2);

	}

}
