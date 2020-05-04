package datastruct.second;

public class ListPurge {

	/*
	 * 删除线性表L中的重复元素
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1, 2, 2, 4, 5, 6, 7, 4, 0, 0, 0, 0};
		int tail = 8;
		purge(arr, tail);
		printArray(arr, tail);
	}
	
	public static void purge(int[] arr, int tail) {
		int i = 0;
		int j;
		while (i <= tail) {
			j = i + 1;
			while (j <= tail) {
				if (arr[i] == arr[j]) {
					arr[j] = 0;
					swap(arr, j, tail);
					tail--;
				}else {
					j++;
				}
			}
			i++;
		}
	}
	
	public static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	
	public static void printArray(int arr[], int tail) {
		for (int i = 0; i < tail; i++) {
			System.out.print(arr[i] + "  ");
		}
	}

}
