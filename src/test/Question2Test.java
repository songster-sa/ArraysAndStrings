package test;

import main.Question2;

public class Question2Test {

    public static void main(String arg[]){
        Question2 obj = new Question2();

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
