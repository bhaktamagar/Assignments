package Question10;
import java.util.Scanner;
public class Question10b {

	public static void main(String[] args) {
		Scanner keybord = new Scanner(System.in);
		System.out.print("Please, Enter a: ");
		double a = keybord.nextDouble();
		System.out.print("Please, Enter b: ");
		double b = keybord.nextDouble();
		System.out.print("Please, Enter c: ");
		double c = keybord.nextDouble();
		
		double s = (a+b+c)/2;
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.println("The result is: " + area);
		
		
	}

}
