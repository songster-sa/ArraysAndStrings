package test;

import main.ReverseString;

public class ReverseStringTest {

    public static void main(String arg[]){
        ReverseString obj = new ReverseString();

        char[] given = new char[]{'a','b','c','d','e','0'};
        System.out.println(obj.solutionOne(given));
        System.out.println(obj.solutionTwo(given));

        given = new char[]{'a','b','c','d','e','f','0'};
        System.out.println(obj.solutionOne(given));
        System.out.println(obj.solutionTwo(given));

        given = new char[]{'a','0'};
        System.out.println(obj.solutionOne(given));
        System.out.println(obj.solutionTwo(given));

        given = new char[]{'0'};
        System.out.println(obj.solutionOne(given));
        System.out.println(obj.solutionTwo(given));
    }
}
