package primary.firstday;


public class XiaoHeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {1, 3, 4, 2, 5};
		int maxSize = 10;
		int maxValue = 10;
		int[] arr = InsertSort.generateRandomArray(maxSize, maxValue);
		InsertSort.printArray(arr);
		System.out.println(mergeSort(arr));
	}
	
	
	public static int mergeSort(int[] arr) {
		/*
		 * 归并排序求小和
		 */
		if (arr == null) {
			return 0;
		}
		return sortProcess(arr, 0, arr.length-1);
	}
	
	public static int sortProcess(int[] arr, int L, int R) {
		/*
		 * 组与组合并的小和相加
		 */
		if (L == R) {
			return 0;
		}
		int mid = L + ((R-L) >> 1);
		return sortProcess(arr, L, mid) + sortProcess(arr, mid+1, R) + merge(arr, L, mid, R);
	}

	public static int merge(int[] arr, int L, int mid, int R) {
		/*
		 * 小和问题
		 * 在归并时，求出左侧当前元素需要求和几次
		 */
		int[] help = new int[R-L+1];
		int i = 0;
		int p1 = L;
		int p2 = mid+1;
		int res = 0;
		while (p1 <= mid && p2 <= R) {
			res += arr[p1] < arr[p2] ? (R-p2+1)*arr[p1] : 0;
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
		return res;
	}
}
