package main.hashmap;

/*
https://leetcode.com/problems/next-greater-element-i/description/

 */
public class NextGreaterElement {


    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] results = new int[0];
        if (nums1 == null || nums2 == null) return results;
        results = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int num = -1;
            boolean found = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    found = true;
                }
                if (found && nums2[j] > nums1[i]) {
                    num = nums2[j];
                    break;
                }
            }
            results[i] = num;
        }
        return results;
    }
}
