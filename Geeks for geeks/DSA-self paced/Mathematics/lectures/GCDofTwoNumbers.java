/* 
 * Given two numbers as input, find GCD/ HCF of given numbers 
 */

package lectures;

import java.util.Scanner;

public class GCDofTwoNumbers {

	public static int gcdOfTwoNumbers(int num1, int num2) {
		if (num1 > num2) {
			return gcdOfTwoNumbers(num2, num1);
		}

		int rem = num2 % num1;
		if (rem == 0)
			return num1;
		return gcdOfTwoNumbers(rem, num1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter number 2 : ");
		int num2 = sc.nextInt();

		System.out.println(gcdOfTwoNumbers(num1, num2));

		sc.close();
	}

}
