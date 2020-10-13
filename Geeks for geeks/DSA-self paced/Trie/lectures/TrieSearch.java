/* Search for "bad", "geek", "gee", "cater" 
 * in {"bad", "bat", "geek", "geeks", "cat", "cut", "zoo"} 
 * and return true if exists else return false */

package lectures;

public class TrieSearch {

	public static boolean trieSearch(TrieNode trie, String key) {

		for (int i = 0; i < key.length(); i++) {
			int index = key.charAt(i) - 'a';

			if (trie.child[index] == null)
				return false;

			trie = trie.child[index];
		}

		return trie.isEnd;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] keys = { "bad", "bat", "geek", "geeks", "cat", "cut", "zoo" };
		TrieNode trie = TrieInsert.trieInsert(keys);

		String[] searchKeys = { "bad", "geek", "gee", "cater", "geeks" };

		for (String key : searchKeys) {
			System.out.println(key + ": " + trieSearch(trie, key));
		}
	}

}
