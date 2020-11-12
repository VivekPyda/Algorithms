/* 
 * Check if given number is a palindrome number.
 * If yes, return true
 * Else false
 */

package lectures;

import java.util.Scanner;

public class PalindromeNumber {

	public static boolean isPalindromeNumber(int input) {
		int val = input;
		int output = 0;
		int rem = 0;

		while (val > 0) {
			rem = val % 10;
			val /= 10;
			output = output * 10 + rem;
		}

		return output == input;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int input = sc.nextInt();

		System.out.print(isPalindromeNumber(input));

		sc.close();
	}

}
