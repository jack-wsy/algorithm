package primary.firstday;

public class SelectorSort {
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 6, 5};
		selectSort(arr);
		for(int i : arr) {
			System.out.print(i);
		}
		
	}
	
	public static void selectSort(int[] arr) {
		for(int i=0; i < arr.length -1; i++) {
			if(arr == null || arr.length < 2) {
				return;
			}
			int minIndex = i;
			for(int j = i+1; j <= arr.length -1; j++) {
				minIndex = arr[j] < arr[minIndex] ? j : minIndex;
			}
			Bubbling.swap(arr, i, minIndex);
		}
	}

}
