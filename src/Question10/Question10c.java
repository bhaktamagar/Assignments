package Question10;

import java.util.Scanner;

public class Question10c {

	public static void main(String[] args) {
		Scanner keybord = new Scanner(System.in);
		System.out.print("Please, Enter a: ");
		double a = keybord.nextDouble();
		System.out.print("Please, Enter b: ");
		double b = keybord.nextDouble();
		System.out.print("Please, Enter c: ");
		double c = keybord.nextDouble();
		
		double x = (- b + Math.sqrt(b*b-4*a*c))/2*a;
		System.out.println("The result is: " + x);
		
	}

}
