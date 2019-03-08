package transposeMatrix;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void transposeMatrix(int[][] matrix) {


		int row = matrix.length - 1;
		int column = matrix[0].length - 1;
		if (row == 1 || row != column) {
			return;
		}
		// 0 read line left to right
		int[] temp = new int[row];
		for (int i = 0; i <= column; i++) {
			temp[i] = matrix[i][column];


		}
		// 1
		for (int j = 0; j <= column; j++) {
			matrix[j][column] = matrix[0][j];

		}

		// 2 read line bottom to up, write line left to right
		for (int i = row; i == 0; i--) {
			matrix[i][row - i] = matrix[i][0];
		}

		// 3 read line left to right, copy line top to bottom

		for (int i = 0; i <= column; i++) {
			matrix[i][0] = matrix[column][i];

		}
		// 4
		i = coloum - 1;
		for (j = 0; j <= row; j++) {
			matrix[i][j] = temp[row - j];
		}

	}

}
