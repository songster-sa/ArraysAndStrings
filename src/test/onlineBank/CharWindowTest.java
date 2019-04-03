package test.onlineBank;

import main.onlineBank.CharWindow;

import java.util.HashSet;
import java.util.Set;

public class CharWindowTest {

    public static void main(String arg[]) {
        CharWindow obj = new CharWindow();
        Set temp = new HashSet<Character>();
        temp.add('s');
        temp.add('t');
        temp.add('e');

        obj.solution("this is the sentence", temp);

        System.out.println("-------------------------------------------------");
        temp.clear();
        temp.add('s');
        temp.add('t');
        temp.add('i');
        temp.add('t'); // duplicate not saved in SET .. use LIST for duplicate
        obj.solution("this is a test string", temp);

        System.out.println("-------------------------------------------------");
        temp.clear();
        temp.add('o');
        temp.add('k');
        temp.add('r');

        obj.solution("geeksforgeeks", temp);

        System.out.println("-------------------------------------------------");
        temp.clear();
        temp.add('o');
        temp.add('k');
        temp.add('r');

        obj.solution("ork", temp);
    }
}
