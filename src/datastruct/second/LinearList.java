package datastruct.second;

public class LinearList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrA = {1, 3, 4, 6, 8, 0, 0, 0};
		int[] arrB = {1, 2, 5, 6, 8};
		union(arrA, arrB);
		printArray(arrA);
		
	}
	
	/*
	 * �������������Ա�LA��LB�ֱ��ʾ��������A��B, ��Ҫ��һ���¼���A= A U B(���ϵĲ�)
	 */
	
	public static void union(int[] arrA, int[] arrB) {
		int flag;
		for (int i = 0; i < arrA.length && i < arrB.length; i++) {
			flag = searchZero(arrA); 
			if (!isContain(arrB[i], arrA) && flag != -1) {
				arrA[flag] = arrB[i];
			}
		}
	}
	
	// ��������ĵ�һ��0λ��
	public static int searchZero(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				return i;
			}
		}
		return -1;
	}
	
	
	// �ж�ֵ�Ƿ���������
	public static boolean isContain(int data, int[] arr) {
		return search(data, arr);
		
	}
	
	// ��������
	public static boolean search(int data, int[] arr) {
		if (arr == null) {
			return false;
		}
		for (int i : arr) {
			if (i == data) {
				return true;
			}
		}
		return false;
	}
	
	// ���ֲ��� ʱ�临�Ӷ�logN
	public static boolean binarySearch(int[] arr, int data, int l, int r) {
		if (arr == null) {
			return false;
		}
		if (l <= r) {
			int mid = (r - l) / 2 + l;
			if (arr[mid] > data) {
				return binarySearch(arr, data, l, mid-1);
			}else if (arr[mid] < data) {
				return binarySearch(arr, data, mid+1, r);
			}else if (arr[mid] == data) {
				return true;
			}
		}
		return false;
	}
	
	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + "  ");
		}
	}

}
