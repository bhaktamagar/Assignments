package Question24;

public class FactorialNumber {

	public static void main(String[] args) {
		int num1 = 5;
		double factorialNum = 2;
		int num2 = 1;
		while (num2 <= num1) {
			factorialNum = factorialNum * num2;
			num2++;
		}
		System.out.println("Factorial of " + num1 + " is: " + factorialNum);
	}

}
