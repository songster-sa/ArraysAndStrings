package main.onlineBank;

import java.util.HashSet;
import java.util.Set;

/**
 * given 2 strings s and t
 * find whether all permutations of t is present as substring in s
 * Example :
 * t-> ab ->all permutations = ab , ba
 * t-> abc ->all permutations - abc, acb, bac, bca, cab, cba
 * t-> abb ->all permutations - abb, bab, bba
 * <p>
 * s-> abcacbacab
 * <p>
 * P(n,r) = n! / (n-r)! = (3*2) / (3-2)! = 6/1 = 6
 */
public class AllPermutations {

    // some quick checks are there like length and chars are present or not
    // but after that ... do we have to store all permutations and then check if they exist ? thats layman and too inefficient

    // hint - use char sum... ie a=10 b=11 c=12 .. then every permutation will be of length 3 and charSum=10+11+12=33
    // then parse through s , 3 chars at a time.. check their sum if 33 - safe to assume or compare / sort

    public boolean solution(String s, String t) {

        if (s == null || t == null || s.length() <= t.length() || s.isEmpty() || t.isEmpty()) {
            // not possible
            return false;
        }

        Set permutations = new HashSet();
        permutations = getPermutations(t, permutations);

        System.out.println("all permutations : " + permutations);

        int charSum = getCharSum(t);

        for (int i = 0, j = t.length(); j <= s.length(); i++, j++) {

            String sub = s.substring(i, j);
            if (getCharSum(sub) == charSum) {
                // char sum is equal to this is a potential match
                if (isValidPerm(sub, t)) {
                    permutations.remove(sub);
                }
            }
        }

        return permutations.isEmpty();
    }

    private Set getPermutations(String input, Set<String> permutations) {

        Set<String> toReturn = new HashSet<String>();

        if (input.length() == 2) {
            toReturn.add(input);
            toReturn.add(input.charAt(1) + "" + input.charAt(0));
        } else {

            char first = input.charAt(0);
            permutations = getPermutations(input.substring(1), permutations);

            for (String sub : permutations) {
                toReturn.addAll(addCharToString(first, sub));
            }

        }
        return toReturn;

    }

    private Set<String> addCharToString(char first, String sub) {

        Set<String> toReturn = new HashSet<String>();
        toReturn.add(first + sub);

        for (int i = 1; i <= sub.length(); i++) {

            String pre = sub.substring(0, i);
            String post = sub.substring(i, sub.length());
            toReturn.add(pre + first + post);
        }

        return toReturn;
    }

    private boolean isValidPerm(String sub, String t) {
        if (sub.length() != t.length()) {
            return false;
        }
        boolean[] track = new boolean[256];

        for (char c : sub.toCharArray()) {
            track[c] = true;
        }

        for (char c : t.toCharArray()) {
            if (!track[c]) {
                return false;
            }
        }
        return true;
    }

    private int getCharSum(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum = sum + c;
        }
        return sum;
    }

}
