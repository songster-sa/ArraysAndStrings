package main.onlineBank;

/**
 * A swap operation on an array is defined as - swap the adjacent elements
 * Given an array of digits, and n number of swaps, maximise the value of the array
 * Example:
 * Input : 1,2,4,3 and swaps allowed 2
 * Output : 4,1,2,3 (value 4123)
 */
public class MaximizeValue {

    // find the largest and then swap it enough to bring to the first position

    public void solutionOne(int[] input, int n) {

        for (int i = 0; i < input.length; i++) {
            int maxIndex = findMax(input, i);

            System.out.println("max is at index = " + maxIndex);
            while (maxIndex > i && n > 0) {
                int temp = input[maxIndex];
                input[maxIndex] = input[maxIndex - 1];
                input[maxIndex - 1] = temp;
                maxIndex--;
                n--;
                System.out.print("swap done ");
                printArray(input);
            }
            if (n == 0) {
                // swaps over
                System.out.println("swaps over");
                return;
            }
        }

    }

    private void printArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ",");
        }
        System.out.println();
    }

    private int findMax(int[] input, int startIndex) {
        int max = input[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
                index = i;
            }
        }
        return index;
    }
}
