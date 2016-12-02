package com.example.rocko;


import com.example.rocko.lib.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Rocko on 2016/11/30.
 */
public class InvertBinaryTreeTest {

    private InvertBinaryTree invertBinaryTree;
    private TreeNode treeNode;

    @Before
    public void setUp(){
        invertBinaryTree = new InvertBinaryTree();
        treeNode = new TreeNode(4);
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(3);

        treeNode.right = new TreeNode(7);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(9);
    }

    @Test
    public void testInvertBinaryTree(){


        TreeNode act = invertBinaryTree.invertTree(treeNode);

        Assert.assertEquals(7,act.left.getVal());
        Assert.assertEquals(2,act.right.getVal());


    }

}
