package Question8OfFC;
import java.util.Scanner;

public class ConvertOfFahrenheitAndCelsius {

	public static void main(String[] args) {
		
 	    Scanner sc=new Scanner(System.in);
 	    double a, f;
 	    System.out.print("Enter Fahrenheit temperature: ");
        f = sc.nextDouble(); 
        a = (f-32)*5/9;
       System.out.println("Celsius temperature is: " + a);	
       
       System.out.println();
       
       double tem, c;
	    System.out.print("Enter Celsius temperature: ");
       c = sc.nextDouble(); 
       tem = ((9*c)/5)+32;
      System.out.println("Fahrenheit temperature is = " + tem);
	}

}
