package main.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PopulatingNextRightPointersEachNodeTest {

    @Test
    void connect() {
        TreeLinkNode root = new TreeLinkNode(0);
        root.left = new TreeLinkNode(1);
        root.right = new TreeLinkNode(2);
        root.left.left = new TreeLinkNode(3);
        root.left.right = new TreeLinkNode(4);
        root.right.left = new TreeLinkNode(5);
        root.right.right = new TreeLinkNode(6);

        //new PopulatingNextRightPointersEachNode().connect(root);
        //  assertEquals(2, root.left.next.val);


        root = new TreeLinkNode(-1);
        root.left = new TreeLinkNode(0);
        root.right = new TreeLinkNode(1);
        root.left.left = new TreeLinkNode(2);
        root.left.right = new TreeLinkNode(3);
        root.right.left = new TreeLinkNode(4);
        root.right.right = new TreeLinkNode(5);

        root.left.left.left = new TreeLinkNode(6);
        root.left.left.right = new TreeLinkNode(7);
        root.left.right.left = new TreeLinkNode(8);
        root.left.right.right = new TreeLinkNode(9);

        root.right.left.left = new TreeLinkNode(10);
        root.right.left.right = new TreeLinkNode(11);
        root.right.right.left = new TreeLinkNode(12);
        root.right.right.right = new TreeLinkNode(13);
        new PopulatingNextRightPointersEachNode().connect(root);
        assertEquals(2, root.left.next.val);
    }
}