package main;

/**
 * reverse a null terminated char array
 * Example:
 * abcde0 = edcba0 - length=6 but 5 chars only index 0 to 4
 * abcdef0 = fedcba0 - length =7
 * a0 = a0
 * 0=0
 */
public class Question2 {

    /**
     * not in place
     * parses the full string
     * @param given
     * @return
     */
    public char[] solutionOne(char[] given) {

        char[] toReturn = new char[given.length];
        if (given.length > 0) {

            int j = 0;
            for (int i = given.length - 2; i >= 0; i--) {
                toReturn[j++] = given[i];
            }
            toReturn[j] = '0';
        }

        return toReturn;
    }

    /**
     * in place
     * goes half the length of the string
     * @param given
     * @return
     */
    public char[] solutionTwo(char[] given) {

        int i = 0;
        int j = given.length - 2;

        if (j <= 0) return given;

        int mid = j / 2;
        boolean swapmid = (j % 2) != 0;

        for (; i <= mid; i++, j--) {
            if (i == mid && !swapmid) {
                continue;
            }
            char temp = given[j];
            given[j] = given[i];
            given[i] = temp;
        }
        return given;
    }
}
