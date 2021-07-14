package Question6OfPerimeter;

import java.util.Scanner;

public class PerimeterDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final double PI = 3.14;
		
		System.out.print("Please, Enter amount of rate is: ");
		double r = input.nextDouble();		
		double perimeterOfCircle = 2*PI * r;		
		System.out.println("The result of Perimeter of circle is: " + perimeterOfCircle);
		
		System.out.println(" ");
		
		System.out.print("Please, Enter value of side: ");
		double s1 = input.nextDouble();		
		System.out.print("Please, Enter value of base: ");
		double b = input.nextDouble();
		System.out.print("Please, Enter value of side: ");
		double s2 = input.nextDouble();		
		double perimeterOfTriangle = s1 + b + s2;
		System.out.println("The result of perimeter of triangle is: " + perimeterOfTriangle);
		
		System.out.println(" ");
		
		System.out.print("Please, Enter value of length : ");
		double l = input.nextDouble();		
		System.out.print("Please, Enter value of Width: ");
		double w = input.nextDouble();
		double perimeterOfRectangle = 2 * (l + w);
		System.out.println("The result of perimeter of Rectangle is: " + perimeterOfRectangle);	
	}

}
