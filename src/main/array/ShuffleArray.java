package main.array;
/*

https://leetcode.com/problemset/top-interview-questions/

Key is the shuffler


 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShuffleArray {
    int[] mNums;
    int[] tmpNums;
    List<Integer> mList = new ArrayList<>();

    public ShuffleArray(int[] nums) {
        mNums = nums;
        tmpNums = nums.clone();
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        tmpNums = mNums.clone();
        return mNums;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        Random rgen = new Random();
        for (int i = 0; i < tmpNums.length; i++) {
            int randomPosition = rgen.nextInt(tmpNums.length);
            int temp = tmpNums[i];
            tmpNums[i] = tmpNums[randomPosition];
            tmpNums[randomPosition] = temp;
        }

        return tmpNums;
    }
}
