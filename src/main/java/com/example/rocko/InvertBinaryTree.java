package com.example.rocko;


import com.example.rocko.lib.TreeNode;

/**
 * Created by Rocko on 2016/12/2.
 */
public class InvertBinaryTree {

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
