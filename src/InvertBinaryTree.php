<?php

namespace Rocko;

class InvertBinaryTree
{
    /**
     * InvertBinaryTree constructor.
     */
    public function __construct()
    {
    }
    
    public function invertTree(Array $originTree): Array
    {
        
        $tmpTree = [];
        foreach ($originTree as $key => $item) {
            if ($key > 0) {
                if ($key % 2 == 1) {
                    array_push($tmpTree, $item);
                    if(!is_null($originTree[$key + 1])){
                        $originTree[$key] = $originTree[$key + 1];
                    }
                } else {
                    $originTree[$key] = array_pop($tmpTree);
                }
            }
        }
        
        return $originTree;
        
    }
}