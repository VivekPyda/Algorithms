/*
 * Given a number,
 * list all the numbers that are divisors of the number.
 */

package lectures;

import java.util.Scanner;

public class AllDivisorsOfANumber {

	public static void allDivisorsOfANumber(int num) {
		int i;

		for (i = 1; i < Math.sqrt(num); i++) {
			if (num % i == 0)
				System.out.print(i + " ");
		}

		for (; i > 0; i--) {
			if (num % i == 0)
				System.out.print(num / i + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		allDivisorsOfANumber(num);

		sc.close();
	}

}
