package Question9;
import java.util.Scanner;
public class ConvertOfPoundAndKg {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double pound , kilogram;
		System.out.print("enter the value of pound: ");
		pound = sc.nextDouble();
		kilogram = pound * 0.454;
		System.out.println("The value in kilogram is : " + kilogram + " " + "kg");
	}

}
