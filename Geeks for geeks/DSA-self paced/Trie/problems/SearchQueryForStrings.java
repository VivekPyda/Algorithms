/* Write a function to insert list of words into a trie data structure and 
 * search for query strings in the Trie
 * 
 * Input:
 * N = 8, Q = 3
 * words[] = {the,a,there,answer,any,by,bye,their}
 * Queries[] = {the,an,any}
 * 
 * Output:
 * 1
 * 0
 * 1
 */

package problems;

import java.util.Scanner;

public class SearchQueryForStrings {

	static final int ALPHABET_SIZE = 26;

	static class TrieNode {
		TrieNode[] children = new TrieNode[ALPHABET_SIZE];
		boolean isEndOfWord;

		TrieNode() {
			isEndOfWord = false;

			for (int i = 0; i < ALPHABET_SIZE; i++)
				children[i] = null;
		}
	};

	static void insert(TrieNode root, String key) {
		for (int i = 0; i < key.length(); i++) {
			int index = key.charAt(i) - 'a';

			if (root.children[index] == null)
				root.children[index] = new TrieNode();

			root = root.children[index];
		}

		root.isEndOfWord = true;
	}

	static boolean search(TrieNode root, String key) {
		for (int i = 0; i < key.length(); i++) {
			int index = key.charAt(i) - 'a';

			if (root.children[index] == null)
				return false;

			root = root.children[index];
		}

		return root.isEndOfWord;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("No. of test cases: ");
		int t = sc.nextInt();

		while (t-- > 0) {
			System.out.println("No. of words to be inserted: ");
			int n = sc.nextInt();
			sc.nextLine();

			System.out.println("List of words to be inserted (Space seperated): ");
			String[] key = sc.nextLine().split(" ");

			TrieNode root = new TrieNode();
			for (int i = 0; i < n; i++) {
				insert(root, key[i]);
			}

			System.out.println("No. of words to be Queried: ");
			int q = sc.nextInt();
			sc.nextLine();

			System.out.println("List of words to be Queried (Space seperated): ");
			String[] query = sc.nextLine().split(" ");

			for (int i = 0; i < q; i++) {
				if (search(root, query[i]))
					System.out.println(1);
				else
					System.out.println(0);
			}

		}

		sc.close();

	}

}
