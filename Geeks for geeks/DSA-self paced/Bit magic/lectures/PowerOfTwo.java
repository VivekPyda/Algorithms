/*
 * Given a positive number,
 * Find if the number is a power of two or not
 * 
 * Example 1:
 * Input: 2
 * Output: true
 * 
 * Example 2:
 * Input: 8
 * Output: true
 * 
 * Example 3:
 * Input: 15
 * Output: false
 */

package lectures;

import java.util.Scanner;

public class PowerOfTwo {

	public static boolean isPowerOfTwo(int num) {
		return (num & num - 1) == 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		System.out.println(isPowerOfTwo(num));

		sc.close();
	}

}
