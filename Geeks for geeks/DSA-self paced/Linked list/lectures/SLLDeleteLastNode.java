package lectures;

public class SLLDeleteLastNode {

	static class ListNode {
		int data;
		ListNode next;

		ListNode(int data) {
			this.data = data;
			next = null;
		}
	}

	public static ListNode deleteFirstNode(ListNode head) {
		if (null == head)
			return head;

		ListNode ref = head;
		ListNode prev = null;

		while (ref.next != null) {
			prev = ref;
			ref = ref.next;
		}

		prev.next = null;

		return head;
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(10);
		ListNode node2 = new ListNode(20);
		ListNode node3 = new ListNode(30);

		node1.next = node2;
		node2.next = node3;

		System.out.println("Before deletion: ");
		display(node1);

		node1 = deleteFirstNode(node1);

		System.out.println("\nAfter deletion: ");
		display(node1);
	}

	public static void display(ListNode head) {
		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.print(head);
	}

}
