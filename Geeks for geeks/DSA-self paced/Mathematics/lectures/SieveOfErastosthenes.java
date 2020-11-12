/*
 * Given a number, 
 * list all prime numbers less than or equal to the number 
 * using sieve of Erastosthenes Algorithm.
 */

package lectures;

import java.util.Scanner;

public class SieveOfErastosthenes {

	public static void sieveOfErastosthenes(int limit) {

		boolean[] primes = new boolean[limit + 1];

		for (int i = 2; i <= limit; i++) {
			if (!primes[i]) {
				System.out.print(i + " ");

				int j = i * i;

				while (j <= limit) {
					primes[j] = true;
					j += i;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the limit: ");
		int limit = sc.nextInt();

		sieveOfErastosthenes(limit);

		sc.close();
	}

}
