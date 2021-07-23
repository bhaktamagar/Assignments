package Question21;
import java.util.Scanner;
public class NameOfDay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, Input the numbers between 1 and 7: ");
		int days = sc.nextInt();
		
		switch (days) {
	    case 1: 
	    	String dayName1 = "Monday";
	    	System.out.print("This is " + dayName1); 
	    	break;
	    case 2: 
	    	String dayName2 = "Tuesday";
	    	System.out.print("This is " + dayName2); 
	    	break;
	    case 3: 
	    	String dayName3 = "Wednesday";
	    	System.out.print("This is " + dayName3); 
	    	break;
	    case 4: 
	    	String dayName4 = "Thursday";
	    	System.out.print("This is " + dayName4); 
	    	break;
	    case 5: 
	    	String dayName5 = "Friday";
	    	System.out.print("This is " + dayName5); 
	    	break;
	    case 6: 
	    	String dayName6 = "Saturday";
	    	System.out.print("This is " + dayName6); 
	    	break;
	    case 7: 
	    	String dayName7 = "Sunday";
	    	System.out.print("This is " + dayName7); 
	    	break;
	    default:
	    	System.out.println("Invalid day range.");
		}
		System.out.println("Thank you so much.");
	}
}
