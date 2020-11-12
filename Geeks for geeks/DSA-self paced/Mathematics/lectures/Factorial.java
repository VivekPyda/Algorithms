/* 
 * Compute the factorial of the given number.
 */

package lectures;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input = sc.nextInt();
		int res = 1;

		for (int i = 1; i <= input; i++) {
			res *= i;
		}

		System.out.println(res);

		sc.close();
	}

}
