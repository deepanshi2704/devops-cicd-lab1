package mypkg;

public class myCalculator {
	
	public int sum(int a, int b) {
		return (a+b);
	}
	public int diff(int a, int b) {
		return (a-b);
	}
	public int mul(int a, int b) {
		return (a*b);
	}

	public static void main(String[] args) {
		myCalculator calc = new myCalculator();
		System.out.println("Sum is: "+calc.sum(50, 40));
		System.out.println("Diff is: "+calc.diff(50, 40));
		System.out.println("Mul is: "+calc.mul(50, 40));

	}

}
