package primary.second;

import primary.firstday.Bubbling;
import primary.firstday.InsertSort;

public class Holland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 给定一个数组arr，和一个数num，请把小于等于num的数放在数组的左边，大于num的数放在数组的右边。
		 */
		/*
		 * 给定一个数组arr,和一个数num,请把小于num的数放在数组的左边,等于num的数放在数组的中间,大于num的数放在数组的右边.
		 */
		int size = 30;
		int value = 100;
		int num = 10;
		int[] arr = InsertSort.generateRandomArray(size, value);
		InsertSort.printArray(arr);
		finishedHolland(arr, num, 0, arr.length-1);
		System.out.println();
		InsertSort.printArray(arr);
	}
	
	public static void hollandProblem(int[] arr, int num) {
		int p1 = 0;
		int p2 = (arr.length-1)/2;
		int p3 = arr.length-1;
		while (p1 <= p3) {
			if (arr[p1] < num) {
				p1++;
			}
			else if (arr[p1] == num) {
				if (arr[p2] == num) {
					p2++;
				}else if (arr[p2] < num) {
					int temp = arr[p2];
					arr[p2] = arr[p1];
					arr[p1] = temp;
					p1++; p2--;
				}else {
					
				}
			}else {
				
			}
		}
	}
	
	private static void finishedHolland(int[] arr, int num, int l, int r) {
		if (arr == null) {
			return;
		}
		int p1 = l-1;
		int p2 = r+1;
		while (l < p2 && l > p1) {
			if (arr[l] < num) {
				Bubbling.swap(arr, l++, ++p1);
			}
			else if (arr[l] == num) {
				++l;
			}else {
				Bubbling.swap(arr, --p2, l);
			}
		}
	}
	
	private static void finishedSetHolland(int[] arr, int num) {
		if (arr == null) {
			return;
		}
		int p1 = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<=num) {
				p1++;
				Bubbling.swap(arr, i, p1);
			}
		}
	}
	
	private static void Holland(int[] arr, int num) {
		if (arr == null) {
			return;
		}
		int p1 = -1;
		int p2 = arr.length;
		for (int i = 0; i < p2; i++) {
			if (arr[i] < num) {
				p1++;
				Bubbling.swap(arr, i, p1);
			}
		}
		for (int j = arr.length-1; j > p1; j--) {
			if (arr[j] > num) {
				p2--;
				Bubbling.swap(arr, j, p2);
			}
		}
	}

	private static void setHolland(int num, int[] arr) {
		if (arr == null) {
			return;
		}
		int p1 = 0;
		int p2 = arr.length-1;
		while (p1 <= p2) {
			if (arr[p1] <= num) {
				p1++;
			}
			else {
				if (arr[p2] > num) {
					p2--;
				}else {
					int temp = arr[p2];
					arr[p2] = arr[p1];
					arr[p1] = temp;
					p1++; p2--;
				}
			}
		}
	}

}
