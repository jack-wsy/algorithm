package primary.second;

import primary.firstday.InsertSort;

public class Holland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ����һ������arr����һ����num�����С�ڵ���num���������������ߣ�����num��������������ұߡ�
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
