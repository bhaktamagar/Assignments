package Question14;

import java.util.Scanner;

public class ThreeSignDemo {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int num1, num2;
		System.out.print("Please, enter num1: ");
		num1 = kbd.nextInt();
		System.out.print("Please, enter num2: ");
		num2 = kbd.nextInt();
		if (num1 == num2) {
			System.out.print("I found the equal numbers.");
		} else if (num1 > num2) {
			System.out.print("The num1 is greater than the num2.");
		} else {
			System.out.print("The num1 is less than the num2.");
		}

	}

}
