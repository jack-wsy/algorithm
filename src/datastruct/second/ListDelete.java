package datastruct.second;

public class ListDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5 ,6, 7, 0, 0, 0};
		int tail = 6;
		int i = 3;
		System.out.println(deleteData(i, arr, tail));
		printArray(arr);
	}
	
	public static int deleteData(int i, int[] arr, int tail) {
		if (i < 1 || i > tail || tail > arr.length - 1) {
			return -1;
		}
		int data = arr[i];
		for (int j = i + 1; j < tail + 1; j++) {
			arr[j - 1] = arr[j];
		}
		arr[tail] = 0;
		tail--;
		return data;
	}
	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + "  ");
		}
	}

}
