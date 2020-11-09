/*
 * Given a number and bit position,
 * Check if the bit is set or not at given position in the number.
 * 
 * Example 1: 
 * Input: 
 * num = 5(101)
 * k = 3
 * Output: true
 * 
 * Example 1: 
 * Input: 
 * num = 5(101)
 * k = 1
 * Output: true
 * 
 *  Example 1: 
 * Input: 
 * num = 5(101)
 * k = 2
 * Output: false
 */

package lectures;

import java.util.Scanner;

public class KthSetBit {

	public static boolean kthSetBit(int num, int k) {
		return ((num >>= k - 1) & 1) != 0;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("Enter k val: ");
		int k = sc.nextInt();

		System.out.println(kthSetBit(num, k));

		sc.close();

	}

}
