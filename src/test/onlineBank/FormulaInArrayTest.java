package test.onlineBank;

import main.onlineBank.FormulaInArray;

public class FormulaInArrayTest {

    public static void main(String arg[]) {

        FormulaInArray obj = new FormulaInArray();
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        obj.solution(input);
        System.out.println("------------------------------");
        input = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        obj.solution(input);
    }
}
