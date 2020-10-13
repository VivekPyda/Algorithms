/* Delete "zoo", "geek", "bad" 
 * from {"bad", "bat", "geek", "geeks", "cat", "cut", "zoo"} */

package lectures;

public class TrieDelete {

	public static TrieNode trieDelete(TrieNode trie, String key) {
		return deleteKey(trie, key, 0);
	}

	private static TrieNode deleteKey(TrieNode trie, String key, int i) {
		if (trie == null)
			return null;

		if (i == key.length()) {
			trie.isEnd = false;

			if (!hasChild(trie))
				return null;

			return trie;
		}

		int index = key.charAt(i) - 'a';

		trie.child[index] = deleteKey(trie.child[index], key, i + 1);

		if (!hasChild(trie) && !trie.isEnd)
			return null;

		return trie;

	}

	private static boolean hasChild(TrieNode trie) {
		for (int i = 0; i < trie.child.length; i++) {
			if (trie.child[i] != null)
				return true;
		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] keys = { "bad", "bat", "geek", "geeks", "cat", "cut", "zoo" };
		TrieNode trie = TrieInsert.trieInsert(keys);

		String[] deleteKeys = { "zoo", "geek", "bad", "abc" };

		System.out.println("==== Before deleting ====");
		for (String key : deleteKeys) {
			System.out.println(key + ": " + TrieSearch.trieSearch(trie, key));
		}

		for (String key : deleteKeys) {
			trieDelete(trie, key);
		}

		System.out.println("==== After deleting ====");
		for (String key : deleteKeys) {
			System.out.println(key + ": " + TrieSearch.trieSearch(trie, key));
		}
	}

}
