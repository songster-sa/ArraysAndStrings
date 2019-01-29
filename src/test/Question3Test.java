package test;

import main.Question3;

public class Question3Test {

    public static void main(String arg[]) {
        Question3 obj = new Question3();

        String given1 = "abc";
        String given2 = "bac";

        System.out.println(obj.solutionOne(given1, given2));

        given1 = "aac";
        given2 = "aca";

        System.out.println(obj.solutionOne(given1, given2));

        given1 = "abc";
        given2 = "acs";

        System.out.println(obj.solutionOne(given1, given2));

        given1 = "a";
        given2 = "bac";

        System.out.println(obj.solutionOne(given1, given2));

        given1 = "";
        given2 = "";

        System.out.println(obj.solutionOne(given1, given2));

        System.out.println(obj.solutionOne(null, null));
    }
}
