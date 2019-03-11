package main.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * there are total x destinations with coordinates given
 * distance from starting point can be calculated as square root of x2+y2 where x and y are coordinates
 * there are total y number of deliveries possible / planned
 * Find out the delivery plan for the trunk to cover max number of closest destinations
 * <p>
 * if there is a tie, return all possible destinations
 * <p>
 * Example:
 * Input= 3 [ [1,2], [2,3] , [3,4] ] 2
 * Distances will be : 2.236068 , 3.6055513, 5
 * Output= [1,2] , [2,3]
 * <p>
 * AMZ S.SDET Online test question
 */
public class TruckDeliveries {

    public List<List<Integer>> solution(int noDest, List<List<Integer>> destinations, int noDeliveries) {

        List<List<Integer>> toReturn = new ArrayList<>();

        if (noDest == 0 || destinations == null || noDeliveries == 0) {
            return toReturn;
        }

        Map<Double, List<List<Integer>>> sortedDest = getSortedDestinations(noDest, destinations);

        for (Map.Entry entry : sortedDest.entrySet()) {
            Double key = (Double) entry.getKey();
            List<List<Integer>> val = sortedDest.get(key);

            if (noDeliveries >= val.size()) {
                toReturn.addAll(val);
                noDeliveries = noDeliveries - val.size();
            } else if (noDeliveries == 0) {
                return toReturn;
            } else {
                // val contains more elements than required
                for (int i = 0; i < noDeliveries; i++) {
                    toReturn.add(val.get(i));
                }
                // no need to subtract noDeliveries as we dont be needing it anymore
                return toReturn;
            }
        }

        return toReturn;

    }

    private Map getSortedDestinations(int noDest, List<List<Integer>> destinations) {

        Map<Double, List<List<Integer>>> toReturn = new TreeMap<>();

        for (List<Integer> item : destinations) {
            Double distance = calculateDistance(item.get(0), item.get(1));

            if (toReturn.get(distance) == null) {
                toReturn.put(distance, new ArrayList<>());
            }
            toReturn.get(distance).add(item);
        }

        return toReturn;
    }

    private Double calculateDistance(int x, int y) {
        int sum = (x * x) + (y * y);
        return Math.sqrt(sum);
    }
}
