package main.onlineBank;

/**
 * Given an int array, find the most frequent number and its count
 * Code must be in place (ie space of O(1))
 * Return output as a string "number: frequency"
 * If there is a tie, return the smallest number
 * <p>
 * Example:
 * Input : 1,3,4,5,2,2,3,2
 * Output : 2: 3
 */
public class FindMostFrequent {

    // as in place, cannot use a map or any other DS to track count
    // we can track curr highest freq and the smallest number holding it

    public String solutionOne(int[] input) {

        if (input == null || input.length == 0) {
            return "invalid";
        }

        int number = input[0];
        int freq = getFrequency(input, 0);

        for (int i = 1; i < input.length; i++) {

            int currFreq = getFrequency(input, i);
            if (currFreq == freq) {
                if (input[i] < number) {
                    number = input[i];
                }
            } else if (currFreq > freq) {
                number = input[i];
                freq = currFreq;
            }
        }

        return number + ": " + freq;
    }

    private int getFrequency(int[] input, int i) {
        int key = input[i];
        int freq = 1;
        for (int j = i + 1; j < input.length; j++) {
            if (input[j] == key) {
                freq++;
            }
        }
        return freq;
    }
}
