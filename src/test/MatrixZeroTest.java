package test;

import main.MatrixZero;

public class MatrixZeroTest {

    public static void main(String arg[]) {
        MatrixZero obj = new MatrixZero();

        obj.solutionOne(null, 0, 0);

        int[][] matrix = new int[3][4];
        matrix[0] = new int[]{1, 2, 3, 4};
        matrix[1] = new int[]{1, 2, 0, 9};
        matrix[2] = new int[]{1, 2, 3, 4};

        obj.solutionOne(matrix, 3, 4);
    }
}
