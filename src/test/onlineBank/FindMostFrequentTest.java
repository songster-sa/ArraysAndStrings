package test.onlineBank;

import main.onlineBank.FindMostFrequent;

public class FindMostFrequentTest {

    public static void main(String arg[]) {

        FindMostFrequent obj = new FindMostFrequent();

        int[] input = new int[]{1, 3, 4, 5, 2, 2, 3, 2};
        System.out.println(obj.solutionOne(input));

        input = new int[]{1, 1, 2, 2, 3, 3};
        System.out.println(obj.solutionOne(input));

        input = new int[]{1, 3, 3, 1, 1, 2};
        System.out.println(obj.solutionOne(input));

        input = new int[]{3, 1, 3, 1, 3};
        System.out.println(obj.solutionOne(input));

        input = new int[]{1, 3, 1, 3};
        System.out.println(obj.solutionOne(input));

        System.out.println(obj.solutionOne(null));

        input = new int[]{5};
        System.out.println(obj.solutionOne(input));

        input = new int[]{};
        System.out.println(obj.solutionOne(input));

    }
}

