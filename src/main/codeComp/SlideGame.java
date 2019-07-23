package main.codeComp;

/**
 * input : 3x3 ; 1,2,0,3,4,5,6,7,8
 * 1 2 -
 * 3 4 5
 * 6 7 8
 * <p>
 * find the least number of moves to get the 0 or - to the bottom right position
 * <p>
 * output = 2
 */
public class SlideGame {

    public void solutionOne(int x, int[] numbers) {

        if (x == 0 || numbers == null) {
            System.out.println("Invalid");
            return;
        }
        if (numbers.length != (x * x)) {
            System.out.println("numbers should form a n X n matrix");
            return;
        }

        // step 1 - find the place of the - or 0 or blank in the martix
        int row = -1, col = -1;

        int countX = 0, countY = 0;

        for (int i : numbers) {
            System.out.println(i + " is at [" + countX + "," + countY + "]");
            if (i == 0) {
                row = countX;
                col = countY;
                break;
            } else if (countY == x - 1) {
                countX++;
                countY = 0;
            } else {
                // inc col
                countY++;
            }
        }

        if (row == -1 || col == -1) {
            System.out.println("Invalid input, 0 not found.");
            return;
        }

        int result = (x - 1 - row) + (x - 1 - col);
        System.out.println("number of slides required = " + result);
    }
}
