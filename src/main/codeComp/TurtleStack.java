package main.codeComp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * you have n turtles with weight and height defined.
 * a turtle can take as much weight on top of it as its strength
 * find out max number of turtles you can stack on top of each other without cracking its shell
 * Example: input is [W,S]
 * <p>
 * Input : [1,2] [1,1] [2,1] [2,2]
 * Output : 3 [2,2] [1,2] [1,1] - stack from bottom up order
 * <p>
 * Input : [1,1] [2,3] [4,2] [2,2]
 * Output : 3 [2,3] [2,2] [1,1] - stack from bottom up order
 * <p>
 * Input : [1,1] [2,2] [5,5] [1,6] - answer is 2 but the actual stack would be 11 55 on 16
 * but this algo would give 22 11 on 16
 */
public class TurtleStack {

    public List<List<Integer>> solution(List<List<Integer>> turtles) {

        List<List<Integer>> toReturn = new ArrayList<>();

        if (turtles.isEmpty()) {
            return toReturn;
        }

        // approach 1
        // get max strength one first and
        // find the sum of weights equal to the strength for MAX turtles ie go by least weight
        // order them by max strength on top of first one

        // better to keep 2 sorted lists - one by ascending order of weight and one by descending order of strength

        // get the max strength
        int i = getIndexOfMaxStrength(turtles);
        toReturn.add(turtles.get(i));
        int maxStrength = turtles.get(i).get(1);
        turtles.remove(i);

        List<List<Integer>> turtlesByW = new ArrayList<>();
        turtlesByW.addAll(turtles); // ascending order
        Collections.sort(turtlesByW, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(0).compareTo(o2.get(0));
            }
        });

        // System.out.println("turtles by ascending order of weight : " + turtlesByW);

        List<List<Integer>> stackTurtles = new ArrayList<>();
        for (List<Integer> item : turtlesByW) {
            if (maxStrength >= item.get(0)) {
                // will this always work?
                // the number of turtles are same/right but the actual stack may not be
                // because the remained of the subtraction may not be found in next try
                stackTurtles.add(item);
                maxStrength = maxStrength - item.get(0);
            }
        }

        // System.out.println("all possible turtles in stack : " + stackTurtles);

        System.out.println("total number of possible turtles in stack = " + (stackTurtles.size() + 1));

        // prepare stack
        Comparator desc = Collections.reverseOrder(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(1).compareTo(o2.get(1));
            }
        });
        Collections.sort(stackTurtles, desc); // descending order
        toReturn.addAll(stackTurtles);

        System.out.println("final stack (bottom to top)= " + toReturn);

        return toReturn;
    }

    private int getIndexOfMaxStrength(List<List<Integer>> turtles) {
        int maxIndex = 0; // max index

        for (int i = 1; i < turtles.size(); i++) {

            List<Integer> item = turtles.get(i);

            if (item.get(1) > turtles.get(maxIndex).get(1)) {
                maxIndex = i;
            }

        }

        return maxIndex;
    }
}
