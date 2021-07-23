package Question19;

import java.util.Scanner;

public class SideOfTriangle {

	public static void main(String[] args) {

		Scanner sOfT = new Scanner(System.in);

		System.out.print("Please, Enter the first side number of the triangle: ");
		int a = sOfT.nextInt();

		System.out.print("Please, Enter the second side number of the triangle: ");
		int b = sOfT.nextInt();

		System.out.print("Please, Enter the third side number of the triangle: ");
		int c = sOfT.nextInt();

		if (a < b + c && b < a + c && c < a + b) {
			if (a == b && b == c)
				System.out.print("This will be an Equilateral triangle");
			else if (a == b || b == c || c == a)
				System.out.println("This will an Isosceles triangle");
			else
				System.out.println("This is a Scalene triangle");
		} else
			System.out.println("It cannot form a triangle");		
	}	
		
}
