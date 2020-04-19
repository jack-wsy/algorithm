package primary.fourth;

import primary.fourth.ReverseList.Node;

public class PrintCommonPart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node1 = new Node(2);
		node1.next = new Node(3);
		node1.next.next = new Node(5);
		node1.next.next.next = new Node(6);

		Node node2 = new Node(1);
		node2.next = new Node(2);
		node2.next.next = new Node(5);
		node2.next.next.next = new Node(7);
		node2.next.next.next.next = new Node(8);
		
		printLinkedList(node1);

		printLinkedList(node2);
		printCommon(node1, node2);

	}
	
	public static class Node {
		private int value;
		private Node next;
		
		public Node(int data) {
			this.value = data;
		}
	}
	
	public static void printCommon(Node first, Node second) {
		while (first != null && second != null) {
			if (first.value < second.value) {
				first = first.next;
			}else if (first.value == second.value) {
				System.out.print(first.value + " ");
				first = first.next;
				second = second.next;
			}else {
				second = second.next;
			}
		}
	}
	
	public static void printLinkedList(Node node1) {
		while (node1 != null) {
			System.out.print(node1.value + " ");
			node1 = node1.next;
		}
		System.out.println();
	}

}
