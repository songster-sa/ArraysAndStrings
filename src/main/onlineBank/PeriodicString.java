package main.onlineBank;

/**
 * Find whether string S is periodic.
 * Periodic indicates S = nP.
 * e.g.
 * S = "ababab", then n = 3, and P = "ab"
 * S = "xxxxxx", then n = 1, and P = "x"
 * S = "aabbaaabba", then n = 2, and P = "aabba"
 * so - aabbcaabbaabb - is false because there is a 'c' in middle
 * <p>
 * Given string S, find out the P (repetitive pattern) of S.
 * <p>
 * CareerCup
 */
public class PeriodicString {
    // approach - take substring from beginning and find next occurances.. if next index = length then possible

    public void solution(String input) {

        if (input == null || input.length() == 0) {
            return;
        }

        String key = "";

        for (int i = 0; i < input.length() - 1; i++) {

            key = key + input.charAt(i);
            String sub = input.substring(key.length());
            int next = sub.indexOf(key);
            int count = 0;

            while (next == 0) {
                // possible pattern
                System.out.println("possible pattern " + key);
                // count occurances
                sub = sub.substring(key.length());
                next = sub.indexOf(key);
                count++;
            }

            if (next == -1 && sub.length() == 0) {
                System.out.println("count=" + ++count);
            }

        }

    }
}
