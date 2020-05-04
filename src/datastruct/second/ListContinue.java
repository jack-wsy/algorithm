package datastruct.second;
import datastruct.second.ListNode.Node;

public class ListContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		Node head = createList(arr);
		printListNode(head);
		insertNode(head, 4);
		System.out.println();
		printListNode(head);
	}

	public static void insertNode(Node head, int data) {
		Node pre = head, cur = head.next, newNode = new Node(data);
		while (cur != head && cur.data > data) {
			cur = cur.next;
			pre = pre.next;
		}
		pre.next = newNode;
		newNode.next = cur;
	}
	/*
	 * 头插法建立一个带头结点的单循环链表
	 */
	public static Node createList(int[] arr) {
		Node head = null, cur = null;
		for (int data : arr) {
			cur = new Node(data);
			cur.next = head;
			head = cur;
		}
		head = new Node();
		head.next = cur;
		while (cur != head) {
			if (cur.next == null) {
				cur.next = head;
			}
			cur = cur.next;
		}
		return head;
	}
	
	public static void printListNode(Node head) {
		Node cur = head.next;
		while (cur != head) {
			System.out.print(cur.data + "  ");
			cur = cur.next;
		}
	}
}
