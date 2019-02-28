package main;

import java.util.ArrayList;

/**
 * Determine if a String has all unique characters
 * - what if you cannot use additional Data Structures
 * Example :
 * abcde - yes
 * abcade - no
 * abcAde - yes
 * only alphabets ? or any character ? capital and small ?
 * input is String or character array ?
 */
public class UniqueChars {

    /**
     * worst case - all unique - n x n
     * @param given
     * @return
     */
    public boolean solutionOne (String given){

        ArrayList unqChar = new ArrayList();

        for(char ch : given.toCharArray()){ // n
            if(unqChar.contains(ch)){ // n
                return false;
            } else {
                unqChar.add(ch);
            }
        }

        return true;
    }

    /**
     * worst case - all unique - n (n-1)
     * @param given
     * @return
     */
    public boolean solutionTwo (String given){

        for(int i=0; i < given.length(); i++){ // n
            for(int j=i+1; j < given.length();j++){ // n-1
                if(given.charAt(i) == given.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * worst case - all unique - O(n)
     * @param given
     * @return
     */
    public boolean solutionThree(String given){
        // ASCII has 256 chars

        if(given.length() > 256 ) return false;

        boolean charSet[] = new boolean[256];
        for(int ch : given.toCharArray()){
            if(charSet[ch]){
                // already found
                return false;
            } else{
                charSet[ch] = true;
            }

        }
        return true;
    }
}
