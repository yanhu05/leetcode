package main.array;

/*

https://leetcode.com/problems/increasing-triplet-subsequence/description/

 */
public class IncreasingTripletSubsequence {

    public boolean increasingTriplet(int[] nums) {
        if (nums == null) return false;
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i < min) min = i;
            else if (i < secondMin && i > min) secondMin = i;
            else if (i > secondMin) {
                return true;
            }
        }
        return false;
    }
}
