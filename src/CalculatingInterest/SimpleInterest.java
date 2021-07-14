package CalculatingInterest;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner kbrd = new Scanner(System.in);
		
		int time = 0;
		double principal = 0.0, rate = 0.0, simInterest = 0.0;
		
		System.out.print("Please, enter the principal is: ");
		 principal = kbrd.nextDouble();
		
		 System.out.print("Please, enter the rate of interest: ");
		 rate = kbrd.nextDouble();		
		 
		 System.out.print("Please, enter the time period: ");
		 time = kbrd.nextInt();	
		 
		 simInterest = principal * time * rate / 100;
		 System.out.println("Your interest total is: " + simInterest);	 		
	}
}
