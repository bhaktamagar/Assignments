package Question10;

import java.util.Scanner;
public class MathematicalFunction {

	public static void main(String[] args) {
		
		Scanner keybord = new Scanner(System.in);
		System.out.print("Please, Enter a: ");
		double a = keybord.nextDouble();
		System.out.print("Please, Enter u: ");
		double u = keybord.nextDouble();
		System.out.print("Please, Enter t: ");
		double t = keybord.nextDouble();
		
		double s = u * t + 0.5 * a * t * t;
		System.out.println("The result is: " + s);
		
	}

}
