package test;

import main.Question1;

public class Question1Test {

    public static void main (String arg[]){
        Question1 object = new Question1();

        String given = "aBANhrLObZ1XJi";

        System.out.println(object.solutionOne(given));
        System.out.println(object.solutionTwo(given));
        System.out.println(object.solutionThree(given));

        given = "aBANhrL ObZ1XJi";

        System.out.println(object.solutionOne(given));
        System.out.println(object.solutionTwo(given));
        System.out.println(object.solutionThree(given));

        given = "aBANhrLObZ1XLJiaBANhrLObZ1XLJi";

        System.out.println(object.solutionOne(given));
        System.out.println(object.solutionTwo(given));
        System.out.println(object.solutionThree(given));

    }
}
