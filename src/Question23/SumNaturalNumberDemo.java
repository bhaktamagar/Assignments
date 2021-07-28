package Question23;

public class SumNaturalNumberDemo {

	public static void main(String[] args) {
		int num = 5, count = 1, sum = 0;
		while (count <= num) {
			sum = sum + count;
			count++;
		}
		System.out.println("Sum of first 10 natural numbers is: " + sum);
	}

}
