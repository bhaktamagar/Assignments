package Question13;
import java.util.Scanner;
public class NegativeDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Please, Enter your number: ");
        int input = in.nextInt();
        if (input < 0)
        {
            System.out.println("The negative number is: " + input);
        }
        else
        {
            System.out.println("This is a positive number: " + input);
        }
	}

}
