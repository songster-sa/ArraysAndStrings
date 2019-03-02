package main.onlineBank;

import java.util.ArrayList;
import java.util.List;

/**
 * houses in a row represented by cells
 * each house can be active =1 or inactive=0
 * a house becomes inactive the next day if both neighbours are either active or inactive the previous day
 * as first and last cell will have only 1 neighbour, you can consider the other neighbour to be inactive
 * Find the state of the houses after n number of days
 * <p>
 * AMZ S.SDET demo Question
 */

public class ActiveHouses {

    public List<Integer> cellCompete(int[] states, int days) {


        int[] arr;

        while (days > 0) {
            arr = new int[states.length];
            if (states[1] == 0) {
                // prev end is assumed 0
                arr[0] = 0;
            } else {
                arr[0] = 1;
            }
            for (int i = 2; i < states.length; i++) {
                if (states[i] == states[i - 2]) {
                    arr[i - 1] = 0;
                } else {
                    arr[i - 1] = 1;
                }
            }
            if (states[states.length - 2] == 0) {
                arr[states.length - 1] = 0;
            } else {
                arr[states.length - 1] = 1;
            }
            days--;
            states = arr;
        }

        List<Integer> toReturn = new ArrayList<Integer>();
        for (int i = 0; i < states.length; i++) {
            toReturn.add(states[i]);
        }
        return toReturn;
    }


    public List<Integer> cellCompete2(int[] states, int days) {

        List<Integer> toReturn = new ArrayList<Integer>();

        while (days > 0) {
            int prev = states[0];
            if (states[1] == 0) {
                // prev end is assumed 0
                states[0] = 0;
            } else {
                states[0] = 1;
            }

            if (days == 1) {
                toReturn.add(states[0]);
            }

            for (int i = 2; i < states.length; i++) {
                if (states[i] == prev) {
                    prev = states[i - 1];
                    states[i - 1] = 0;
                } else {
                    prev = states[i - 1];
                    states[i - 1] = 1;
                }
                if (days == 1) {
                    toReturn.add(states[i - 1]);
                }
            }
            if (prev == 0) {
                states[states.length - 1] = 0;
            } else {
                states[states.length - 1] = 1;
            }
            if (days == 1) {
                toReturn.add(states[states.length - 1]);
            }

            days--;
        }

        return toReturn;
    }
}