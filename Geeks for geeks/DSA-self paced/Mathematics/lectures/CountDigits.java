/*
 * Given a number, Count number of digits does the number have.
 */

package lectures;

import java.util.Scanner;

public class CountDigits {

	public static int countDigits(int num) {
		if (num == 0)
			return 1;
		return (int) Math.log10(num) + 1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();

		System.out.println(countDigits(num));

		sc.close();

	}

}
