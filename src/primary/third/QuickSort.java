package primary.third;

import primary.firstday.Bubbling;
import primary.firstday.InsertSort;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 快速排序
		 * 1. 经典快排
		 * 2. 荷兰问题改进快排
		 * 3. 随机快排
		 */
		int size = 50;
		int value = 50;
		int arr[] = InsertSort.generateRandomArray(size, value);
		InsertSort.printArray(arr);
		quickSort(arr, 0, arr.length-1);
		System.out.println();
		InsertSort.printArray(arr);

	}
	public static void quickSort(int arr[], int l, int r) {
		if (l < r) {
			// 随机快排
			Bubbling.swap(arr, l + (int)(Math.random()*(r-l+1)), r);
			int[] p = partition(arr, l, r);
			quickSort(arr, l, p[0]);
			quickSort(arr, p[1], r);
		}
	}
	public static int[] partition(int arr[], int l, int r) {
		int p1 = l-1;
		int p2 = r;
		if (arr == null) {
			return arr;
		}
		while (l < p2) {
			if (arr[l] < arr[r]) {
				Bubbling.swap(arr, ++p1, l++);
			}else if (arr[l] > arr[r]) {
				Bubbling.swap(arr, l, --p2);
			}else {
				l++;
			}
		}
		Bubbling.swap(arr, p2, r);
		return new int[] {p1, p2+1};
	}

}
