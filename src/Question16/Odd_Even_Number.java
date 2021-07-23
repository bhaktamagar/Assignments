package Question16;
import java.util.Scanner;
public class Odd_Even_Number {

	public static void main(String[] args) {
        int num;
        Scanner kbd = new Scanner(System.in);
        System.out.print("Please, Enter any number you want to check: ");
        num = kbd.nextInt();
        if(num % 2 == 0)
        {
            System.out.println("The number " + num + " is Even. ");
        }
        else
        {
            System.out.println("The number "+ num +" is Odd. ");
	}
	}
}
