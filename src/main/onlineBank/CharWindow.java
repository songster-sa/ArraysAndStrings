package main.onlineBank;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * given a sentence and set of chars
 * find the min window within which chars can be found in the sentence in any order
 * <p>
 * Example :
 * this is the sentence , ste => "sent" , "s the" , "the s"=> "sent"
 */
public class CharWindow {

    // track all(or only the required) the letters and their indices
    // t -> 0,8,15 , s-> 3,6,12 , e->10,13,16,19
    // now we have to find the closest numbers one in each

    // Approach 2 - keep finding windows and track their length ( maintain a min_length var)
    public void solution(String sentence, Set<Character> chars) {

        if (sentence == null || chars == null || chars.isEmpty() || sentence.isEmpty() || chars.size() > sentence.length()) {
            return;
        }

        Map toreturn = new TreeMap<String, Integer>();

        Set temp = new HashSet();
        temp.addAll(chars);

        for (int i = 0; i <= (sentence.length() - temp.size()); i++) {

            if (temp.contains(sentence.charAt(i))) {
                // a char found
                temp.remove(sentence.charAt(i));

                for (int j = i + 1; j < sentence.length(); j++) {

                    if (temp.contains(sentence.charAt(j))) {
                        // a char found
                        temp.remove(sentence.charAt(j));
                    }
                    if (temp.isEmpty()) {
                        String window = sentence.substring(i, j + 1);
                        toreturn.put(window.length(), window);
                        System.out.println("found window : " + window + " ," + window.length());
                        break;// this for loop
                    }
                }

                temp.clear();
                temp.addAll(chars);
            }
        }

    }
}
