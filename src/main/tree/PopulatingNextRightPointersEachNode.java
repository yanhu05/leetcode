package main.tree;

/*

https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/

 */
public class PopulatingNextRightPointersEachNode {

    public void connect(TreeLinkNode root) {
        dfsChidren(root);
        dfsLeft(root);
    }

    private void dfsChidren(TreeLinkNode node) {
        if (node == null || node.left == null || node.right == null) return;
        node.left.next = node.right;
        dfsChidren(node.left);
        dfsChidren(node.right);
    }

    private void dfsLeft(TreeLinkNode node) {
        if (node == null || node.left == null) return;
        TreeLinkNode current = node;
        while (current.next != null) {
            current.right.next = current.next.left;
            current = current.next;
        }
        dfsLeft(node.left);
    }
}
