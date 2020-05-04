package datastruct.second;

public class ListRevers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5 ,6};
		reverseList(arr, 0, arr.length-1);
		ListDelete.printArray(arr);
	}
	
	public static void reverseList(int arr[], int l, int r) {
		while (l < r) {
			swap(arr, l++, r--);
		}
	}
	
	public static void swap(int[] arr, int l, int r) {
		int temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
	}

}
