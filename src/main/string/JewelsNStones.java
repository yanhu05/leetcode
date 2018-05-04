package main.string;


// https://leetcode.com/problems/jewels-and-stones/description/
public class JewelsNStones {

    public int numJewelsInStones(String jewels, String stones) {
        if (jewels == null || stones == null) {
            return 0;
        }

        int[] jewelSet = new int[128];
        for (int i = 0; i < jewels.length(); i++) {
            char c = jewels.charAt(i);
            jewelSet[c] = c;
        }
        int total = 0;
        for (int i = 0; i < stones.length(); i++) {
            char s = stones.charAt(i);
            if (jewelSet[s] > 0) {
                total += 1;
            }
        }
        return total;
    }
}
