package Question25;

import java.util.Scanner;

public class studentHighestScore {
	/*25.	Write a program that prompts the user 
	to enter the number of students and each student’s name and score.
	Finally display the student with the highest score. */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double highestScore = 0;
		double studentScore = 0;
		String studentName = "";
		double count = 0;
		double totalStudents = 0;

		System.out.print("Please, enter Student name: ");
		studentName = sc.next();
		System.out.print("Please, enter Student score: ");
		highestScore = sc.nextInt();
		System.out.print("Enter the total number of students: ");
		totalStudents = sc.nextDouble();

		while (count < totalStudents) {
			count++;
			if (studentScore > highestScore) {
				highestScore = studentScore;

			} else {
				System.out.println(studentName + " has the highest score of " + highestScore);
			}
		}
	}
}