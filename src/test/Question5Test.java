package test;

import main.Question5;

public class Question5Test {

    public static void main (String arg[]){

        Question5 obj = new Question5();

        String given="aabccccaaa";
        System.out.println(obj.solutionOne(given));

        given="aa";
        System.out.println(obj.solutionOne(given));

        given="a";
        System.out.println(obj.solutionOne(given));

        given="aaaaab";
        System.out.println(obj.solutionOne(given));

        given="";
        System.out.println(obj.solutionOne(given));
    }
}
