package Question17;
import java.util.Scanner;
public class CheckLeapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please, Enter any calender year: ");
		int year = input.nextInt();		
		if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
	}

}
