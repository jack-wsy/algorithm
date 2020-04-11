package primary.firstday;

public class RecursionSelect {
	
	public static void main(String[] args) {
//		int sum = sumAdd(5);
//		System.out.println(sum);
		int[] arr = InsertSort.generateRandomArray(10,100);
		InsertSort.printArray(arr);
		System.out.println(getMax(arr, 0, arr.length-1));
	}

	public static int sumAdd(int size) {
		if (size == 0) {
			return 0;
		}else {
			return size+sumAdd(size-1);
		}
	}
	public static int getMax(int[] arr, int L, int R) {
		if(L == R) {
			return arr[L];
		}
		int mid = (L+R)/2;
		int maxLeft = getMax(arr, L, mid);
		int maxRight = getMax(arr, mid+1, R);
		return Math.max(maxLeft, maxRight);
	}
}
