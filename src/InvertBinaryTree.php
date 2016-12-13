<?php

namespace Rocko;

class InvertBinaryTree
{
    public function invertTree($originTree)
    {
        if (is_null($originTree)) {
            return null;
        }
        
        $tmp = $originTree->left;
        $originTree->left = $originTree->right;
        $originTree->right = $tmp;
        
        $this->invertTree($originTree->left);
        $this->invertTree($originTree->right);
        
        return $originTree;
        
    }
}