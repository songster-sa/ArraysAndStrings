package main;

/**
 * Given two strings, find if one is a permutation of another
 * Example
 * ab -> ab, ba
 * aab -> aab, baa, aba
 * abc -> abc, acb, bca, bac, cab, cba
 * <p>
 * do spaces count ?  does case of the letter counts?
 */
public class Question3 {

    // 1. length has to be same
    // 2. characters have to be same - count

    public boolean solutionOne(String given1, String given2) {

        if (given1 == null
                || given2 == null
                || given1.length() != given2.length()) {
            return false;
        }

        int[] chArray = new int[256]; // default value is 0

        for (int ch : given1.toCharArray()) {
            chArray[ch]++;
        }

        for (int ch : given2.toCharArray()) {
            chArray[ch]--;
            if (chArray[ch] < 0) {
                return false;
            }
        }

        return true;
    }
}
