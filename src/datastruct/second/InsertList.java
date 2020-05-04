package datastruct.second;

public class InsertList {
	
	/*
	 * 在顺序表中i位置插入一个元素
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 3, 4, 6, 8, 3, 5, 0, 0};
		int tail = 7;
		int data = 10, i = 3;
		insertArray(arr, tail, i, data);
		printArray(arr);
	}
	
	public static void insertArray(int arr[], int tail, int i, int data) {
		if (arr == null || i < 1 || i > arr.length - 1) {
			return;
		}
		if (tail > arr.length - 1) {
			return;
		}
		for (int j = tail; j >= i; j--) {
			 arr[j+1] = arr[j];
		}
		arr[i] = data;
		tail++;
	}
	
	public static void printArray(int arr[]) {
		for (int i : arr) {
			System.out.print(i + "  ");
		}
	}

}
