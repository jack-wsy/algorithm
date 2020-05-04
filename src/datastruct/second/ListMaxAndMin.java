package datastruct.second;

public class ListMaxAndMin {

	/*
	 * 查找数组中的最大元素和最小元素, 并且返回元素及元素位置;
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5 ,6};
		ListDelete.printArray(getMaxAndMin(arr));
	}
	
	public static int[] getMaxAndMin(int arr[]) {
		int k = 0,j = 0;
		int min = arr[0], max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				k = i;
			}
			if(arr[i] < min) {
				min = arr[i];
				j = i;
			}
		}
		return new int[] {max, k, min, j};
	}
}
