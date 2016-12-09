<?php

namespace Rocko;

use PHPUnit\Framework\TestCase;

class InvertBinaryTreeTest extends TestCase
{
    protected $invertBinaryTree;
    
    public function setUp()
    {
        $this->invertBinaryTree = new InvertBinaryTree();
    }
}