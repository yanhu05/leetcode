package main.array;

/*

https://leetcode.com/problems/binary-gap/solution/


 */
public class BinaryGap {

    public int binaryGap(int N) {

        String s = Integer.toBinaryString(N);
        int max = 0;
        int start = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '1') {
                if (start > -1) {
                    max = Math.max(max, i - start);
                }
                start = i;
            }
        }
        return max;
    }
}
