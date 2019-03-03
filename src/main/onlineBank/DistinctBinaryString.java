package main.onlineBank;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Give a size n, count all possible distinct binary strings of length n such that there are no consecutive 1s
 * <p>
 * Example : n = 2
 * strings will be : 00,01,10 = 3
 * <p>
 * n=3
 * Strings will be : 000,001,010,100,101 = 5
 */
public class DistinctBinaryString {

    public Set<String> solution(int n) {
        // find all possible and then filter

        Set<String> toReturn = new HashSet<>(); // will ensure its unique
        findAllPossible(n, "", toReturn);

        System.out.println("all distinct possible = " + toReturn);

        Iterator iterator = toReturn.iterator();
        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            if (s.contains("11")) {
                iterator.remove();
            }
        }

        return toReturn;
    }

    private void findAllPossible(int n, String s, Set<String> toReturn) {
        if (s.length() == n) {
            toReturn.add(s);
            return;
        }
        findAllPossible(n, s + "0", toReturn);
        findAllPossible(n, s + "1", toReturn);
    }

}
