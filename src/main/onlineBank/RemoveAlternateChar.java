package main.onlineBank;

/**
 * remove alternate duplicate character from a char array
 * algo must be in place and in O(n) time complexity
 * <p>
 * Example :
 * input = "you got beautiful eyes"
 * output = "you gtbeaiful es"
 * <p>
 * question :
 * all letters are small letters OR captial and small letters need to be treated alike ?
 * ascii chars?
 */
public class RemoveAlternateChar {

    public char[] solution(char[] input, boolean isCaseSensitive) {

        if (!isCaseSensitive) {
            // covert all letters to small
            String s = new String((input));
            s = s.toLowerCase();
            input = s.toCharArray();
        }

        boolean[] tracker = new boolean[256]; // all will be false initially

        int shift = 0;

        for (int i = 0; i < input.length; i++) {

            char c = input[i];
            input[i - shift] = c;

            if (!tracker[c]) {
                tracker[c] = true;
            } else {
                // tracker is true
                tracker[c] = false;
                shift++;
            }
        }
        for (int i = input.length - shift; i < input.length; i++) {
            input[i] = '~';
        }
        return input;
    }
}
