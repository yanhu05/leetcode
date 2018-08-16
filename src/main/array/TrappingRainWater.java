package main.array;

/*

https://leetcode.com/problems/trapping-rain-water/description/


 */

public class TrappingRainWater {

    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;
        int cnt = 0;
        for (int i = 1; i < height.length; i++) {
            int leftMax = 0;
            int rightMax = 0;
            for (int j = i; j >= 0; j--) {
                leftMax = Math.max(height[j], leftMax);
            }
            for (int k = i + 1; k < height.length; k++) {
                rightMax = Math.max(height[k], rightMax);
            }
            int tmp = Math.min(leftMax, rightMax) - height[i];
            if (tmp > 0) {
                cnt += Math.min(leftMax, rightMax) - height[i];
            }
        }

        return cnt;
    }


    public int trapTLE(int[] height) {
        if (height == null || height.length == 0) return 0;
        int cnt = 0;
        while (true) {
            int head = 0;
            int tail = height.length - 1;
            while (head < height.length && height[head] == 0) head++;
            while (tail > -1 && height[tail] == 0) tail--;
            int localCnt = 0;
            for (int i = head; i < tail; i++) {
                if (height[i] == 0) localCnt++;
            }
            cnt += localCnt;

            boolean breakIt = true;
            for (int i = 0; i < height.length; i++) {
                if (height[i] > 0) {
                    breakIt = false;
                }
            }
            if (breakIt) break;

            reduce(height);
        }
        return cnt;
    }

    private void reduce(int[] height) {
        for (int i = 0; i < height.length; i++) {
            if (height[i] > 0) {
                height[i]--;
            }
        }
    }
}
