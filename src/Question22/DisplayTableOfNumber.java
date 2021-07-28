package Question22;

import java.util.Scanner;

public class DisplayTableOfNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Please, Enter a Number what you want: ");
		int num = scan.nextInt();

		System.out.print("Table of " + num + " is\n");
		for (int i = 1; i <= 10; i++) {
			int allNum = num * i;
			System.out.print(num + " * " + i + " = " + allNum + "\n");
		}
	}

}
