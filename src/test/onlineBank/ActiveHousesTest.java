package test.onlineBank;

import main.onlineBank.ActiveHouses;

public class ActiveHousesTest {

    public static void main(String[] arg) {
        ActiveHouses obj = new ActiveHouses();

        int[] input = new int[]{0, 1, 0, 0, 0, 0, 1, 0}; // 1,0,1,0,0,1,0,1
        System.out.println(obj.cellCompete(input, 1));

        input = new int[]{0, 1, 0, 0, 0, 0, 1, 0}; // 1,0,1,0,0,1,0,1
        System.out.println(obj.cellCompete2(input, 1));
    }
}
