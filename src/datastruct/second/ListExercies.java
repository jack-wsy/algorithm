package datastruct.second;

import datastruct.second.ListNode.DoubleNode;
import datastruct.second.ListNode.Node;

public class ListExercies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrA = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] arrB = {3, 4, 5, 6, 7, 10, 11, 12};
		DoubleNode head = createListDoubleNode(arrA);
		insertDoubleNode(head, 5, 10);
		printListDoubleNode(head);
		System.out.println();
		Node headA = createListNode(arrA);
		Node headB = createListNode(arrB);
		Node headC = mergeSameListNode(headA, headB);
		printListNode(headC);
		System.out.println();
		swapNode(headA, headA.next.next.next.next);
		printListNode(headA);
		System.out.println();
		ASubtractB(arrA, arrB, arrA.length-1, arrB.length-1);
		printArray(arrA);
		System.out.println();
		printArray(arrB);
	}
	
	/*
	 * ˫ѭ����������һ�����֮ǰ����ֵΪy�Ľ��
	 */
	
	public static void insertDoubleNode(DoubleNode head, int x, int y) {
		DoubleNode pre = new DoubleNode(y), cur = searchNode(head, x);
		pre.right = cur;
		pre.left = cur.left;
		cur.left.right = cur.left = pre;
		
	}
	
	/*
	 * ��˫ѭ�������в���ֵΪx�Ľ�㲢����
	 */
	
	public static DoubleNode searchNode(DoubleNode head, int x) {
		DoubleNode cur = head.right;
		while (cur != head) {
			if (cur.data == x) {
				return cur;
			}
			cur = cur.right;
		}
		return null;
	}
	/*
	 * A��B��ͬԪ�� �����������г�����C, A, B��������
	 */
	public static Node mergeSameListNode(Node headA, Node headB) {
		Node curA = headA.next, curB = headB.next;
		Node headC = new Node(), rearC = headC, curC;
		while (curA != null && curB != null) {
			if (curA.data == curB.data) {
				curC = new Node(curA.data);
				rearC.next = curC;
				rearC = curC;
				curA = curA.next;
				continue;
			}
			if (curA.data > curB.data) {
				curB = curB.next;
			}else {
				curA = curA.next;
			}
		}
		
		return headC;
	}
	
	
	/*
	 * �������е���һ������̽ڵ�λ�ý���, ��֪head
	 */
	
	public static void swapNode(Node head, Node p) {
		Node left = head, right = p.next;
		while (left.next != p) {
			left =left.next;
		}
		left.next = right;
		p.next = right.next;
		right.next = p;
	}
	
	/*
	 * ������������˳���A��ɾ����B����ͬԪ��
	 */
	
	public static void ASubtractB(int[] arrA, int[] arrB, int arear, int brear) {
		int aPoint, bPoint;
		aPoint = bPoint = 0;
		while (aPoint <= arear && bPoint <= brear) {
			if (arrA[aPoint] == arrB[bPoint]) {
				arear = deleteArrayElement(arrA, aPoint, arear);
				continue;
			}
			if (arrA[aPoint] > arrB[bPoint]) {
				++bPoint;
			}else {
				++aPoint;
			}
		}
	}
	
	/*
	 * ɾ�������е�һ��Ԫ��
	 */
	
	public static int deleteArrayElement(int[] arr, int index, int rear) {
		while (index != rear) {
			arr[index] = arr[++index];
		}
		arr[rear] = 0;
		rear--;
		return rear;
	}
	
	/*
	 * ��ӡ�����е�Ԫ��
	 */
	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + "  ");
		}
	}
	
	/*
	 * ͨ��������������
	 */
	public static Node createListNode(int[] arr) {
		Node head = new Node(), rear = head, cur;
		for (int data : arr) {
			cur = new Node(data);
			rear.next = cur;
			rear = cur;
		}
		if (rear != null) {
			rear.next = null;
		}
		return head;
	}
	/*
	 * ��ӡ����
	 */
	
	public static void printListNode(Node head) {
		Node cur = head.next;
		while (cur != null) {
			System.out.print(cur.data + "  ");
			cur = cur.next;
		}
	}
	
	/*
	 * ����˫ѭ������
	 */
	public static DoubleNode createListDoubleNode(int[] arr) {
		DoubleNode head = new DoubleNode(), rear = head, cur;
		for (int data : arr) {
			cur = new DoubleNode(data);
			rear.right = cur;
			cur.left = rear;
			rear = cur;
			rear.right = head;
		}
		
		head.left = rear;
		
		return head;
	}
	
	/*
	 * ��ӡ˫ѭ������
	 */
	
	public static void printListDoubleNode(DoubleNode head) {
		DoubleNode cur = head.right;
		while (cur != head) {
			System.out.print(cur.data + "  ");
			cur = cur.right;
		}
		cur = cur.left;
		System.out.println();
		while (cur != head) {
			System.out.print(cur.data + "  ");
			cur = cur.left;
		}
	}

}
