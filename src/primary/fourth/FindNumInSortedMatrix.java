package primary.fourth;

public class FindNumInSortedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = new int[][] { { 0, 1, 2, 3, 4, 5, 6 },// 0
			{ 10, 12, 13, 15, 16, 17, 18 },// 1
			{ 23, 24, 25, 26, 27, 28, 29 },// 2
			{ 44, 45, 46, 47, 48, 49, 50 },// 3
			{ 65, 66, 67, 68, 69, 70, 71 },// 4
			{ 96, 97, 98, 99, 100, 111, 122 },// 5
			{ 166, 176, 186, 187, 190, 195, 200 },// 6
			{ 233, 243, 321, 341, 356, 370, 380 } // 7
	};
	int K = 234;
	System.out.println(isContains(matrix, K));
	}

	public static boolean isContains(int[][] matrix, int num) {
		int col = matrix[0].length - 1;
		int row = 0;
		while (col >= 0 && row < matrix.length) {
			if (matrix[row][col] > num) {
				col--;
			}else if (matrix[row][col] < num) {
				row++;
			}else {
				return true;
			}
		}
		return false;
	}
}
