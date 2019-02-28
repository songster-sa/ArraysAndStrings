package main;

/**
 * Replace all spaces with %20. Assume you have enough space at the end of the string.
 * Example:
 * Input :  "Mr John Smith    "
 * Output : "Mr%20John%20Smith"
 */
public class ReplaceChar {

    public char[] solutionOne(char[] given) {

        // may be validate that given actually ahs enough space as assumed

        int j = given.length - 1;
        boolean charFound = false;

        for (int i = given.length - 1; i >= 0; i--) {
            if (given[i] == ' ') {
                if (!charFound) {
                    continue; // keep skipping until you find first char from last
                }
                // else insert %20
                if (j - i < 2) {
                    System.out.println("some problem : j=" + j + " i=" + i + " " + given);
                }
                given[j--] = '0';
                given[j--] = '2';
                given[j--] = '%';
            } else {

                if (!charFound) {
                    charFound = true;
                }

                // move to last
                // System.out.println("setting i=" + i + " in j=" + j);
                given[j--] = given[i];
            }

        }
        return given;
    }
}
