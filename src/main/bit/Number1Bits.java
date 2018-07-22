package main.bit;

public class Number1Bits {

    public int hammingWeight(int n) {
        int cnt = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                cnt++;
            }
            n = n >>> 1;

        }
        return cnt;
    }


    public int hammingWeightLazy(int n) {
        String num = Integer.toBinaryString(n);
        int cnt = 0;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            if (c == '1') cnt++;
        }
        return cnt;
    }
}
