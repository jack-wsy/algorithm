package primary.second;

import primary.firstday.InsertSort;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1.  堆排序
		 * 		1. 实现大根堆
		 * 		2. 大根堆数变化 
		 */
		int size = 100;
		int value = 100;
		int[] arr = InsertSort.generateRandomArray(size, value);
		InsertSort.printArray(arr);
		heapSort(arr);
		System.out.println();
		InsertSort.printArray(arr);

	}
	
	public static void heapSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			heapInsertt(arr, i);
		}
		int heapSize = arr.length;
		swap(arr, 0, --heapSize);
		while (heapSize > 0) {
			heapify(arr, 0, heapSize);
			swap(arr, 0, --heapSize);
		}
	}
	
	public static void heapInsertt(int arr[], int index) {
		while (arr[index] > arr[(index-1) / 2]) {
			swap(arr, index, (index-1)/2);
			index = (index-1) / 2;
		}
	}
	
	public static void heapify(int[] arr, int index, int heapSize) {
		int left = 2 * index + 1;
		while (left < heapSize) {
			int largest = left+1 < heapSize && arr[left] > arr[left + 1] ? left : left+1;
			largest = arr[largest] > arr[index] ? largest : index;
			if (largest == index) {
				break;
			}
			swap(arr, largest, index);
			index = largest;
			left = 2 * index + 1;
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
