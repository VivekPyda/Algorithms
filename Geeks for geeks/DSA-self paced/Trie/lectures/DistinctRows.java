/* Given a binary matrix find number of distinct rows are present in the matrix
 * 
 * Example:
 * 1 0 0
 * 1 1 1 
 * 1 0 0
 * 1 1 1
 * 
 * Answer: 2 ([1 0 0],[1 1 1])
 */

package lectures;

public class DistinctRows {
	
	public static int distinctRows(int[][] matrix) {
		
		int count = 0;
		Node root = new Node();
		
		for(int i=0; i<matrix.length; i++) {
			if(insertRow(root, matrix[i])) {
				count++;
			}
		}
		
		return count;
	}
	
	private static boolean insertRow(Node root, int[] row) {
		
		for(int i=0; i<row.length; i++) {
			if(root.child[row[i]] == null)
				root.child[row[i]] = new Node();
			
			root = root.child[row[i]];
		}
		
		if(!root.isEnd) {
			root.isEnd = true;
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] test1 = {{1,0,0}, {1,1,1}, {1,0,1}, {1,0,0}, {1,1,1}};
		System.out.println(distinctRows(test1));
	}

}

class Node {
	Node[] child = new Node[2];
	boolean isEnd;
}
