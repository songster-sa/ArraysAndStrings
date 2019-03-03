package test.onlineBank;

import main.onlineBank.RemoveAlternateChar;

public class RemoveAlternateCharTest {

    public static void main(String arg[]) {
        RemoveAlternateChar obj = new RemoveAlternateChar();

        String input = "you got beautiful eyes";

        System.out.println(obj.solution(input.toCharArray(), false));

    }
}
