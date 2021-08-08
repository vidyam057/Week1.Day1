package Week1.day1;

public class LearnWhile {

	public static void main(String[] args) {

		int n = 345, rem, sum = 0;

		while (n != 0)

		{
			rem = n % 10;
			sum = sum + rem;
			n = n / 10;

		}
		System.out.println("Sum of the Digit is: " + sum);
	}

}
