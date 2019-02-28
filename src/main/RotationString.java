package main;

/**
 * given 'isSubstring()' - check if s2 is a rotation of s1 using only 1 call to the method
 * Example:
 * s1 = "waterbottle"
 * s2 = "erbottlewat"
 * true
 */
public class RotationString {

    public boolean solutionOne(String s1, String s2) {
        String s3 = s1 + s1;
        return s3.contains(s2);
    }
}
