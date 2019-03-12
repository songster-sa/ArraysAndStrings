package main.onlineBank;

/**
 * given 2 sorted arrays with repetitive elements
 * find the kth min number from both array
 * <p>
 * Example :
 * 1,1,2,3,4,4,5
 * 1,1,3,3,4,5,6,
 * find 2nd min number = 2
 * <p>
 * <p>
 * assumption -> no 0 in the int array
 */
public class FindMinArray {
    //merge and then find the kth

    public int solution(int[] arr1, int[] arr2, int k) {

        if (k > (arr1.length + arr2.length)) {
            System.out.println("k > sum of lengths");
            return -1;
        }

        int[] arr3 = merge(arr1, arr2);
        // instead of arr3 being an int array , we can have an array list of size of the biggest array
        // it will double its size on the next call though

        // just to print
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + ",");
        }

        System.out.println();

        return arr3[k - 1];
    }

    private int[] merge(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0, curr = 0;

        while (i < arr1.length && j < arr2.length) {

            if (k != 0) {
                curr = arr3[k - 1];
            }

            if (arr1[i] < arr2[j]) {
                if (arr1[i] != curr) {
                    arr3[k] = arr1[i];
                    k++;
                } // else skip i
                i++;
            } else if (arr1[i] == arr2[j]) {
                if (arr1[i] != curr) {
                    arr3[k] = arr1[i];
                    k++;
                } // else skip i and j
                i++;
                j++;
            } else if (arr1[i] > arr2[j]) {
                if (arr2[j] != curr) {
                    arr3[k] = arr2[j];
                    k++;
                } // else skip j
                j++;
            }

        }

        while (i < arr1.length) {
            // i left over
            if (k != 0) {
                curr = arr3[k - 1];
            }
            if (arr1[i] != curr) {
                arr3[k] = arr1[i];
                k++;
            } // else skip i
            i++;

        }


        while (j < arr2.length) {
            // j left over
            if (k != 0) {
                curr = arr3[k - 1];
            }
            if (arr2[j] != curr) {
                arr3[k] = arr2[j];
                k++;
            } // else skip j
            j++;
        }
        return arr3;
    }
}
