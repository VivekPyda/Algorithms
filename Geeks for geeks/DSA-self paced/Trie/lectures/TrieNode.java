/* Representatiton of Trie data structure */

package lectures;

public class TrieNode {
	TrieNode[] child = new TrieNode[26];
	boolean isEnd;
}