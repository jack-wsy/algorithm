package primary.fourth;

public class ZigZagPrintMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		printMatrixZigZag(matrix);
	}
	
	public static void printMatrixZigZag(int[][] matrix) {
		int leftRow = 0;
		int leftColumn = 0;
		int rightRow = matrix.length - 1;
		int rightColumn = matrix[0].length - 1;
		int curUp = 0;
		int curDown = 0;
		boolean formUp = false;
		while (leftRow <= rightRow) {
			printLevel(matrix, leftRow, leftColumn, curDown, curUp, formUp);
			leftRow = curUp == rightColumn ? ++leftRow : leftRow;
			leftColumn = curDown == rightRow ? ++leftColumn : leftColumn;
			curUp = curUp == rightColumn ? curUp : ++curUp;
			curDown = curDown == rightRow ? curDown : ++curDown;
			formUp = !formUp;
		}
		
	}
	
	public static void printLevel(
			int[][] matrix, int leftRow, int leftColumn, 
			int rightRow, int rightColumn, boolean formUp
			) {
		if (formUp) {
			while (leftRow <= rightRow) {
				System.out.print(matrix[leftRow++][rightColumn--] + " ");
			}
			return;
		}
		while (rightRow >= leftRow) {
			System.out.print(matrix[rightRow--][leftColumn++] + " ");
		}
	}

}
