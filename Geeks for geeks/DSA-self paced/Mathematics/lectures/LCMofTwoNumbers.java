/*
 * Given 2 numbers as input, find the LCM.
 */

package lectures;

import java.util.Scanner;

public class LCMofTwoNumbers {

	public static int GCD(int num1, int num2) {
		if (num1 > num2) {
			return GCD(num2, num1);
		}

		int rem = num2 % num1;
		if (rem == 0)
			return num1;
		return GCD(rem, num1);
	}

	public static int LCM(int num1, int num2) {
		return (num1 * num2) / GCD(num1, num2);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number 1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter number 2 : ");
		int num2 = sc.nextInt();

		System.out.println(LCM(num1, num2));

		sc.close();
	}

}
