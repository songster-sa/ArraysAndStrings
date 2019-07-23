package main;

/**
 * int[m][n] - if an element is 0, make its entire row and column 0
 */
public class MatrixZero {

    public void solutionOne(int[][] matrix, int row, int col) {

        if (matrix == null || row <= 0 || col <= 0) {
            return;
        }

        outer:
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    setZeroAhead(i, j, row, col, matrix);
                    setZeroBehind(i, j, matrix);
                    break outer; // disadvantage - this will solve only for the first 0 found
                    // otherwise set it to some symbol - and then continue looking for 0
                    // in the end while printing just print 0 if symbol found
                }
            }
        }

        printMatrix(matrix, row, col);
    }

    private void printMatrix(int[][] matrix, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }

    private void setZeroBehind(int i, int j, int[][] matrix) {
        int originalJ = j;

        for (; j >= 0; j--) {
            matrix[i][j] = 0;
        }

        j = originalJ;

        for (; i >= 0; i--) {
            matrix[i][j] = 0;
        }
    }

    private void setZeroAhead(int i, int j, int row, int col, int[][] matrix) {
        int originalJ = j;

        for (; j < col; j++) {
            matrix[i][j] = 0;
        }

        j = originalJ;

        for (; i < row; i++) {
            matrix[i][j] = 0;
        }
    }
}
