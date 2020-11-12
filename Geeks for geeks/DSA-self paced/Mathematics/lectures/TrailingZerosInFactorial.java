/* 
 * Given an input N, find number of trailing zeros that occur after computing factorial of N. 
 * 
 * Example 1: 
 * Input : 10
 * Output : 2
 * 
 * Example 1: 
 * Input : 100
 * Output : 24
 * 
 * 
 */

package lectures;

import java.util.Scanner;

public class TrailingZerosInFactorial {

	public static int numberOfTrailingZeros1(int N) {
		int count5 = 0;

		for (int i = 1; i <= N; i++) {
			int temp = i;

			while (temp % 5 == 0) {
				temp /= 5;
				count5++;
			}
		}

		return count5;
	}

	public static int numberOfTrailingZeros2(int N) {
		int count5 = 0;
		int i = 5;

		while (i <= N) {
			count5 += (N / i);
			i *= 5;
		}

		return count5;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of N: ");
		int N = sc.nextInt();

		// Approach 1:
		System.out.println("Approach 1: " + numberOfTrailingZeros1(N));

		// Approach 2:
		System.out.println("Approach 2: " + numberOfTrailingZeros2(N));

		sc.close();
	}

}
