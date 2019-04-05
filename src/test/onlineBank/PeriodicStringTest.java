package test.onlineBank;

import main.onlineBank.PeriodicString;

public class PeriodicStringTest {

    public static void main(String arg[]) {
        PeriodicString obj = new PeriodicString();

        obj.solution("");
        System.out.println("---------------------------------");
        obj.solution(null);
        System.out.println("---------------------------------");
        obj.solution("a");
        System.out.println("---------------------------------");
        obj.solution("ababab");
        System.out.println("---------------------------------");
        obj.solution("xxxxxx");
        System.out.println("---------------------------------");
        obj.solution("aabbaaabba");
        System.out.println("---------------------------------");
        obj.solution("aabbacaabbaaabba");
        System.out.println("---------------------------------");

    }
}
