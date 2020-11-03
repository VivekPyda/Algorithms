/* Given a Linked list and value, 
 * search the list and return position of the element in the list
 * If not found, return -1
 */

package lectures;

public class SLLSearch {

	static class ListNode {
		int data;
		ListNode next;

		ListNode(int data) {
			this.data = data;
			next = null;
		}
	}

	public static int searchALinkedList(ListNode head, int val) {
		int position = 0;

		while (head != null) {
			if (head.data == val)
				return position + 1;

			position++;
			head = head.next;
		}

		return -1;
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(10);
		ListNode node2 = new ListNode(20);
		ListNode node3 = new ListNode(30);

		node1.next = node2;
		node2.next = node3;
		display(node1);

		int val = 30;

		System.out.println("\nPosition: " + searchALinkedList(node1, val));
	}

	public static void display(ListNode head) {
		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.print(head);
	}

}
