package primary.third;

import java.util.Stack;

public class GetMinStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack myStack = new MyStack();
		myStack.push(3);
		myStack.push(4);
		myStack.push(1);
		System.out.println(myStack.getMin());
		System.out.println(myStack.pop());
		System.out.println(myStack.getMin());
	}

	public static class MyStack {
		
		private Stack<Integer> dataStack;
		private Stack<Integer> minStack;
		
		public MyStack() {
			this.dataStack = new Stack<Integer>();
			this.minStack = new Stack<Integer>();
		}
		
		public void push(int obj) {
			if (this.minStack.isEmpty()) {
				this.minStack.push(obj);
			}else if (this.minStack.peek() < obj) {
				this.minStack.push(this.minStack.peek());
			}else {
				this.minStack.push(obj);
			}
			this.dataStack.push(obj);
		}
		
		public Integer pop() {
			if (this.dataStack.isEmpty()) {
				throw new RuntimeException("Your Stack is empty");
			}
			this.minStack.pop();
			return this.dataStack.pop();
		}
		
		public Integer getMin() {
			if (this.minStack.isEmpty()) {
				throw new RuntimeException("Your Stack is empty");
			}
			return this.minStack.peek();
		}
	}
}
