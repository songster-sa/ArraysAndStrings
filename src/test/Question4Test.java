package test;

import main.Question4;

public class Question4Test {

    public static void main(String arg[]){
        Question4 obj = new Question4();

        String given = "Mr John  ";
        System.out.println(obj.solutionOne(given.toCharArray()));

        given = "Mr John Smith    ";
        System.out.println(obj.solutionOne(given.toCharArray()));

        given = "Mr";
        System.out.println(obj.solutionOne(given.toCharArray()));

        given = "Mr ";
        System.out.println(obj.solutionOne(given.toCharArray()));

    }
}
