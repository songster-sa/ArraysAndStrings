package main.onlineBank;

/**
 * get the next bigger number using the same digits
 * example:
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
public class NextBiggerNum {

    public int solution(int num) {

        int[] arr = convertNumtoArr(num + "");
        int l = arr.length;
        int last = arr[l - 1];
        int i = l - 2;

        while (i >= 0 && last <= arr[i]) {
            i--;
        }

        if (i < 0) {
            // no possible
            System.out.println("number in decreasing order.. hence not possible");
            return -1;
        } else {
            // move everything right and put last in ith place
            for (int j = l - 2; j >= i; j--) {
                arr[j + 1] = arr[j];
            }
            arr[i] = last;
            return convertArrToNum(arr);
        }
    }

    private int convertArrToNum(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i);
        }
        return Integer.parseInt(sb.toString());
    }

    private int[] convertNumtoArr(String s) {

        int[] arr = new int[s.length()];
        int i = 0;
        for (char c : s.toCharArray()) {
            arr[i++] = Integer.parseInt(c + "");
        }
        return arr;

    }
}
