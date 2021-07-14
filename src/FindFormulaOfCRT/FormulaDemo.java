package FindFormulaOfCRT;

import java.util.Scanner;

public class FormulaDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final double PI = 3.14;
		
		System.out.print("Please, Enter amount of rate is: ");
		double r = input.nextDouble();		
		double areaOfCircle = PI * r * r;		
		System.out.println("The result of area of circle is: " + areaOfCircle);
		
		System.out.println(" ");
		
		System.out.print("Please, Enter value of width: ");
		double w = input.nextDouble();		
		System.out.print("Please, Enter value of length: ");
		double l = input.nextDouble();
		double areaOfRectangle = w * l;
		System.out.println("The result of area of rectangle is: " + areaOfRectangle);
		
		System.out.println(" ");
		
		System.out.print("Please, Enter value of height: ");
		double h = input.nextDouble();		
		System.out.print("Please, Enter value of base: ");
		double b = input.nextDouble();
		double areaOfTringle = h * b / 2;
		System.out.println("The result of area of rectangle is: " + areaOfTringle);			
	}

}
