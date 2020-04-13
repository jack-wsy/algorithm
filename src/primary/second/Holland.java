package primary.second;

import primary.firstday.InsertSort;

public class Holland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 给定一个数组arr，和一个数num，请把小于等于num的数放在数组的左边，大于num的数放在数组的右边。
		 */
		int size = 10;
		int value = 100;
		int num = 50;
		int[] arr = InsertSort.generateRandomArray(size, value);
		InsertSort.printArray(arr);
		int p1 = 0;
		int p2 = arr.length-1;
		while (p1 != p2) {
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
				}
			}
		}
		System.out.println();
		InsertSort.printArray(arr);
	}

}
