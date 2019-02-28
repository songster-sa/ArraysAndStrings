package test.onlineBank;

import main.onlineBank.MaximizeValue;

public class MaximizeValueTest {

    public static void main(String[] args) {
        MaximizeValue obj = new MaximizeValue();

        int[] input = new int[]{1, 2, 4, 3};
        obj.solutionOne(input, 2);

        System.out.println("--------------------------");
        input = new int[]{1, 2, 4, 3};
        obj.solutionOne(input, 5);

        System.out.println("--------------------------");
        input = new int[]{1, 2, 4, 3, 5};
        obj.solutionOne(input, 5);

        System.out.println("--------------------------");
        input = new int[]{1, 2, 4, 3, 5};
        obj.solutionOne(input, 25);

    }
}
