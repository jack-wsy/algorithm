package primary.third;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueueConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *栈转队列
		 *队列转栈
		 */

	}

	public static class TowSatckQueue {
		
		private Stack<Integer> pushStack;
		private Stack<Integer> popStack;
		
		public TowSatckQueue() {
			// TODO Auto-generated constructor stub
			this.pushStack = new Stack<Integer>();
			this.popStack = new Stack<Integer>();
		}
		
		public void push(int obj) {
			this.pushStack.push(obj);
		}
		
		public Integer poll() {
			if (this.pushStack.isEmpty() && this.popStack.isEmpty()) {
				throw new RuntimeException("Queue is empty");
			}else if (this.popStack.isEmpty()) {
				while (!this.pushStack.isEmpty()) {
					this.popStack.push(pushStack.pop());
				}
			}
			
			return this.popStack.pop();
		}
		
		public Integer peek() {
			if (this.pushStack.isEmpty() && this.popStack.isEmpty()) {
				throw new RuntimeException("Queue is empty");
			}else if (this.popStack.isEmpty()) {
				while (!this.pushStack.isEmpty()) {
					this.popStack.push(pushStack.pop());
				}
			}
			
			return this.popStack.peek();
		}
		
	}
	
	public static class TwoQueueStack{
		
		private Queue<Integer> queue;
		private Queue<Integer> help;
		
		public TwoQueueStack() {
			this.queue = new LinkedList<Integer>();
			this.help = new LinkedList<Integer>();
		}
		
		public void push(int obj) {
			this.queue.add(obj);
		}
		
		public Integer pop() {
			if (this.queue.isEmpty()) {
				throw new RuntimeException("Stack is empty");
			}
			while (this.queue.size() != 1) {
				this.help.add(this.queue.poll());
			}
			int res = this.queue.poll();
			swap();
			return res;
		}
		
		public Integer peek() {
			if (this.queue.isEmpty()) {
				throw new RuntimeException("Stack is empty");
			}
			while (this.queue.size() != 1) {
				this.help.add(this.queue.poll());
			}
			int res = this.queue.poll();
			this.help.add(res);
			swap();
			return res;
		}
		public void swap() {
			Queue<Integer> tmp = this.queue;
			this.queue = this.help;
			this.help = tmp;
		}
	}
}
