package main.exam;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 1/3 = 0.3333 = 0.(3)
 * 1/4 = 0.25 = 0.25(0)
 * 1/7 = 0.(142358)
 * x/y = 0.1234(567)
 * x/y = 1234.567(89012)
 * <p>
 * Given x and y, print the division result in the above format
 * ie the repetitive digits within brackets
 */
public class RepetitiveDecimal {

    public void solution(int x, int y) {

        // negative numbers?

        if (y == 0) {
            System.out.println("divide by zero");
            return;
        }

        System.out.print(x / y); // print the part from before decimal

        if (x % y != 0) {
            System.out.print(".");
            // keep track of remainder and print when remainder repeats
            // but hashmap keyset does not maintain order, and iteration over it is slow - hence use LinkedHashMap
            Map<Integer, Integer> map = new LinkedHashMap();
            int r = findRepetitivePart(x, y, map);

            for (Map.Entry entry : map.entrySet()) {
                Integer key = (Integer) entry.getKey();
                if (key != r) {
                    System.out.print(map.get(key));
                } else {
                    System.out.print("(" + map.get(key));
                }
            }
            System.out.println(")");
        } else {
            System.out.println();
        }
    }


    private int findRepetitivePart(int x, int y, Map<Integer, Integer> map) {

        int r = x % y;

        if (map.containsKey(r)) {
            // repetition starts from here
            return r;
        }
        map.put(r, (r * 10) / y);
        return findRepetitivePart(r * 10, y, map);
    }

}
