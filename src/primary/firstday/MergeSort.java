package primary.firstday;

public class MergeSort {
	
	public static void main(String[] args) {
		int[] arr = InsertSort.generateRandomArray(10, 100);
		InsertSort.printArray(arr);
		mergeSort(arr);
		InsertSort.printArray(arr);
	}
	
	public static void mergeSort(int[] arr) {
		if (arr == null) {
			return;
		}
		sortProcess(arr, 0, arr.length-1);
	}

	public static void sortProcess(int[] arr, int L, int R) {
		/*
		 * 递归调用，进行分组排序
		 */
		if (L == R) {
			return;
		}
		int mid = (L+R) / 2;
		sortProcess(arr, L, mid);
		sortProcess(arr, mid+1, R);
		merge(arr, L, mid, R);
		
	}
	
	public static void merge(int[] arr, int L, int mid, int R) {
		/*
		 * 归并组与组
		 * 左右均小于边界值时，小的往辅助数组较前位置放置
		 * 某侧超过边界时，copy另一侧放置于辅助数组
		 */
		int[] help = new int[R-L+1];
		int i = 0;
		int p1 = L;
		int p2 = mid+1;
		while (p1 <= mid && p2 <= R) {
			help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
		}
		while (p1 <= mid) {
			help[i++] = arr[p1++];
		}
		while (p2 <= R) {
			help[i++] = arr[p2++];
		}
		for (int j = 0; j < help.length; j++) {
			arr[L+j] = help[j];
		}
	}
}
