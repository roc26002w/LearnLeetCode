package com.example.rocko;


/**
 * Created by Rocko on 2016/11/30.
 */
public class InvertBinaryTreeTest {

    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
