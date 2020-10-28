/* 
 * Problem 4
 * 
 * Given a dictionary of words dict where each word follows CamelCase notation, 
 * print all words in the dictionary that match with a given pattern 
 * consisting of uppercase characters only.
 * 
 * Input:
 * n = 8
 * dict[] = {Hi,Hello,HelloWorld,HiTechHiGeek,HiTechWorld,HiTechCity,HiTechLab}
 * Hi Hello HelloWorld HiTechHiGeek HiTechWorld HiTechCity HiTechLab
 * pattern = HA
 * Output: No match found
 * 
 * Input:
 * n = 3
 * dict[]={WelcomeGeek,WelcomeToGeeksForGeeks,GeeksForGeeks}
 * WelcomeGeek WelcomeToGeeksForGeeks GeeksForGeeks
 * pattern = WTG
 * Output: WelcomeToGeeksForGeeks
 * Explanation: WTG occurs in WelcomeToGeeksForGeeks.
 */

package problems;

import java.util.Scanner;

public class CamelCase {

	static final int SIZE = 124;

	static class TrieNode {
		TrieNode[] children = new TrieNode[SIZE];
		boolean isEnd;

		TrieNode() {
			isEnd = false;

			for (int i = 0; i < SIZE; i++) {
				children[i] = null;
			}
		}
	}

	static void findAllWords(String[] dict, String pattern, int numberOfWords) {
		// Your code here
		TrieNode trie = new TrieNode();

		for (String word : dict)
			insert(trie, word);

		char[] patternChar = pattern.toCharArray();

		search(trie.children[patternChar[0]], patternChar, 1, "" + patternChar[0]);

	}

	static void insert(TrieNode trie, String key) {
		for (int i = 0; i < key.length(); i++) {
			int index = key.charAt(i);

			if (trie.children[index] == null) {
				trie.children[index] = new TrieNode();
			}

			trie = trie.children[index];

			if (i == key.length() - 1) {
				trie.isEnd = true;
			}
		}
	}

	static void search(TrieNode trie, char[] pattern, int index, String s) {
		if (trie.isEnd && index == pattern.length)
			System.out.println(s);

		for (int i = 0; i < SIZE; i++) {
			if (trie.children[i] != null) {
				if (index < pattern.length) {
					if (i == pattern[index]) {
						index = index + 1;
					} else if (i < 92) {
						continue;
					}
				}

				search(trie.children[i], pattern, index, s + (char) i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("No. of test cases: ");
		int t = sc.nextInt();

		while (t-- > 0) {
			System.out.println("No. of words: ");
			int n = sc.nextInt();
			sc.nextLine();

			System.out.println("List of words (Space seperated): ");
			String[] dict = sc.nextLine().split(" ");

			System.out.println("Pattern to be searched: ");
			String pattern = sc.next().toUpperCase();

			findAllWords(dict, pattern, n);
		}

		sc.close();
	}
}
