package datastruct.second;
import datastruct.second.ListNode.Node;

public class ListCreatNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		Node head = createList(arr);
		printListNode(head);
		System.out.println();
		Node tail = tailCreateList(arr);
		printListNode(tail);
		System.out.println();
		Node have = haveHeadList(arr);
		printListNode(have.next);
	}
	
	/*
	 * 头插法建表
	 */
	public static Node createList(int[] arr) {
		Node head = null;
		Node cur;
		for (int i : arr) {
			cur = new Node(i);
			cur.next = head;
			head = cur;
		}
		return head;
	}
	
	/*
	 * 尾插法建表
	 */
	public static Node tailCreateList(int[] arr) {
		Node rear = null, head = null, cur = null;
		for (int i : arr) {
			cur = new Node(i);
			if (head != null) {
				rear.next = cur;
				rear = cur;
			}else {
				head = cur;
				rear = head;
			}
		}
		if (rear != null) {
			rear.next = null;
		}
		return head;
	}
	
	/*
	 * 带头结点尾插建表
	 */
	public static Node haveHeadList(int[] arr) {
		Node head = new Node();
		Node rear, cur;
		rear = head;
		for (int i : arr) {
			cur = new Node(i);
			rear.next = cur;
			rear = cur;
		}
		rear.next = null;
		
		return head;
	}
	
	/*
	 * 打印链表中的值
	 */
	public static void printListNode(Node head) {
		while (head != null) {
			System.out.print(head.data + "  ");
			head = head.next;
		}
	}
}
