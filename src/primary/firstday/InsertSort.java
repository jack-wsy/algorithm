package primary.firstday;

import java.util.Arrays;

public class InsertSort {
	
	public static void main(String[] args) {
		int times = 50000;
		boolean success = true;
		int maxSize = 100;
		int maxValue = 100;
		for (int i = 0; i < times; i++) {
			int[] arr = generateRandomArray(maxSize, maxValue);
			int[] arr1 = copyArray(arr);
			int[] arr2 = copyArray(arr);
			SelectorSort.selectSort(arr1);
			rightMethod(arr2);
			if (!isEqual(arr1, arr2)) {
				success = false;
				printArray(arr);;
				break;
			}
		}
		System.out.println(success ? "NICE" : "ERROR");
	}
	
	public static void insertSort(int[] arr) {
		if(arr == null || arr.length < 2) {
			return;
		}
		for(int i=1; i < arr.length; i++) {
			for(int j=i-1;j >= 0 && arr[j] > arr[j+1]; j++) {
				Bubbling.swap(arr, j, j+1);
			}
		}
	}
	public static int[] generateRandomArray(int size, int value) {
		/*
		 * ����һ��������ȣ����Ԫ�ص�����
		 * ������[0, size-1]
		 * Ԫ�ش�С��[-value+1, value-1]
		 */
		int [] arr = new int[(int)((size+1) * Math.random())];
		for(int i=0; i < arr.length; i++) {
			arr[i] = (int)((value+1) * Math.random()) - (int)((value+1) * Math.random());
		}
		return arr;
	}
	
	public static int[] rightMethod(int[] arr) {
		/*
		 * ��������֤���㷨
		 * ϵͳ�ṩ�ľ�����ȷ���㷨
		 */
		if (arr == null) {
			return arr;
		}
		Arrays.sort(arr);
		return arr;
	}
	
	public static int[] copyArray(int[] arr) {
		/*
		 * ����һ�����飬����Ԫ�س��ȡ�λ�á���С��ͬ����ַ��ͬ
		 */
		int[] res = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			res[i] = arr[i];
		}
		return res;
	}
	
	public static boolean isEqual(int[] arr, int[] res) {
		if ((arr == null && res != null) || (arr != null && res == null)) {
			return false;
		}
		if (arr == null && res == null) {
			return true;
		}
		if (arr.length != res.length) {
			return false;
		}
		for (int i = 0; i < res.length; i++) {
			if (arr[i] != res[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void printArray(int[] arr) {
		if (arr == null) {
			return;
		}
		for (int i : arr) {
			System.out.print(i+"  ");
		}
	}
}
