/* Insert {"bad", "bat", "geek", "geeks", "cat", "cut", "zoo"} 
 * in Trie data structure */

package lectures;

public class TrieInsert {

	public static TrieNode trieInsert(String[] keys) {
		TrieNode root = new TrieNode();

		for (String key : keys) {
			insertKey(root, key);
		}

		return root;
	}

	private static void insertKey(TrieNode trie, String key) {
		for (int i = 0; i < key.length(); i++) {
			int index = key.charAt(i) - 'a';

			if (trie.child[index] == null) {
				trie.child[index] = new TrieNode();
			}

			trie = trie.child[index];

			if (i == key.length() - 1) {
				trie.isEnd = true;
			}
		}
	}

	public static void main(String[] args) {
		String[] keys = { "bad", "bat", "geek", "geeks", "cat", "cut", "zoo" };
		trieInsert(keys);
		System.out.println("Trie created successfully!!");
	}
}
