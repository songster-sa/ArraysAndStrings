package test.onlineBank;

import main.onlineBank.AllPermutations;

public class AllPermutationsTest {

    public static void main(String arg[]) {

        AllPermutations obj = new AllPermutations();
        System.out.println(obj.solution("abcacbacab", "abc"));
        System.out.println(obj.solution("abcacvbacab", "abc"));
        System.out.println(obj.solution("abba", "ab"));
        System.out.println(obj.solution("caba", "ab"));
    }
}
