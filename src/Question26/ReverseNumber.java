package Question26;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 0;
		int reverseNum = 0;
		System.out.print("please, Enter any number that you want to reverse: ");
		num = in.nextInt();
		
		while (num != 0) {
			reverseNum = reverseNum * 10;
			reverseNum = reverseNum + num % 10;
			num = num / 10;
		}
		System.out.println("Your reverse number is: " + reverseNum);
		}
}
