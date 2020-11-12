/*
 * Given an array of numbers, 
 * Find the only number that appears odd number of times in the array.
 * 
 * Example 1:
 * Input:
 * 4 3 4 4 4 5 5
 * Output: 3
 * 
 * Example 2:
 * Input:
 * 8 7 7 8 8
 * Output: 8
 */

package lectures;

import java.util.Scanner;

public class OneOddOccuring {

	public static int oddOccuringNumber(int[] arr) {

		int num = 0;

		for (int i = 0; i < arr.length; i++) {
			num ^= arr[i];
		}

		return num;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();

		System.out.println("Enter array values: ");
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(oddOccuringNumber(arr));

		sc.close();
	}

}
