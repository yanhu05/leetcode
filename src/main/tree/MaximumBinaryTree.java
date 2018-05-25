package main.tree;

//https://leetcode.com/problems/maximum-binary-tree/solution/

/*
  A simple improvement is to not copy nums
  Time = O(n^2)
  Space = O(n^2)

 */
import java.util.List;
import java.util.ArrayList;

public class MaximumBinaryTree {


    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }

        int max = 0;
        int pos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                pos = i;
            }
        }

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i < pos) {
                left.add(nums[i]);
            } else if (i > pos) {
                right.add(nums[i]);
            }
        }

        int[] leftNums = new int[left.size()];

        for (int i = 0; i < left.size(); i++) {
            leftNums[i] = left.get(i);
        }

        int[] rightNums = new int[right.size()];
        for (int i = 0; i < right.size(); i++) {
            rightNums[i] = right.get(i);
        }

        TreeNode node = new TreeNode(max);

        if (leftNums.length > 0) {
            node.left = constructMaximumBinaryTree(leftNums);
        }

        if (rightNums.length > 0) {
            node.right = constructMaximumBinaryTree(rightNums);
        }


        return node;
    }
}
