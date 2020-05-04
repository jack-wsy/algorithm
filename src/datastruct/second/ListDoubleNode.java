package datastruct.second;
import datastruct.second.ListNode.DoubleNode;

public class ListDoubleNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
//		DoubleNode head = createDoubleNode(arr);
//		printDoubleList(head);
//		insertDoubleList(head.right.right.right, 3);
//		System.out.println();
//		printDoubleList(head);
//		System.out.println();
//		System.out.println(deleteDoubleNode(head.right.right.right));
//		printDoubleList(head);
//		System.out.println();
		DoubleNode headA = createLeftEmpty(arr);
		printDoubleRight(headA);
		modifyDoubleLeft(headA);
		printDoubleList(headA);
		
	}
	
	/*
	 * 将链表的左指针域补全，成为双向循环链表
	 */
	public static void modifyDoubleLeft(DoubleNode head) {
		DoubleNode cur = head.right, pre = head;
		while (cur != head ) {
			cur.left = pre;
			cur = cur.right;
			pre = pre.right;
		}
		cur.left = pre;
	}
	
	
	/*
	 * 给定结点前插入数据--双向链表
	 */
	
	public static void insertDoubleList(DoubleNode cur, int data) {
		DoubleNode newNode = new DoubleNode(data);
		newNode.left = cur.left;
		newNode.left.right = newNode;
		cur.left = newNode;
		newNode.right = cur;
	}
	
	/*
	 * 删除双向链表上的一个指定结点
	 */
	
	public static int deleteDoubleNode(DoubleNode cur) {
		cur.left.right = cur.right;
		cur.right.left = cur.left;
		
		return cur.data;
	}
	
	/*
	 * 通过数组生成一个双向循环链表
	 */
	
	public static DoubleNode createDoubleNode(int arr[]) {
		DoubleNode head = new DoubleNode(), cur, rear;
		rear = head;
		for (int data : arr) {
			cur = new DoubleNode(data);
			cur.left = rear;
			rear.right = cur;
			rear = rear.right;
			rear.right = head;
			head.left = rear;
		}
		
		return head;
	}
	
	/*
	 * 建立一个做指针域为null的双向链表
	 */
	public static DoubleNode createLeftEmpty(int[] arr) {
		DoubleNode head, rear, cur;
		head = new DoubleNode();
		rear = head;
		for (int data : arr) {
			cur = new DoubleNode(data);
			rear.right = cur;
			rear = cur;
		}
		rear.right = head;
		return head;
	}
	
	/*
	 * 打印双向链表
	 */
	
	public static void printDoubleList(DoubleNode head) {
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
	
	/*
	 * 打印双向链表的右链
	 */
	
	public static void printDoubleRight(DoubleNode head) {
		DoubleNode cur = head.right;
		while (cur != head) {
			System.out.print(cur.data + "  ");
			cur = cur.right;
		}
	}

}
