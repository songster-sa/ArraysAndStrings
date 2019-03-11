package main;

/**
 * compress String using counts of repeated chars
 * Example :
 * aabccccaaa = a2b1c4a3
 * aa = a2 = aa
 * a = a1 = a
 */
public class CompressString {

    // solutionInt 1 = actually count -> from back or front
    // solutionInt 2 = use the indices to compute the count
    // for single letter you will have to create space to store count
    // can be in space or use a separate string to return
    // if doing in place, the need to be careful as count can be double digit also

    public String solutionOne(String given) {
        StringBuilder toReturn = new StringBuilder();

        if (given.length() <= 2) {
            return given;
        }

        char curC = given.charAt(0);
        int prevI = 0;

        for (int i = 1; i < given.length(); i++) {

            if (given.charAt(i) != curC) {
                // new char found
                int count = i - prevI;
                toReturn.append(curC).append(count);
                prevI = i;
                curC = given.charAt(i);
            }
        } // last char will be missed
        int count = given.length() - prevI;
        toReturn.append(curC).append(count);

        return (toReturn.length() < given.length()) ? toReturn.toString() : given;
    }
}
