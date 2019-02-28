package test;

import main.ReplaceChar;

public class ReplaceCharTest {

    public static void main(String arg[]){
        ReplaceChar obj = new ReplaceChar();

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
