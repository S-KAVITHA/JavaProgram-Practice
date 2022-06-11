package PracticePgms;

import java.util.Scanner;

public class FactorialEx {

	// the factorial of 4 is 4󫢪�1, which is equal to 24

	public static void main(String args[]) {

		System.out.println("Enter No");
		@SuppressWarnings("resource")
		int number = new Scanner(System.in).nextInt();
		int getFact = factorial(number);
		System.out.println(getFact);

		// ---------recursive-------
		System.out.println("----------recursive------");
		int getFact1 = factorial1(number);
		System.out.println(getFact1);
	}

	public static int factorial(int number) {
		int factNumber = 1;
		for (int i = number; i > 0; i--) {
			factNumber *= i;
		}
		return factNumber;
	}

	public static int factorial1(int number) {
		//System.out.println(number );
		if (number == 0) {
			return 1;
		}

		
		return number * factorial1(number - 1);
	}

}
