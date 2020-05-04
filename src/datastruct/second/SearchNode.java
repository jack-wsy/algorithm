package datastruct.second;

import com.sun.javafx.scene.EnteredExitedHandler;

import datastruct.second.ListNode.Node;

public class SearchNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int[] arrb = {2, 5, 7, 8, 9};
		Node head = ListCreatNode.haveHeadList(arr);
		Node headB = ListCreatNode.haveHeadList(arrb);
		Node headC = mergeList(head, headB);
		ListCreatNode.printListNode(headC);
		System.out.println();
		ListCreatNode.printListNode(head.next);
		System.out.println();
		System.out.println(searchNode(head, 3).data);
		System.out.println(searchNodeValue(head, 3).data);
		insertNode(head, 3, 5);
		ListCreatNode.printListNode(head.next);
		deleteNode(head, 3);
		System.out.println();
		ListCreatNode.printListNode(head.next);
		Node[] arrNode = splitList(head);
		System.out.println();
		ListCreatNode.printListNode(arrNode[0].next);
		System.out.println();
		ListCreatNode.printListNode(arrNode[1].next);
	}
	
	/*
	 * 查找指定位置的结点
	 */
	public static Node searchNode(Node head, int i) {
		Node cur;
		cur = head.next;
		int j = 1;
		while (cur != null && j < i) {
			cur = cur.next;
			j++;
		}
		return j == i ? cur : null;
	}
	
	/*
	 * 根据值查找结点
	 */
	public static Node searchNodeValue(Node head, int data) {
		Node cur = head;
		while (cur != null && cur.data != data) {
			cur = cur.next;
		}
		return cur;
	}
	
	/*
	 * 插入一个新结点
	 */
	public static void insertNode(Node head, int index, int data) {
		Node cur = head;
		int j = 0;
		while (cur != null && j < index - 1) {
			cur = cur.next;
			j++;
		}
		if (cur == null) {
			return;
		}
		
		Node newNode = new Node(data);
		newNode.next = cur.next;
		cur.next = newNode;
		
//		Node temp = cur.next;
//		cur.next = new Node(data);
//		cur.next.next = temp;
	}
	
	public static int deleteNode(Node head, int index) {
		Node cur = head;
		int j = 1;
		while (cur != null && j < index) {
			cur = cur.next;
			j++;
		}
		if (cur == null) {
			System.exit(1);
		}
		Node delete = cur.next;
		int data = delete.data;
		cur.next = delete.next;
		return data;
	}
	
	/*
	 * 将一个链表分解成2个，一个存储基数序号， 一个存储偶数序号
	 */
	public static Node[] splitList(Node head) {
		Node cur = head.next;
		Node first = new Node(), second = new Node();
		Node l = first, r = second;
		while (cur != null) {
			first.next = cur;
			first = cur;
			cur = cur.next;
			if (cur != null) {
				second.next = cur;
				second = cur;
				cur = cur.next;
			}
		}
		first.next = second.next = null;
		return new Node[] {l, r};
	}
	/*
	 * 将两个有序链表合并成一个有序链表
	 */
	
	public static Node mergeList(Node headA, Node headB) {
		Node headC = new Node();
		Node curA = headA.next, curB = headB.next, curC = headC;
		while (curA != null && curB != null) {
			if (curA.data <= curB.data) {
				curC.next = curA;
				curC = curA;
				curA = curA.next;
			}else {
				curC.next = curB;
				curC = curB;
				curB = curB.next;
			}
		}
		curC.next = curA == null ? curB : curA;
		headB = null;
		return headC;
	}

}
