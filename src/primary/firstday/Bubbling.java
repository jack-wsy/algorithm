package primary.firstday;

public class Bubbling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void bubbling(int[] arr) {
		if(arr == null || arr.length < 2) {
			return;
		}
		for(int i=arr.length-1; i > 0; i--) {
			for(int j=0; j < i; j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
				}
			} 
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
