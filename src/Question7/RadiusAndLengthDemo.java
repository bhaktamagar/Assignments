package Question7;
import java.util.Scanner;

public class RadiusAndLengthDemo {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner ( System.in );

		System.out.print("Enter the radius of a cylinder ");
		double radius = myScanner.nextDouble();
		System.out.print("Enter the length of a cylinder ");
		double length = myScanner.nextDouble();

		double bottom = radius * radius * 3.14;
		double volume = bottom * length;
		double area = ((2 * radius * 3.14 * length) + (2 * bottom));

		System.out.println("The Bottom is " + bottom);
		System.out.println("The volume is " + volume);

		System.out.println("The area is " + area);
	}

}
