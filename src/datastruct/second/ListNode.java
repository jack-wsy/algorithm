package datastruct.second;

public class ListNode {
	
	public static class Node {
		public int data;
		public Node next;
		
		public Node() {
			// TODO Auto-generated constructor stub
		}
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public static class DoubleNode {
		public int data;
		public DoubleNode left;
		public DoubleNode right;
		
		public DoubleNode(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
		}
		
		public DoubleNode() {
			// TODO Auto-generated constructor stub
			
		}
	}
}
