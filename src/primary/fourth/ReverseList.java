package primary.fourth;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(3);
		printLinkedList(head1);
		head1 = reverseList(head1);
		System.out.println("============================");
		printLinkedList(head1);
		
		DoubleNode head2 = new DoubleNode(1);
		head2.last = new DoubleNode(2);
		head2.last.front = head2;
		head2.last.last = new DoubleNode(3);
		head2.last.last.front = head2.last;
		head2.last.last.last = new DoubleNode(4);
		head2.last.last.last.front = head2.last.last;
		printDoubleLinkedList(head2);
		System.out.println();
		System.out.println("============================");
		printDoubleLinkedList(reverseList(head2));

	}
	public static class Node {
		private int value;
		private Node next;
		
		public Node(int data) {
			this.value = data;
		}
	}
	
	public static class DoubleNode {
		private int value;
		private DoubleNode last;
		private DoubleNode front;
		
		public DoubleNode(int data) {
			this.value = data;
		}
	}
	
	public static DoubleNode reverseList(DoubleNode head) {
		DoubleNode next = null;
		DoubleNode pre = null;
		while (head != null) {
			next = head.last;
			head.last = pre;
			head.front = next;
			pre = head;
			head = next;
		}
		return pre;
	}
	
	public static void printDoubleLinkedList(DoubleNode head) {
		DoubleNode end = null;
		while (head != null) {
			System.out.print(head.value + " ");
			end = head;
			head = head.last;
		}
		System.out.println();
		while (end != null) {
			System.out.print(end.value + " ");
			end = end.front;
		}
	}
	
	public static Node reverseList(Node head) {
		Node pre = null;
		Node next = null;
		while (head != null) {
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}
	
	public static void printLinkedList(Node head) {
		while (head != null) {
			System.out.print(head.value + " ");
			head = head.next;
		}
		System.out.println();
	}

}
