/*
 * Given a number as input,
 * Find number of set bits(1) does the number have when its represented in binary form.
 * 
 * Example 1: 
 * Input: 5
 * Output: 2
 * 
 * Example 2:
 * Input: 15
 * Output: 4
 * 
 * Example 3:
 * Input: 0
 * Output: 0
 */

package lectures;

import java.util.Scanner;

public class CountSetBits {

	public static int countSetBits(int num) {

		int count = 0;

		while (num > 0) {
			num &= num - 1;
			count++;
		}

		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();

		System.out.println(countSetBits(num));

		sc.close();
	}

}
