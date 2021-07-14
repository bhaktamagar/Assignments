package Introduction;
import java.util.Scanner;
public class AverageNum {

	public static void main(String[] args) {
		Scanner inputNum = new Scanner(System.in);
				
		System.out.print("Enter first integer number is: ");
		int mark1 = inputNum.nextInt();
		System.out.print("Enter second integer number is: ");
		int mark2 = inputNum.nextInt();
		System.out.print("Enter third integer number is: ");
		int mark3 = inputNum.nextInt();
		System.out.print("Enter fourth integer number is: ");
		int mark4 = inputNum.nextInt();
		System.out.print("Enter fifth integer number is: ");
		int mark5 = inputNum.nextInt();
		
		System.out.println("");
		int sum = mark1 + mark2 + mark3 + mark4 + mark5;
		System.out.print("Your additional number is:" + " " + sum);
		
		System.out.println("");
		 int average = mark1 + mark2 + mark3 + mark4 + mark5 / 5;
		 System.out.print("Your average number is: " + average);
	}

}
