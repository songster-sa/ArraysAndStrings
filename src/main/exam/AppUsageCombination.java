package main.exam;

import java.util.*;

/**
 * you have a list of foreground apps with their IDs and memory [1,2] [2,3] [3,4] [4,5] [5,6]
 * you have a list of background apps with their IDs and memory [1,2] [2,3] [3,4] [4,5] [5,6]
 * you have a capacity of a system say 10MB
 * Find out the most optimal set of foreground and background apps that you can run on the system
 * return their IDs as [f,b]
 * If you can match full capacity then thats the most optimal and then no other app combination of less than that will be optimal
 * Example output : [5,3] [4,4] [3,5] all these IDs come up with combined memory of 10
 */
public class AppUsageCombination {

    public List<List<Integer>> solution(List<List<Integer>> foregroundApps, List<List<Integer>> backgroundApps, int capacity) {

        List<List<Integer>> toReturn = new ArrayList<>();
        if (capacity == 0 || foregroundApps.isEmpty() || backgroundApps.isEmpty()) {
            return toReturn;
        }

        Map<Integer, List<List<Integer>>> allCombinations = allCombinationsSorted(foregroundApps, backgroundApps);

        for (Map.Entry entry : allCombinations.entrySet()) {
            Integer key = (Integer) entry.getKey();
            if (key <= capacity) {
                return allCombinations.get(key);
            }
        }

        return toReturn;
    }

    private Map<Integer, List<List<Integer>>> allCombinationsSorted(List<List<Integer>> foregroundApps, List<List<Integer>> backgroundApps) {

        Map<Integer, List<List<Integer>>> toReturn = new TreeMap<>(Collections.reverseOrder());

        for (List<Integer> fore : foregroundApps) {

            for (List<Integer> back : backgroundApps) {
                int sum = fore.get(1) + back.get(1);
                if (toReturn.get(sum) == null) {
                    toReturn.put(sum, new ArrayList<>());
                }
                toReturn.get(sum).add(new ArrayList() {{
                    add(fore.get(0));
                    add(back.get(0));
                }});
            }
        }

        return toReturn;
    }
}
