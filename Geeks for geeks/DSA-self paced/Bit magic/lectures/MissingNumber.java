/*
 * Given an array of integers from range 1 to n+1 with size n-1,
 * Find the missing number.
 * Note: Every number occurs exactly once.
 * 
 * Example 1:
 * Input:
 * 1 5 3 2
 * Output: 4
 * 
 * Example 2:
 * Input:
 * 1 4 3
 * Output: 2
 */

package lectures;

import java.util.Scanner;

public class MissingNumber {

	public static int missingNumber(int[] arr) {

		int missingNum = arr.length + 1;

		for (int i = 0; i < arr.length; i++) {
			missingNum ^= i + 1;
			missingNum ^= arr[i];
		}

		return missingNum;
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

		System.out.println(missingNumber(arr));

		sc.close();
	}

}
