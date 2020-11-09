/*
 * Given a string as input,
 * Print all the subsets of the characters in the string including empty string using bitwise operators.
 * 
 * Example:
 * Input: abc
 * Output: ["", "a", "b", "ab", "c", "ac", "bc", "abc"]
 */

package lectures;

import java.util.Scanner;

public class PowerSet {

	public static void powerSet(String s) {
		char[] chArray = s.toCharArray();
		int numberOfSubsets = 1 << chArray.length;

		for (int i = 0; i < numberOfSubsets; i++) {

			int j = 0;
			int n = i;

			System.out.print("\"");
			while (n > 0) {
				if ((n & 1) != 0) {
					System.out.print(chArray[j]);
				}
				n >>= 1;
				j++;
			}

			System.out.println("\"");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.next();
		powerSet(s);
		sc.close();
	}

}
