package lectures;

import java.util.Scanner;

public class BinaryEquivalent {

	public static void binaryEquivalent(int num) {
		if (num == 0)
			return;

		binaryEquivalent(num / 2);
		System.out.print(num % 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		binaryEquivalent(num);

		sc.close();
	}

}
