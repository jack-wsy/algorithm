package primary.firstday;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {1, 3, 4, 2, 5};
		int maxSize = 10;
		int maxValue = 10;
		int[] arr = InsertSort.generateRandomArray(maxSize, maxValue);
		InsertSort.printArray(arr);
		mergeSort(arr);

	}
	
	public static void mergeSort(int arr[]) {
		if (arr == null) {
			return;
		}
		sortProcess(arr, 0, arr.length-1);
	}
	
	public static void sortProcess(int arr[], int l, int r) {
		if (l == r) {
			return;
		}
		int mid = l + ((r-l) >> 1);
		sortProcess(arr, l, mid);
		sortProcess(arr, mid+1, r);
		merge(arr, l, mid, r);
	}

	public static void merge(int[] arr, int l, int mid, int r) {
		int[] help = new int[r-l+1];
		int i = 0;
		int p1 = l;
		int p2 = mid + 1;
		while (p1 <= mid && p2 <= r) {
			if (arr[p1] < arr[p2]) {
				for (int j = p2; j <= r; j++) {
					System.out.println(arr[p1] + " " + arr[j]);
				}
			}
			help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
		}
		while (p1 <= mid) {
			help[i++] = arr[p1++];
		}
		while (p2 <= r) {
			help[i++] = arr[p2++];
		}
		for (int j = 0; j < help.length; j++) {
			arr[l+j] = help[j];
		}
	}
}
