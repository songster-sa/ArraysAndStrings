package test.onlineBank;

import main.onlineBank.FarthestIndex;

public class FarthestIndexTest {

    public static void main(String arg[]) {
        FarthestIndex obj = new FarthestIndex();

        int[] input = new int[]{1, 3, 4, 5, 2, 2, 3, 2};
        System.out.println(obj.solutionOne(input));

        input = new int[]{1, 2, 3, 2, 4, 1};
        System.out.println(obj.solutionOne(input));

        input = new int[]{1, 1, 1, 1, 1};
        System.out.println(obj.solutionOne(input));

        input = new int[]{1, 2, 3, 2, 1};
        System.out.println(obj.solutionOne(input));

        input = new int[]{1, 3, 4, 1, 1};
        System.out.println(obj.solutionOne(input));


        input = new int[]{5, 3, 4, 1, 1};
        System.out.println(obj.solutionOne(input));

        input = new int[]{5, 3, 4, 6, 1};
        System.out.println(obj.solutionOne(input));

        input = new int[]{5, 6, 4, 3, 1};
        System.out.println(obj.solutionOne(input));
    }
}
