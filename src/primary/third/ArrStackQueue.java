package primary.third;

public class ArrStackQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. 使用数组实现栈结构
		 */

	}
	public static class ArrayStack{
		
		private Integer[] arr;
		private Integer size;
		
		public ArrayStack(int initSize) {
			if (initSize < 0) {
				throw new IllegalArgumentException("The init size is less than 0");
			}
			arr = new Integer[initSize];
			size = 0;
		}
		
		public void push(int obj) {
			if (size == arr.length) {
				throw new ArrayIndexOutOfBoundsException("The queue is full");
			}
			arr[size++] = obj;
		}
		
		public Integer pop() {
			if (size == 0) {
				throw new ArrayIndexOutOfBoundsException("The queue is empty");
			}
			return arr[--size];
		}
		
		public Integer peek() {
			if (size == 0) {
				return null;
			}
			return arr[size-1];
		}
	}
	
	public static class ArrayQueue {
		
		private Integer start;
		private Integer end;
		private Integer size;
		private Integer[] arr;
		
		public ArrayQueue(int initSize) {
			if (size < 0) {
				throw new IllegalArgumentException("The init size is less than 0");
			}
			arr = new Integer[initSize];
			end = 0;
			start = 0;
			size = 0;
		}
		
		public void push(int obj) {
			if (size == arr.length) {
				throw new ArrayIndexOutOfBoundsException("The queue is full");
			}
			size++;
			arr[end] = obj;
			end = end == arr.length - 1 ? 0 : ++end;
		}
		
		public Integer pop() {
			if (size == 0) {
				throw new ArrayIndexOutOfBoundsException("The queue is empty");
			}
			size--;
			Integer temp = arr[start];
			start = start == arr.length - 1 ? 0 : ++start;
			return temp;
		}
		
		public Integer peek() {
			if (size == 0) {
				return null;
			}
			return arr[start];
		}
	}

}
