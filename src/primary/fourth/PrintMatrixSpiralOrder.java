package primary.fourth;

public class PrintMatrixSpiralOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		printSpiralOrder(matrix);
	}
	
	public static void printSpiralOrder(int[][] matrix) {
		int leftRow = 0;
		int leftColumn = 0;
		int rightRow = matrix.length - 1;
		int rightColumn = matrix[0].length - 1;
		while (leftRow <= rightRow) {
			printEage(matrix, leftRow++, leftColumn++, rightRow--, rightColumn--);
		}
	}
	
	public static void printEage(int[][] matrix, int leftRow, int leftColumn, int rightRow, int rightColumn) {
		if (leftRow == rightRow) {
			for (int num : matrix[leftRow]) {
				System.out.print(num + " ");
			}
		}else if (leftColumn == rightColumn) {
			for (int i = leftRow; i <= rightRow; i++) {
				System.out.println(matrix[i][leftColumn] + " ");
			}
		}else {
			int curRow = leftRow;
			int curColumn = leftColumn;
			while (curColumn != rightColumn) {
				System.out.println(matrix[leftRow][curColumn]);
				curColumn++;
			}
			while (curRow != rightRow) {
				System.out.println(matrix[curRow][curColumn]);
				curRow++;
			}
			while (curColumn != leftColumn) {
				System.out.println(matrix[curRow][curColumn]);
				curColumn--;
			}
			while (curRow != leftRow) {
				System.out.println(matrix[curRow][curColumn]);
				curRow--;
			}
		}
	}

}
