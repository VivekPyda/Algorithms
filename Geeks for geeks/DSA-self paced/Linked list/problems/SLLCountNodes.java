/* 
 * Problem 1: 
 * Given a singly linked list. 
 * The task is to find the length of the linked list,
 * where length is defined as the number of nodes in the linked list. */

package problems;

public class SLLCountNodes {

	static class ListNode {
		int data;
		ListNode next;

		ListNode(int data) {
			this.data = data;
			next = null;
		}
	}

	public static int getCount(ListNode head) {
		int count = 0;

		while (null != head) {
			count++;
			head = head.next;
		}

		return count;
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(10);
		ListNode node2 = new ListNode(20);
		ListNode node3 = new ListNode(30);

		node1.next = node2;
		node2.next = node3;
		display(node1);

		System.out.println("\nCount: " + getCount(node1));
	}

	public static void display(ListNode head) {
		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.print(head);
	}
}
