package test.onlineBank;

import main.onlineBank.NextBiggerNum;

/**
 * input = 123456
 * output = 123465
 * <p>
 * 12 -> 21
 * 123 -> 132
 * 154 -> 415
 * 321 -> not possible
 * 2143 -> 2314
 * 1243  -> 1324
 * 2114 -> 2141
 * 3455  -> 3545
 * 31453 ->  31534
 */
public class NextBiggerNumTest {

    public static void main(String arg[]) {

        NextBiggerNum obj = new NextBiggerNum();

        System.out.println(obj.solution(123456));
        System.out.println(obj.solution(12));
        System.out.println(obj.solution(1));
        System.out.println(obj.solution(123));
        System.out.println(obj.solution(154));
        System.out.println(obj.solution(321));
        System.out.println(obj.solution(2143));
        System.out.println(obj.solution(1243));
        System.out.println(obj.solution(2114));
        System.out.println(obj.solution(3455));

        System.out.println(obj.solution(31453));// wrong


    }
}
