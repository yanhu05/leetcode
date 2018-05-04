package main.dp;

public class CutRod {

    public int cutRod(int len, int[] prices) {
        if (len == 0 || prices == null) return 0;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            int subLen = i + 1;
            if (subLen <= len) {
                int localMax = prices[i];
                localMax += cutRod(len - subLen, prices);
                max = Math.max(max, localMax);
            }
        }
        return max;
    }
}
