/*
 * Given a number and positive exponent,
 * Computer the power of given number using iterative approach.
 */

package lectures;

import java.util.Scanner;

public class ComputingPowerIterative {

	public static double computingPowerUsingBinary(int num, int exp) {
		if (exp < 0)
			return 1 / computingPowerUsingBinary(num, -exp);

		int res = 1;

		while (exp > 0) {
			if ((exp & 1) == 1)
				res = res * num;
			num *= num;
			exp >>= 1;
		}

		return res;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("Enter the exponent value: ");
		int exp = sc.nextInt();

		System.out.println(computingPowerUsingBinary(num, exp));

		sc.close();
	}

}
