package main.onlineBank;

/**
 * Given an array of Integers, find out how many combinations in the array,
 * satisfy the equation x+y+z=w, where x,y,z and w belong to the array
 * and idx(x)<idx(y)<idx(z)<idx(w).
 * Elements are unique.
 * <p>
 * Example : 1,2,3,4,5,6,7,8,9 => 1+3+4 = 8 => 1+2+3 =6
 * <p>
 * input need not be sorted
 */
public class FormulaInArray {

    public void solution(int[] input) {

        for (int i = 0; i < input.length; i++) {

            for (int j = i + 1; j < input.length; j++) {

                for (int k = j + 1; k < input.length; k++) {

                    int sum = input[i] + input[j] + input[k];

                    for (int m = k; m < input.length; m++) {
                        if (input[m] == sum) {
                            System.out.println("found : " + input[i] + "," + input[j] + "," + input[k] + "," + input[m]);
                        }
                    }
                }
            }
        }
    }
}
