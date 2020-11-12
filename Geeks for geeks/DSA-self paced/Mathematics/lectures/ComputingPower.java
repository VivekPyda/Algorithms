package lectures;

import java.util.Scanner;

public class ComputingPower {

	/* Divide and conquer approach */
	public static int computingPower(int num, int exp) {
		if (exp == 0)
			return 1;

		if (exp == 1)
			return num;

		if ((exp & 1) == 0)
			return computingPower(num, exp / 2) * computingPower(num, exp / 2);
		else
			return computingPower(num, exp / 2) * computingPower(num, exp / 2) * num;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("Enter the exponent value: ");
		int exp = sc.nextInt();

		System.out.println(computingPower(num, exp));

		sc.close();
	}

}
