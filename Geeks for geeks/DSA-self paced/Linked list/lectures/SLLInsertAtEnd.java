/* Given a linked list and a value, 
 * insert value at end of the linked list
 */

package lectures;

public class SLLInsertAtEnd {

	static class ListNode {
		int data;
		ListNode next;

		ListNode(int data) {
			this.data = data;
			next = null;
		}
	}

	public static ListNode insertAtEnd(ListNode head, int val) {
		ListNode newNode = new ListNode(val);
		ListNode ref = head;
		while (ref.next != null) {
			ref = ref.next;
		}
		ref.next = newNode;
		return head;
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(10);
		ListNode node2 = new ListNode(20);
		ListNode node3 = new ListNode(30);

		node1.next = node2;
		node2.next = node3;

		int val = 5;

		display(insertAtEnd(node1, val));

	}

	public static void display(ListNode head) {
		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.print(head);
	}

}
