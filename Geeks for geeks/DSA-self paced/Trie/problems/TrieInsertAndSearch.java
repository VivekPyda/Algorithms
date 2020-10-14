/*
 * Input:
 * N = 8
 * key[] = {the,a,there,answer,any,by,bye,their}
 * search = the
 * Output: 1
 * 
 * Input:
 * N = 8
 * key[] = {the,a,there,answer,any,by,bye,their}
 * search = geeks
 * Output: 0
 */

package problems;

import java.util.Scanner;

public class TrieInsertAndSearch {

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

		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			sc.nextLine();

			String[] key = sc.nextLine().split(" ");

			TrieNode root = new TrieNode();
			for (int i = 0; i < n; i++) {
				insert(root, key[i]);
			}

			String abc = sc.nextLine();
			if (search(root, abc))
				System.out.println(1);
			else
				System.out.println(0);
		}

		sc.close();
	}
}
