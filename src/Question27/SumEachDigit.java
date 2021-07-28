package Question27;

import java.util.Scanner;

public class SumEachDigit {

	public static void main(String[] args) {
		int num1, num2, total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, Enter the number: ");
		num1 = sc.nextInt();
		
		while (num1 > 0) {
			num2 = num1 % 10;
			total = total + num2;
			num1 = num1 / 10;
		}
		System.out.println("Sum of Digit is: " + total);
	}
}
