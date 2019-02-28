package main.onlineBank;

/**
 * Given an array, find the maximum j-i, such that arr[j] > arr[i]
 * Example:
 * Input : 1,3,4,5,2,2,3,2
 * Output : 7-0
 * <p>
 * This might be in another way where we have to find the biggest i and smalled j such that arr[j] > arr[i]
 */
public class FarthestIndex {

    // j starts from end and i starts from beginning
    // make sure arr[j] > arr[i]

    public String solutionOne(int[] input) {

        int i = 0;
        int j = input.length - 1;

        while (i < j) {

            if (input[j] > input[i]) {
                break; // this j and i are farthest
            }
            j--;
            // no need to move the other index because the difference of indexes wont matter ie 7-1 = 6-0
            /*else if (input[j - 1] > input[i]) {
                j--;
            } else {
                i++;
            }*/
        }

        if (i >= j) {
            return "nothing found";
        }
        return j + "-" + i;
    }
}
