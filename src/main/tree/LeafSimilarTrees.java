package main.tree;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) return false;
        List<Integer> a = new ArrayList<>();
        collectLeaf(root1, a);
        List<Integer> b = new ArrayList<>();
        collectLeaf(root2, b);
        if (a.size() != b.size()) return false;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == b.get(i)) continue;
            return false;
        }
        return true;
    }

    private void collectLeaf(TreeNode root, List<Integer> list) {
        if (root.right == null && root.left == null) {
            list.add(root.val);
            return;
        }

        if (root.left != null) {
            collectLeaf(root.left, list);
        }

        if (root.right != null) {
            collectLeaf(root.right, list);
        }
    }
}
