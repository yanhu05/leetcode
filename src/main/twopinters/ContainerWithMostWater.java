package main.twopinters;

/*

https://leetcode.com/problems/container-with-most-water/description/

Hint
A container's capacity is bound by it is lower side.  So the longer, the better

 */

public class ContainerWithMostWater {


    public static int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int head = 0;
        int tail = height.length - 1;

        while (head <= tail) {
            max = Math.max((tail - head) * Math.min(height[head], height[tail]), max);
            if (height[head] < height[tail]) {
                head++;
            } else {
                tail--;
            }
        }

        return max;
    }

    public int maxAreaBF(int[] height) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < height.length; i++) {
            int curMax = Integer.MIN_VALUE;
            for (int j = i + 1; j < height.length; j++) {
                curMax = Math.max((j - i) * Math.min(height[i], height[j]), curMax);
            }
            max = Math.max(max, curMax);
        }
        return max;
    }
}
