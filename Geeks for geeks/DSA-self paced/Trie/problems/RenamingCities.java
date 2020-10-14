/* Given N renamed cities consisting of lowercase alphabets only. 
 * The task is to generate a station ID for all the stations.
 * 
 * Input:
 * N = 6
 * Cities[] = {shimla,safari,jammu,delhi,jammu,dehradun}
 * shimla safari jammu delhi jammu dehradun
 * 
 * Output:
 * s
 * sa
 * j
 * d
 * jammu 2
 * deh
 */

package problems;

import java.util.Scanner;

public class RenamingCities {

	static final int ALPHABET_SIZE = 26;

	static class TrieNode {
		TrieNode[] child = new TrieNode[ALPHABET_SIZE];
		int count;
		boolean isEnd;

		TrieNode() {
			count = 0;
			isEnd = false;

			for (int i = 0; i < ALPHABET_SIZE; i++)
				child[i] = null;
		}
	};

	public static void check(String arr[], int n) {

		TrieNode root = new TrieNode();

		for (int i = 0; i < n; i++) {
			insert(root, arr[i]);
		}
	}

	public static void insert(TrieNode root, String city) {
		int end = 1;

		for (int i = 0; i < city.length(); i++) {
			int index = city.charAt(i) - 'a';

			if (root.child[index] == null) {
				root.child[index] = new TrieNode();
			} else {
				end++;
			}

			root = root.child[index];
		}

		if (city.length() == end - 1) {
			root.count++;
			System.out.println(city + " " + root.count);
		} else {
			System.out.println(city.substring(0, end));
			root.count = 1;
		}

		root.isEnd = true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("No. of test cases: ");
		int t = sc.nextInt();

		while (t-- > 0) {
			System.out.println("No. of cities: ");
			int n = sc.nextInt();
			sc.nextLine();

			System.out.println("List of cities (Space seperated): ");
			String[] cities = sc.nextLine().split(" ");

			check(cities, n);
		}

		sc.close();
	}

}
