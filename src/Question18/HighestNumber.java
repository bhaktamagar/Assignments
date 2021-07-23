package Question18;

import java.util.Scanner;

public class HighestNumber {

	public static void main(String[] args) {
		Scanner largestNum = new Scanner(System.in);
		System.out.print("Please, Enter the first number: ");
		int x = largestNum.nextInt();
		System.out.print("Please, Enterr the second number: ");
		int y = largestNum.nextInt();
		System.out.print("Please, Enter the third number: ");
		int z = largestNum.nextInt();

		if (x > y && x > z) {
			System.out.println("The largest number is: " + x);
		} else if (y > z && y > x) {
			System.out.println("The largest number is:" + y);
		} else {
			System.out.println("The largest number is: " + z);
		}
			System.out.println("You found the largest number, Thank you");
	}

}
