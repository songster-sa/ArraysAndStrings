package test;

import main.UniqueChars;

public class UniqueCharsTest {

    public static void main (String arg[]){
        UniqueChars object = new UniqueChars();

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
