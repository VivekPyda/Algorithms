/*
 * Given a number, find if the number is prime or not
 * If number is prime, print true
 * Else false
 */

package lectures;

import java.util.Scanner;

public class CheckForPrime {

	public static boolean isPrime(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int val = sc.nextInt();

		System.out.println(isPrime(val));

		sc.close();
	}

}
