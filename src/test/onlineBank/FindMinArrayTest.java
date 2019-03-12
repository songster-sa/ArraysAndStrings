package test.onlineBank;

import main.onlineBank.FindMinArray;

public class FindMinArrayTest {

    public static void main(String arg[]) {
        FindMinArray obj = new FindMinArray();

        int[] arr1 = new int[]{1, 1, 2, 3, 4, 4, 5};
        int[] arr2 = new int[]{1, 1, 3, 3, 4, 5, 6};

        System.out.println(obj.solution(arr1, arr2, 2));

        System.out.println(obj.solution(new int[0], arr2, 2));

        System.out.println(obj.solution(new int[0], new int[0], 2));
    }
}
