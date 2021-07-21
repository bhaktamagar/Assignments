package Question15;

import java.util.Scanner;

public class AscIICode {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please, Enter the number for an ASCII code between 0 and 128: ");
		int number = input.nextInt();
		if (number > 0 && number < 128) {
			System.out.println("The number of " + number
			+ " " + "for the AsCII Code, The character is: " + (char) number);
		} else {
			System.out.println("I'm out");
		}

	}

}
