package primary.fourth;

public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		printMatrix(matrix);
		printRotate(matrix);
		System.out.println("=============================================");
		printMatrix(matrix);

	}
	
	public static void printRotate(int[][] matrix) {
		int leftRow = 0;
		int leftColumn = 0;
		int rightRow = matrix.length - 1;
		int rightColumn = matrix[0].length - 1;
		while (leftRow <= rightRow) {
			rotateEage(matrix, leftRow++, leftColumn++, rightRow--, rightColumn--);
		}
	}
	
	public static void rotateEage(int[][] matrix, int leftRow, int leftColumn, int rightRow, int rightColumn) {
		int times = rightColumn - leftColumn;
		int tmp;
		for (int i = 0; i < times; i++) {
			tmp = matrix[leftRow][leftColumn + i];
			matrix[leftRow][leftColumn + i] = matrix[rightRow - i][leftColumn];
			matrix[rightRow - i][leftColumn] = matrix[rightRow][rightColumn - i];
			matrix[rightRow][rightColumn - i] = matrix[leftRow + i][rightColumn];
			matrix[leftRow + i][rightColumn] = tmp;
		}
		
	}
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
