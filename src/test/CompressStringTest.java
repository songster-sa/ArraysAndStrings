package test;

import main.CompressString;

public class CompressStringTest {

    public static void main (String arg[]){

        CompressString obj = new CompressString();

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
