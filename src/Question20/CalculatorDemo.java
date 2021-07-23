package Question20;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		Scanner calc = new Scanner(System.in);
		System.out.print("Please, Enter any operators: + or - or * or /: ");
		char optr = calc.next().charAt(0);
		int a = 0, b = 0;
		if(optr == '+' || optr == '-' || optr == '*' || optr == '/') {		
		System.out.print("Please,Enter the first number: ");
		a = calc.nextInt();
		System.out.print("Please,Enter the second number: ");
		b = calc .nextInt();
		}
		switch (optr) {
		case '+':
			int sum = a + b;
			System.out.println("The sum is: " + sum);
			break;
		case '-':
			int sub = a - b;
			System.out.println("The substraction is: " + sub);
			break;
		case '*':
			int mult = a * b;
			System.out.println("The multiplication is: " + mult);
			break;
		case '/':
			int div = a / b;
			System.out.println("The division is: " + div);
			break;
		default:
			System.out.println("I chose the wrong operator!");
		}
		System.out.println("That's all.");
		}
	}


