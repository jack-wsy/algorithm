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
		 * �ݹ���ã����з�������
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
		 * �鲢������
		 * ���Ҿ�С�ڱ߽�ֵʱ��С�������������ǰλ�÷���
		 * ĳ�೬���߽�ʱ��copy��һ������ڸ�������
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
